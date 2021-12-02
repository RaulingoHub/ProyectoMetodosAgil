
package WSBalanceEmpleado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para editar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="editar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEmpleado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EfectivoEntrada" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="retiro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editar", propOrder = {
    "idEmpleado",
    "efectivoEntrada",
    "retiro",
    "fecha"
})
public class Editar {

    protected int idEmpleado;
    @XmlElement(name = "EfectivoEntrada")
    protected double efectivoEntrada;
    protected double retiro;
    protected String fecha;

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

}
