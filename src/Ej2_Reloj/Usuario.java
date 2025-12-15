package Ej2_Reloj;

import java.util.Scanner;

public class Usuario extends Thread{

    Scanner sc = new Scanner(System.in);
    String palabra;
    Reloj r;
    static boolean seguir=true;

    public Usuario(String name, Reloj r) {
        super(name);
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        palabra=sc.nextLine();
        if(palabra.equals("parar")){
            seguir=false;
        }

    }
}
