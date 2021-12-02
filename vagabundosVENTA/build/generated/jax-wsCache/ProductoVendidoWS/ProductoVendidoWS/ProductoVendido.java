
package ProductoVendidoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productoVendido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productoVendido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idProductoVendido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idTicket" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productoVendido", propOrder = {
    "idProducto",
    "idProductoVendido",
    "idTicket"
})
public class ProductoVendido {

    protected int idProducto;
    protected int idProductoVendido;
    protected int idTicket;

    /**
     * Obtiene el valor de la propiedad idProducto.
     * 
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     */
    public void setIdProducto(int value) {
        this.idProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad idProductoVendido.
     * 
     */
    public int getIdProductoVendido() {
        return idProductoVendido;
    }

    /**
     * Define el valor de la propiedad idProductoVendido.
     * 
     */
    public void setIdProductoVendido(int value) {
        this.idProductoVendido = value;
    }

    /**
     * Obtiene el valor de la propiedad idTicket.
     * 
     */
    public int getIdTicket() {
        return idTicket;
    }

    /**
     * Define el valor de la propiedad idTicket.
     * 
     */
    public void setIdTicket(int value) {
        this.idTicket = value;
    }

}
