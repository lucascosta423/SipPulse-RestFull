
package com.sippulse.soapadapter.sippulse.client.subscriberWS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveDailyQuotaResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="retrieveDailyQuotaResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dailyQuotaDTO" type="{http://service.ws.sippulse.voffice.com.br/}subscriberDailyQuotaDTO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveDailyQuotaResponse", propOrder = {
    "dailyQuotaDTO"
})
public class RetrieveDailyQuotaResponse {

    protected SubscriberDailyQuotaDTO dailyQuotaDTO;

    /**
     * Gets the value of the dailyQuotaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberDailyQuotaDTO }
     *     
     */
    public SubscriberDailyQuotaDTO getDailyQuotaDTO() {
        return dailyQuotaDTO;
    }

    /**
     * Sets the value of the dailyQuotaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberDailyQuotaDTO }
     *     
     */
    public void setDailyQuotaDTO(SubscriberDailyQuotaDTO value) {
        this.dailyQuotaDTO = value;
    }

}
