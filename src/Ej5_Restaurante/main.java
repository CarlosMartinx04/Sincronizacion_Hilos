package Ej5_Restaurante;

import Ej3_ColaPedidos.Consumidor;

public class main {
    public static void main(String[] args){
        Restaurante restaurante = new Restaurante();
        Cocinero c1 = new Cocinero("Cocinero 1", restaurante);
        Cocinero c2 = new Cocinero("Cocinero 2", restaurante);

        Cliente cliente1 = new Cliente("Cliente 1", restaurante);
        Cliente cliente2 = new Cliente("Cliente 2", restaurante);
        Cliente cliente3 = new Cliente("Cliente 3", restaurante);
        Cliente cliente4 = new Cliente("Cliente 4", restaurante);
        Cliente cliente5 = new Cliente("Cliente 5", restaurante);

        c1.start();
        c2.start();

        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();

    }
}
