/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Cliente;
import modelo.Producto;
import servicio.ClienteServicio;
import servicio.ProductoServicio;

/**
 *
 * @author PC
 */
public class ProductoControlador {
        
    private final ProductoServicio productoServicio = new ProductoServicio();
    private final ClienteServicio clienteServicio = new ClienteServicio();
    
    public Producto crear(String[] args){
       Cliente cliente =this.clienteServicio.buscarPorCodigo(Integer.valueOf(args[6]));
       Producto producto = new Producto(args[0],args[1],Integer.valueOf(args[2]),Integer.valueOf(args[3]),Integer.valueOf(args[4]),cliente);
        this.productoServicio.crear(producto);
        return producto;
    }
    
    public Producto buscarDignidad(String arg){
        return this.productoServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Producto eliminar(String arg)
    {
        return this.productoServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Producto modificar(String [] args){
        Cliente cliente =this.clienteServicio.buscarPorCodigo(Integer.valueOf(args[6]));
        Producto productoNuevo = new Producto(args[0],args[1],Integer.valueOf(args[2]),Integer.valueOf(args[3]),Integer.valueOf(args[4]),cliente);
        this.productoServicio.modificar(Integer.valueOf(args[4]), productoNuevo);
        return productoNuevo;
    }
    
    public List<Producto> listar(){
        return this.productoServicio.listar();
    }
    
}
