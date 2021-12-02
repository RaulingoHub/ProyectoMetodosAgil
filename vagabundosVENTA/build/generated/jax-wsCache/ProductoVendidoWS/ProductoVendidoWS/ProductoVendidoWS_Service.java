
package ProductoVendidoWS;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductoVendidoWS", targetNamespace = "http://WSProductoVendido/", wsdlLocation = "http://localhost:8080/vagabundosWS/ProductoVendidoWS?WSDL")
public class ProductoVendidoWS_Service
    extends Service
{

    private final static URL PRODUCTOVENDIDOWS_WSDL_LOCATION;
    private final static WebServiceException PRODUCTOVENDIDOWS_EXCEPTION;
    private final static QName PRODUCTOVENDIDOWS_QNAME = new QName("http://WSProductoVendido/", "ProductoVendidoWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/vagabundosWS/ProductoVendidoWS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTOVENDIDOWS_WSDL_LOCATION = url;
        PRODUCTOVENDIDOWS_EXCEPTION = e;
    }

    public ProductoVendidoWS_Service() {
        super(__getWsdlLocation(), PRODUCTOVENDIDOWS_QNAME);
    }

    public ProductoVendidoWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTOVENDIDOWS_QNAME, features);
    }

    public ProductoVendidoWS_Service(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTOVENDIDOWS_QNAME);
    }

    public ProductoVendidoWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTOVENDIDOWS_QNAME, features);
    }

    public ProductoVendidoWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductoVendidoWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductoVendidoWS
     */
    @WebEndpoint(name = "ProductoVendidoWSPort")
    public ProductoVendidoWS getProductoVendidoWSPort() {
        return super.getPort(new QName("http://WSProductoVendido/", "ProductoVendidoWSPort"), ProductoVendidoWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductoVendidoWS
     */
    @WebEndpoint(name = "ProductoVendidoWSPort")
    public ProductoVendidoWS getProductoVendidoWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WSProductoVendido/", "ProductoVendidoWSPort"), ProductoVendidoWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTOVENDIDOWS_EXCEPTION!= null) {
            throw PRODUCTOVENDIDOWS_EXCEPTION;
        }
        return PRODUCTOVENDIDOWS_WSDL_LOCATION;
    }

}
