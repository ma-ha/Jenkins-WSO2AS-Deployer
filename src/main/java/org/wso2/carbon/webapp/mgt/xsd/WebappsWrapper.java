
package org.wso2.carbon.webapp.mgt.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebappsWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebappsWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="httpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="httpsPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfCorrectWebapps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfFaultyWebapps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="webapps" type="{http://mgt.webapp.carbon.wso2.org/xsd}VersionedWebappMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="webappsDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebappsWrapper", propOrder = {
    "hostName",
    "httpPort",
    "httpsPort",
    "numberOfCorrectWebapps",
    "numberOfFaultyWebapps",
    "numberOfPages",
    "webapps",
    "webappsDir"
})
public class WebappsWrapper {

    @XmlElementRef(name = "hostName", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostName;
    protected Integer httpPort;
    protected Integer httpsPort;
    protected Integer numberOfCorrectWebapps;
    protected Integer numberOfFaultyWebapps;
    protected Integer numberOfPages;
    @XmlElement(nillable = true)
    protected List<VersionedWebappMetadata> webapps;
    @XmlElementRef(name = "webappsDir", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webappsDir;

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostName(JAXBElement<String> value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the httpPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHttpPort() {
        return httpPort;
    }

    /**
     * Sets the value of the httpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHttpPort(Integer value) {
        this.httpPort = value;
    }

    /**
     * Gets the value of the httpsPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHttpsPort() {
        return httpsPort;
    }

    /**
     * Sets the value of the httpsPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHttpsPort(Integer value) {
        this.httpsPort = value;
    }

    /**
     * Gets the value of the numberOfCorrectWebapps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfCorrectWebapps() {
        return numberOfCorrectWebapps;
    }

    /**
     * Sets the value of the numberOfCorrectWebapps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfCorrectWebapps(Integer value) {
        this.numberOfCorrectWebapps = value;
    }

    /**
     * Gets the value of the numberOfFaultyWebapps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfFaultyWebapps() {
        return numberOfFaultyWebapps;
    }

    /**
     * Sets the value of the numberOfFaultyWebapps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfFaultyWebapps(Integer value) {
        this.numberOfFaultyWebapps = value;
    }

    /**
     * Gets the value of the numberOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPages(Integer value) {
        this.numberOfPages = value;
    }

    /**
     * Gets the value of the webapps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webapps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebapps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VersionedWebappMetadata }
     * 
     * 
     */
    public List<VersionedWebappMetadata> getWebapps() {
        if (webapps == null) {
            webapps = new ArrayList<VersionedWebappMetadata>();
        }
        return this.webapps;
    }

    /**
     * Gets the value of the webappsDir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebappsDir() {
        return webappsDir;
    }

    /**
     * Sets the value of the webappsDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebappsDir(JAXBElement<String> value) {
        this.webappsDir = value;
    }

}
