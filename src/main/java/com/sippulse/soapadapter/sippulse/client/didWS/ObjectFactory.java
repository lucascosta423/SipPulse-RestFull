
package com.sippulse.soapadapter.sippulse.client.didWS;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sippulse.soapadapter.sippulse.client.didWS package. 
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
    private static final QName _DeleteDid_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "deleteDid");
    private static final QName _DeleteDidResponse_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "deleteDidResponse");
    private static final QName _InsertDid_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "insertDid");
    private static final QName _InsertDidResponse_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "insertDidResponse");
    private static final QName _ListAvailablesNumbers_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "listAvailablesNumbers");
    private static final QName _ListAvailablesNumbersResponse_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "listAvailablesNumbersResponse");
    private static final QName _ListByAcc_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "listByAcc");
    private static final QName _ListByAccResponse_QNAME = new QName("http://service.ws.sippulse.voffice.com.br/", "listByAccResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sippulse.soapadapter.sippulse.client.didWS
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
     * Create an instance of {@link DeleteDid }
     * 
     * @return
     *     the new instance of {@link DeleteDid }
     */
    public DeleteDid createDeleteDid() {
        return new DeleteDid();
    }

    /**
     * Create an instance of {@link DeleteDidResponse }
     * 
     * @return
     *     the new instance of {@link DeleteDidResponse }
     */
    public DeleteDidResponse createDeleteDidResponse() {
        return new DeleteDidResponse();
    }

    /**
     * Create an instance of {@link InsertDid }
     * 
     * @return
     *     the new instance of {@link InsertDid }
     */
    public InsertDid createInsertDid() {
        return new InsertDid();
    }

    /**
     * Create an instance of {@link InsertDidResponse }
     * 
     * @return
     *     the new instance of {@link InsertDidResponse }
     */
    public InsertDidResponse createInsertDidResponse() {
        return new InsertDidResponse();
    }

    /**
     * Create an instance of {@link ListAvailablesNumbers }
     * 
     * @return
     *     the new instance of {@link ListAvailablesNumbers }
     */
    public ListAvailablesNumbers createListAvailablesNumbers() {
        return new ListAvailablesNumbers();
    }

    /**
     * Create an instance of {@link ListAvailablesNumbersResponse }
     * 
     * @return
     *     the new instance of {@link ListAvailablesNumbersResponse }
     */
    public ListAvailablesNumbersResponse createListAvailablesNumbersResponse() {
        return new ListAvailablesNumbersResponse();
    }

    /**
     * Create an instance of {@link ListByAcc }
     * 
     * @return
     *     the new instance of {@link ListByAcc }
     */
    public ListByAcc createListByAcc() {
        return new ListByAcc();
    }

    /**
     * Create an instance of {@link ListByAccResponse }
     * 
     * @return
     *     the new instance of {@link ListByAccResponse }
     */
    public ListByAccResponse createListByAccResponse() {
        return new ListByAccResponse();
    }

    /**
     * Create an instance of {@link Did }
     * 
     * @return
     *     the new instance of {@link Did }
     */
    public Did createDid() {
        return new Did();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDid }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "deleteDid")
    public JAXBElement<DeleteDid> createDeleteDid(DeleteDid value) {
        return new JAXBElement<>(_DeleteDid_QNAME, DeleteDid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "deleteDidResponse")
    public JAXBElement<DeleteDidResponse> createDeleteDidResponse(DeleteDidResponse value) {
        return new JAXBElement<>(_DeleteDidResponse_QNAME, DeleteDidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertDid }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "insertDid")
    public JAXBElement<InsertDid> createInsertDid(InsertDid value) {
        return new JAXBElement<>(_InsertDid_QNAME, InsertDid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertDidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "insertDidResponse")
    public JAXBElement<InsertDidResponse> createInsertDidResponse(InsertDidResponse value) {
        return new JAXBElement<>(_InsertDidResponse_QNAME, InsertDidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAvailablesNumbers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListAvailablesNumbers }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "listAvailablesNumbers")
    public JAXBElement<ListAvailablesNumbers> createListAvailablesNumbers(ListAvailablesNumbers value) {
        return new JAXBElement<>(_ListAvailablesNumbers_QNAME, ListAvailablesNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAvailablesNumbersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListAvailablesNumbersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "listAvailablesNumbersResponse")
    public JAXBElement<ListAvailablesNumbersResponse> createListAvailablesNumbersResponse(ListAvailablesNumbersResponse value) {
        return new JAXBElement<>(_ListAvailablesNumbersResponse_QNAME, ListAvailablesNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListByAcc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListByAcc }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "listByAcc")
    public JAXBElement<ListByAcc> createListByAcc(ListByAcc value) {
        return new JAXBElement<>(_ListByAcc_QNAME, ListByAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListByAccResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListByAccResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ws.sippulse.voffice.com.br/", name = "listByAccResponse")
    public JAXBElement<ListByAccResponse> createListByAccResponse(ListByAccResponse value) {
        return new JAXBElement<>(_ListByAccResponse_QNAME, ListByAccResponse.class, null, value);
    }

}
