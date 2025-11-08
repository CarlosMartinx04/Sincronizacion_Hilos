package EJ2_Reloj;

public class Main {
    public static void main(String[] args){
        Hora h = new Hora(0,0,0);

        Reloj r = new Reloj(h);
        Lector l = new Lector(r);

        r.start();
        l.start();


        System.out.println();

    }
}
