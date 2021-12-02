/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import configuracion.DBHelper;
import entidades.BalanceTienda;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author lopez
 */
public class BalanceTiendaDAOIMP implements CRUD<BalanceTienda> {
    DBHelper bd = new DBHelper();
    @Override
    public boolean agregar(BalanceTienda t) {
     boolean resultado = false;
     
        if (bd.connect()) {
            try {
                StringBuilder sql = new StringBuilder();

                ///sql.append("INSERT INTO `vagabundosws`.`empleados` (`int`, `nombre`, `codigo`, `rol`, `contraseña`) VALUES ('1', 'Carlos Alberto Soto Pacheco', '1450842', 'Admin', 'a231195d67aa0224b886ddd8fbdcfa92')");
                sql.append("INSERT INTO bfbkuvpw7umrcsbqjoms.balanceTienda")
                        .append("(totalEfectivo, fecha) VALUES")
                        .append("('").append(t.getTotalEfectivo()).append("',")
                       
                        .append("'").append(t.getFecha()).append("')");

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
    public boolean editar(BalanceTienda t) {
     boolean resultado = false;
        try {

            if (bd.connect()) {

           String query="UPDATE `bfbkuvpw7umrcsbqjoms`.`balanceTienda` SET `totalEfectivo` = '"+t.getTotalEfectivo()+"', `fecha` = '"+t.getFecha()+"' WHERE (`fecha` = '"+t.getFecha()+"');";
                resultado = (boolean) bd.execute(query, true);

            }

        } catch (Exception e) {
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
    public List<BalanceTienda> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BalanceTienda buscarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BalanceTienda> buscarNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public BalanceTienda buscarPorFecha(String fecha){
        
        BalanceTienda tienda = new BalanceTienda();
        
        try {
            if (bd.connect()) {
            
                String query = "SELECT * FROM balanceTienda WHERE fecha = '"+fecha+"'";
                
                ResultSet rs =(ResultSet) bd.execute(query, false);
                
                if(rs.next()){
                    tienda.setFecha(rs.getString("fecha"));
                    tienda.setId(rs.getInt("idBalanceTienda"));
                    tienda.setTotalEfectivo(rs.getDouble("totalEfectivo"));
                }
                
                
                
            }
            
            
            
            
            
        } catch (Exception e) {
        }finally{
            bd.disconnect();
        }
        
        return tienda;
        
    }
    
    
    
}
