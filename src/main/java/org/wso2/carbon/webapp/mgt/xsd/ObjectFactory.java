
package org.wso2.carbon.webapp.mgt.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.wso2.carbon.webapp.mgt.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WebappMetadataWebappType_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "webappType");
    private final static QName _WebappMetadataWebappFile_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "webappFile");
    private final static QName _WebappMetadataServletContext_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "servletContext");
    private final static QName _WebappMetadataAppVersion_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "appVersion");
    private final static QName _WebappMetadataState_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "state");
    private final static QName _WebappMetadataServiceListPath_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "serviceListPath");
    private final static QName _WebappMetadataContext_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "context");
    private final static QName _WebappMetadataContextPath_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "contextPath");
    private final static QName _WebappMetadataDisplayName_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "displayName");
    private final static QName _WebappMetadataStatistics_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "statistics");
    private final static QName _WebappMetadataFaultException_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "faultException");
    private final static QName _SessionMetadataSessionId_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "sessionId");
    private final static QName _SessionMetadataAuthType_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "authType");
    private final static QName _VersionedWebappMetadataAppVersionRoot_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "appVersionRoot");
    private final static QName _WebappUploadDataFileName_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "fileName");
    private final static QName _WebappUploadDataDataHandler_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "dataHandler");
    private final static QName _WebappUploadDataVersion_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "version");
    private final static QName _SessionsWrapperWebappFileName_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "webappFileName");
    private final static QName _WebappsWrapperHostName_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "hostName");
    private final static QName _WebappsWrapperWebappsDir_QNAME = new QName("http://mgt.webapp.carbon.wso2.org/xsd", "webappsDir");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.wso2.carbon.webapp.mgt.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SessionsWrapper }
     * 
     */
    public SessionsWrapper createSessionsWrapper() {
        return new SessionsWrapper();
    }

    /**
     * Create an instance of {@link WebappStatistics }
     * 
     */
    public WebappStatistics createWebappStatistics() {
        return new WebappStatistics();
    }

    /**
     * Create an instance of {@link WebappsWrapper }
     * 
     */
    public WebappsWrapper createWebappsWrapper() {
        return new WebappsWrapper();
    }

    /**
     * Create an instance of {@link WebappUploadData }
     * 
     */
    public WebappUploadData createWebappUploadData() {
        return new WebappUploadData();
    }

    /**
     * Create an instance of {@link WebappMetadata }
     * 
     */
    public WebappMetadata createWebappMetadata() {
        return new WebappMetadata();
    }

    /**
     * Create an instance of {@link VersionedWebappMetadata }
     * 
     */
    public VersionedWebappMetadata createVersionedWebappMetadata() {
        return new VersionedWebappMetadata();
    }

    /**
     * Create an instance of {@link SessionMetadata }
     * 
     */
    public SessionMetadata createSessionMetadata() {
        return new SessionMetadata();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "webappType", scope = WebappMetadata.class)
    public JAXBElement<String> createWebappMetadataWebappType(String value) {
        return new JAXBElement<String>(_WebappMetadataWebappType_QNAME, String.class, WebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "webappFile", scope = WebappMetadata.class)
    public JAXBElement<String> createWebappMetadataWebappFile(String value) {
        return new JAXBElement<String>(_WebappMetadataWebappFile_QNAME, String.class, WebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "servletContext", scope = WebappMetadata.class)
    public JAXBElement<String> createWebappMetadataServletContext(String value) {
        return new JAXBElement<String>(_WebappMetadataServletContext_QNAME, String.class, WebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "appVersion", scope = WebappMetadata.class)
    public JAXBElement<String> createWebappMetadataAppVersion(String value) {
        return new JAXBElement<String>(_WebappMetadataAppVersion_QNAME, String.class, WebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "state", scope = WebappMetadata.class)
    public JAXBElement<String> createWebappMetadataState(String value) {
        return new JAXBElement<String>(_WebappMetadataState_QNAME, String.class, WebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "serviceListPath", scope = WebappMetadata.class)
    public JAXBElement<String> createWebappMetadataServiceListPath(String value) {
        return new JAXBElement<String>(_WebappMetadataServiceListPath_QNAME, String.class, WebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "context", scope = WebappMetadata.class)
    public JAXBElement<String> createWebappMetadataContext(String value) {
        return new JAXBElement<String>(_WebappMetadataContext_QNAME, String.class, WebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "contextPath", scope = WebappMetadata.class)
    public JAXBElement<String> createWebappMetadataContextPath(String value) {
        return new JAXBElement<String>(_WebappMetadataContextPath_QNAME, String.class, WebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "displayName", scope = WebappMetadata.class)
    public JAXBElement<String> createWebappMetadataDisplayName(String value) {
        return new JAXBElement<String>(_WebappMetadataDisplayName_QNAME, String.class, WebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebappStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "statistics", scope = WebappMetadata.class)
    public JAXBElement<WebappStatistics> createWebappMetadataStatistics(WebappStatistics value) {
        return new JAXBElement<WebappStatistics>(_WebappMetadataStatistics_QNAME, WebappStatistics.class, WebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "faultException", scope = WebappMetadata.class)
    public JAXBElement<String> createWebappMetadataFaultException(String value) {
        return new JAXBElement<String>(_WebappMetadataFaultException_QNAME, String.class, WebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "sessionId", scope = SessionMetadata.class)
    public JAXBElement<String> createSessionMetadataSessionId(String value) {
        return new JAXBElement<String>(_SessionMetadataSessionId_QNAME, String.class, SessionMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "authType", scope = SessionMetadata.class)
    public JAXBElement<String> createSessionMetadataAuthType(String value) {
        return new JAXBElement<String>(_SessionMetadataAuthType_QNAME, String.class, SessionMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "appVersionRoot", scope = VersionedWebappMetadata.class)
    public JAXBElement<String> createVersionedWebappMetadataAppVersionRoot(String value) {
        return new JAXBElement<String>(_VersionedWebappMetadataAppVersionRoot_QNAME, String.class, VersionedWebappMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "fileName", scope = WebappUploadData.class)
    public JAXBElement<String> createWebappUploadDataFileName(String value) {
        return new JAXBElement<String>(_WebappUploadDataFileName_QNAME, String.class, WebappUploadData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "dataHandler", scope = WebappUploadData.class)
    public JAXBElement<byte[]> createWebappUploadDataDataHandler(byte[] value) {
        return new JAXBElement<byte[]>(_WebappUploadDataDataHandler_QNAME, byte[].class, WebappUploadData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "version", scope = WebappUploadData.class)
    public JAXBElement<String> createWebappUploadDataVersion(String value) {
        return new JAXBElement<String>(_WebappUploadDataVersion_QNAME, String.class, WebappUploadData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "webappFileName", scope = SessionsWrapper.class)
    public JAXBElement<String> createSessionsWrapperWebappFileName(String value) {
        return new JAXBElement<String>(_SessionsWrapperWebappFileName_QNAME, String.class, SessionsWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "hostName", scope = WebappsWrapper.class)
    public JAXBElement<String> createWebappsWrapperHostName(String value) {
        return new JAXBElement<String>(_WebappsWrapperHostName_QNAME, String.class, WebappsWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mgt.webapp.carbon.wso2.org/xsd", name = "webappsDir", scope = WebappsWrapper.class)
    public JAXBElement<String> createWebappsWrapperWebappsDir(String value) {
        return new JAXBElement<String>(_WebappsWrapperWebappsDir_QNAME, String.class, WebappsWrapper.class, value);
    }

}
