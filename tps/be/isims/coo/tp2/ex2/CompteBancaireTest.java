package be.isims.coo.tp2.ex2;

/**
 * CompteBancaireTest
 */
public class CompteBancaireTest {
    
    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire(50.00);
        CompteBancaire compte2 = new CompteBancaire(-7.50);
        System.out.println(compte1);
        System.out.println(compte2);
        compte1.deposeArgent(10);
        System.out.println(compte1);
        compte2.deposeArgent(5);
        System.out.println(compte2);
    }
}