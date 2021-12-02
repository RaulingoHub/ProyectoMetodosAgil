/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import configuracion.DBHelper;
import entidades.ProductoVendido;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Soto Pacheco
 */
public class ProductoVendidoDAOIMP implements CRUD<ProductoVendido> {

    DBHelper bd = new DBHelper();

    @Override
    public boolean agregar(ProductoVendido t) {

        boolean resultado = false;

        try {

            if (bd.connect()) {

                String query = "INSERT INTO `bfbkuvpw7umrcsbqjoms`.`productoVendido` (`idProducto`, `idTicket`) VALUES ('"+t.getIdProducto()+"', '"+t.getIdTicket()+"');";
                resultado = (boolean) bd.execute(query, true);

            }//INSERT INTO `bfbkuvpw7umrcsbqjoms`.`productoVendido` (`idProductoVendido`, `idProducto`, `idTicket`) VALUES ('4', '4', '1');


        } catch (Exception e) {

            bd.disconnect();
        } finally {

            bd.disconnect();

        }

        return resultado;

    }

    @Override
    public boolean editar(ProductoVendido t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductoVendido> buscarTodos() {

        List<ProductoVendido> lista = new ArrayList();

        try {

            String query = "SELECT * FROM productoVendido";

            if (bd.connect()) {

                ResultSet rs = (ResultSet) bd.execute(query, false);

                while (rs.next()) {
                    ProductoVendido p = new ProductoVendido();

                    p.setIdProductoVendido(rs.getInt("idProductoVendido"));
                    p.setIdProducto(rs.getInt("idProducto"));
                    p.setIdTicket(rs.getInt("idTicket"));

                    lista.add(p);

                }

            }

        } catch (Exception e) {
            bd.disconnect();
        } finally {

            bd.disconnect();
        }

        return lista;
    }

    @Override
    public ProductoVendido buscarId(int id) {
        ProductoVendido p = new ProductoVendido();

        try {

            String query = "SELECT * FROM productoVendido WHERE idProductoVendido = " + id;

            if (bd.connect()) {

                ResultSet rs = (ResultSet) bd.execute(query, false);

                while (rs.next()) {

                    p.setIdProductoVendido(rs.getInt("idProductoVendido"));
                    p.setIdProducto(rs.getInt("idProducto"));
                    p.setIdTicket(rs.getInt("idTicket"));

                }

            }

        } catch (Exception e) {
            bd.disconnect();
        } finally {

            bd.disconnect();
        }

        return p;

    }

    @Override
    public List<ProductoVendido> buscarNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
