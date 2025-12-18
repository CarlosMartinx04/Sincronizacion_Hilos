package Ej3_ColaPedidos;

public class MainColaPedidos {
    public static void main(String[] args){

    ColaPedidos colaPedidos = new ColaPedidos();
    Consumidor c = new Consumidor(colaPedidos);
    Productor p = new Productor(colaPedidos);

    c.start();
    p.start();

    }
}
