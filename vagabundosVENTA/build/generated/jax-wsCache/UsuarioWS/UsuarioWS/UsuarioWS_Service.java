
package UsuarioWS;

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
@WebServiceClient(name = "UsuarioWS", targetNamespace = "http://WSUsuario/", wsdlLocation = "http://localhost:8080/vagabundosWS/UsuarioWS?WSDL")
public class UsuarioWS_Service
    extends Service
{

    private final static URL USUARIOWS_WSDL_LOCATION;
    private final static WebServiceException USUARIOWS_EXCEPTION;
    private final static QName USUARIOWS_QNAME = new QName("http://WSUsuario/", "UsuarioWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/vagabundosWS/UsuarioWS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USUARIOWS_WSDL_LOCATION = url;
        USUARIOWS_EXCEPTION = e;
    }

    public UsuarioWS_Service() {
        super(__getWsdlLocation(), USUARIOWS_QNAME);
    }

    public UsuarioWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), USUARIOWS_QNAME, features);
    }

    public UsuarioWS_Service(URL wsdlLocation) {
        super(wsdlLocation, USUARIOWS_QNAME);
    }

    public UsuarioWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USUARIOWS_QNAME, features);
    }

    public UsuarioWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UsuarioWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UsuarioWS
     */
    @WebEndpoint(name = "UsuarioWSPort")
    public UsuarioWS getUsuarioWSPort() {
        return super.getPort(new QName("http://WSUsuario/", "UsuarioWSPort"), UsuarioWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UsuarioWS
     */
    @WebEndpoint(name = "UsuarioWSPort")
    public UsuarioWS getUsuarioWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WSUsuario/", "UsuarioWSPort"), UsuarioWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USUARIOWS_EXCEPTION!= null) {
            throw USUARIOWS_EXCEPTION;
        }
        return USUARIOWS_WSDL_LOCATION;
    }

}
