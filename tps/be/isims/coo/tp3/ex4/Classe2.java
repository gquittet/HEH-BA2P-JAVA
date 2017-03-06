package be.isims.coo.tp3.ex4;

/**
 * Classe2
 */
public class Classe2 {
    private Classe1 classe1;

    /**
     * Crée une classe 1
     */
    public Classe2() {
        System.out.println("Un nouvel objet de type Classe2 a ete cree.");
    }

    /**
     * Supprime l'objet
     */
    protected void finalize() {
        System.out.println("L'objet de type Classe2 se meurt ...");
    }
}