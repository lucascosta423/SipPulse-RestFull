
package com.sippulse.soapadapter.sippulse.client.didWS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteDid complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="deleteDid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="didId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "deleteDid", propOrder = {
    "didId",
    "principal"
})
public class DeleteDid {

    protected Integer didId;
    protected UserPrincipalDTO principal;

    /**
     * Gets the value of the didId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDidId() {
        return didId;
    }

    /**
     * Sets the value of the didId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDidId(Integer value) {
        this.didId = value;
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
