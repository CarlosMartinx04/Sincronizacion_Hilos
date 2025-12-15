package Ej13_RuedaFina;

public class Coche extends Thread{

    int numeroCoches =0;

    public synchronized void llegaCoche() throws InterruptedException {
        numeroCoches++;
    }

    @Override
    public void run() {
        super.run();
        while(true){
            try {
                llegaCoche();
                sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
