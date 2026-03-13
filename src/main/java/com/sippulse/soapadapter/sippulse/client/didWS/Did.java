
package com.sippulse.soapadapter.sippulse.client.didWS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for did complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="did">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="accountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aliasUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="didHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="didToRuri" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gwid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="localArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="monthlySubscription" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="reverseBilling" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "did", propOrder = {
    "accountCode",
    "aliasUsername",
    "didHeader",
    "didToRuri",
    "domain",
    "gwid",
    "id",
    "localArea",
    "monthlySubscription",
    "reverseBilling",
    "username"
})
public class Did {

    protected String accountCode;
    protected String aliasUsername;
    protected String didHeader;
    protected boolean didToRuri;
    protected String domain;
    protected String gwid;
    protected Integer id;
    protected String localArea;
    protected Double monthlySubscription;
    protected boolean reverseBilling;
    protected String username;

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the aliasUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasUsername() {
        return aliasUsername;
    }

    /**
     * Sets the value of the aliasUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasUsername(String value) {
        this.aliasUsername = value;
    }

    /**
     * Gets the value of the didHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDidHeader() {
        return didHeader;
    }

    /**
     * Sets the value of the didHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDidHeader(String value) {
        this.didHeader = value;
    }

    /**
     * Gets the value of the didToRuri property.
     * 
     */
    public boolean isDidToRuri() {
        return didToRuri;
    }

    /**
     * Sets the value of the didToRuri property.
     * 
     */
    public void setDidToRuri(boolean value) {
        this.didToRuri = value;
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
     * Gets the value of the gwid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGwid() {
        return gwid;
    }

    /**
     * Sets the value of the gwid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGwid(String value) {
        this.gwid = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the localArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalArea() {
        return localArea;
    }

    /**
     * Sets the value of the localArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalArea(String value) {
        this.localArea = value;
    }

    /**
     * Gets the value of the monthlySubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMonthlySubscription() {
        return monthlySubscription;
    }

    /**
     * Sets the value of the monthlySubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMonthlySubscription(Double value) {
        this.monthlySubscription = value;
    }

    /**
     * Gets the value of the reverseBilling property.
     * 
     */
    public boolean isReverseBilling() {
        return reverseBilling;
    }

    /**
     * Sets the value of the reverseBilling property.
     * 
     */
    public void setReverseBilling(boolean value) {
        this.reverseBilling = value;
    }

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

}
