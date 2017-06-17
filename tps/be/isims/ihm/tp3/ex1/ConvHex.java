package be.isims.ihm.tp3.ex1;


/**
 * ConvHex
 * La classe qui sert à convertir un nombre en base 16
 */
public class ConvHex extends Observateur {

    public ConvHex(Saisi saisi) {
        this.saisi = saisi;
        this.saisi.attach(this);
    }

    /**
     * Convertit un nombre de base 10 en base 16
     */
    public void actualise() {
        System.out.println("Conversion en hexadécimal : " + (Integer.toString(saisi.getNombre(), 16)));
    }
}