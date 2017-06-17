package observer.ex2;

/**
 * ZoneTexte
 */
public class ZoneTexte implements Observateur {

    @Override
    public void actualise() {
        System.out.println("Je suis une zone de texte.");
    }
}