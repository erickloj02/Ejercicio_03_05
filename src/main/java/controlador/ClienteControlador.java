/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Cliente;
import servicio.ClienteServicio;

/**
 *
 * @author PC
 */
public class ClienteControlador {

    private final ClienteServicio clienteServicio = new ClienteServicio();
   
    public Cliente crear(String [] args){
        var cliente = new Cliente(Integer.valueOf(args[0]),args[1],args[2], Integer.valueOf(args[3]));
        this.clienteServicio.crear(cliente);
        return cliente;
    }
    
    public List<Cliente> listar(){
        return this.clienteServicio.listar();
    }
}
