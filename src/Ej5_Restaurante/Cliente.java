package Ej5_Restaurante;

public class Cliente extends Thread{

    Restaurante restaurante;

    public Cliente(String name, Restaurante restaurante) {
        super(name);
        this.restaurante = restaurante;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            try {
                restaurante.clienteConsume(getName());
                sleep((int)(Math.random()*8000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
