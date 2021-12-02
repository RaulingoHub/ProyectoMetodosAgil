/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSProducto;

import entidades.Producto;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.ProductoDAOIMP;

/**
 *
 * @author Carlos Soto Pacheco
 */
@WebService(serviceName = "ProductoWS")
public class ProductoWS {

    ProductoDAOIMP productoM = new ProductoDAOIMP();

    /**
     *
     * @param nombreProducto
     * @param cantidad
     * @param precio
     * @param codigoProducto
     * @return
     */
    @WebMethod(operationName = "agregar")
    public boolean agregar(@WebParam(name = "nombreProducto") String nombreProducto, @WebParam(name = "cantidad") int cantidad, @WebParam(name = "precio") double precio, @WebParam(name = "codigoProducto") String codigoProducto) {

        Producto producto = new Producto();
        producto.setCantidadProducto(cantidad);
        producto.setNombreProducto(nombreProducto);
        producto.setPrecioProducto(precio);
    producto.setCodigo(codigoProducto);
        return productoM.agregar(producto);

    }

    /**
     *
     * @param nombreProducto
     * @param cantidad
     * @param precio
     * @param codigoProducto
     * @param id
     * @return
     */
    @WebMethod(operationName = "editar")
    public boolean editar(@WebParam(name = "nombreProducto") String nombreProducto, @WebParam(name = "cantidad") int cantidad, @WebParam(name = "precio") double precio, @WebParam(name = "codigoProducto") String codigoProducto, @WebParam(name = "id") int id) {

        Producto producto = new Producto();
        producto.setCantidadProducto(cantidad);
        producto.setCodigo(codigoProducto);
        producto.setNombreProducto(nombreProducto);
        producto.setPrecioProducto(precio);
        producto.setIdProducto(id);

        return productoM.editar(producto);

    }

    /**
     * Web service operation
     *
     * @param id
     * @return
     */
    @WebMethod(operationName = "eliminar")
    public boolean eliminar(@WebParam(name = "id") int id) {
        return productoM.eliminar(id);
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "buscarTodos")
    public List<Producto> buscarTodos() {
        return productoM.buscarTodos();
    }

    /**
     *
     * @param id
     * @return
     */
    @WebMethod(operationName = "buscarPorID")
    public Producto buscarPorID(@WebParam(name = "id") int id) {

        return productoM.buscarId(id);

    }
    
    /**
     *
     * @param nombre
     * @return
     */
    @WebMethod(operationName = "buscarPorNombre")
    public List<Producto> buscarPorNombre(@WebParam(name = "nombre") String nombre) {

        return productoM.buscarNombre(nombre);

    }
    
    /**
     *
     * @param codigo
     * @return
     */
    @WebMethod(operationName = "buscarPorCodigo")
    public Producto buscarPorCodigo(@WebParam(name = "codigo") String codigo) {

        return productoM.buscarCodigo(codigo);

        
    }
    
    
    
    
    

}
