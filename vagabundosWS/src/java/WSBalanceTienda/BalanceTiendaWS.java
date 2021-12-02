/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSBalanceTienda;

import entidades.BalanceTienda;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import negocio.BalanceTiendaDAOIMP;

/**
 *
 * @author lopez
 */

@WebService(serviceName = "BalanceTiendaWS")
public class BalanceTiendaWS {
        BalanceTiendaDAOIMP dao = new BalanceTiendaDAOIMP();
    
    @WebMethod(operationName = "agregarBalanceTienda")
    public boolean agregarUsuario(
            @WebParam(name = "totalEfectivo") double totalEfectivo,
            @WebParam(name = "fecha") String fecha
         
       
    ) {
        BalanceTienda balTienda = new BalanceTienda();
        balTienda.setTotalEfectivo(totalEfectivo);
        balTienda.setFecha(fecha);

       

        return dao.agregar(balTienda);
    }
    
    
    
    
    
    @WebMethod(operationName = "editar")
    public Boolean editar(@WebParam(name = "totalEfectivo") double totalEfectivo, 
            @WebParam(name = "fecha") String fecha ){

        BalanceTienda bt = new BalanceTienda();
        bt.setTotalEfectivo(totalEfectivo);
        bt.setFecha(fecha);
        
        return dao.editar(bt);
    }
    
    
    @WebMethod (operationName = "buscarFecha")
    public BalanceTienda buscarFecha(
    @WebParam(name = "fecha") String fecha
    ){
       return dao.buscarPorFecha(fecha);
    }
    
    
    
    
}
