package observer.ex2;

/**
 * Label
 */
public class Label implements Observateur {

    @Override
    public void actualise() {
        System.out.println("Je suis un Label.");
    }
}