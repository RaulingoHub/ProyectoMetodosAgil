
package WSBalanceEmpleado;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WSBalanceEmpleado package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://WSBalanceEmpleado/", "helloResponse");
    private final static QName _Editar_QNAME = new QName("http://WSBalanceEmpleado/", "editar");
    private final static QName _EditarResponse_QNAME = new QName("http://WSBalanceEmpleado/", "editarResponse");
    private final static QName _BuscarIDFecha_QNAME = new QName("http://WSBalanceEmpleado/", "buscarIDFecha");
    private final static QName _AgregarBalance_QNAME = new QName("http://WSBalanceEmpleado/", "agregarBalance");
    private final static QName _Hello_QNAME = new QName("http://WSBalanceEmpleado/", "hello");
    private final static QName _BuscarIDFechaResponse_QNAME = new QName("http://WSBalanceEmpleado/", "buscarIDFechaResponse");
    private final static QName _AgregarBalanceResponse_QNAME = new QName("http://WSBalanceEmpleado/", "agregarBalanceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WSBalanceEmpleado
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarIDFecha }
     * 
     */
    public BuscarIDFecha createBuscarIDFecha() {
        return new BuscarIDFecha();
    }

    /**
     * Create an instance of {@link AgregarBalance }
     * 
     */
    public AgregarBalance createAgregarBalance() {
        return new AgregarBalance();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Editar }
     * 
     */
    public Editar createEditar() {
        return new Editar();
    }

    /**
     * Create an instance of {@link EditarResponse }
     * 
     */
    public EditarResponse createEditarResponse() {
        return new EditarResponse();
    }

    /**
     * Create an instance of {@link BuscarIDFechaResponse }
     * 
     */
    public BuscarIDFechaResponse createBuscarIDFechaResponse() {
        return new BuscarIDFechaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link AgregarBalanceResponse }
     * 
     */
    public AgregarBalanceResponse createAgregarBalanceResponse() {
        return new AgregarBalanceResponse();
    }

    /**
     * Create an instance of {@link BalanceEmpleado }
     * 
     */
    public BalanceEmpleado createBalanceEmpleado() {
        return new BalanceEmpleado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceEmpleado/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Editar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceEmpleado/", name = "editar")
    public JAXBElement<Editar> createEditar(Editar value) {
        return new JAXBElement<Editar>(_Editar_QNAME, Editar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceEmpleado/", name = "editarResponse")
    public JAXBElement<EditarResponse> createEditarResponse(EditarResponse value) {
        return new JAXBElement<EditarResponse>(_EditarResponse_QNAME, EditarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarIDFecha }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceEmpleado/", name = "buscarIDFecha")
    public JAXBElement<BuscarIDFecha> createBuscarIDFecha(BuscarIDFecha value) {
        return new JAXBElement<BuscarIDFecha>(_BuscarIDFecha_QNAME, BuscarIDFecha.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceEmpleado/", name = "agregarBalance")
    public JAXBElement<AgregarBalance> createAgregarBalance(AgregarBalance value) {
        return new JAXBElement<AgregarBalance>(_AgregarBalance_QNAME, AgregarBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceEmpleado/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarIDFechaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceEmpleado/", name = "buscarIDFechaResponse")
    public JAXBElement<BuscarIDFechaResponse> createBuscarIDFechaResponse(BuscarIDFechaResponse value) {
        return new JAXBElement<BuscarIDFechaResponse>(_BuscarIDFechaResponse_QNAME, BuscarIDFechaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceEmpleado/", name = "agregarBalanceResponse")
    public JAXBElement<AgregarBalanceResponse> createAgregarBalanceResponse(AgregarBalanceResponse value) {
        return new JAXBElement<AgregarBalanceResponse>(_AgregarBalanceResponse_QNAME, AgregarBalanceResponse.class, null, value);
    }

}
