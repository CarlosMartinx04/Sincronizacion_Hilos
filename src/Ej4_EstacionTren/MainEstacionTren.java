package Ej4_EstacionTren;

public class MainEstacionTren {

    public static void main(String[] args){

        Tren tren = new Tren();
        Pasajero p1 = new Pasajero("1", tren);
        Pasajero p2 = new Pasajero("2", tren);
        Pasajero p3 = new Pasajero("3", tren);
        Pasajero p4 = new Pasajero("4", tren);
        Pasajero p5 = new Pasajero("5", tren);
        Pasajero p6 = new Pasajero("6", tren);
        Pasajero p7 = new Pasajero("7", tren);
        Pasajero p8 = new Pasajero("8", tren);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
    }

}
