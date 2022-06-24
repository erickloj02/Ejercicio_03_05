/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author PC
 */
public class ProductoServicio implements IProductoServicio {

    private static List<Producto> productoList = new ArrayList<>(); 

    @Override
    public Producto crear(Producto producto) {
        this.productoList.add(producto);
        return producto;
    }

    @Override
    public Producto modificar(int codigoProducto, Producto productoNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoProducto));
        this.listar().get(posicion).setTipoProducto(productoNuevo.getTipoProducto());
        this.listar().get(posicion).setNombreProducto(productoNuevo.getNombreProducto());
        this.listar().get(posicion).setPrecioProducto(productoNuevo.getPrecioProducto());
        this.listar().get(posicion).setYearFabricacion(productoNuevo.getYearFabricacion());
        this.listar().get(posicion).setCliente(productoNuevo.getCliente());
        return productoNuevo;
    }

    @Override
    public Producto eliminar(int codigoProducto) {
        Producto producto=this.buscarPorCodigo(codigoProducto);
        var posicion=this.buscarPosicion(producto);
        this.listar().remove(posicion);
        return producto;
    }

    @Override
    public Producto buscarPorCodigo(int codigoProducto) {
        Producto producto=null;
        for(var p:this.productoList){
            if(codigoProducto==p.getCodigo()){
                producto=p;
                break;
            }
        }
        return producto;
    }

    @Override
    public int buscarPosicion(Producto producto) {
        int posicion=-1;
        for(var p:this.productoList){
            posicion++;
            if(p.getCodigo()==producto.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Producto> listar() {
       return this.productoList;
    }

    
}



/*
@Override
    public Producto crear(Producto producto) {
        this.productoList.add(producto);
        return producto;
    }

    @Override
    public Producto modificar(int codigoProducto, Producto productoNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoProducto));
        this.listar().get(posicion).setCodigoProducto(productoNuevo.getCodigoProducto());
        this.listar().get(posicion).setNombreProducto(productoNuevo.getNombreProducto());
        this.listar().get(posicion).setPrecioProducto(productoNuevo.getPrecioProducto());
        this.listar().get(posicion).setYearFabricacion(productoNuevo.getYearFabricacion());
        this.listar().get(posicion).setFactura(productoNuevo.getFactura());
        return productoNuevo;
    }

    @Override
    public Producto eliminar(int codigoProducto) {
        Producto producto=this.buscarPorCodigo(codigoProducto);
        var posicion=this.buscarPosicion(producto);
        this.listar().remove(posicion);
        return producto;
    }

    @Override
    public Producto buscarPorCodigo(int codigoProducto) {
        Producto producto=null;
        for(var p:this.productoList){
            if(codigoProducto==p.getCodigoProducto()){
                producto=p;
                break;
            }
        }
        return producto;
    }

    @Override
    public int buscarPosicion(Producto producto) {
        int posicion=-1;
        for(var p:this.productoList){
            posicion++;
            if(p.getCodigoProducto()==producto.getCodigoProducto()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Producto> listar() {
         return this.productoList;
    }   
*/