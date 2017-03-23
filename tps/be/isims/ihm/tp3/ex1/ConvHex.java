package be.isims.ihm.tp3.ex1;


/**
 * ConvHex
 */
public class ConvHex implements Observateur {

    public ConvHex() {
        
    }

    public void actualise(int nombre) {
        System.out.println("Conversion en hexadécimal : " + Integer.toString(nombre, 16));
    }
}