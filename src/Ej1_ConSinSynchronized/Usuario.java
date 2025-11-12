package Ej1_ConSinSynchronized;

public class Usuario extends Thread{

    Contador contador;
    public Usuario(String name, Contador c){
        super(name);
        contador = c;
    }

    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 1000;i++){
            contador.incrementar();
        }

    }
}
