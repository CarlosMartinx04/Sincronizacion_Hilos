package Ej2_Reloj;

public class MainReloj {

    public static void main(String[] args){
        Reloj r = new Reloj(0,0,0);
        Usuario u = new Usuario("Pablo",r);
        r.start();
        u.start();
    }

}
