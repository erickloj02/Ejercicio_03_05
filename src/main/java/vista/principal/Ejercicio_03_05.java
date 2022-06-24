/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista.principal;

import vista.cliente.CreateCliente;
import vista.factura.CreateFactura;
import vista.factura.DeleteFactura;
import vista.factura.UpdateFactura;
import vista.producto.CreateProducto;

/**
 *
 * @author PC
 */
public class Ejercicio_03_05 {

    public static void main(String[] args) {
        var v1 = new CreateFactura();
        var v2 = new DeleteFactura();
        var v3 = new UpdateFactura();
        var v4 = new CreateProducto();
        var v5 = new CreateCliente();
        
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
        v4.setVisible(true);
        v5.setVisible(true);
    }
}
