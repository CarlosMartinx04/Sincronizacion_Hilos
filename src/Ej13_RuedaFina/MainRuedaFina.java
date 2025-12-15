package Ej13_RuedaFina;

public class MainRuedaFina {

    public static void main(String[] args){
        Taller taller = new Taller();
        Coche c = new Coche();
        Mecanico m = new Mecanico("asda", taller);
        c.start();
        m.start();
        taller.start();

    }

}
