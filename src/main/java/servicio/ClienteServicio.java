/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 * 
 * @author PC
 */
public class ClienteServicio implements IClienteServicio {
    
     private static List<Cliente> clienteList = new ArrayList<>();

    @Override
    public Cliente crear(Cliente cliente) {
        this.clienteList.add(cliente);
        return cliente;
    }

    @Override
    public Cliente buscarPorCodigo(int codigoCliente) {
        Cliente cliente=null;
        for(var c:this.clienteList){
            if(codigoCliente==c.getCodigo()){
                cliente=c;
                break;
            }
        }
        return cliente;
    }

    @Override
    public List<Cliente> listar() {
       return this.clienteList;
    }
}
