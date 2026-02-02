package Ej6_Biblioteca;

public class Estudiantes extends Thread{

    Biblioteca biblioteca;

    public Estudiantes(String name, Biblioteca biblioteca) {
        super(name);
        this.biblioteca = biblioteca;
    }

    @Override
    public void run() {
        super.run();
        try {
            biblioteca.intentaSentarse(getName());
            biblioteca.lee(getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
