package EJ2_Reloj;

public class Reloj extends Thread{
    Hora hora;

    public Reloj(Hora hora) {
        this.hora = hora;
    }

    @Override
    public void run() {
        super.run();

        if(estado(true)){
            for(long i =0; i<10000; i++){
                hora.incrementar();
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(hora.toString());
            }
        }
        
    }

    public boolean estado(boolean estado){
        estado = true;
        return estado;
    }

}
