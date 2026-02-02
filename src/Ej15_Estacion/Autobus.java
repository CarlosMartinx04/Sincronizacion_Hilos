package Ej15_Estacion;

import java.util.ArrayList;

public class Autobus extends Thread{

    int capacidadMaxima=3;
    Estacion estacion;
    private ArrayList<Pasajero> pasajeros = new ArrayList<>();
    private boolean embarqueCompletado = false;

    public Autobus(String name, Estacion estacion) {
        super(name);
        this.estacion = estacion;
    }

    public synchronized void subePasajero(Pasajero pasajero, Autobus autobus) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" ha subido al autobus "+autobus.getName());
        pasajeros.add(pasajero);
        notifyAll();
    }







    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public boolean isEmbarqueCompletado() {
        return embarqueCompletado;
    }

    public void setEmbarqueCompletado(boolean embarqueCompletado) {
        this.embarqueCompletado = embarqueCompletado;
    }

    @Override
    public void run() {
        super.run();
        try {
            estacion.llegaAutobus(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
