package Model;

import java.util.*;


public class Cliente {

    private int numCliente;
    private String nombreC;
    private String categoriaF;
    private String categoriaIIBB;

    public Cliente(int numCliente, String nombreC, String categoriaF, String categoriaIIBB) {
        this.numCliente = numCliente;
        this.nombreC = nombreC;
        this.categoriaF = categoriaF;
        this.categoriaIIBB = categoriaIIBB;
    }

    public boolean soyElCliente(int numCliente2) {
        return (numCliente2 == numCliente);
    }
    

}