
package axis2.apache.org.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.wso2.carbon.webapp.mgt.xsd.WebappUploadData;


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
 *         &lt;element name="webappUploadDataList" type="{http://mgt.webapp.carbon.wso2.org/xsd}WebappUploadData" maxOccurs="unbounded" minOccurs="0"/>
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
    "webappUploadDataList"
})
@XmlRootElement(name = "uploadWebapp")
public class UploadWebapp {

    @XmlElement(nillable = true)
    protected List<WebappUploadData> webappUploadDataList;

    /**
     * Gets the value of the webappUploadDataList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webappUploadDataList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebappUploadDataList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebappUploadData }
     * 
     * 
     */
    public List<WebappUploadData> getWebappUploadDataList() {
        if (webappUploadDataList == null) {
            webappUploadDataList = new ArrayList<WebappUploadData>();
        }
        return this.webappUploadDataList;
    }

}
