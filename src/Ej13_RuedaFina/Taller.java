package Ej13_RuedaFina;

public class Taller extends Thread{

    int elevadoras =2;
    int cochesEsperando;
    Mecanico m;
    Coche c = new Coche();


    public synchronized void llegaCoche() throws InterruptedException {
        cochesEsperando++;
        System.out.println("Ha llegado un coche.("+cochesEsperando+")");
        while(elevadoras==0){
            System.out.println("No hay elevadoras disponibles");
            wait();
        }
        elevadoras--;
        m.reparando();
        elevadoras++;
        notifyAll();
    }


    //                sleep((int) (Math.random()*6000-1000));
    @Override
    public void run() {
        super.run();
        while(c.numeroCoches>0&&elevadoras>0){
            try {
                llegaCoche();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
