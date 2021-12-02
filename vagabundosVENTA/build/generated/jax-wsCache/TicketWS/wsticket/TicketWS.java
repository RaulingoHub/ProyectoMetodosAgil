
package wsticket;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TicketWS", targetNamespace = "http://WSTicket/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TicketWS {


    /**
     * 
     * @return
     *     returns java.util.List<wsticket.Ticket>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarTodos", targetNamespace = "http://WSTicket/", className = "wsticket.BuscarTodos")
    @ResponseWrapper(localName = "buscarTodosResponse", targetNamespace = "http://WSTicket/", className = "wsticket.BuscarTodosResponse")
    @Action(input = "http://WSTicket/TicketWS/buscarTodosRequest", output = "http://WSTicket/TicketWS/buscarTodosResponse")
    public List<Ticket> buscarTodos();

    /**
     * 
     * @param fecha
     * @param total
     * @param idEmpleado
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarTicket", targetNamespace = "http://WSTicket/", className = "wsticket.AgregarTicket")
    @ResponseWrapper(localName = "agregarTicketResponse", targetNamespace = "http://WSTicket/", className = "wsticket.AgregarTicketResponse")
    @Action(input = "http://WSTicket/TicketWS/agregarTicketRequest", output = "http://WSTicket/TicketWS/agregarTicketResponse")
    public boolean agregarTicket(
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "idEmpleado", targetNamespace = "")
        int idEmpleado,
        @WebParam(name = "total", targetNamespace = "")
        double total);

    /**
     * 
     * @param id
     * @return
     *     returns wsticket.Ticket
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarPorID", targetNamespace = "http://WSTicket/", className = "wsticket.BuscarPorID")
    @ResponseWrapper(localName = "buscarPorIDResponse", targetNamespace = "http://WSTicket/", className = "wsticket.BuscarPorIDResponse")
    @Action(input = "http://WSTicket/TicketWS/buscarPorIDRequest", output = "http://WSTicket/TicketWS/buscarPorIDResponse")
    public Ticket buscarPorID(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
