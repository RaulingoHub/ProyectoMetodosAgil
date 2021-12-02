/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import configuracion.DBHelper;
import entidades.Usuario;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lopez
 */
public class UsuarioDAOIMP implements CRUD<Usuario> {
   DBHelper bd = new DBHelper();
    @Override
    public boolean agregar(Usuario user) {
       boolean resultado = false;
        if (bd.connect()) {
            try {
                StringBuilder sql = new StringBuilder();

               sql.append("INSERT INTO usuario")
                        .append("(nombreusuario,correousuario,contraseñausuario) VALUES")
                        .append("('").append(user.getNombre()).append("',")
                        .append("'").append(user.getCorreo()).append("',")
                        .append("MD5('").append(user.getContraseña()).append("'))");
                    

                resultado = (boolean) bd.execute(sql.toString(), true);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                bd.disconnect();
            }

        }

        return resultado;
    
    }

    @Override
    public boolean editar(Usuario user) {
       boolean resultado = false;
        try {
            if (bd.connect()) {
                String query = "UPDATE empleados SET  "
                        + "`nombreusuario` = '" + user.getNombre() + "',  "
                        + "`correousuario` = '" + user.getCorreo()+ "',  "
                        + " WHERE (`id` = '" + user.getIdUser()+ "') ";
                resultado = (boolean) bd.execute(query, true);
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            bd.disconnect();
        }
        return resultado;
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> buscarTodos() {
   
    
        List<Usuario> user = new ArrayList();

        try {
            if (bd.connect()) {
                String query = "SELECT * FROM  usuario";
                ResultSet rs = (ResultSet) bd.execute(query, false);
                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setIdUser(rs.getInt("idusuario"));
                    usuario.setNombre(rs.getString("nombreusuario"));
                    usuario.setCorreo(rs.getString("correousuario"));
              
               
                  
                    user.add(usuario);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            bd.disconnect();
        }

        return user;
    }
    
    
    

    @Override
    public Usuario buscarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> buscarNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public boolean loginUser(String correo, String contraseña) {
        Usuario user = new Usuario();
boolean resultado = false;
        if (bd.connect()) {

            try {

                StringBuilder sql = new StringBuilder();

                sql.append("SELECT * FROM usuario WHERE correousuario ='").
                        append(correo).append("' AND contraseñausuario = MD5('").append(contraseña).append("')");

                ResultSet rs = (ResultSet) bd.execute(sql.toString(), false);

                if (rs.next()) {
                    resultado = true;
                }else{
                resultado=false;
                }

            } catch (Exception e) {
                
            }
        }

        return resultado;
    }
    
}
