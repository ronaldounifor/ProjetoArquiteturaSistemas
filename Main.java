import quarto.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args) {
        ArrayList<Movel> listaDeMoveis = new ArrayList<Movel>();
        listaDeMoveis.add(new Cama());
        listaDeMoveis.add(new Escrivaninha());
        listaDeMoveis.add(new GuardaRoupa());
        listaDeMoveis.add(new Cadeira());

        arrumarQuarto(listaDeMoveis);
    }

    public static void arrumarQuarto(List<Movel> moveis) {
        for (Movel movel:moveis)
            movel.arrumar();
    }
}
