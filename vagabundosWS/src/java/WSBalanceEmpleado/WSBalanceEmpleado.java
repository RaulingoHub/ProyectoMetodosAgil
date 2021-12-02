/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSBalanceEmpleado;

import entidades.BalanceEmpleado;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.BalanceDAOIMP;

/**
 *
 * @author Carlos Soto Pacheco
 */
@WebService(serviceName = "WSBalanceEmpleado")
public class WSBalanceEmpleado {

    /**
     * This is a sample web service operation
     */
    BalanceDAOIMP mt = new BalanceDAOIMP();

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "agregarBalance")
    public boolean agregarBalance(@WebParam(name = "idEmpleado") int id,
            @WebParam(name = "EfectivoEntrada") double efectivoEntrada,
            @WebParam(name = "retiro") double retiro,
            @WebParam(name = "fecha") String fecha
    ) {

        BalanceEmpleado balance = new BalanceEmpleado();
        balance.setEfectivoEntrada(efectivoEntrada);
        balance.setFecha(fecha);
        balance.setIdEmpleado(id);
        balance.setRetiro(retiro);

        return mt.agregar(balance);

    }

    @WebMethod(operationName = "editar")
    public boolean editar(
            @WebParam(name = "idEmpleado") int id,
            @WebParam(name = "EfectivoEntrada") double efectivoEntrada,
            @WebParam(name = "retiro") double retiro,
            @WebParam(name = "fecha") String fecha
    ) {

        BalanceEmpleado balance = new BalanceEmpleado();
        balance.setEfectivoEntrada(efectivoEntrada);
        balance.setFecha(fecha);
        balance.setIdEmpleado(id);
        balance.setRetiro(retiro);

        return mt.editar(balance);
    }

    @WebMethod(operationName = "buscarIDFecha")
    public BalanceEmpleado buscarIDFecha(
            @WebParam(name = "idEmpleado") int idEmpleado,
            @WebParam(name = "fecha") String fecha
    ) {

       BalanceEmpleado balance = mt.buscarIdFecha(idEmpleado, fecha);
        return balance;

    }

}
