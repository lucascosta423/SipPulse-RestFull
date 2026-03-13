
package com.sippulse.soapadapter.sippulse.client.subscriberWS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveMonthlyQuotaDTOResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="retrieveMonthlyQuotaDTOResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="monthlyQuotaDTO" type="{http://service.ws.sippulse.voffice.com.br/}subscriberMonthlyQuotaDTO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveMonthlyQuotaDTOResponse", propOrder = {
    "monthlyQuotaDTO"
})
public class RetrieveMonthlyQuotaDTOResponse {

    protected SubscriberMonthlyQuotaDTO monthlyQuotaDTO;

    /**
     * Gets the value of the monthlyQuotaDTO property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberMonthlyQuotaDTO }
     *     
     */
    public SubscriberMonthlyQuotaDTO getMonthlyQuotaDTO() {
        return monthlyQuotaDTO;
    }

    /**
     * Sets the value of the monthlyQuotaDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberMonthlyQuotaDTO }
     *     
     */
    public void setMonthlyQuotaDTO(SubscriberMonthlyQuotaDTO value) {
        this.monthlyQuotaDTO = value;
    }

}
