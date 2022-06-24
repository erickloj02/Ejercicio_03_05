/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PC
 */
public class Producto {
    
    private String tipoProducto;
    private String nombreProducto;
    private int precioProducto;
    private int yearFabricacion;
    private int codigo;
    private Cliente cliente;

    public Producto(String tipoProducto, String nombreProducto, int precioProducto, int yearFabricacion, int codigo, Cliente cliente) {
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.yearFabricacion = yearFabricacion;
        this.codigo = codigo;
        this.cliente = cliente;
    }

    public Producto(String tipoProducto, String nombreProducto, int precioProducto, int yearFabricacion, int codigo) {
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.yearFabricacion = yearFabricacion;
        this.codigo = codigo;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getYearFabricacion() {
        return yearFabricacion;
    }

    public void setYearFabricacion(int yearFabricacion) {
        this.yearFabricacion = yearFabricacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String validarTipoProducto(){
        var retorno="TBD";
        var producto=this.tipoProducto.charAt(0);
        switch(producto)
        {
           case 'V':
           retorno="Vegetales";
           break;
           case 'C':
           retorno="Carnes";
           break;
           case 'F':
           retorno="Frutas";
           break;
           case 'G':
           retorno="Golosinas";
           break;
           case 'B':
           retorno="Bebidas";
           break;
        }
        return retorno;
    }
    
    public int calcularDurabilidadProducto (int yearExpedicion){    
         var retorno= 10;
         retorno= yearExpedicion - this.yearFabricacion;
         return retorno;
    } 

    @Override
    public String toString() {
        return "Producto{" + "tipoProducto=" + tipoProducto + ", nombreProducto=" 
                + nombreProducto + ", precioProducto=" + precioProducto 
                + ", yearFabricacion=" + yearFabricacion + ", codigo=" + codigo
                + ", cliente=" + cliente + '}';
    }

}
