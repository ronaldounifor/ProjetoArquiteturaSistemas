import pinguim.Pinguim;
import pinguim.PinguimVoador;

public class Main {
    public static void main (String [] args) {
        Pinguim gessevaldo = new PinguimVoador();
        ((PinguimVoador)gessevaldo).voar();

        alimentar(gessevaldo);
    }

    public static void alimentar(Pinguim pinguim) {
        pinguim.comer();
    }
}