package Ej13_RuedaFina;

public class Elevadora {
    public Coche coche;

    public boolean estaLibre(){
        return coche == null;
    }

    public void setCoche(){
        coche = new Coche();
    }

    public void repararCoche(Mecanico mecanico) throws InterruptedException {
        System.out.println("Mecanico en coche.");
        Thread.sleep(5000);
        coche = null;
    }
}
