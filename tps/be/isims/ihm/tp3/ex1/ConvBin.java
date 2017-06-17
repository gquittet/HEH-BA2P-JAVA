package be.isims.ihm.tp3.ex1;


/**
 * ConvBin
 * Classe qui aide à convertir un nombre en binaire
 */
public class ConvBin extends Observateur {

    /**
     * Instancie la Conversion
     * @param saisi L'objet qui récupère la saisie
     */
    public ConvBin(Saisi saisi) {
        this.saisi = saisi;
        this.saisi.attach(this);
    }

    /**
     * Actualise le nombre par sa représentation en binaire
     */
    public void actualise() {
        System.out.println("Conversion en binaire : " + Integer.toString(saisi.getNombre(), 2));
    }
}