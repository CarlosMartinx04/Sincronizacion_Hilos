package EJ2_Reloj;

public class Hora {
    int horas = 0;
    int minutos = 0;
    int segundos = 0;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public synchronized void incrementar(){
        segundos++;
        if(segundos>=60){
            segundos=0;minutos++;
            if(minutos>=60){
                minutos=0;horas++;if (horas==24){horas=0;}
            }
        }
    }

    @Override
    public String toString() {
        return horas + ":" + minutos + ":" + segundos;
    }
}
