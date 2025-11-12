package EJ2_Reloj;

import java.util.Random;
import java.util.Scanner;

import static EJ2_Reloj.Reloj.seguir;

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
<<<<<<< Updated upstream
        while (seguir){
            palabraClave = sc.nextLine();
            if(palabraClave.equals("parar")){
                seguir=false;
=======
        palabraClave=sc.nextLine();
        if(palabraClave.equals("parar")){
            System.out.println("hola");
            try {
                r.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
>>>>>>> Stashed changes
            }
        }

    }

}
