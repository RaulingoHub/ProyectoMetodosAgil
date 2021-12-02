/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.ResultSet;

import configuracion.DBHelper;
import entidades.BalanceEmpleado;
import java.util.List;

/**
 *
 * @author Carlos Soto Pacheco
 */
public class BalanceDAOIMP implements CRUD<BalanceEmpleado> {

    DBHelper bd = new DBHelper();

    @Override
    public boolean agregar(BalanceEmpleado t) {
        boolean resultado = false;
        try {
            if (bd.connect()) {

                String query = "INSERT INTO `bfbkuvpw7umrcsbqjoms`.`balance` (`idEmpleado`, `efectivoEntrada`, `retiro`,`fecha` ) VALUES ("
                        + "'" + t.getIdEmpleado() + "', '" + t.getEfectivoEntrada() + "', '" + t.getRetiro() + "',' "+t.getFecha()+"');";

                resultado = (boolean) bd.execute(query, true);
            }

        } catch (Exception e) {

        } finally {

            bd.disconnect();
        }

        return resultado;
    }

    @Override
    public boolean editar(BalanceEmpleado t) {

        boolean resultado = false;
        try {

            if (bd.connect()) {

           String query="UPDATE `bfbkuvpw7umrcsbqjoms`.`balance` SET `efectivoEntrada` = '"+t.getEfectivoEntrada()+"', `retiro` = '"+t.getRetiro()+"' WHERE (`idEmpleado` = '"+t.getIdEmpleado()+"') AND (`fecha` = '"+t.getFecha()+"');";
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
    public List<BalanceEmpleado> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BalanceEmpleado buscarId(int id) {
        BalanceEmpleado balance = new BalanceEmpleado();

        return balance;
    }

    public BalanceEmpleado buscarIdFecha(int id, String fecha) {
        BalanceEmpleado balance = new BalanceEmpleado();
        try {

            if (bd.connect()) {

                String query = "SELECT * FROM balance WHERE (`idEmpleado`) ="+id+" AND (`fecha`) ='"+fecha+"'";
                ResultSet rs = (ResultSet) bd.execute(query, false);

                if (rs.next()) {

                    balance.setEfectivoEntrada(rs.getDouble("efectivoEntrada"));
                    balance.setFecha(rs.getString("fecha"));
                    balance.setIdBalance(rs.getInt("idBalance"));
                    balance.setIdEmpleado(rs.getInt("idEmpleado"));
                    balance.setRetiro(rs.getDouble("retiro"));

                } else {
                    balance.setFecha("vacioooo");
                }

            } else {
                balance.setFecha("no entra a la bd");
            }

        } catch (Exception e) {
        } finally {
            bd.disconnect();
        }

        return balance;
    }

    @Override
    public List<BalanceEmpleado> buscarNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
