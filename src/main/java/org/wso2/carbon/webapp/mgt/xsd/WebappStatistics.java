
package org.wso2.carbon.webapp.mgt.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebappStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebappStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeSessions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="avgSessionLifetime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expiredSessions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxActiveSessions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxSessionInactivityInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxSessionLifetime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rejectedSessions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebappStatistics", propOrder = {
    "activeSessions",
    "avgSessionLifetime",
    "expiredSessions",
    "maxActiveSessions",
    "maxSessionInactivityInterval",
    "maxSessionLifetime",
    "rejectedSessions"
})
public class WebappStatistics {

    protected Integer activeSessions;
    protected Integer avgSessionLifetime;
    protected Long expiredSessions;
    protected Integer maxActiveSessions;
    protected Integer maxSessionInactivityInterval;
    protected Integer maxSessionLifetime;
    protected Integer rejectedSessions;

    /**
     * Gets the value of the activeSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActiveSessions() {
        return activeSessions;
    }

    /**
     * Sets the value of the activeSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActiveSessions(Integer value) {
        this.activeSessions = value;
    }

    /**
     * Gets the value of the avgSessionLifetime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgSessionLifetime() {
        return avgSessionLifetime;
    }

    /**
     * Sets the value of the avgSessionLifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgSessionLifetime(Integer value) {
        this.avgSessionLifetime = value;
    }

    /**
     * Gets the value of the expiredSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpiredSessions() {
        return expiredSessions;
    }

    /**
     * Sets the value of the expiredSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpiredSessions(Long value) {
        this.expiredSessions = value;
    }

    /**
     * Gets the value of the maxActiveSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxActiveSessions() {
        return maxActiveSessions;
    }

    /**
     * Sets the value of the maxActiveSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxActiveSessions(Integer value) {
        this.maxActiveSessions = value;
    }

    /**
     * Gets the value of the maxSessionInactivityInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSessionInactivityInterval() {
        return maxSessionInactivityInterval;
    }

    /**
     * Sets the value of the maxSessionInactivityInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSessionInactivityInterval(Integer value) {
        this.maxSessionInactivityInterval = value;
    }

    /**
     * Gets the value of the maxSessionLifetime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSessionLifetime() {
        return maxSessionLifetime;
    }

    /**
     * Sets the value of the maxSessionLifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSessionLifetime(Integer value) {
        this.maxSessionLifetime = value;
    }

    /**
     * Gets the value of the rejectedSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRejectedSessions() {
        return rejectedSessions;
    }

    /**
     * Sets the value of the rejectedSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRejectedSessions(Integer value) {
        this.rejectedSessions = value;
    }

}
