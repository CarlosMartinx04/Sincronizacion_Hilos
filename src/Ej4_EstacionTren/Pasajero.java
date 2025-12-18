package Ej4_EstacionTren;

public class Pasajero extends Thread{

    Tren tren;

    public Pasajero(String name, Tren tren) {
        super(name);
        this.tren = tren;
    }

    @Override
    public void run() {
        super.run();
        try {
            tren.intentaSubir();
            tren.seBaja();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
