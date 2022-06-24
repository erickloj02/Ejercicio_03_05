/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Factura;

/**
 *
 * @author PC
 */
public interface IFacturaServicio {
    
    public Factura crear(Factura factura);
    public Factura modificar(int codigoFactura, Factura facturaNuevo);
    public Factura eliminar(int codigoFactura);
    public Factura buscarPorCodigo(int codigoFactura);
    public int buscarPosicion(Factura factura);
    public List<Factura> listar();
}
