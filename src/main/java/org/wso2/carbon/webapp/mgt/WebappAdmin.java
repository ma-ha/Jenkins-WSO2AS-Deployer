package org.wso2.carbon.webapp.mgt;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2013-12-20T13:24:53.199+01:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "WebappAdmin", 
                  wsdlLocation = "../WebappAdmin.wsdl",
                  targetNamespace = "http://mgt.webapp.carbon.wso2.org") 
public class WebappAdmin extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://mgt.webapp.carbon.wso2.org", "WebappAdmin");
    public final static QName WebappAdminHttpsSoap12Endpoint = new QName("http://mgt.webapp.carbon.wso2.org", "WebappAdminHttpsSoap12Endpoint");
    public final static QName WebappAdminHttpsEndpoint = new QName("http://mgt.webapp.carbon.wso2.org", "WebappAdminHttpsEndpoint");
    public final static QName WebappAdminHttpsSoap11Endpoint = new QName("http://mgt.webapp.carbon.wso2.org", "WebappAdminHttpsSoap11Endpoint");
    static {
        URL url = WebappAdmin.class.getResource("../WebappAdmin.wsdl");
        if (url == null) {
            url = WebappAdmin.class.getClassLoader().getResource("../WebappAdmin.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(WebappAdmin.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "../WebappAdmin.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public WebappAdmin(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WebappAdmin(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebappAdmin() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WebappAdmin(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WebappAdmin(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WebappAdmin(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns WebappAdminPortType
     */
    @WebEndpoint(name = "WebappAdminHttpsSoap12Endpoint")
    public WebappAdminPortType getWebappAdminHttpsSoap12Endpoint() {
        return super.getPort(WebappAdminHttpsSoap12Endpoint, WebappAdminPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebappAdminPortType
     */
    @WebEndpoint(name = "WebappAdminHttpsSoap12Endpoint")
    public WebappAdminPortType getWebappAdminHttpsSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(WebappAdminHttpsSoap12Endpoint, WebappAdminPortType.class, features);
    }
    /**
     *
     * @return
     *     returns WebappAdminPortType
     */
    @WebEndpoint(name = "WebappAdminHttpsEndpoint")
    public WebappAdminPortType getWebappAdminHttpsEndpoint() {
        return super.getPort(WebappAdminHttpsEndpoint, WebappAdminPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebappAdminPortType
     */
    @WebEndpoint(name = "WebappAdminHttpsEndpoint")
    public WebappAdminPortType getWebappAdminHttpsEndpoint(WebServiceFeature... features) {
        return super.getPort(WebappAdminHttpsEndpoint, WebappAdminPortType.class, features);
    }
    /**
     *
     * @return
     *     returns WebappAdminPortType
     */
    @WebEndpoint(name = "WebappAdminHttpsSoap11Endpoint")
    public WebappAdminPortType getWebappAdminHttpsSoap11Endpoint() {
        return super.getPort(WebappAdminHttpsSoap11Endpoint, WebappAdminPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebappAdminPortType
     */
    @WebEndpoint(name = "WebappAdminHttpsSoap11Endpoint")
    public WebappAdminPortType getWebappAdminHttpsSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(WebappAdminHttpsSoap11Endpoint, WebappAdminPortType.class, features);
    }

}
