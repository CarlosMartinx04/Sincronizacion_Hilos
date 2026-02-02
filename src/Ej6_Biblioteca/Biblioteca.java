package Ej6_Biblioteca;

import javax.swing.table.TableRowSorter;

public class Biblioteca extends Thread {

    boolean leyendo = false;
    int puestosLibres = 3;

    public synchronized void intentaSentarse(String name) throws InterruptedException {
        sleep(500);
        while (puestosLibres==0){
            System.out.println(name+" espera");
            wait();
        }

        puestosLibres--;
        System.out.println(name+" se ha sentado.("+puestosLibres+")");
        notifyAll();
    }

    public void lee(String name) throws InterruptedException {
        leyendo = true;
        System.out.println(name+" se ha puesto a leer.");
        sleep((int)(Math.random()*3000));
        synchronized (this){
            System.out.println(name+" se levanta y se va.");
            leyendo=false;
            puestosLibres++;
            notifyAll();
        }

    }

}
