package Ej4_EstacionTren;

public class Pasajero extends Thread{

    Tren tren;

    public Pasajero(String name, Tren tren) {
        super(name);
        this.tren = tren;
    }

    @Override
    public void run() {
        try {
            tren.subePasajero(getName());
            if(tren.enMarcha){
                sleep((int)(Math.random()*5000)-1000);
            }
            tren.bajaPasajero(getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
