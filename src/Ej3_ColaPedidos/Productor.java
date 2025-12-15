package Ej3_ColaPedidos;


public class Productor extends Thread{
    ColaPedidos c;

    public Productor(String name, ColaPedidos colaPedidos) {
        super(name);
        this.c = colaPedidos;
    }

    public synchronized void producirPedido(){
        c.pedidos.add("Pedido "+c.pedidos.size());
        System.out.println(c.pedidos.getLast());
    }

    @Override
    public void run() {
        super.run();
        while (c.pedidos.size()<5){
            producirPedido();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
