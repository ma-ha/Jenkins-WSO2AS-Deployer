
package axis2.apache.org.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.wso2.carbon.core.persistence.metadata.xsd.ArtifactMetadataException;


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
 *         &lt;element name="ArtifactMetadataException" type="{http://metadata.persistence.core.carbon.wso2.org/xsd}ArtifactMetadataException" minOccurs="0"/>
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
    "artifactMetadataException"
})
@XmlRootElement(name = "WebappAdminArtifactMetadataException")
public class WebappAdminArtifactMetadataException {

    @XmlElementRef(name = "ArtifactMetadataException", namespace = "http://org.apache.axis2/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArtifactMetadataException> artifactMetadataException;

    /**
     * Gets the value of the artifactMetadataException property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArtifactMetadataException }{@code >}
     *     
     */
    public JAXBElement<ArtifactMetadataException> getArtifactMetadataException() {
        return artifactMetadataException;
    }

    /**
     * Sets the value of the artifactMetadataException property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArtifactMetadataException }{@code >}
     *     
     */
    public void setArtifactMetadataException(JAXBElement<ArtifactMetadataException> value) {
        this.artifactMetadataException = value;
    }

}
