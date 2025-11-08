package EJ2_Reloj;

import java.util.Random;
import java.util.Scanner;

public class Lector extends Thread{
    Reloj r;
    Scanner sc = new Scanner(System.in);
    String palabraClave;

    public Lector(Reloj r){
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        palabraClave = sc.nextLine();
        if(palabraClave.equals("parar")){
            r.estado(false);
        }
    }
}
