package Ej13_RuedaFina;

import static java.lang.Thread.sleep;

public class MainRuedaFina {

    public static void main(String[] args){
        Taller taller = new Taller();
        //Nestor me ayudo a hacer este ejericio

        while(true){
            try {
                taller.llegaCoche();
                sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
