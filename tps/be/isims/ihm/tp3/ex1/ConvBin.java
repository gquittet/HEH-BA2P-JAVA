package be.isims.ihm.tp3.ex1;


/**
 * ConvBin
 */
public class ConvBin extends Observateur {

    public ConvBin(Saisi saisi) {
        this.saisi = saisi;
        this.saisi.attach(this);
    }

    public void actualise() {
        System.out.println("Conversion en binaire : " + Integer.toString(saisi.getNombre(), 2));
    }
}