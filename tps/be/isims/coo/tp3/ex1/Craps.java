package be.isims.coo.tp3.ex1;

import java.util.Random;


/**
 * Craps - Cette classe implémente le jeu du Craps
 * @author Guillaume Quittet
 */
public class Craps {
    private De de1, de2;
    private enum Etat {
        GAGNE,
        PERDU,
        CONTINU;
    }
    private Etat etat;
    private final String NATURAL = "NATURAL";
    private final String YO_ELEVEN = "YO ELEVEN";
    private final String SNAKE_EYES = "SNAKE EYES";
    private final String ACE_DEUCE = "ACE DEUCE";
    private final String BOXCARS = "BOXCARS";
    
    /**
     * Crée le jeu du Craps
     */
    public Craps() {
        de1 = new De();
        de2 = new De();
        etat = Etat.CONTINU;
    }

    /**
     * Lance le jeu
     */
    public void play() {
        int lancer = lancer();
        System.out.println("Nombre sorti : " + Integer.toString(lancer)  + " (" + de1.getNumber() + " + " + de2.getNumber() + ")");
        if (lancer == 7 || lancer == 11)
            etat = Etat.GAGNE;
        else if (lancer == 2 || lancer == 3 || lancer == 12)
            etat = Etat.PERDU;
        else
            continu(lancer);
        afficheTypeVictoire(lancer);
        System.out.println(etat);
    }

    /**
     * Lance les dés et retourne le résultat
     * @return Le résultat des dés.
     */
    private int lancer() {
       return (de1.lancer() + de2.lancer());
    }

    /**
     * Si le nombre tiré est différent de 2, 3, 7, 11, 12, il doit refaire son nombre avant de refaire un 7
     * @param nombreARefaire Le nombre a refaire
     */
    private void continu(int nombreARefaire) {
        int lancer = 0;
        boolean aRefaitLeNombre = false;
        while(etat == Etat.CONTINU) {
            lancer = lancer();
            if (lancer == 7) {
                if (aRefaitLeNombre)
                    etat = Etat.GAGNE;
                else
                    etat = Etat.PERDU;
            } else {
                if (lancer == nombreARefaire)
                    aRefaitLeNombre = true;
            }
            System.out.println("Nombre sorti : " + Integer.toString(lancer)  + " (" + de1.getNumber() + " + " + de2.getNumber() + ")");
        }
    }

    /**
     * Affiche un message suivant la victoire
     * @param lancer Le resultat du premier lancer
     */
    private void afficheTypeVictoire(int lancer) {
        switch(lancer) {
            case 2:
                System.out.println(SNAKE_EYES);
                break;
            case 3:
                System.out.println(ACE_DEUCE);
                break;
            case 7:
                System.out.println(NATURAL);
                break;
            case 11:
                if ((de1.getNumber() == 5 || de2.getNumber() == 6) && (de1.getNumber() == 6 || de2.getNumber() == 5))
                    System.out.println(YO_ELEVEN);
                break;
            case 12:
                System.out.println(BOXCARS);
                break;
        }
    }
}