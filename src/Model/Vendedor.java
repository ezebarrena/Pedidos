package Model;

import java.util.*;
import Model.*;

public class Vendedor {

    private int numVendedor;
    private String nombre;

    public Vendedor(int numVendedor, String nombre) {
        this.numVendedor = numVendedor;
        this.nombre =nombre;
    }

    

    public boolean verificarCliente(int numCliente) {
        return false;
    }

    public void altaCliente(int numCliente, String nombreC, String categoriaF, String categoriaIIBB) {
    }



    public boolean soyElVendedor(int numVendedorB) {
        return (numVendedorB == numVendedor);
    }

}