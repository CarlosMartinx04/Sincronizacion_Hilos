package Ej13_RuedaFina;

public class Mecanico extends Thread{

    public Mecanico(String name) {
        super(name);
    }

    public void reparando() throws InterruptedException {
        System.out.println("El mecanico esta reparando el coche");
        sleep(3000);
        System.out.println("El coche ha sido reparado");
    }

    @Override
    public void run(){
        try {
            while (true){
                for (int i = 0; i < Taller.elevadoras.size(); i++){
                    Elevadora elevadora = Taller.elevadoras.get(i);
                    if (!elevadora.estaLibre()){
                        elevadora.repararCoche(this);
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
