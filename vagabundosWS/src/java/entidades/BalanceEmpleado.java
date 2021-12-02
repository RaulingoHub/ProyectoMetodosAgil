/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Carlos Soto Pacheco
 */
public class BalanceEmpleado {
    
    
    private int idBalance, idEmpleado;
    private double efectivoEntrada, retiro;
    private String fecha;

    public BalanceEmpleado() {
    }

    public int getIdBalance() {
        return idBalance;
    }

    public void setIdBalance(int idBalance) {
        this.idBalance = idBalance;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getEfectivoEntrada() {
        return efectivoEntrada;
    }

    public void setEfectivoEntrada(double efectivoEntrada) {
        this.efectivoEntrada = efectivoEntrada;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
    
}
