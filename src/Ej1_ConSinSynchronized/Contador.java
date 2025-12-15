package Ej1_ConSinSynchronized;

public class Contador {

    int valor = 0;

    //Sincronizamos metodo para que solo un hilo pueda entrar en cada momento
    public synchronized void incrementar(){
        valor ++;
    }

    //Lo mismo hacemos para que no cambien los resultados cada hilo
    public synchronized int getValor() {
        return valor;
    }

}

