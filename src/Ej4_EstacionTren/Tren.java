package Ej4_EstacionTren;

import java.sql.SQLOutput;
import java.util.ArrayList;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Tren  {

    boolean enMarcha = false;
    ArrayList<String> pasajeros = new ArrayList<>(0);

    public synchronized void intentaSubir() throws InterruptedException {
        System.out.println("Ha llegado el pasajero "+ currentThread().getName());
        while(pasajeros.size()==4 || enMarcha){
            System.out.println("El pasajero "+ currentThread().getName()+" esta esperando a que llegue el tren.");
            wait();
        }
        pasajeros.add(currentThread().getName());
        System.out.println("El pasajero "+currentThread().getName()+" se ha subido al tren.("+pasajeros.size()+")");
        if (pasajeros.size()!=4){
            System.out.println("El tren esta esperando a que se llene.");
            wait();
        }
        else {
            notifyAll();
            saleTren();
        }

    }

    public synchronized void saleTren() throws InterruptedException {
        System.out.println("El tren ha salido");
        enMarcha = true;
        sleep(2000);
//        enMarcha=false;
//        System.out.println("El tren ha llegado");
    }

    public synchronized void seBaja(){
        pasajeros.remove(currentThread().getName());
        if(pasajeros.isEmpty()){
            enMarcha=false;
            notifyAll();
            System.out.println("El tren se ha vaciado");
        }
    }


}