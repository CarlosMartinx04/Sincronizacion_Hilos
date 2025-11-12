package EJ2_Reloj;

public class Reloj extends Thread{
    Hora hora;
<<<<<<< Updated upstream
    public static boolean seguir=true;
=======
    static boolean estado=true;
>>>>>>> Stashed changes

    public Reloj(Hora hora) {
        this.hora = hora;
    }

    @Override
    public void run() {
        super.run();

<<<<<<< Updated upstream
        while(seguir){
            try {
                hora.incrementar();
                System.out.println(hora.toString());
                sleep(1000);
=======
        if(!Reloj.interrupted()){
            for(long i =0; i<10000; i++) {
                hora.incrementar();
                System.out.println(hora.toString());
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } else if(Reloj.interrupted()){
            try {
                join();
>>>>>>> Stashed changes
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
<<<<<<< Updated upstream
        
=======

>>>>>>> Stashed changes
    }
}
