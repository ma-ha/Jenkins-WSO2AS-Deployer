
package axis2.apache.org.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="webappSearchString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webappState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webappType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "webappSearchString",
    "webappState",
    "webappType",
    "pageNumber"
})
@XmlRootElement(name = "getPagedWebappsSummary")
public class GetPagedWebappsSummary {

    @XmlElementRef(name = "webappSearchString", namespace = "http://org.apache.axis2/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webappSearchString;
    @XmlElementRef(name = "webappState", namespace = "http://org.apache.axis2/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webappState;
    @XmlElementRef(name = "webappType", namespace = "http://org.apache.axis2/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webappType;
    protected Integer pageNumber;

    /**
     * Gets the value of the webappSearchString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebappSearchString() {
        return webappSearchString;
    }

    /**
     * Sets the value of the webappSearchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebappSearchString(JAXBElement<String> value) {
        this.webappSearchString = value;
    }

    /**
     * Gets the value of the webappState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebappState() {
        return webappState;
    }

    /**
     * Sets the value of the webappState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebappState(JAXBElement<String> value) {
        this.webappState = value;
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

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

}
