package Ej5_Restaurante;

public class Cocinero extends Thread{

    Restaurante restaurante;

    public Cocinero(String name, Restaurante restaurante) {
        super(name);
        this.restaurante = restaurante;
    }

    @Override
    public void run() {
        super.run();

        while (true){
            try {
                restaurante.producenPlato(getName());
                sleep((int)(Math.random()*3000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
