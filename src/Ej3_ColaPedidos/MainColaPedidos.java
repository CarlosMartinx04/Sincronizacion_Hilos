package Ej3_ColaPedidos;

public class MainColaPedidos {

    public static void main(String[] args){
        ColaPedidos colaPedidos = new ColaPedidos();
        Productor p = new Productor("Productor 1", colaPedidos);
        colaPedidos.start();
        p.start();
    }

}
