
package UsuarioWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correousuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contraseñausuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarUsuario", propOrder = {
    "nombreusuario",
    "correousuario",
    "contrase\u00f1ausuario"
})
public class AgregarUsuario {

    protected String nombreusuario;
    protected String correousuario;
    protected String contraseñausuario;

    /**
     * Obtiene el valor de la propiedad nombreusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreusuario() {
        return nombreusuario;
    }

    /**
     * Define el valor de la propiedad nombreusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreusuario(String value) {
        this.nombreusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad correousuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreousuario() {
        return correousuario;
    }

    /**
     * Define el valor de la propiedad correousuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreousuario(String value) {
        this.correousuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contraseñausuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraseñausuario() {
        return contraseñausuario;
    }

    /**
     * Define el valor de la propiedad contraseñausuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraseñausuario(String value) {
        this.contraseñausuario = value;
    }

}
