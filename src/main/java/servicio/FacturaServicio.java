/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Factura;

/**
 *
 * @author PC
 */
public class FacturaServicio implements IFacturaServicio {

    private static List<Factura> facturaList = new ArrayList<>();

    @Override
    public Factura crear(Factura factura) {
        this.facturaList.add(factura);
        return factura;
    }

    @Override
    public Factura modificar(int codigoFactura, Factura facturaNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoFactura));
        this.listar().get(posicion).setNombreEmpresa(facturaNuevo.getNombreEmpresa());
        this.listar().get(posicion).setCantidadProducto(facturaNuevo.getCantidadProducto());
        this.listar().get(posicion).setYearFacturaRecibida(facturaNuevo.getYearFacturaRecibida());
        this.listar().get(posicion).setProducto(facturaNuevo.getProducto());
        return facturaNuevo;
    }

    @Override
    public Factura eliminar(int codigoFactura) {
        Factura factura=this.buscarPorCodigo(codigoFactura);
        var posicion=this.buscarPosicion(factura);
        this.listar().remove(posicion);
        return factura;
    }

    @Override
    public Factura buscarPorCodigo(int codigoFactura) {
        Factura factura=null;
        for(var f:this.facturaList){
            if(codigoFactura==f.getCodigo()){
                factura=f;
                break;
            }
        }
        return factura;
    }

    @Override
    public int buscarPosicion(Factura factura) {
        int posicion=-1;
        for(var f:this.facturaList){
            posicion++;
            if(f.getCodigo()==factura.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }  
}

/*
 @Override
    public Factura crear(Factura factura) {
        this.facturaList.add(factura);
        return factura;
    }

    @Override
    public Factura modificar(int codigoFactura, Factura facturaNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoFactura));
        this.listar().get(posicion).setNombreEmpresa(facturaNuevo.getNombreEmpresa());
        this.listar().get(posicion).setCantidadProducto(facturaNuevo.getCantidadProducto());
        this.listar().get(posicion).setYearFacturaRecibida(facturaNuevo.getYearFacturaRecibida());
        this.listar().get(posicion).setProducto(facturaNuevo.getProducto());
        return facturaNuevo;
    }

    @Override
    public Factura eliminar(int codigoFactura) {
        Factura factura=this.buscarPorCodigo(codigoFactura);
        var posicion=this.buscarPosicion(factura);
        this.listar().remove(posicion);
        return factura;
    }

    @Override
    public Factura buscarPorCodigo(int codigoFact) {
        Factura factura=null;
        for(var f:this.facturaList){
            if(codigoFact==f.getCodigoFactura()){
                factura=f;
                break;
            }
        }
        return factura;
    }

    @Override
    public int buscarPosicion(Factura factura) {
       int posicion=-1;
        for(var e:this.facturaList){
            posicion++;
            if(e.getCodigoFactura()==factura.getCodigoFactura()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }
*/