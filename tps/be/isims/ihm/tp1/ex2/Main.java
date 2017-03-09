package be.isims.ihm.tp1.ex2;

import be.isims.ihm.tp1.ex2.Province;

/**
 * Main
 * @author Guillaume Quittet
 * @since 9 mars 2017
 */
public class Main {

    /**
     * C'est parti pour un nouvel exercice !
     * L'explication de cette fonction est dans l'image ihm-tp1-ex2-main-uml.jpg
     * @param args Le tableau d'arguments
     */
    public static void main(String[] args) {
        Province hainaut = new Province();
        Province namur = new Province();

        Ville mons = new Ville();
        Ville charleroi = new Ville();
        Ville mettet = new Ville();

        Magasin magasin1 = new Magasin(10.5);
        Magasin magasin2 = new Magasin(0.5);
        Magasin magasin3 = new Magasin(4.3);
        Magasin magasin4 = new Magasin(10.2);
        Magasin magasin5 = new Magasin(20.6);

        mons.ajouter(magasin1);
        mons.ajouter(magasin2);
        charleroi.ajouter(magasin3);
        mettet.ajouter(magasin4);
        mettet.ajouter(magasin5);

        hainaut.ajouter(mons);
        hainaut.ajouter(charleroi);
        namur.ajouter(mettet);

        System.out.println("Bénéfice pour Mons : " + Double.toString(mons.benefice()));
        System.out.println("Bénéfice pour Charleroi : " + Double.toString(charleroi.benefice()));
        System.out.println("Bénéfice pour Mettet : " + Double.toString(mettet.benefice()));
        System.out.println("Bénéfice pour Hainaut : " + Double.toString(hainaut.benefice()));
        System.out.println("Bénéfice pour Namur : " + Double.toString(namur.benefice()));

        mons.supprimer(magasin1);
        mons.supprimer(magasin2);
        charleroi.supprimer(magasin3);
        mettet.supprimer(magasin4);
        mettet.supprimer(magasin5);

        hainaut.supprimer(mons);
        hainaut.supprimer(charleroi);
        namur.supprimer(mettet);
    }
}