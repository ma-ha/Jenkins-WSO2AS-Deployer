
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
 * <p>Java class for SessionsWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionsWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfActiveSessions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sessions" type="{http://mgt.webapp.carbon.wso2.org/xsd}SessionMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="webappFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionsWrapper", propOrder = {
    "numberOfActiveSessions",
    "numberOfPages",
    "sessions",
    "webappFileName"
})
public class SessionsWrapper {

    protected Integer numberOfActiveSessions;
    protected Integer numberOfPages;
    @XmlElement(nillable = true)
    protected List<SessionMetadata> sessions;
    @XmlElementRef(name = "webappFileName", namespace = "http://mgt.webapp.carbon.wso2.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webappFileName;

    /**
     * Gets the value of the numberOfActiveSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfActiveSessions() {
        return numberOfActiveSessions;
    }

    /**
     * Sets the value of the numberOfActiveSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfActiveSessions(Integer value) {
        this.numberOfActiveSessions = value;
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
     * Gets the value of the sessions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SessionMetadata }
     * 
     * 
     */
    public List<SessionMetadata> getSessions() {
        if (sessions == null) {
            sessions = new ArrayList<SessionMetadata>();
        }
        return this.sessions;
    }

    /**
     * Gets the value of the webappFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebappFileName() {
        return webappFileName;
    }

    /**
     * Sets the value of the webappFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebappFileName(JAXBElement<String> value) {
        this.webappFileName = value;
    }

}
