package EJ3_Pedidos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pedidos extends Thread{

    ArrayList<String> pedidos = new ArrayList<>();
    int maxSize=5;

    @Override
    public void run() {
        super.run();
        for(int i =0; i<; i++){
            pedidos[i] = "Pedido" + (i + 1);
        }
    }
}
