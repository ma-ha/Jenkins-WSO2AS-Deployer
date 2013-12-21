Jenkins-WSO2AS-Deployer
=======================
Jenkins plugin deploys WAR files to a WSO2 Application Server via SOAP admin API.

Prepare Jenkins:
----------------
1. You should start the WSO2 Server and open the carbon console in the browser. 
2. Copy the certificate to al local file, e.g. wso2-as.cert
3. Load the certificate into your keystore (it will go to ~/.keystore by default):
   keytool -import -trustcacerts -alias wso2as-key -file wso2-as.cert
4. Add parameter in Jenkins for Maven to trust the certificate of the WSO2 AS server: Manage Jenkins > Configure System > Global MAVEN_OPTS:
  -Djavax.net.ssl.trustStore=/home/mh/.keystore -Djavax.net.ssl.trustStorePassword=changeit

Build the Plugin
----------------
mvn clean install -Dmaven.test.skip=true

Use the Jenkins Plugin:
----------------------
1. Upload the Plugin
2. Configure your project to use "Deploy to WSO2 AS" as "Post-build Actions"
3. Fill out the configuration form