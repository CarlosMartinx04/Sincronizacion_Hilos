package EJ2_Reloj;

public class Reloj extends Thread{
    Hora hora;
    public static boolean seguir=true;

    public Reloj(Hora hora) {
        this.hora = hora;
    }

    @Override
    public void run() {
        super.run();

        while(seguir){
            try {
                hora.incrementar();
                System.out.println(hora.toString());
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        
    }
}
