package Ej4_EstacionTren;

public class Tren {

    int pasajeros = 0;
    boolean enMarcha=false;
    boolean enDestino=true;

    public synchronized void subePasajero(String name) throws InterruptedException {
        while (enMarcha||pasajeros==4){
            System.out.println(name+" esperando.");
            wait();
        }
        pasajeros++;
        System.out.println(name+" ha subido al tren("+pasajeros+")");

        if(pasajeros==4 && enDestino){
            saleTren();
        }
        wait();
    }

    public synchronized void saleTren() throws InterruptedException {
        System.out.println("El tren sale de la estacion");
        enMarcha=true;
        enDestino=false;
        enMarcha=false;
        System.out.println("El tren llega  a la estacion");
        notifyAll();

    }

    public synchronized void bajaPasajero(String name) throws InterruptedException {
        while (enMarcha&&!enDestino){
            wait();
        }

        pasajeros--;
        System.out.println(name+" ha bajado del tren.");

        if(pasajeros==0){
            enDestino=true;
        }
        notifyAll();
    }

}