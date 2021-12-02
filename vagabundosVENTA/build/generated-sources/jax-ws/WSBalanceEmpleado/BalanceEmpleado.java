
package WSBalanceEmpleado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para balanceEmpleado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="balanceEmpleado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="efectivoEntrada" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idBalance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idEmpleado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="retiro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balanceEmpleado", propOrder = {
    "efectivoEntrada",
    "fecha",
    "idBalance",
    "idEmpleado",
    "retiro"
})
public class BalanceEmpleado {

    protected double efectivoEntrada;
    protected String fecha;
    protected int idBalance;
    protected int idEmpleado;
    protected double retiro;

    /**
     * Obtiene el valor de la propiedad efectivoEntrada.
     * 
     */
    public double getEfectivoEntrada() {
        return efectivoEntrada;
    }

    /**
     * Define el valor de la propiedad efectivoEntrada.
     * 
     */
    public void setEfectivoEntrada(double value) {
        this.efectivoEntrada = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idBalance.
     * 
     */
    public int getIdBalance() {
        return idBalance;
    }

    /**
     * Define el valor de la propiedad idBalance.
     * 
     */
    public void setIdBalance(int value) {
        this.idBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad idEmpleado.
     * 
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Define el valor de la propiedad idEmpleado.
     * 
     */
    public void setIdEmpleado(int value) {
        this.idEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad retiro.
     * 
     */
    public double getRetiro() {
        return retiro;
    }

    /**
     * Define el valor de la propiedad retiro.
     * 
     */
    public void setRetiro(double value) {
        this.retiro = value;
    }

}
