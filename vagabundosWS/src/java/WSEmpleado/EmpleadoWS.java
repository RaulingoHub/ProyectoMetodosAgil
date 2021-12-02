/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSEmpleado;

import entidades.Empleado;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.EmpleadoDAOIMP;

/**
 *
 * @author Carlos Soto Pacheco
 */
@WebService(serviceName = "EmpleadoWS")
public class EmpleadoWS {

    EmpleadoDAOIMP empleadoM = new EmpleadoDAOIMP();

    /**
     * This is a sample web service operation
     *
     * @param nombre
     * @param codigo
     * @param rol
     * @param contraseña
     * @param puesto
     * @return
     */
    @WebMethod(operationName = "agregarEmpleado")
    public boolean agregarEmpleado(
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "codigo") Long codigo,
            @WebParam(name = "rol") String rol,
            @WebParam(name = "contraseña") String contraseña,
            @WebParam(name = "puesto") String puesto
    ) {
        Empleado empleado = new Empleado();
        empleado.setCodigoEmpleado(codigo);
        empleado.setContraseña(contraseña);
        empleado.setNombre(nombre);
        empleado.setPuesto(puesto);
        empleado.setRol(rol);

        return empleadoM.agregar(empleado);
    }

    /**
     * Web service operation
     *Login de empleados, que permite ingresar a la aplicacion.
     * @param codigo
     * @param contraseña
     * @return
     */
    @WebMethod(operationName = "login")
    public Empleado login(
            @WebParam(name = "codigoEmpleado") long codigo,
            @WebParam(name = "contraseña") String contraseña
    ) {
        //TODO write your implementation code here:
        return empleadoM.login(codigo, contraseña);
    }

    /**
     * Web service operation
     *
     * @param codigo
     * @return
     */
    @WebMethod(operationName = "autorizacion")
    public Long autorizacion(@WebParam(name = "codigo") long codigo) {

        return empleadoM.autorizacion(codigo);
    }

    /**
     * Web service operation
     *
     * @param nombre
     * @param codigo
     * @param rol
     * @param puesto
    
     * @param id
     * @return
     */
    @WebMethod(operationName = "editar")
    public Boolean editar(@WebParam(name = "nombre") String nombre, @WebParam(name = "codigo") long codigo, @WebParam(name = "rol") String rol,
            @WebParam(name = "puesto") String puesto,
            @WebParam(name = "id") int id) {

        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(id);
        empleado.setCodigoEmpleado(codigo);
        empleado.setNombre(nombre);
        empleado.setPuesto(puesto);
        empleado.setRol(rol);
        return empleadoM.editar(empleado);
    }

    /**
     * Web service operation
     *
     * @param id
     * @return
     */
    @WebMethod(operationName = "eliminar")
    public boolean eliminar(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return empleadoM.eliminar(id);
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "buscarTodos")
    public List<Empleado> buscarTodos() {
        //TODO write your implementation code here:
        return empleadoM.buscarTodos();
    }

    /**
     * Web service operation
     *
     * @param id
     * @return
     */
    @WebMethod(operationName = "buscarPorID")
    public Empleado buscarPorID(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return empleadoM.buscarId(id);
    }

}
