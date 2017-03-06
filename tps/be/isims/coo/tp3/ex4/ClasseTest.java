package be.isims.coo.tp3.ex4;

/**
 * ClasseTest
 */
public class ClasseTest {

    public static void main(String[] args) {
        VieMortObjet vieMortObjet = new VieMortObjet();
        vieMortObjet.variableToNull();
        System.gc();
        vieMortObjet.remakeAVariable();
        System.gc();
        vieMortObjet.finalize();
        System.gc();
    }
}