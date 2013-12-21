
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
 *         &lt;element name="webappFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxSessionLifetimeMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "webappFileName",
    "maxSessionLifetimeMillis"
})
@XmlRootElement(name = "expireSessionsInWebapp")
public class ExpireSessionsInWebapp {

    @XmlElementRef(name = "webappFileName", namespace = "http://org.apache.axis2/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webappFileName;
    protected Long maxSessionLifetimeMillis;

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

    /**
     * Gets the value of the maxSessionLifetimeMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxSessionLifetimeMillis() {
        return maxSessionLifetimeMillis;
    }

    /**
     * Sets the value of the maxSessionLifetimeMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxSessionLifetimeMillis(Long value) {
        this.maxSessionLifetimeMillis = value;
    }

}
