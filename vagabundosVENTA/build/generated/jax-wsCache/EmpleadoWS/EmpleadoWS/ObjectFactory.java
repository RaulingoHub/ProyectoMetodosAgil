
package EmpleadoWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the EmpleadoWS package. 
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

    private final static QName _Login_QNAME = new QName("http://WSEmpleado/", "login");
    private final static QName _AgregarEmpleadoResponse_QNAME = new QName("http://WSEmpleado/", "agregarEmpleadoResponse");
    private final static QName _Autorizacion_QNAME = new QName("http://WSEmpleado/", "autorizacion");
    private final static QName _LoginResponse_QNAME = new QName("http://WSEmpleado/", "loginResponse");
    private final static QName _EliminarResponse_QNAME = new QName("http://WSEmpleado/", "eliminarResponse");
    private final static QName _AutorizacionResponse_QNAME = new QName("http://WSEmpleado/", "autorizacionResponse");
    private final static QName _BuscarTodosResponse_QNAME = new QName("http://WSEmpleado/", "buscarTodosResponse");
    private final static QName _BuscarPorIDResponse_QNAME = new QName("http://WSEmpleado/", "buscarPorIDResponse");
    private final static QName _BuscarTodos_QNAME = new QName("http://WSEmpleado/", "buscarTodos");
    private final static QName _BuscarPorID_QNAME = new QName("http://WSEmpleado/", "buscarPorID");
    private final static QName _Eliminar_QNAME = new QName("http://WSEmpleado/", "eliminar");
    private final static QName _Editar_QNAME = new QName("http://WSEmpleado/", "editar");
    private final static QName _EditarResponse_QNAME = new QName("http://WSEmpleado/", "editarResponse");
    private final static QName _AgregarEmpleado_QNAME = new QName("http://WSEmpleado/", "agregarEmpleado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: EmpleadoWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Autorizacion }
     * 
     */
    public Autorizacion createAutorizacion() {
        return new Autorizacion();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link AgregarEmpleadoResponse }
     * 
     */
    public AgregarEmpleadoResponse createAgregarEmpleadoResponse() {
        return new AgregarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link AgregarEmpleado }
     * 
     */
    public AgregarEmpleado createAgregarEmpleado() {
        return new AgregarEmpleado();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link BuscarPorID }
     * 
     */
    public BuscarPorID createBuscarPorID() {
        return new BuscarPorID();
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
     * Create an instance of {@link AutorizacionResponse }
     * 
     */
    public AutorizacionResponse createAutorizacionResponse() {
        return new AutorizacionResponse();
    }

    /**
     * Create an instance of {@link BuscarTodosResponse }
     * 
     */
    public BuscarTodosResponse createBuscarTodosResponse() {
        return new BuscarTodosResponse();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
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
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "agregarEmpleadoResponse")
    public JAXBElement<AgregarEmpleadoResponse> createAgregarEmpleadoResponse(AgregarEmpleadoResponse value) {
        return new JAXBElement<AgregarEmpleadoResponse>(_AgregarEmpleadoResponse_QNAME, AgregarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autorizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "autorizacion")
    public JAXBElement<Autorizacion> createAutorizacion(Autorizacion value) {
        return new JAXBElement<Autorizacion>(_Autorizacion_QNAME, Autorizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "eliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutorizacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "autorizacionResponse")
    public JAXBElement<AutorizacionResponse> createAutorizacionResponse(AutorizacionResponse value) {
        return new JAXBElement<AutorizacionResponse>(_AutorizacionResponse_QNAME, AutorizacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "buscarTodosResponse")
    public JAXBElement<BuscarTodosResponse> createBuscarTodosResponse(BuscarTodosResponse value) {
        return new JAXBElement<BuscarTodosResponse>(_BuscarTodosResponse_QNAME, BuscarTodosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "buscarPorIDResponse")
    public JAXBElement<BuscarPorIDResponse> createBuscarPorIDResponse(BuscarPorIDResponse value) {
        return new JAXBElement<BuscarPorIDResponse>(_BuscarPorIDResponse_QNAME, BuscarPorIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "buscarTodos")
    public JAXBElement<BuscarTodos> createBuscarTodos(BuscarTodos value) {
        return new JAXBElement<BuscarTodos>(_BuscarTodos_QNAME, BuscarTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "buscarPorID")
    public JAXBElement<BuscarPorID> createBuscarPorID(BuscarPorID value) {
        return new JAXBElement<BuscarPorID>(_BuscarPorID_QNAME, BuscarPorID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Editar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "editar")
    public JAXBElement<Editar> createEditar(Editar value) {
        return new JAXBElement<Editar>(_Editar_QNAME, Editar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "editarResponse")
    public JAXBElement<EditarResponse> createEditarResponse(EditarResponse value) {
        return new JAXBElement<EditarResponse>(_EditarResponse_QNAME, EditarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSEmpleado/", name = "agregarEmpleado")
    public JAXBElement<AgregarEmpleado> createAgregarEmpleado(AgregarEmpleado value) {
        return new JAXBElement<AgregarEmpleado>(_AgregarEmpleado_QNAME, AgregarEmpleado.class, null, value);
    }

}
