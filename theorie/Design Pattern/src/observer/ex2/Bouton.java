package observer.ex2;

/**
 * Bouton
 */
public class Bouton extends Sujet {

    private Label label;
    private ZoneTexte zoneTexte;

    public Bouton() {
        label = new Label();
        zoneTexte = new ZoneTexte();
    }
}