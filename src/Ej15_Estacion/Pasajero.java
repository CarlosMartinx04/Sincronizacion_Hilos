package Ej15_Estacion;

public class Pasajero extends Thread{

    Estacion estacion;
    Autobus autobus;

    public Pasajero(String name, Estacion estacion) {
        super(name);
        this.estacion = estacion;
    }

    @Override
    public void run() {
        super.run();
        try {
            estacion.llegaPasajero(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
