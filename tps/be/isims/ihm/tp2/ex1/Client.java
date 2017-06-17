package be.isims.ihm.tp2.ex1;

/**
 * Client
 * Un client qui lance le programme
 */
public class Client {

    /**
     * C'est ici que tout commence
     * @param args Une liste d'arguments
     */
    public static void main(String[] args) {
        Facture maFacture = new Facture(50.0);
        System.out.println("\nBelgique");
        System.out.println("---------");
        maFacture.setAffichage(new AffichageBelgique());
        System.out.println(maFacture.affiche());
        System.out.println("\nRoyaume-Uni");
        System.out.println("------------");
        maFacture.setAffichage(new AffichageRoyaumeUni());
        System.out.println(maFacture.affiche());
        System.out.println("\nAllemagne");
        System.out.println("----------");
        maFacture.setAffichage(new AffichageAllemagne());
        System.out.println(maFacture.affiche());
    }
}