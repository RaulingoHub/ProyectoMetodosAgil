
package ProductoVendidoWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ProductoVendidoWS package. 
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

    private final static QName _BuscarTodosResponse_QNAME = new QName("http://WSProductoVendido/", "buscarTodosResponse");
    private final static QName _BuscarTodos_QNAME = new QName("http://WSProductoVendido/", "buscarTodos");
    private final static QName _BuscarPorIDResponse_QNAME = new QName("http://WSProductoVendido/", "buscarPorIDResponse");
    private final static QName _BuscarPorID_QNAME = new QName("http://WSProductoVendido/", "buscarPorID");
    private final static QName _AgregarProductoVendido_QNAME = new QName("http://WSProductoVendido/", "AgregarProductoVendido");
    private final static QName _AgregarProductoVendidoResponse_QNAME = new QName("http://WSProductoVendido/", "AgregarProductoVendidoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ProductoVendidoWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarPorID }
     * 
     */
    public BuscarPorID createBuscarPorID() {
        return new BuscarPorID();
    }

    /**
     * Create an instance of {@link AgregarProductoVendido }
     * 
     */
    public AgregarProductoVendido createAgregarProductoVendido() {
        return new AgregarProductoVendido();
    }

    /**
     * Create an instance of {@link AgregarProductoVendidoResponse }
     * 
     */
    public AgregarProductoVendidoResponse createAgregarProductoVendidoResponse() {
        return new AgregarProductoVendidoResponse();
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
     * Create an instance of {@link ProductoVendido }
     * 
     */
    public ProductoVendido createProductoVendido() {
        return new ProductoVendido();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProductoVendido/", name = "buscarTodosResponse")
    public JAXBElement<BuscarTodosResponse> createBuscarTodosResponse(BuscarTodosResponse value) {
        return new JAXBElement<BuscarTodosResponse>(_BuscarTodosResponse_QNAME, BuscarTodosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProductoVendido/", name = "buscarTodos")
    public JAXBElement<BuscarTodos> createBuscarTodos(BuscarTodos value) {
        return new JAXBElement<BuscarTodos>(_BuscarTodos_QNAME, BuscarTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProductoVendido/", name = "buscarPorIDResponse")
    public JAXBElement<BuscarPorIDResponse> createBuscarPorIDResponse(BuscarPorIDResponse value) {
        return new JAXBElement<BuscarPorIDResponse>(_BuscarPorIDResponse_QNAME, BuscarPorIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProductoVendido/", name = "buscarPorID")
    public JAXBElement<BuscarPorID> createBuscarPorID(BuscarPorID value) {
        return new JAXBElement<BuscarPorID>(_BuscarPorID_QNAME, BuscarPorID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarProductoVendido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProductoVendido/", name = "AgregarProductoVendido")
    public JAXBElement<AgregarProductoVendido> createAgregarProductoVendido(AgregarProductoVendido value) {
        return new JAXBElement<AgregarProductoVendido>(_AgregarProductoVendido_QNAME, AgregarProductoVendido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarProductoVendidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProductoVendido/", name = "AgregarProductoVendidoResponse")
    public JAXBElement<AgregarProductoVendidoResponse> createAgregarProductoVendidoResponse(AgregarProductoVendidoResponse value) {
        return new JAXBElement<AgregarProductoVendidoResponse>(_AgregarProductoVendidoResponse_QNAME, AgregarProductoVendidoResponse.class, null, value);
    }

}
