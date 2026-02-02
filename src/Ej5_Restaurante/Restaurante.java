package Ej5_Restaurante;

public class Restaurante {

    int platos=0;

    public synchronized void producenPlato(String name) throws InterruptedException {
        while (platos==3){
            System.out.println("La barra esta llena.");
            wait();
        }

        platos++;
        System.out.println(name+" ha producido un plato");
        notifyAll();
    }

    public synchronized void clienteConsume(String name) throws InterruptedException {
        while (platos==0){
            System.out.println("La barra esta vacia");
            wait();
        }

        platos--;
        System.out.println(name+" ha consumido un plato.");
        notifyAll();
    }

}
