Jenkins-WSO2AS-Deployer
=======================
Jenkins plugin deploys WAR files to a WSO2 Application Server via SOAP admin API.

Prepare Jenkins:
----------------
1. You should start the WSO2 Server and open the carbon console in the browser. 
2. Copy the certificate to a local file, e.g. wso2-as.cert
3. Load the certificate into your keystore (it will go to ~/.keystore by default):<br>
   <tt>keytool -import -trustcacerts -alias wso2as-key -file wso2-as.cert</tt>
4. Add parameter in Jenkins for Maven to trust the certificate of the WSO2 AS server: Manage Jenkins > Configure System > Global MAVEN_OPTS:<br>
  -Djavax.net.ssl.trustStore=/home/mh/.keystore -Djavax.net.ssl.trustStorePassword=changeit

Build the Plugin
----------------
Get the sources via

<tt>git clone https://github.com/ma-ha/Jenkins-WSO2AS-Deployer.git</tt>

Simply call:

<tt>mvn clean install -Dmaven.test.skip=true</tt>

Use the Jenkins Plugin:
----------------------
1. Load the Plugin (target/Jenkins-WSO2AS-Deployer.hpi) into Jenkins (Manage Jenkins > Manage Plugins)
2. Restart Jenkins
3. Configure your project to use "Deploy to WSO2 AS" as "Post-build Actions"
4. Fill out the configuration form

This plugin don't undeploy any old versions. If you don't change the version of the WAR in your pom.xml, the WAR is replaced. 
By changing the version, you may have two WARs running in the application server. If you don't want this, you have to stop or 
undeploy them manually.

Jenkins Parameterized Build:
----------------------------
You can use build parameters and put them into the plug in form as $ parameters. This is ideal to reduce the number of build of jobs.
Lets say you have defined the parameter <tt>URL</tt> as build parameter, you can type <tt>$URL</tt> into the 'WSO2 Service URL' field, 
to tell the plug in to use this parameter as service URL. 

Currently you can either use static strings or a parameter, replacement of sub strings is not possible. 
Please feel free to implement this, if you need it.

New in version 0.12:
--------------------
* Checkbox in job config to deploy w/o the artifact version. This can switch between a <tt>[target-name]#[version].war</tt> and a <tt>[target-name].war</tt> deployment, without a version sub-context in Tomcat.
* Improved error handling
 
