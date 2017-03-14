package observer.ex2;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        Label label = new Label();
        ZoneTexte zoneTexte = new ZoneTexte();
        Bouton bouton = new Bouton();
        bouton.add(label);
        bouton.add(zoneTexte);
        bouton.clique();
    }
}