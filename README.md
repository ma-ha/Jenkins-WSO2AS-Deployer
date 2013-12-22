Jenkins-WSO2AS-Deployer
=======================
Jenkins plugin deploys WAR files to a WSO2 Application Server via SOAP admin API.

Prepare Jenkins:
----------------
1. You should start the WSO2 Server and open the carbon console in the browser. 
2. Copy the certificate to a local file, e.g. wso2-as.cert
3. Load the certificate into your keystore (it will go to ~/.keystore by default):
   <tt>keytool -import -trustcacerts -alias wso2as-key -file wso2-as.cert</tt>
4. Add parameter in Jenkins for Maven to trust the certificate of the WSO2 AS server: Manage Jenkins > Configure System > Global MAVEN_OPTS:
  -Djavax.net.ssl.trustStore=/home/mh/.keystore -Djavax.net.ssl.trustStorePassword=changeit

Build the Plugin
----------------
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