package Ej15_Estacion;

public class Main {

    public static void main(String[] args){

        Estacion estacion = new Estacion();
        Autobus autobus1 = new Autobus("MK1", estacion);
        Autobus autobus2 = new Autobus("MK2", estacion);
        Autobus autobus3 = new Autobus("MK3", estacion);
        Pasajero pasajero1 = new Pasajero("Marco", estacion);
        Pasajero pasajero2 = new Pasajero("Fabio", estacion);
        Pasajero pasajero3 = new Pasajero("Ernesto", estacion);
        Pasajero pasajero4 = new Pasajero("Escalope", estacion);

        autobus1.start();
        pasajero1.start();
        pasajero2.start();
        pasajero3.start();
        pasajero4.start();




//        autobus2.start();
//        autobus3.start();

    }
}
