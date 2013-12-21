
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
 * <p>Java class for VersionedWebappMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersionedWebappMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appVersionRoot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionGroups" type="{http://mgt.webapp.carbon.wso2.org/xsd}WebappMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionedWebappMetadata", propOrder = {
    "appVersionRoot",
    "versionGroups"
})
public class VersionedWebappMetadata {

    @XmlElementRef(name = "appVersionRoot", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> appVersionRoot;
    @XmlElement(nillable = true)
    protected List<WebappMetadata> versionGroups;

    /**
     * Gets the value of the appVersionRoot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppVersionRoot() {
        return appVersionRoot;
    }

    /**
     * Sets the value of the appVersionRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppVersionRoot(JAXBElement<String> value) {
        this.appVersionRoot = value;
    }

    /**
     * Gets the value of the versionGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versionGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersionGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebappMetadata }
     * 
     * 
     */
    public List<WebappMetadata> getVersionGroups() {
        if (versionGroups == null) {
            versionGroups = new ArrayList<WebappMetadata>();
        }
        return this.versionGroups;
    }

}
