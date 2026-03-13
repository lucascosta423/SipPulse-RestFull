
package com.sippulse.soapadapter.sippulse.client.subscriberWS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertSubscriber complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="insertSubscriber">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="subscriber" type="{http://service.ws.sippulse.voffice.com.br/}subscriberDTO" minOccurs="0"/>
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
@XmlType(name = "insertSubscriber", propOrder = {
    "subscriber",
    "principal"
})
public class InsertSubscriber {

    protected SubscriberDTO subscriber;
    protected UserPrincipalDTO principal;

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberDTO }
     *     
     */
    public SubscriberDTO getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberDTO }
     *     
     */
    public void setSubscriber(SubscriberDTO value) {
        this.subscriber = value;
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
