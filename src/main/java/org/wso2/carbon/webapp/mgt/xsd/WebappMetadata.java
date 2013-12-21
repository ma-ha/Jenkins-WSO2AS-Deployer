
package org.wso2.carbon.webapp.mgt.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebappMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebappMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contextPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faultException" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faulty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="running" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serviceListPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servletContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="started" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statistics" type="{http://mgt.webapp.carbon.wso2.org/xsd}WebappStatistics" minOccurs="0"/>
 *         &lt;element name="webappFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webappType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebappMetadata", propOrder = {
    "appVersion",
    "context",
    "contextPath",
    "displayName",
    "faultException",
    "faulty",
    "lastModifiedTime",
    "running",
    "serviceListPath",
    "servletContext",
    "started",
    "state",
    "statistics",
    "webappFile",
    "webappType"
})
public class WebappMetadata {

    @XmlElementRef(name = "appVersion", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> appVersion;
    @XmlElementRef(name = "context", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> context;
    @XmlElementRef(name = "contextPath", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contextPath;
    @XmlElementRef(name = "displayName", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayName;
    @XmlElementRef(name = "faultException", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faultException;
    protected Boolean faulty;
    protected Long lastModifiedTime;
    protected Boolean running;
    @XmlElementRef(name = "serviceListPath", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceListPath;
    @XmlElementRef(name = "servletContext", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> servletContext;
    protected Boolean started;
    @XmlElementRef(name = "state", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "statistics", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<WebappStatistics> statistics;
    @XmlElementRef(name = "webappFile", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webappFile;
    @XmlElementRef(name = "webappType", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webappType;

    /**
     * Gets the value of the appVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppVersion() {
        return appVersion;
    }

    /**
     * Sets the value of the appVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppVersion(JAXBElement<String> value) {
        this.appVersion = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContext(JAXBElement<String> value) {
        this.context = value;
    }

    /**
     * Gets the value of the contextPath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContextPath() {
        return contextPath;
    }

    /**
     * Sets the value of the contextPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContextPath(JAXBElement<String> value) {
        this.contextPath = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayName(JAXBElement<String> value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the faultException property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaultException() {
        return faultException;
    }

    /**
     * Sets the value of the faultException property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaultException(JAXBElement<String> value) {
        this.faultException = value;
    }

    /**
     * Gets the value of the faulty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaulty() {
        return faulty;
    }

    /**
     * Sets the value of the faulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaulty(Boolean value) {
        this.faulty = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastModifiedTime(Long value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the running property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunning() {
        return running;
    }

    /**
     * Sets the value of the running property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunning(Boolean value) {
        this.running = value;
    }

    /**
     * Gets the value of the serviceListPath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceListPath() {
        return serviceListPath;
    }

    /**
     * Sets the value of the serviceListPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceListPath(JAXBElement<String> value) {
        this.serviceListPath = value;
    }

    /**
     * Gets the value of the servletContext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServletContext() {
        return servletContext;
    }

    /**
     * Sets the value of the servletContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServletContext(JAXBElement<String> value) {
        this.servletContext = value;
    }

    /**
     * Gets the value of the started property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStarted() {
        return started;
    }

    /**
     * Sets the value of the started property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStarted(Boolean value) {
        this.started = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WebappStatistics }{@code >}
     *     
     */
    public JAXBElement<WebappStatistics> getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WebappStatistics }{@code >}
     *     
     */
    public void setStatistics(JAXBElement<WebappStatistics> value) {
        this.statistics = value;
    }

    /**
     * Gets the value of the webappFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebappFile() {
        return webappFile;
    }

    /**
     * Sets the value of the webappFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebappFile(JAXBElement<String> value) {
        this.webappFile = value;
    }

    /**
     * Gets the value of the webappType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebappType() {
        return webappType;
    }

    /**
     * Sets the value of the webappType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebappType(JAXBElement<String> value) {
        this.webappType = value;
    }

}
