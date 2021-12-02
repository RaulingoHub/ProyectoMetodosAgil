
package ProductoWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ProductoWS package. 
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

    private final static QName _BuscarPorNombreResponse_QNAME = new QName("http://WSProducto/", "buscarPorNombreResponse");
    private final static QName _Agregar_QNAME = new QName("http://WSProducto/", "agregar");
    private final static QName _BuscarPorCodigo_QNAME = new QName("http://WSProducto/", "buscarPorCodigo");
    private final static QName _BuscarPorCodigoResponse_QNAME = new QName("http://WSProducto/", "buscarPorCodigoResponse");
    private final static QName _Editar_QNAME = new QName("http://WSProducto/", "editar");
    private final static QName _EditarResponse_QNAME = new QName("http://WSProducto/", "editarResponse");
    private final static QName _Eliminar_QNAME = new QName("http://WSProducto/", "eliminar");
    private final static QName _BuscarPorID_QNAME = new QName("http://WSProducto/", "buscarPorID");
    private final static QName _BuscarPorNombre_QNAME = new QName("http://WSProducto/", "buscarPorNombre");
    private final static QName _AgregarResponse_QNAME = new QName("http://WSProducto/", "agregarResponse");
    private final static QName _BuscarTodos_QNAME = new QName("http://WSProducto/", "buscarTodos");
    private final static QName _BuscarPorIDResponse_QNAME = new QName("http://WSProducto/", "buscarPorIDResponse");
    private final static QName _BuscarTodosResponse_QNAME = new QName("http://WSProducto/", "buscarTodosResponse");
    private final static QName _EliminarResponse_QNAME = new QName("http://WSProducto/", "eliminarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ProductoWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarPorNombreResponse }
     * 
     */
    public BuscarPorNombreResponse createBuscarPorNombreResponse() {
        return new BuscarPorNombreResponse();
    }

    /**
     * Create an instance of {@link Agregar }
     * 
     */
    public Agregar createAgregar() {
        return new Agregar();
    }

    /**
     * Create an instance of {@link BuscarPorCodigo }
     * 
     */
    public BuscarPorCodigo createBuscarPorCodigo() {
        return new BuscarPorCodigo();
    }

    /**
     * Create an instance of {@link AgregarResponse }
     * 
     */
    public AgregarResponse createAgregarResponse() {
        return new AgregarResponse();
    }

    /**
     * Create an instance of {@link BuscarPorNombre }
     * 
     */
    public BuscarPorNombre createBuscarPorNombre() {
        return new BuscarPorNombre();
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
     * Create an instance of {@link BuscarPorCodigoResponse }
     * 
     */
    public BuscarPorCodigoResponse createBuscarPorCodigoResponse() {
        return new BuscarPorCodigoResponse();
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
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorNombreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "buscarPorNombreResponse")
    public JAXBElement<BuscarPorNombreResponse> createBuscarPorNombreResponse(BuscarPorNombreResponse value) {
        return new JAXBElement<BuscarPorNombreResponse>(_BuscarPorNombreResponse_QNAME, BuscarPorNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agregar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "agregar")
    public JAXBElement<Agregar> createAgregar(Agregar value) {
        return new JAXBElement<Agregar>(_Agregar_QNAME, Agregar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "buscarPorCodigo")
    public JAXBElement<BuscarPorCodigo> createBuscarPorCodigo(BuscarPorCodigo value) {
        return new JAXBElement<BuscarPorCodigo>(_BuscarPorCodigo_QNAME, BuscarPorCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "buscarPorCodigoResponse")
    public JAXBElement<BuscarPorCodigoResponse> createBuscarPorCodigoResponse(BuscarPorCodigoResponse value) {
        return new JAXBElement<BuscarPorCodigoResponse>(_BuscarPorCodigoResponse_QNAME, BuscarPorCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Editar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "editar")
    public JAXBElement<Editar> createEditar(Editar value) {
        return new JAXBElement<Editar>(_Editar_QNAME, Editar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "editarResponse")
    public JAXBElement<EditarResponse> createEditarResponse(EditarResponse value) {
        return new JAXBElement<EditarResponse>(_EditarResponse_QNAME, EditarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "buscarPorID")
    public JAXBElement<BuscarPorID> createBuscarPorID(BuscarPorID value) {
        return new JAXBElement<BuscarPorID>(_BuscarPorID_QNAME, BuscarPorID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "buscarPorNombre")
    public JAXBElement<BuscarPorNombre> createBuscarPorNombre(BuscarPorNombre value) {
        return new JAXBElement<BuscarPorNombre>(_BuscarPorNombre_QNAME, BuscarPorNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "agregarResponse")
    public JAXBElement<AgregarResponse> createAgregarResponse(AgregarResponse value) {
        return new JAXBElement<AgregarResponse>(_AgregarResponse_QNAME, AgregarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "buscarTodos")
    public JAXBElement<BuscarTodos> createBuscarTodos(BuscarTodos value) {
        return new JAXBElement<BuscarTodos>(_BuscarTodos_QNAME, BuscarTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPorIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "buscarPorIDResponse")
    public JAXBElement<BuscarPorIDResponse> createBuscarPorIDResponse(BuscarPorIDResponse value) {
        return new JAXBElement<BuscarPorIDResponse>(_BuscarPorIDResponse_QNAME, BuscarPorIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "buscarTodosResponse")
    public JAXBElement<BuscarTodosResponse> createBuscarTodosResponse(BuscarTodosResponse value) {
        return new JAXBElement<BuscarTodosResponse>(_BuscarTodosResponse_QNAME, BuscarTodosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSProducto/", name = "eliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

}
