
package axis2.apache.org.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.wso2.carbon.core.persistence.metadata.xsd.ArtifactMetadataException;
import org.wso2.carbon.webapp.mgt.xsd.SessionsWrapper;
import org.wso2.carbon.webapp.mgt.xsd.WebappMetadata;
import org.wso2.carbon.webapp.mgt.xsd.WebappsWrapper;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the axis2.apache.org.xsd package. 
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

    private final static QName _ExpireSessionsWebappFileName_QNAME = new QName("http://org.apache.axis2/xsd", "webappFileName");
    private final static QName _GetStartedWebappResponseReturn_QNAME = new QName("http://org.apache.axis2/xsd", "return");
    private final static QName _SetBamConfigurationValue_QNAME = new QName("http://org.apache.axis2/xsd", "value");
    private final static QName _GetPagedWebappsSummaryWebappState_QNAME = new QName("http://org.apache.axis2/xsd", "webappState");
    private final static QName _GetPagedWebappsSummaryWebappType_QNAME = new QName("http://org.apache.axis2/xsd", "webappType");
    private final static QName _GetPagedWebappsSummaryWebappSearchString_QNAME = new QName("http://org.apache.axis2/xsd", "webappSearchString");
    private final static QName _WebappAdminArtifactMetadataExceptionArtifactMetadataException_QNAME = new QName("http://org.apache.axis2/xsd", "ArtifactMetadataException");
    private final static QName _ChangeDefaultAppVersionFileName_QNAME = new QName("http://org.apache.axis2/xsd", "fileName");
    private final static QName _ChangeDefaultAppVersionAppGroupName_QNAME = new QName("http://org.apache.axis2/xsd", "appGroupName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: axis2.apache.org.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeDefaultAppVersion }
     * 
     */
    public ChangeDefaultAppVersion createChangeDefaultAppVersion() {
        return new ChangeDefaultAppVersion();
    }

    /**
     * Create an instance of {@link StopAllWebapps }
     * 
     */
    public StopAllWebapps createStopAllWebapps() {
        return new StopAllWebapps();
    }

    /**
     * Create an instance of {@link ExpireAllSessions }
     * 
     */
    public ExpireAllSessions createExpireAllSessions() {
        return new ExpireAllSessions();
    }

    /**
     * Create an instance of {@link GetActiveSessions }
     * 
     */
    public GetActiveSessions createGetActiveSessions() {
        return new GetActiveSessions();
    }

    /**
     * Create an instance of {@link DeleteAllFaultyWebapps }
     * 
     */
    public DeleteAllFaultyWebapps createDeleteAllFaultyWebapps() {
        return new DeleteAllFaultyWebapps();
    }

    /**
     * Create an instance of {@link IsDefaultVersionManagementEnabledResponse }
     * 
     */
    public IsDefaultVersionManagementEnabledResponse createIsDefaultVersionManagementEnabledResponse() {
        return new IsDefaultVersionManagementEnabledResponse();
    }

    /**
     * Create an instance of {@link GetStoppedWebappResponse }
     * 
     */
    public GetStoppedWebappResponse createGetStoppedWebappResponse() {
        return new GetStoppedWebappResponse();
    }

    /**
     * Create an instance of {@link GetStoppedWebapp }
     * 
     */
    public GetStoppedWebapp createGetStoppedWebapp() {
        return new GetStoppedWebapp();
    }

    /**
     * Create an instance of {@link UploadWebapp }
     * 
     */
    public UploadWebapp createUploadWebapp() {
        return new UploadWebapp();
    }

    /**
     * Create an instance of {@link GetStartedWebappResponse }
     * 
     */
    public GetStartedWebappResponse createGetStartedWebappResponse() {
        return new GetStartedWebappResponse();
    }

    /**
     * Create an instance of {@link ExpireSessions }
     * 
     */
    public ExpireSessions createExpireSessions() {
        return new ExpireSessions();
    }

    /**
     * Create an instance of {@link DeleteAllStartedWebapps }
     * 
     */
    public DeleteAllStartedWebapps createDeleteAllStartedWebapps() {
        return new DeleteAllStartedWebapps();
    }

    /**
     * Create an instance of {@link StartAllWebapps }
     * 
     */
    public StartAllWebapps createStartAllWebapps() {
        return new StartAllWebapps();
    }

    /**
     * Create an instance of {@link GetPagedWebappsSummary }
     * 
     */
    public GetPagedWebappsSummary createGetPagedWebappsSummary() {
        return new GetPagedWebappsSummary();
    }

    /**
     * Create an instance of {@link DeleteStoppedWebapps }
     * 
     */
    public DeleteStoppedWebapps createDeleteStoppedWebapps() {
        return new DeleteStoppedWebapps();
    }

    /**
     * Create an instance of {@link SetBamConfiguration }
     * 
     */
    public SetBamConfiguration createSetBamConfiguration() {
        return new SetBamConfiguration();
    }

    /**
     * Create an instance of {@link WebappAdminArtifactMetadataException }
     * 
     */
    public WebappAdminArtifactMetadataException createWebappAdminArtifactMetadataException() {
        return new WebappAdminArtifactMetadataException();
    }

    /**
     * Create an instance of {@link IsDefaultVersionManagementEnabled }
     * 
     */
    public IsDefaultVersionManagementEnabled createIsDefaultVersionManagementEnabled() {
        return new IsDefaultVersionManagementEnabled();
    }

    /**
     * Create an instance of {@link StartWebapps }
     * 
     */
    public StartWebapps createStartWebapps() {
        return new StartWebapps();
    }

    /**
     * Create an instance of {@link DeleteWebapp }
     * 
     */
    public DeleteWebapp createDeleteWebapp() {
        return new DeleteWebapp();
    }

    /**
     * Create an instance of {@link IsUnpackWARs }
     * 
     */
    public IsUnpackWARs createIsUnpackWARs() {
        return new IsUnpackWARs();
    }

    /**
     * Create an instance of {@link GetStartedWebapp }
     * 
     */
    public GetStartedWebapp createGetStartedWebapp() {
        return new GetStartedWebapp();
    }

    /**
     * Create an instance of {@link GetPagedWebappsSummaryResponse }
     * 
     */
    public GetPagedWebappsSummaryResponse createGetPagedWebappsSummaryResponse() {
        return new GetPagedWebappsSummaryResponse();
    }

    /**
     * Create an instance of {@link DeleteAllWebApps }
     * 
     */
    public DeleteAllWebApps createDeleteAllWebApps() {
        return new DeleteAllWebApps();
    }

    /**
     * Create an instance of {@link IsUnpackWARsResponse }
     * 
     */
    public IsUnpackWARsResponse createIsUnpackWARsResponse() {
        return new IsUnpackWARsResponse();
    }

    /**
     * Create an instance of {@link ReloadAllWebapps }
     * 
     */
    public ReloadAllWebapps createReloadAllWebapps() {
        return new ReloadAllWebapps();
    }

    /**
     * Create an instance of {@link DeleteFaultyWebapps }
     * 
     */
    public DeleteFaultyWebapps createDeleteFaultyWebapps() {
        return new DeleteFaultyWebapps();
    }

    /**
     * Create an instance of {@link GetPagedFaultyWebappsSummaryResponse }
     * 
     */
    public GetPagedFaultyWebappsSummaryResponse createGetPagedFaultyWebappsSummaryResponse() {
        return new GetPagedFaultyWebappsSummaryResponse();
    }

    /**
     * Create an instance of {@link GetBamConfiguration }
     * 
     */
    public GetBamConfiguration createGetBamConfiguration() {
        return new GetBamConfiguration();
    }

    /**
     * Create an instance of {@link ReloadWebapps }
     * 
     */
    public ReloadWebapps createReloadWebapps() {
        return new ReloadWebapps();
    }

    /**
     * Create an instance of {@link GetBamConfigurationResponse }
     * 
     */
    public GetBamConfigurationResponse createGetBamConfigurationResponse() {
        return new GetBamConfigurationResponse();
    }

    /**
     * Create an instance of {@link DeleteStartedWebapps }
     * 
     */
    public DeleteStartedWebapps createDeleteStartedWebapps() {
        return new DeleteStartedWebapps();
    }

    /**
     * Create an instance of {@link ExpireSessionsInWebapps }
     * 
     */
    public ExpireSessionsInWebapps createExpireSessionsInWebapps() {
        return new ExpireSessionsInWebapps();
    }

    /**
     * Create an instance of {@link ExpireSessionsInAllWebapps }
     * 
     */
    public ExpireSessionsInAllWebapps createExpireSessionsInAllWebapps() {
        return new ExpireSessionsInAllWebapps();
    }

    /**
     * Create an instance of {@link GetActiveSessionsResponse }
     * 
     */
    public GetActiveSessionsResponse createGetActiveSessionsResponse() {
        return new GetActiveSessionsResponse();
    }

    /**
     * Create an instance of {@link StopWebapps }
     * 
     */
    public StopWebapps createStopWebapps() {
        return new StopWebapps();
    }

    /**
     * Create an instance of {@link DownloadWarFileHandlerResponse }
     * 
     */
    public DownloadWarFileHandlerResponse createDownloadWarFileHandlerResponse() {
        return new DownloadWarFileHandlerResponse();
    }

    /**
     * Create an instance of {@link DownloadWarFileHandler }
     * 
     */
    public DownloadWarFileHandler createDownloadWarFileHandler() {
        return new DownloadWarFileHandler();
    }

    /**
     * Create an instance of {@link UploadWebappResponse }
     * 
     */
    public UploadWebappResponse createUploadWebappResponse() {
        return new UploadWebappResponse();
    }

    /**
     * Create an instance of {@link ExpireSessionsInWebapp }
     * 
     */
    public ExpireSessionsInWebapp createExpireSessionsInWebapp() {
        return new ExpireSessionsInWebapp();
    }

    /**
     * Create an instance of {@link GetPagedFaultyWebappsSummary }
     * 
     */
    public GetPagedFaultyWebappsSummary createGetPagedFaultyWebappsSummary() {
        return new GetPagedFaultyWebappsSummary();
    }

    /**
     * Create an instance of {@link DeleteAllStoppedWebapps }
     * 
     */
    public DeleteAllStoppedWebapps createDeleteAllStoppedWebapps() {
        return new DeleteAllStoppedWebapps();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappFileName", scope = ExpireSessions.class)
    public JAXBElement<String> createExpireSessionsWebappFileName(String value) {
        return new JAXBElement<String>(_ExpireSessionsWebappFileName_QNAME, String.class, ExpireSessions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappFileName", scope = GetStoppedWebapp.class)
    public JAXBElement<String> createGetStoppedWebappWebappFileName(String value) {
        return new JAXBElement<String>(_ExpireSessionsWebappFileName_QNAME, String.class, GetStoppedWebapp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappFileName", scope = GetBamConfiguration.class)
    public JAXBElement<String> createGetBamConfigurationWebappFileName(String value) {
        return new JAXBElement<String>(_ExpireSessionsWebappFileName_QNAME, String.class, GetBamConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappFileName", scope = ExpireSessionsInWebapp.class)
    public JAXBElement<String> createExpireSessionsInWebappWebappFileName(String value) {
        return new JAXBElement<String>(_ExpireSessionsWebappFileName_QNAME, String.class, ExpireSessionsInWebapp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebappMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "return", scope = GetStartedWebappResponse.class)
    public JAXBElement<WebappMetadata> createGetStartedWebappResponseReturn(WebappMetadata value) {
        return new JAXBElement<WebappMetadata>(_GetStartedWebappResponseReturn_QNAME, WebappMetadata.class, GetStartedWebappResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappFileName", scope = ExpireAllSessions.class)
    public JAXBElement<String> createExpireAllSessionsWebappFileName(String value) {
        return new JAXBElement<String>(_ExpireSessionsWebappFileName_QNAME, String.class, ExpireAllSessions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappFileName", scope = GetStartedWebapp.class)
    public JAXBElement<String> createGetStartedWebappWebappFileName(String value) {
        return new JAXBElement<String>(_ExpireSessionsWebappFileName_QNAME, String.class, GetStartedWebapp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "value", scope = SetBamConfiguration.class)
    public JAXBElement<String> createSetBamConfigurationValue(String value) {
        return new JAXBElement<String>(_SetBamConfigurationValue_QNAME, String.class, SetBamConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappFileName", scope = SetBamConfiguration.class)
    public JAXBElement<String> createSetBamConfigurationWebappFileName(String value) {
        return new JAXBElement<String>(_ExpireSessionsWebappFileName_QNAME, String.class, SetBamConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionsWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "return", scope = GetActiveSessionsResponse.class)
    public JAXBElement<SessionsWrapper> createGetActiveSessionsResponseReturn(SessionsWrapper value) {
        return new JAXBElement<SessionsWrapper>(_GetStartedWebappResponseReturn_QNAME, SessionsWrapper.class, GetActiveSessionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappState", scope = GetPagedWebappsSummary.class)
    public JAXBElement<String> createGetPagedWebappsSummaryWebappState(String value) {
        return new JAXBElement<String>(_GetPagedWebappsSummaryWebappState_QNAME, String.class, GetPagedWebappsSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappType", scope = GetPagedWebappsSummary.class)
    public JAXBElement<String> createGetPagedWebappsSummaryWebappType(String value) {
        return new JAXBElement<String>(_GetPagedWebappsSummaryWebappType_QNAME, String.class, GetPagedWebappsSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappSearchString", scope = GetPagedWebappsSummary.class)
    public JAXBElement<String> createGetPagedWebappsSummaryWebappSearchString(String value) {
        return new JAXBElement<String>(_GetPagedWebappsSummaryWebappSearchString_QNAME, String.class, GetPagedWebappsSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtifactMetadataException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "ArtifactMetadataException", scope = WebappAdminArtifactMetadataException.class)
    public JAXBElement<ArtifactMetadataException> createWebappAdminArtifactMetadataExceptionArtifactMetadataException(ArtifactMetadataException value) {
        return new JAXBElement<ArtifactMetadataException>(_WebappAdminArtifactMetadataExceptionArtifactMetadataException_QNAME, ArtifactMetadataException.class, WebappAdminArtifactMetadataException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "fileName", scope = ChangeDefaultAppVersion.class)
    public JAXBElement<String> createChangeDefaultAppVersionFileName(String value) {
        return new JAXBElement<String>(_ChangeDefaultAppVersionFileName_QNAME, String.class, ChangeDefaultAppVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "appGroupName", scope = ChangeDefaultAppVersion.class)
    public JAXBElement<String> createChangeDefaultAppVersionAppGroupName(String value) {
        return new JAXBElement<String>(_ChangeDefaultAppVersionAppGroupName_QNAME, String.class, ChangeDefaultAppVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebappsWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "return", scope = GetPagedFaultyWebappsSummaryResponse.class)
    public JAXBElement<WebappsWrapper> createGetPagedFaultyWebappsSummaryResponseReturn(WebappsWrapper value) {
        return new JAXBElement<WebappsWrapper>(_GetStartedWebappResponseReturn_QNAME, WebappsWrapper.class, GetPagedFaultyWebappsSummaryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappFileName", scope = GetActiveSessions.class)
    public JAXBElement<String> createGetActiveSessionsWebappFileName(String value) {
        return new JAXBElement<String>(_ExpireSessionsWebappFileName_QNAME, String.class, GetActiveSessions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "return", scope = GetBamConfigurationResponse.class)
    public JAXBElement<String> createGetBamConfigurationResponseReturn(String value) {
        return new JAXBElement<String>(_GetStartedWebappResponseReturn_QNAME, String.class, GetBamConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebappsWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "return", scope = GetPagedWebappsSummaryResponse.class)
    public JAXBElement<WebappsWrapper> createGetPagedWebappsSummaryResponseReturn(WebappsWrapper value) {
        return new JAXBElement<WebappsWrapper>(_GetStartedWebappResponseReturn_QNAME, WebappsWrapper.class, GetPagedWebappsSummaryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebappMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "return", scope = GetStoppedWebappResponse.class)
    public JAXBElement<WebappMetadata> createGetStoppedWebappResponseReturn(WebappMetadata value) {
        return new JAXBElement<WebappMetadata>(_GetStartedWebappResponseReturn_QNAME, WebappMetadata.class, GetStoppedWebappResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappType", scope = GetPagedFaultyWebappsSummary.class)
    public JAXBElement<String> createGetPagedFaultyWebappsSummaryWebappType(String value) {
        return new JAXBElement<String>(_GetPagedWebappsSummaryWebappType_QNAME, String.class, GetPagedFaultyWebappsSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappSearchString", scope = GetPagedFaultyWebappsSummary.class)
    public JAXBElement<String> createGetPagedFaultyWebappsSummaryWebappSearchString(String value) {
        return new JAXBElement<String>(_GetPagedWebappsSummaryWebappSearchString_QNAME, String.class, GetPagedFaultyWebappsSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "fileName", scope = DownloadWarFileHandler.class)
    public JAXBElement<String> createDownloadWarFileHandlerFileName(String value) {
        return new JAXBElement<String>(_ChangeDefaultAppVersionFileName_QNAME, String.class, DownloadWarFileHandler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappType", scope = DownloadWarFileHandler.class)
    public JAXBElement<String> createDownloadWarFileHandlerWebappType(String value) {
        return new JAXBElement<String>(_GetPagedWebappsSummaryWebappType_QNAME, String.class, DownloadWarFileHandler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "webappFileName", scope = DeleteWebapp.class)
    public JAXBElement<String> createDeleteWebappWebappFileName(String value) {
        return new JAXBElement<String>(_ExpireSessionsWebappFileName_QNAME, String.class, DeleteWebapp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "return", scope = DownloadWarFileHandlerResponse.class)
    public JAXBElement<byte[]> createDownloadWarFileHandlerResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_GetStartedWebappResponseReturn_QNAME, byte[].class, DownloadWarFileHandlerResponse.class, ((byte[]) value));
    }

}
