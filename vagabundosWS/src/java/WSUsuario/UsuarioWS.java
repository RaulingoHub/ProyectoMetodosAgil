/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSUsuario;

import entidades.Usuario;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import negocio.UsuarioDAOIMP;

/**
 *
 * @author lopez
 */
@WebService(serviceName = "UsuarioWS")
public class UsuarioWS {
    UsuarioDAOIMP userM = new UsuarioDAOIMP();
    
    
    @WebMethod(operationName = "agregarUsuario")
    public boolean agregarUsuario(
            @WebParam(name = "nombreusuario") String nombre,
            @WebParam(name = "correousuario") String correo,
            @WebParam(name = "contraseñausuario") String contraseña
       
    ) {
        Usuario user = new Usuario();
        user.setNombre(nombre);
        user.setCorreo(correo);
        user.setContraseña(contraseña);
       

        return userM.agregar(user);
    }
     @WebMethod(operationName = "loginUser")
    public boolean loginUser(
            @WebParam(name = "correousuario") String correo,
            @WebParam(name = "contraseñausuario") String contraseña
    ) {
        
        
        //TODO write your implementation code here:
        return userM.loginUser(correo, contraseña);
    }
    
      @WebMethod(operationName = "buscarTodos")
    public List<Usuario> buscarTodos() {
        //TODO write your implementation code here:
        return userM.buscarTodos();
    }
    
}
