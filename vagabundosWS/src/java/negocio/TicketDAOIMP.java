/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import configuracion.DBHelper;
import entidades.Ticket;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Soto Pacheco
 */
public class TicketDAOIMP implements CRUD<Ticket> {

    DBHelper bd = new DBHelper();

    @Override
    public boolean agregar(Ticket t) {
        boolean resultado = false;
        try {
            if (bd.connect()) {
                String query = "INSERT INTO `bfbkuvpw7umrcsbqjoms`.`ticket` (`fecha`, `idEmpleado`, `total`) VALUES "
                        + "('" + t.getFecha() + "', '" + t.getIdEmpleado() + "', '" + t.getTotal() + "');";
                resultado = (boolean) bd.execute(query, true);
            }
        } catch (Exception e) {
        } finally {
            bd.disconnect();
        }
        return resultado;
    }

    @Override
    public boolean editar(Ticket t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ticket> buscarTodos() {
        List<Ticket> lista = new ArrayList();

        try {

            String query = "SELECT * FROM ticket";

            if (bd.connect()) {

                ResultSet rs = (ResultSet) bd.execute(query, false);

                while (rs.next()) {
                    Ticket tk = new Ticket();

                    tk.setFecha(rs.getString("fecha"));
                    tk.setIdEmpleado(rs.getInt("idEmpleado"));
                    tk.setIdTicket(rs.getInt("idTicket"));
                    tk.setTotal(rs.getLong("total"));

                    lista.add(tk);

                }

            }

        } catch (Exception e) {
        } finally {

            bd.disconnect();
        }

        return lista;

    }

    @Override
    public Ticket buscarId(int id) {
        Ticket tk = new Ticket();

        try {

            String query = "SELECT * FROM Ticket WHERE idTicket ="+id;

            if (bd.connect()) {

                ResultSet rs = (ResultSet) bd.execute(query, false);

                while (rs.next()) {

                    tk.setFecha(rs.getString("fecha"));
                    tk.setIdEmpleado(rs.getInt("idEmpleado"));
                    tk.setIdTicket(rs.getInt("idTicket"));
                    tk.setTotal(rs.getLong("total"));

                }

            }

        } catch (Exception e) {
        } finally {

            bd.disconnect();
        }

        return tk;

    }

    @Override
    public List<Ticket> buscarNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
