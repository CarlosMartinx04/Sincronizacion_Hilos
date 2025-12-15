package Ej2_Reloj;

import static Ej2_Reloj.Usuario.seguir;

public class Reloj extends Thread {

    int segundo=0;
    int minuto=0;
    int hora=0;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void incrementarSegundo(){
        segundo++;
        if(segundo==60){
            incrementarMinuto();
            segundo=0;
        }
        System.out.println(hora+":"+minuto+":"+segundo);
    }

    public void incrementarMinuto(){
        minuto++;
        if(minuto==60){
            incrementarHora();
            minuto=0;
        }
    }

    public void incrementarHora(){
        hora++;
        if(hora==24){
            hora=0;
        }
    }

    @Override
    public void run() {
        super.run();
        while(seguir){
            incrementarSegundo();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
