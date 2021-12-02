
package BalanceTiendaWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the BalanceTiendaWS package. 
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

    private final static QName _BuscarFechaResponse_QNAME = new QName("http://WSBalanceTienda/", "buscarFechaResponse");
    private final static QName _AgregarBalanceTiendaResponse_QNAME = new QName("http://WSBalanceTienda/", "agregarBalanceTiendaResponse");
    private final static QName _BuscarFecha_QNAME = new QName("http://WSBalanceTienda/", "buscarFecha");
    private final static QName _Editar_QNAME = new QName("http://WSBalanceTienda/", "editar");
    private final static QName _EditarResponse_QNAME = new QName("http://WSBalanceTienda/", "editarResponse");
    private final static QName _AgregarBalanceTienda_QNAME = new QName("http://WSBalanceTienda/", "agregarBalanceTienda");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: BalanceTiendaWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarBalanceTienda }
     * 
     */
    public AgregarBalanceTienda createAgregarBalanceTienda() {
        return new AgregarBalanceTienda();
    }

    /**
     * Create an instance of {@link AgregarBalanceTiendaResponse }
     * 
     */
    public AgregarBalanceTiendaResponse createAgregarBalanceTiendaResponse() {
        return new AgregarBalanceTiendaResponse();
    }

    /**
     * Create an instance of {@link BuscarFecha }
     * 
     */
    public BuscarFecha createBuscarFecha() {
        return new BuscarFecha();
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
     * Create an instance of {@link BuscarFechaResponse }
     * 
     */
    public BuscarFechaResponse createBuscarFechaResponse() {
        return new BuscarFechaResponse();
    }

    /**
     * Create an instance of {@link BalanceTienda }
     * 
     */
    public BalanceTienda createBalanceTienda() {
        return new BalanceTienda();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFechaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceTienda/", name = "buscarFechaResponse")
    public JAXBElement<BuscarFechaResponse> createBuscarFechaResponse(BuscarFechaResponse value) {
        return new JAXBElement<BuscarFechaResponse>(_BuscarFechaResponse_QNAME, BuscarFechaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarBalanceTiendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceTienda/", name = "agregarBalanceTiendaResponse")
    public JAXBElement<AgregarBalanceTiendaResponse> createAgregarBalanceTiendaResponse(AgregarBalanceTiendaResponse value) {
        return new JAXBElement<AgregarBalanceTiendaResponse>(_AgregarBalanceTiendaResponse_QNAME, AgregarBalanceTiendaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFecha }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceTienda/", name = "buscarFecha")
    public JAXBElement<BuscarFecha> createBuscarFecha(BuscarFecha value) {
        return new JAXBElement<BuscarFecha>(_BuscarFecha_QNAME, BuscarFecha.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Editar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceTienda/", name = "editar")
    public JAXBElement<Editar> createEditar(Editar value) {
        return new JAXBElement<Editar>(_Editar_QNAME, Editar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceTienda/", name = "editarResponse")
    public JAXBElement<EditarResponse> createEditarResponse(EditarResponse value) {
        return new JAXBElement<EditarResponse>(_EditarResponse_QNAME, EditarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarBalanceTienda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSBalanceTienda/", name = "agregarBalanceTienda")
    public JAXBElement<AgregarBalanceTienda> createAgregarBalanceTienda(AgregarBalanceTienda value) {
        return new JAXBElement<AgregarBalanceTienda>(_AgregarBalanceTienda_QNAME, AgregarBalanceTienda.class, null, value);
    }

}
