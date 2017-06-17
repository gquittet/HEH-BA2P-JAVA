package be.isims.ihm.tp3.ex1;


/**
 * ConvOctale
 * La classe qui convertit un nombre en base 10 en base 8
 */
public class ConvOctale extends Observateur {
 
    /**
     * Instancie la convertion octale
     * @param saisi L'objet Saisi
     */
    public ConvOctale(Saisi saisi) {
        this.saisi = saisi;
        this.saisi.attach(this);
    }

    /**
     * Actualise le nombre de saisi
     */
    public void actualise() {
        System.out.println("Conversion en octal : " + Integer.toString(saisi.getNombre(), 8));
    }
}