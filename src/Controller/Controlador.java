package Controller;

import java.util.*;

import Model.*;

public class Controlador {

    public static ArrayList<Vendedor> vendedores;
    private static ArrayList<Cliente> clientes;


    private static Controlador instancia;
    

    public Controlador() {
        vendedores = new ArrayList<Vendedor>();
        clientes = new ArrayList<Cliente>();
    }

    public static Controlador getInstance() {
        if(instancia==null) {
			instancia= new Controlador();
		}
		return instancia;
    }

    public boolean altaCliente(int numCliente, String nombre, String categoriaF, String categoriaIIBB) {
        Cliente cliente = buscarCliente(numCliente);
        if (cliente == null){
            cliente = new Cliente (numCliente, nombre, categoriaF, categoriaIIBB);
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente (int numCliente){
        for ( Cliente clienteB : clientes){
            if (clienteB.soyElCliente(numCliente))
                return clienteB;
        }
        return null;
    }

    public boolean verificarCliente(int numCliente) {

        for ( Cliente clienteB : clientes){
            if (clienteB.soyElCliente(numCliente))
                return true;
        }
        return false;
    }

    public void crearPedido() {
    }
    
    public void cargarArticulo() {
    }
    
    public boolean registrarVendedor(int numVendedor, String nombre) {
        Vendedor vendedor = buscarVendedor(numVendedor);
        if (vendedor == null){
            vendedor = new Vendedor(numVendedor, nombre);
            vendedores.add(vendedor);
            return true;
        }
        return false;
    }

    public Vendedor buscarVendedor(int numVendedor) {
        for ( Vendedor vendedorB : vendedores){
            if (vendedorB.soyElVendedor(numVendedor))
                return vendedorB;
        }
        return null;
    }

    public void registrarProducto() {
    }


    /*------------------------------------------------------------------------------------------------------------*/
    

}