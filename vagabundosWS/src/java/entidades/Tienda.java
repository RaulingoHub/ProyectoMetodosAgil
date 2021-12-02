/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Carlos Soto Pacheco
 */
public class Tienda {

    private int idBalanceTienda;
    private long totalEfectivo;
    private long totalTarjetaBancaria;
    private Date fecha;

    public Tienda() {
    }

    public int getIdBalanceTienda() {
        return idBalanceTienda;
    }

    public void setIdBalanceTienda(int idBalanceTienda) {
        this.idBalanceTienda = idBalanceTienda;
    }

    public long getTotalEfectivo() {
        return totalEfectivo;
    }

    public void setTotalEfectivo(long totalEfectivo) {
        this.totalEfectivo = totalEfectivo;
    }

    public long getTotalTarjetaBancaria() {
        return totalTarjetaBancaria;
    }

    public void setTotalTarjetaBancaria(long totalTarjetaBancaria) {
        this.totalTarjetaBancaria = totalTarjetaBancaria;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    

}
