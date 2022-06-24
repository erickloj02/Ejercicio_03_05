/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PC
 */
public class Factura {
   
    private String nombreEmpresa;
    private int cantidadProducto; 
    private int yearFacturaRecibida;
    private int codigo;
    private Producto producto;

    public Factura(String nombreEmpresa, int cantidadProducto, int yearFacturaRecibida, int codigo, Producto producto) {
        this.nombreEmpresa = nombreEmpresa;
        this.cantidadProducto = cantidadProducto;
        this.yearFacturaRecibida = yearFacturaRecibida;
        this.codigo = codigo;
        this.producto = producto;
    }

    public Factura(String nombreEmpresa, int cantidadProducto, int yearFacturaRecibida, int codigo) {
        this.nombreEmpresa = nombreEmpresa;
        this.cantidadProducto = cantidadProducto;
        this.yearFacturaRecibida = yearFacturaRecibida;
        this.codigo = codigo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getYearFacturaRecibida() {
        return yearFacturaRecibida;
    }

    public void setYearFacturaRecibida(int yearFacturaRecibida) {
        this.yearFacturaRecibida = yearFacturaRecibida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String verificarFecha(){
     var retorno= " ";
      
        if (this.yearFacturaRecibida>=2017 && this.yearFacturaRecibida<= 2022){    
          retorno= "Compra Reciente"; 
        }else if (this.yearFacturaRecibida>2010 && this.yearFacturaRecibida<2017){
          retorno= "Compra Antigua";
        }
        return retorno;   
    } 
    
    public String verificarCantidadProducto(){
     var retorno= " ";
      
      if (this.cantidadProducto>=5 && this.cantidadProducto<= 30){  
          retorno= "Cantidad de Productos Extensa"; 
        }else if (this.cantidadProducto>=1 && this.yearFacturaRecibida<5){
          retorno= "Cantidad de Productos Reducido";
        }
        return retorno;   
    } 

    @Override
    public String toString() {
        return "Factura{" + "nombreEmpresa=" + nombreEmpresa + ", cantidadProducto=" 
                + cantidadProducto + ", yearFacturaRecibida=" + yearFacturaRecibida 
                + ", codigo=" + codigo + ", producto=" + producto + '}';
    }
}
