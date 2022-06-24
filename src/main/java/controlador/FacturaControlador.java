/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Factura;
import modelo.Producto;
import servicio.FacturaServicio;
import servicio.ProductoServicio;

/**
 *
 * @author PC
 */
public class FacturaControlador {
    
    private final FacturaServicio facturaServicio = new FacturaServicio();
    private final ProductoServicio productoServicio = new ProductoServicio();
    
    public Factura crear(String[] args){
        Producto producto = this.productoServicio.buscarPorCodigo(Integer.valueOf(args[5]));
        Factura factura = new Factura (args[0],Integer.valueOf(args[1]), Integer.valueOf(args[2]),Integer.valueOf(args[3]), producto);
        this.facturaServicio.crear(factura);
        return factura;
    }
    
    public Factura buscarFactura(String arg){
        return this.facturaServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Factura eliminar(String arg)
    {
        return this.facturaServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Factura modificar(String [] args){
         
        Producto producto = this.productoServicio.buscarPorCodigo(Integer.valueOf(args[5]));
        Factura facturaNueva = new Factura (args[0],Integer.valueOf(args[1]), Integer.valueOf(args[2]),Integer.valueOf(args[3]),producto);
        this.facturaServicio.modificar(Integer.valueOf(args[1]), facturaNueva);
        return facturaNueva;
    }
    
    public List<Factura> listar(){
        return this.facturaServicio.listar();
    }
    
}
