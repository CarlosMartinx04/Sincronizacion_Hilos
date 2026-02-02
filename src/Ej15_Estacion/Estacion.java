package Ej15_Estacion;

import java.util.ArrayList;

public class Estacion {

    int andenes = 4;
    ArrayList<Autobus> autobuses = new ArrayList<>();

    public synchronized void llegaPasajero(Pasajero pasajero) throws InterruptedException {
        while(autobuses.isEmpty()){
            System.out.println(pasajero.getName()+" espera.");
            wait();
        }

        for(Autobus autobus : autobuses){
            if(autobus.getPasajeros().size()!=autobus.capacidadMaxima){
                autobus.subePasajero(pasajero, autobus);
            } else
                wait();
            break;
        }
    }

    public synchronized void llegaAutobus(Autobus autobus) throws InterruptedException {
        while(autobuses.size()>andenes){
            System.out.println(Thread.currentThread().getName()+ " espera.");
            wait();
        }

        autobuses.add(autobus);
        System.out.println(autobus.getName()+" ha llegado a la estacion");
        notifyAll();

        while(autobus.getPasajeros().size()!=autobus.capacidadMaxima){
            System.out.println(autobus.getName()+" espera a que se llenen los pasajeros");
            wait();
        }

        if(autobus.getPasajeros().size()==autobus.capacidadMaxima){
            System.out.println("El autobus sale");
        }

    }


}
