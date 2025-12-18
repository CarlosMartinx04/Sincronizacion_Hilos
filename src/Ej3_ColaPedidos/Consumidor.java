package Ej3_ColaPedidos;

public class Consumidor extends Thread{

    ColaPedidos colaPedidos;

    public Consumidor(ColaPedidos colaPedidos) {
        this.colaPedidos = colaPedidos;
    }

    @Override
    public void run() {
        super.run();
        while(true){
            try {
                colaPedidos.consumePedido();
                sleep((int)(Math.random()*6000)+1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
