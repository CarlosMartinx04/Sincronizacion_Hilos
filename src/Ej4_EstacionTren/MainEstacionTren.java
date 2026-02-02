package Ej4_EstacionTren;

public class MainEstacionTren {
    public static void main(String[] args){

        Tren tren = new Tren();
        Pasajero p1 = new Pasajero("Juan", tren);
        Pasajero p2 = new Pasajero("Fernando", tren);
        Pasajero p3 = new Pasajero("Raul", tren);
        Pasajero p4 = new Pasajero("Lorente", tren);
        Pasajero p5 = new Pasajero("Esteban", tren);
        Pasajero p6 = new Pasajero("Lucia", tren);
        Pasajero p7 = new Pasajero("Carol", tren);
        Pasajero p8 = new Pasajero("Delia", tren);

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
