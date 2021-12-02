
package UsuarioWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para loginUser complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="loginUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "loginUser", propOrder = {
    "correousuario",
    "contrase\u00f1ausuario"
})
public class LoginUser {

    protected String correousuario;
    protected String contraseñausuario;

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
