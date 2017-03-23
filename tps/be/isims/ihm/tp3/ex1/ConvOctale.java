package be.isims.ihm.tp3.ex1;


/**
 * ConvOctale
 */
public class ConvOctale implements Observateur {

    public ConvOctale() {
        
    }

    public void actualise(int nombre) {
        System.out.println("Conversion en octal : " + Integer.toString(nombre, 8));
    }
}