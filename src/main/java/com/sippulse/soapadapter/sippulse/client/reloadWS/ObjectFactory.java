
package com.sippulse.soapadapter.sippulse.client.reloadWS;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sippulse.soapadapter.sippulse.client.reloadWS package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _WSException_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "WSException");
    private static final QName _ReloadAddress_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "reloadAddress");
    private static final QName _ReloadAddressResponse_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "reloadAddressResponse");
    private static final QName _ReloadDid_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "reloadDid");
    private static final QName _ReloadDidResponse_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "reloadDidResponse");
    private static final QName _ReloadHuntGroup_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "reloadHuntGroup");
    private static final QName _ReloadHuntGroupResponse_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "reloadHuntGroupResponse");
    private static final QName _ReloadProfile_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "reloadProfile");
    private static final QName _ReloadProfileResponse_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "reloadProfileResponse");
    private static final QName _ReloadSubscriber_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "reloadSubscriber");
    private static final QName _ReloadSubscriberResponse_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "reloadSubscriberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sippulse.soapadapter.sippulse.client.reloadWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WsExceptionMessage }
     * 
     * @return
     *     the new instance of {@link WsExceptionMessage }
     */
    public WsExceptionMessage createWsExceptionMessage() {
        return new WsExceptionMessage();
    }

    /**
     * Create an instance of {@link ReloadAddress }
     * 
     * @return
     *     the new instance of {@link ReloadAddress }
     */
    public ReloadAddress createReloadAddress() {
        return new ReloadAddress();
    }

    /**
     * Create an instance of {@link ReloadAddressResponse }
     * 
     * @return
     *     the new instance of {@link ReloadAddressResponse }
     */
    public ReloadAddressResponse createReloadAddressResponse() {
        return new ReloadAddressResponse();
    }

    /**
     * Create an instance of {@link ReloadDid }
     * 
     * @return
     *     the new instance of {@link ReloadDid }
     */
    public ReloadDid createReloadDid() {
        return new ReloadDid();
    }

    /**
     * Create an instance of {@link ReloadDidResponse }
     * 
     * @return
     *     the new instance of {@link ReloadDidResponse }
     */
    public ReloadDidResponse createReloadDidResponse() {
        return new ReloadDidResponse();
    }

    /**
     * Create an instance of {@link ReloadHuntGroup }
     * 
     * @return
     *     the new instance of {@link ReloadHuntGroup }
     */
    public ReloadHuntGroup createReloadHuntGroup() {
        return new ReloadHuntGroup();
    }

    /**
     * Create an instance of {@link ReloadHuntGroupResponse }
     * 
     * @return
     *     the new instance of {@link ReloadHuntGroupResponse }
     */
    public ReloadHuntGroupResponse createReloadHuntGroupResponse() {
        return new ReloadHuntGroupResponse();
    }

    /**
     * Create an instance of {@link ReloadProfile }
     * 
     * @return
     *     the new instance of {@link ReloadProfile }
     */
    public ReloadProfile createReloadProfile() {
        return new ReloadProfile();
    }

    /**
     * Create an instance of {@link ReloadProfileResponse }
     * 
     * @return
     *     the new instance of {@link ReloadProfileResponse }
     */
    public ReloadProfileResponse createReloadProfileResponse() {
        return new ReloadProfileResponse();
    }

    /**
     * Create an instance of {@link ReloadSubscriber }
     * 
     * @return
     *     the new instance of {@link ReloadSubscriber }
     */
    public ReloadSubscriber createReloadSubscriber() {
        return new ReloadSubscriber();
    }

    /**
     * Create an instance of {@link ReloadSubscriberResponse }
     * 
     * @return
     *     the new instance of {@link ReloadSubscriberResponse }
     */
    public ReloadSubscriberResponse createReloadSubscriberResponse() {
        return new ReloadSubscriberResponse();
    }

    /**
     * Create an instance of {@link UserPrincipalDTO }
     * 
     * @return
     *     the new instance of {@link UserPrincipalDTO }
     */
    public UserPrincipalDTO createUserPrincipalDTO() {
        return new UserPrincipalDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsExceptionMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsExceptionMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "WSException")
    public JAXBElement<WsExceptionMessage> createWSException(WsExceptionMessage value) {
        return new JAXBElement<>(_WSException_QNAME, WsExceptionMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReloadAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "reloadAddress")
    public JAXBElement<ReloadAddress> createReloadAddress(ReloadAddress value) {
        return new JAXBElement<>(_ReloadAddress_QNAME, ReloadAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadAddressResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReloadAddressResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "reloadAddressResponse")
    public JAXBElement<ReloadAddressResponse> createReloadAddressResponse(ReloadAddressResponse value) {
        return new JAXBElement<>(_ReloadAddressResponse_QNAME, ReloadAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadDid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReloadDid }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "reloadDid")
    public JAXBElement<ReloadDid> createReloadDid(ReloadDid value) {
        return new JAXBElement<>(_ReloadDid_QNAME, ReloadDid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadDidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReloadDidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "reloadDidResponse")
    public JAXBElement<ReloadDidResponse> createReloadDidResponse(ReloadDidResponse value) {
        return new JAXBElement<>(_ReloadDidResponse_QNAME, ReloadDidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadHuntGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReloadHuntGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "reloadHuntGroup")
    public JAXBElement<ReloadHuntGroup> createReloadHuntGroup(ReloadHuntGroup value) {
        return new JAXBElement<>(_ReloadHuntGroup_QNAME, ReloadHuntGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadHuntGroupResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReloadHuntGroupResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "reloadHuntGroupResponse")
    public JAXBElement<ReloadHuntGroupResponse> createReloadHuntGroupResponse(ReloadHuntGroupResponse value) {
        return new JAXBElement<>(_ReloadHuntGroupResponse_QNAME, ReloadHuntGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReloadProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "reloadProfile")
    public JAXBElement<ReloadProfile> createReloadProfile(ReloadProfile value) {
        return new JAXBElement<>(_ReloadProfile_QNAME, ReloadProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadProfileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReloadProfileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "reloadProfileResponse")
    public JAXBElement<ReloadProfileResponse> createReloadProfileResponse(ReloadProfileResponse value) {
        return new JAXBElement<>(_ReloadProfileResponse_QNAME, ReloadProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadSubscriber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReloadSubscriber }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "reloadSubscriber")
    public JAXBElement<ReloadSubscriber> createReloadSubscriber(ReloadSubscriber value) {
        return new JAXBElement<>(_ReloadSubscriber_QNAME, ReloadSubscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadSubscriberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReloadSubscriberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "reloadSubscriberResponse")
    public JAXBElement<ReloadSubscriberResponse> createReloadSubscriberResponse(ReloadSubscriberResponse value) {
        return new JAXBElement<>(_ReloadSubscriberResponse_QNAME, ReloadSubscriberResponse.class, null, value);
    }

}
