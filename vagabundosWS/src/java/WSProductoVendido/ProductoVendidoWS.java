/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSProductoVendido;

import entidades.ProductoVendido;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.ProductoVendidoDAOIMP;

/**
 *
 * @author Carlos Soto Pacheco
 */
@WebService(serviceName = "ProductoVendidoWS")
public class ProductoVendidoWS {

    ProductoVendido p = new ProductoVendido();
    ProductoVendidoDAOIMP metodo = new ProductoVendidoDAOIMP();

    /**
     * Web service operation
     *
     * @param idProducto
     * @param idTicket
     * @return
     */
    @WebMethod(operationName = "AgregarProductoVendido")
    public Boolean AgregarProductoVendido(@WebParam(name = "idProducto") int idProducto, @WebParam(name = "idTicket") int idTicket) {
        //TODO write your implementation code here:
        p.setIdProducto(idProducto);
        p.setIdTicket(idTicket);
        
        return metodo.agregar(p);
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "buscarTodos")
    public List<ProductoVendido> buscarTodos() {
        return metodo.buscarTodos();
    }

    /**
     * Web service operation
     * @param idProducto
     * @return 
     */
    @WebMethod(operationName = "buscarPorID")
    public ProductoVendido buscarPorID(
            @WebParam(name = "idProducto") int idProducto
    
    ) {
        //TODO write your implementation code here:
        return metodo.buscarId(idProducto);
    }
    
    
    
    
    
    
    
}
