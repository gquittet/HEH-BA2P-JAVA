package be.isims.coo.tp3.ex1;

import java.util.Random;


/**
 * De - Un objet de
 */
public class De {
    private final int NBRE_FACES = 6;
    private int number;
    
    /**
     * Génère un nombre aléatoire entre 1 et le nombre de faces.
     * @return number Le nombre aléatoire
     */
    public int lancer() {
        Random random = new Random();
        number = random.nextInt(NBRE_FACES) + 1;
        return number;
    }

    /**
     * Retourne le nombre généré aléatoirement
     * @return number Le nombre généré aléatoirement
     */
    public int getNumber() {
        return number;
    }
}