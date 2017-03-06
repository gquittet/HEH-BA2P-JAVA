package be.isims.coo.tp3.ex4;

/**
 * Classe1
 */
public class Classe1 {
    private Classe2 classe2;

    /**
     * Crée une classe 1
     */
    public Classe1() {
        System.out.println("Un nouvel objet de type Classe1 a ete cree.");
        classe2 = new Classe2();
    }

    /**
     * Supprime l'objet
     */
    protected void finalize() {
        System.out.println("L'objet de type Classe1 se meurt ...");
    }
}