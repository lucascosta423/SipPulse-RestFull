
package com.sippulse.soapadapter.sippulse.client.subscriberWS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateMonthlyQuota complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="updateMonthlyQuota">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="monthlyQuotaDTO" type="{http://service.ws.sippulse.voffice.com.br/}subscriberMonthlyQuotaDTO" minOccurs="0"/>
 *         <element name="principal" type="{http://service.ws.sippulse.voffice.com.br/}userPrincipalDTO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateMonthlyQuota", propOrder = {
    "monthlyQuotaDTO",
    "principal"
})
public class UpdateMonthlyQuota {

    protected SubscriberMonthlyQuotaDTO monthlyQuotaDTO;
    protected UserPrincipalDTO principal;

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

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link UserPrincipalDTO }
     *     
     */
    public UserPrincipalDTO getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPrincipalDTO }
     *     
     */
    public void setPrincipal(UserPrincipalDTO value) {
        this.principal = value;
    }

}
