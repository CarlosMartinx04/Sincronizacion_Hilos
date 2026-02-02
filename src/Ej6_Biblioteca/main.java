package Ej6_Biblioteca;

public class main {

    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();

        Estudiantes e1 = new Estudiantes("Marcos", biblioteca);
        Estudiantes e2 = new Estudiantes("Roberto", biblioteca);
        Estudiantes e3 = new Estudiantes("Carla", biblioteca);
        Estudiantes e4 = new Estudiantes("Sebastian", biblioteca);
        Estudiantes e5 = new Estudiantes("Rocio", biblioteca);
        Estudiantes e6 = new Estudiantes("Lorena", biblioteca);
        Estudiantes e7 = new Estudiantes("Miguel", biblioteca);
        Estudiantes e8 = new Estudiantes("Jose", biblioteca);

        e1.start();
        e2.start();
        e3.start();
        e4.start();
        e5.start();
        e6.start();
        e7.start();
        e8.start();


    }

}
