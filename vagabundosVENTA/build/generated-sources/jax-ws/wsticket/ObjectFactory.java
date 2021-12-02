
package wsticket;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsticket package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _BuscarTodosResponse_QNAME = new QName("http://WSTicket/", "buscarTodosResponse");
    private final static QName _BuscarTodos_QNAME = new QName("http://WSTicket/", "buscarTodos");
    private final static QName _BuscarPorIDResponse_QNAME = new QName("http://WSTicket/", "buscarPorIDResponse");
    private final static QName _AgregarTicket_QNAME = new QName("http://WSTicket/", "agregarTicket");
    private final static QName _BuscarPorID_QNAME = new QName("http://WSTicket/", "buscarPorID");
    private final static QName _AgregarTicketResponse_QNAME = new QName("http://WSTicket/", "agregarTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsticket
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarTicketResponse }
     * 
     */
    public AgregarTicketResponse createAgregarTicketResponse() {
        return new AgregarTicketResponse();
    }

    /**
     * Create an instance of {@link AgregarTicket }
     * 
     */
    public AgregarTicket createAgregarTicket() {
        return new AgregarTicket();
    }

    /**
     * Create an instance of {@link BuscarPorID }
     * 
     */
    public BuscarPorID createBuscarPorID() {
        return new BuscarPorID();
    }

    /**
     * Create an instance of {@link BuscarTodosResponse }
     * 
     */
    public BuscarTodosResponse createBuscarTodosResponse() {
        return new BuscarTodosResponse();
    }

    /**
     * Create an instance of {@link BuscarTodos }
     * 
     */
    public BuscarTodos createBuscarTodos() {
        return new BuscarTodos();
    }

    /**
     * Create an instance of {@link BuscarPorIDResponse }
     * 
     */
    public BuscarPorIDResponse createBuscarPorIDResponse() {
        return new BuscarPorIDResponse();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTicket/", name = "buscarTodosResponse")
    public JAXBElement<BuscarTodosResponse> createBuscarTodosResponse(BuscarTodosResponse value) {
        return new JAXBElement<BuscarTodosResponse>(_BuscarTodosResponse_QNAME, BuscarTodosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTicket/", name = "buscarTodos")
    public JAXBElement<BuscarTodos> createBuscarTodos(BuscarTodos value) {
        return new JAXBElement<BuscarTodos>(_BuscarTodos_QNAME, BuscarTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTicket/", name = "buscarPorIDResponse")
    public JAXBElement<BuscarPorIDResponse> createBuscarPorIDResponse(BuscarPorIDResponse value) {
        return new JAXBElement<BuscarPorIDResponse>(_BuscarPorIDResponse_QNAME, BuscarPorIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTicket/", name = "agregarTicket")
    public JAXBElement<AgregarTicket> createAgregarTicket(AgregarTicket value) {
        return new JAXBElement<AgregarTicket>(_AgregarTicket_QNAME, AgregarTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTicket/", name = "buscarPorID")
    public JAXBElement<BuscarPorID> createBuscarPorID(BuscarPorID value) {
        return new JAXBElement<BuscarPorID>(_BuscarPorID_QNAME, BuscarPorID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTicket/", name = "agregarTicketResponse")
    public JAXBElement<AgregarTicketResponse> createAgregarTicketResponse(AgregarTicketResponse value) {
        return new JAXBElement<AgregarTicketResponse>(_AgregarTicketResponse_QNAME, AgregarTicketResponse.class, null, value);
    }

}
