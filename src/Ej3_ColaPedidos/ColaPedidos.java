package Ej3_ColaPedidos;

import java.util.ArrayList;

public class ColaPedidos {

    ArrayList<String> pedidos = new ArrayList<>();

    public synchronized void hacerPedido() throws InterruptedException {
        System.out.println("Se va a preparar un pedido");
            while(pedidos.size()>=5){
                System.out.println("Esperando a que se consuman pedidos");
                wait();
            }
            pedidos.add("Pedido"+(pedidos.size()+1));
            System.out.println("Se ha hecho un pedido. Pedidos("+pedidos.size()+")");
            notifyAll();

    }

    public synchronized void consumePedido() throws InterruptedException {
        while (pedidos.isEmpty()){
            System.out.println("Esperando a que haya pedidos");
            wait();
        }
        pedidos.remove(pedidos.getLast());
        System.out.println("Se ha consumido un pedido. Pedidos("+pedidos.size()+")");
        notifyAll();
    }

}