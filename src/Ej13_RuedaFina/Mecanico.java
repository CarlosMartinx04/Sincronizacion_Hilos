package Ej13_RuedaFina;

public class Mecanico extends Thread{

    Taller taller;

    public Mecanico(String name, Taller taller) {
        super(name);
        this.taller = taller;
    }

    public void reparando() throws InterruptedException {
        System.out.println("El mecanico esta reparando el coche");
        sleep(3000);
        System.out.println("El coche ha sido reparado");
    }

}
