package org.mh.jenkins.wso2.WSO2Deployment;

import hudson.Extension;
import hudson.FilePath;
import hudson.Launcher;
import hudson.maven.MavenModule;
import hudson.maven.MavenModuleSet;
import hudson.maven.MavenModuleSetBuild;
import hudson.model.BuildListener;
import hudson.model.Result;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.BuildStepMonitor;
import hudson.tasks.Publisher;
import hudson.tasks.Recorder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;

/** 
 * Deploy WAR files to a WSO2 Application Server via SOAP administration web service.
 * 
 * @author mh
 *
 */
public class Wso2asPublisher extends Recorder {

    public  String warSource;
    public  String warTargetFileName;
    public  String wso2asURL;
    public  String wso2asAdminUser;
    public  String wso2asAdminPwd;
    
    /** Constructor using fields */
    @DataBoundConstructor
    public Wso2asPublisher( String warSource, String warTargetFileName, String wso2asURL, String wso2asAdminUser, String wso2asAdminPwd ) {
 		super();
 		this.warSource = warSource.trim();
 		this.warTargetFileName = warTargetFileName.trim();
 		this.wso2asURL = wso2asURL.trim();
 		if ( ! this.wso2asURL.endsWith("/") ) {
 			this.wso2asURL += "/";
 		}
 		this.wso2asAdminUser = wso2asAdminUser.trim();
 		this.wso2asAdminPwd = wso2asAdminPwd.trim();
 	}
    
    @Override
    public DescriptorImpl getDescriptor() {
        return (DescriptorImpl) super.getDescriptor();
    }
	

	public BuildStepMonitor getRequiredMonitorService() {
        return BuildStepMonitor.NONE;
	}

	// --------------------------------------------------------------------------------------------
	
	/** Check input params and tart the deployment */
    @SuppressWarnings("rawtypes")
	@Override
    public boolean perform( AbstractBuild build, Launcher launcher, BuildListener listener ) throws InterruptedException, IOException {
        if ( build.getResult().isWorseOrEqualTo( Result.FAILURE) ) {
        	listener.getLogger().println( "[WSO2 Deployer] WSO2 AS WAR upload: STOP, due to worse build result!" );
            return true; // nothing to do
        }
        listener.getLogger().println( "[WSO2 Deployer] WSO2 AS WAR upload initiated (baseDir="+build.getArtifactsDir().getPath()+")" );

        if ( StringUtils.isBlank( warTargetFileName ) ) {
            listener.error( "[WSO2 Deployer] WAR file name must be set!" ); 
            return false;
        }
        if ( StringUtils.isBlank( warSource ) ) {
            listener.error( "[WSO2 Deployer] WAR source name must be set!" ); 
            return false;
        }
        if ( StringUtils.isBlank( wso2asURL ) ) {
            listener.error( "[WSO2 Deployer] WSO2 AS server URL must be set!" ); 
            return false;
        }
        // Validates that the organization token is filled in the project configuration.
        if ( StringUtils.isBlank( wso2asAdminUser ) ) {
            listener.error( "[WSO2 Deployer] Admin user name must be set!" ); 
            return false;
        }
        // Validates that the organization token is filled in the project configuration.
        if ( StringUtils.isBlank( wso2asAdminPwd ) ) {
            listener.error( "[WSO2 Deployer] Admin password must be set!" ); 
            return false;
        }
                
        String version = artifactVersion( build, listener );
               
        boolean result = true;

        FilePath[] warList = build.getWorkspace().list( warSource );
        if ( warList.length == 0 ) {
            listener.error( "[WSO2 Deployer] No WAR file found for '"+warSource+"'" );   
            return false;
        } else if ( warList.length != 1  ) {
            listener.error( "[WSO2 Deployer] Multiple WAR files found for '"+warSource+"'" );   
            for ( FilePath warFile : warList ) {
                listener.getLogger().println( "WAR is n="+warFile.toURI() );
            }
            return false;
        } else {
        	for ( FilePath warFile : warList ) {
	            listener.getLogger().println( "[WSO2 Deployer] WAR is   = "+warFile.toURI() );
	            listener.getLogger().println( "[WSO2 Deployer] WAR size = "+warFile.read().available()  );
	
	            InputStream fileIs = warFile.read();
		        
		        Wso2AsDeployHelper deployer = new Wso2AsDeployHelper( wso2asURL, wso2asAdminUser,  wso2asAdminPwd, listener  );
		        result = deployer.upload( fileIs, warTargetFileName, version );
	        }
        }
        return result;
    }
    
     
    /** helper to get the version of the artifact from pom definition */
    @SuppressWarnings("rawtypes")
	private String artifactVersion( AbstractBuild build, BuildListener listener ) {
    	 String version = "1.0";
         if ( build instanceof MavenModuleSetBuild ) {
 	        try {
 				MavenModuleSetBuild mavenBuild = (MavenModuleSetBuild) build;
 				MavenModuleSet parent = mavenBuild.getParent();
 				Collection<MavenModule> modules = parent.getModules();
 				MavenModule module = modules.iterator().next();
 				version = module.getVersion();
 	        	listener.getLogger().println( "[WSO2 Deployer] "+warTargetFileName+" version: "+version );
 			} catch (Exception e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 	        	listener.getLogger().println( "[WSO2 Deployer] Waning: Version is set to default (1.0)" );
 			}
         } else {
         	listener.getLogger().println( "[WSO2 Deployer] Waning: Version is set to default (1.0)" );
         }
    	return version;
    }
    
    // --------------------------------------------------------------------------------------------
	
	@Extension // This indicates to Jenkins that this is an implementation of an extension point.
	public static final class DescriptorImpl extends BuildStepDescriptor<Publisher> {
	       
		public DescriptorImpl() {
			super(Wso2asPublisher.class);
			load();
		}

		public boolean isApplicable( Class<? extends AbstractProject> aClass ) {
			// Indicates that this builder can be used with all kinds of project types
			return true;
		}

		@Override
		public boolean configure( StaplerRequest req, JSONObject json ) throws FormException {
			req.bindJSON(this, json);
			save();
			return true;
		}

		/** This human readable name is used in the configuration screen. */
		public String getDisplayName() {
			return "Deploy WAR to WSO2 AS";
		}
	}

}
