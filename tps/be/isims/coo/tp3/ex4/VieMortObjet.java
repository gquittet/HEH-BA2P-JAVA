package be.isims.coo.tp3.ex4;

/**
 * VieMortObjet
 */
public class VieMortObjet {
    private Classe1 classe1;

    /**
     * Crée un objet VieMortObjet
     */
    public VieMortObjet() {
        classe1 = new Classe1();
    }

    /**
     * Supprime la référence de l'objet 
     */
    public void variableToNull() {
        classe1 = null;
    }

    /**
     * Réinstancie la classe pour changer son adresse en mémoire
     */
    public void remakeAVariable() {
        classe1 = new Classe1();
    }

    /**
     * Supprime l'objet
     */
    public void finalize() {
        classe1.finalize();
    }
}