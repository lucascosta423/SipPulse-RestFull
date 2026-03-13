
package com.sippulse.soapadapter.sippulse.client.subscriberWS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changePassword complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="changePassword">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="actualPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="newPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="confirmNewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "changePassword", propOrder = {
    "username",
    "domain",
    "actualPassword",
    "newPassword",
    "confirmNewPassword",
    "principal"
})
public class ChangePassword {

    protected String username;
    protected String domain;
    protected String actualPassword;
    protected String newPassword;
    protected String confirmNewPassword;
    protected UserPrincipalDTO principal;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the actualPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualPassword() {
        return actualPassword;
    }

    /**
     * Sets the value of the actualPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualPassword(String value) {
        this.actualPassword = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    /**
     * Gets the value of the confirmNewPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmNewPassword() {
        return confirmNewPassword;
    }

    /**
     * Sets the value of the confirmNewPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmNewPassword(String value) {
        this.confirmNewPassword = value;
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
