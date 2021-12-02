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
public class ProductoVendido {
    int idProductoVendido;
    int idProducto;
    int idTicket;

    public ProductoVendido() {
    }

    public int getIdProductoVendido() {
        return idProductoVendido;
    }

    public void setIdProductoVendido(int idProductoVendido) {
        this.idProductoVendido = idProductoVendido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }
    
    
}
