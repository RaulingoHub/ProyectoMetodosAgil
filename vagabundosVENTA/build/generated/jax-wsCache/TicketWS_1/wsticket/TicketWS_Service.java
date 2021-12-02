
package wsticket;

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
@WebServiceClient(name = "TicketWS", targetNamespace = "http://WSTicket/", wsdlLocation = "http://209.145.53.75:8080/vagabundosWS/TicketWS?wsdl")
public class TicketWS_Service
    extends Service
{

    private final static URL TICKETWS_WSDL_LOCATION;
    private final static WebServiceException TICKETWS_EXCEPTION;
    private final static QName TICKETWS_QNAME = new QName("http://WSTicket/", "TicketWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://209.145.53.75:8080/vagabundosWS/TicketWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TICKETWS_WSDL_LOCATION = url;
        TICKETWS_EXCEPTION = e;
    }

    public TicketWS_Service() {
        super(__getWsdlLocation(), TICKETWS_QNAME);
    }

    public TicketWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TICKETWS_QNAME, features);
    }

    public TicketWS_Service(URL wsdlLocation) {
        super(wsdlLocation, TICKETWS_QNAME);
    }

    public TicketWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TICKETWS_QNAME, features);
    }

    public TicketWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TicketWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TicketWS
     */
    @WebEndpoint(name = "TicketWSPort")
    public TicketWS getTicketWSPort() {
        return super.getPort(new QName("http://WSTicket/", "TicketWSPort"), TicketWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TicketWS
     */
    @WebEndpoint(name = "TicketWSPort")
    public TicketWS getTicketWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WSTicket/", "TicketWSPort"), TicketWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TICKETWS_EXCEPTION!= null) {
            throw TICKETWS_EXCEPTION;
        }
        return TICKETWS_WSDL_LOCATION;
    }

}
