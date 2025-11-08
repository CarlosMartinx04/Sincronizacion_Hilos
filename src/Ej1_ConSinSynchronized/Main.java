package Ej1_ConSinSynchronized;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Contador c = new Contador();
        Usuario usuario1 = new Usuario("Carlos",c);
        Usuario usuario2 = new Usuario("Sergio",c);
        Usuario usuario3 = new Usuario("Álvaro",c);

        //Iniciamos cada hilo
        usuario1.start();
        usuario2.start();
        usuario3.start();

        //Esperamos a que acabe el hilo principal(Main)
        usuario1.join();
        usuario2.join();
        usuario3.join();

        System.out.println("Contador : "+ c.getValor());
    }
}
