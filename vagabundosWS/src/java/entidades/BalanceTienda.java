/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author lopez
 */
public class BalanceTienda {
    
   private int id;
   private double totalEfectivo;
   private String fecha;

    public BalanceTienda() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the totalEfectivo
     */
    public double getTotalEfectivo() {
        return totalEfectivo;
    }

    /**
     * @param totalEfectivo the totalEfectivo to set
     */
    public void setTotalEfectivo(double totalEfectivo) {
        this.totalEfectivo = totalEfectivo;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   
   
   
    
}
