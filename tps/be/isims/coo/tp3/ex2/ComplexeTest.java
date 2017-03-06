package be.isims.coo.tp3.ex2;

/**
 * ComplexeTest
 */
public class ComplexeTest {

    public static void main(String[] args) {
        Complexe a = new Complexe(2, -3);
        Complexe b = new Complexe();
        System.out.println("Complexe a : " + a);
        System.out.println("Complexe b : " + b);
        Complexe c = a.addition(b);
        System.out.println("Addition de a avec b : " + c);
        Complexe d = a.soustraction(b);
        System.out.println("Soustraction de a avec b : " + d);
    }
}