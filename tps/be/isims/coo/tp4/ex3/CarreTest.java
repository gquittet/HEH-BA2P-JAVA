package be.isims.coo.tp4.ex3;

/**
 * CarreTest
 */
public class CarreTest {

    public static void main(String[] args) {
        Carre carre = new Carre(25);
        carre.load("carre.txt");
        carre.print();
    }
}