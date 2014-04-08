package org.mh.jenkins.wso2.WSO2Deployment;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import hudson.model.BuildListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.wso2.carbon.webapp.mgt.WebappAdminPortType;
import org.wso2.carbon.webapp.mgt.xsd.WebappUploadData;

/** 
 * Deploy test for WSO2 Application Server 5.2
 *  
 *  @author mh 
 */
public class Wso2AsDeployHelper {

    /**
     * File read buffer size.
     */
    private static final int READ_BUFFER_SIZE = 4096;
	/** the admin web service proxy */
	public WebappAdminPortType adminSvc;
	private BuildListener listener;
		
	/** construct proxy */
	public Wso2AsDeployHelper( String serviceUrl, String adminUser, String adminPwd, BuildListener listener  ) {
		this.listener = listener;
		listener.getLogger().println( "[WSO2 Deployer] Init WSO2 SOAP client proxy (CXF 2.7.x type)..." );
		
		Properties properties = System.getProperties();
		properties.put( "org.apache.cxf.stax.allowInsecureParser", "1" );
		System.setProperties( properties ); 
		
		//ClientProxyFactoryBean
        JaxWsProxyFactoryBean clientFactory = new JaxWsProxyFactoryBean(); 
        
        /* serviceUrl = "https://localhost:9443" */ 
        String adminURL = serviceUrl + "WebappAdmin.WebappAdminHttpsEndpoint/";
        listener.getLogger().println( "[WSO2 Deployer] Endpoint URL: "+adminURL);

        clientFactory.setAddress( adminURL );
		clientFactory.setServiceClass( WebappAdminPortType.class );
		clientFactory.setUsername( adminUser );
		clientFactory.setPassword( adminPwd );
		
		listener.getLogger().println( "[WSO2 Deployer] start proxy ..." );
		adminSvc =	(WebappAdminPortType) clientFactory.create();
		
		Client clientProxy = ClientProxy.getClient( adminSvc );
		
		HTTPConduit conduit = (HTTPConduit) clientProxy.getConduit();
		HTTPClientPolicy httpClientPolicy = conduit.getClient();
		httpClientPolicy.setAllowChunking(false);
		
		String targetAddr = conduit.getTarget().getAddress().getValue();
		if ( targetAddr.toLowerCase().startsWith("https:") ) {
			TrustManager[] simpleTrustManager = new TrustManager[] { 
					new X509TrustManager() {
						public java.security.cert.X509Certificate[] getAcceptedIssuers() {
							return null;
						}
		
						public void checkClientTrusted(
							java.security.cert.X509Certificate[] certs, String authType) {
						}
		
						public void checkServerTrusted(
								java.security.cert.X509Certificate[] certs, String authType) {
						}
					} 
			};
			TLSClientParameters tlsParams = new TLSClientParameters();
			tlsParams.setTrustManagers(simpleTrustManager);
			tlsParams.setDisableCNCheck(true); //TODO enable CN check
			conduit.setTlsClientParameters(tlsParams);
		}
	}
	

	/** prepare input data for war upload web service */ 
    private WebappUploadData getUploadData( InputStream fin, String name, String version) throws Exception {
        WebappUploadData data = new WebappUploadData();
        listener.getLogger().println( "[WSO2 Deployer] Prepare uploadWebapp for "+name+" ...");
        
        //File file = new File( warFilename );
        //FileInputStream fin = new FileInputStream( deployable );
        final byte fileContent[] = readFully(fin);
        final int cnt = fileContent.length;
        listener.getLogger().println( "[WSO2 Deployer] Read war with "+cnt+" bytes" );
        fin.close();
        
        org.wso2.carbon.webapp.mgt.xsd.ObjectFactory webappAdmObjFactory = new org.wso2.carbon.webapp.mgt.xsd.ObjectFactory();

        data.setFileName( webappAdmObjFactory.createWebappUploadDataFileName( name ) );
        data.setVersion( webappAdmObjFactory.createWebappUploadDataVersion( version ) );
        data.setDataHandler( webappAdmObjFactory.createWebappUploadDataDataHandler( fileContent ) );

        return data;
    }
    
    /** upload war via SOAP admin web service */
    public boolean upload( InputStream deployable, String warFileName, String version ) {
    	listener.getLogger().println( "[WSO2 Deployer] Start WAR upload" );
    	
    	WebappUploadData warUpload;
		try {
			warUpload = getUploadData( deployable, warFileName, version );
		} catch (Exception e) {
			e.printStackTrace();
			return false;	
		}
        
        List<WebappUploadData> webappUploadDataList = new ArrayList<WebappUploadData>();
        webappUploadDataList.add( warUpload );
        
        listener.getLogger().println( "[WSO2 Deployer] Invoking uploadWebapp for "+warFileName+" ...");
        Boolean uplResult = adminSvc.uploadWebapp( webappUploadDataList  );
        
        listener.getLogger().println( "[WSO2 Deployer] Upload "+warFileName+" result: "+uplResult );
        
        return uplResult;
    }

    /**
     * Read all data available in this input stream and return it as byte[].
     * Take care for memory on large files!
     * <p>
     * Imported from org.jcoderz.commons.util.IoUtil</p>
     *
     * @param is the input stream to read from (will not be closed).
     * @return a byte array containing all data read from the is.
     */
    private byte[] readFully(InputStream is) throws IOException {
        final byte[] buffer = new byte[READ_BUFFER_SIZE];
        int read = 0;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        while ((read = is.read(buffer)) >= 0) {
            out.write(buffer, 0, read);
        }

        return out.toByteArray();
    }
	
}
