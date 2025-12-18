package Ej13_RuedaFina;

import java.util.ArrayList;
//Nestor me ayudo a hacer esto
public class Taller{

    public static ArrayList<Elevadora> elevadoras = new ArrayList<Elevadora>();
    public static int cochesEsperando=0;
    private Mecanico mecanico = new Mecanico("Mecánico jefe");

    public Taller(){
        elevadoras.add(new Elevadora());
        elevadoras.add(new Elevadora());
        mecanico.start();
    }

    public void llegaCoche() throws InterruptedException {
        cochesEsperando++;
        System.out.println("Ha llegado un coche.("+cochesEsperando+")");

        synchronized (this){
            while (!hayElevadoraLibre()){
//                System.out.println("Coche esperando.");
                Thread.sleep(500);
            }
        }
        accederAElevadora();
    }

    public boolean hayElevadoraLibre(){
        boolean hayLibre = false;
        for(int i = 0; (!hayLibre && i < elevadoras.size()); i++){
            Elevadora elevadora = elevadoras.get(i);
            hayLibre = elevadora.estaLibre();
//            System.out.println("Elevadora libre: " + hayLibre);
        }
//        System.out.println("Hay Elevadora libre: " + hayLibre);
        return hayLibre;
    }

    public synchronized void accederAElevadora() throws InterruptedException {
        System.out.println("Coche en elevadora");
        Elevadora elevadora = obtenerElevadoraLibre();
        elevadora.setCoche();
    }

    private Elevadora obtenerElevadoraLibre() {
        Elevadora elevadoraLibre = null;
        System.out.println("Elevadora libre: " + (elevadoraLibre == null));
        for(int i = 0; ((elevadoraLibre == null) && i < elevadoras.size()); i++){
            Elevadora elevadora = elevadoras.get(i);
            System.out.println("Esta Elevadora libre: " + elevadora.estaLibre());
            if (elevadora.estaLibre()){
                elevadoraLibre = elevadora;
            }
        }
        System.out.println("Elevadora libre: " + (elevadoraLibre == null));
        return elevadoraLibre;
    }

    //                sleep((int) (Math.random()*6000-1000));
}
