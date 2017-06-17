package be.isims.coo.tp4.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 * Paquet
 * Un paquet de cartes
 */
public class Paquet {
    private List<Carte> cartes;
    private int size;

    /**
     * Crée un paquet de cartes
     * @param size Le nombre de cartes dans le paquet
     */
    public Paquet(int size) {
        this.size = size;
        cartes = new ArrayList<Carte>();
        generate();
    }

    /**
     * Génère le paquet de cartes
     */
    private void generate() {
        int value;
        String type;
        int cartesParFamille = size / 4;
        for (int i = 0; i < size; i++) {
            value = (i % cartesParFamille) + 1;
            if(i < cartesParFamille)
                type = "Pique";
            else if (i >= cartesParFamille && i < (2 * cartesParFamille))
                type = "Treffle";
            else if (i >= (2 * cartesParFamille) && i < (3 * cartesParFamille))
                type = "Coeur";
            else
                type = "Carreau";
            cartes.add(new Carte(type, value));
        }
    }

    /**
     * Affiche toutes les cartes du paquet
     */
    public void print() {
        for (Carte carte : cartes) {
            System.out.println(carte.getType() + " : " + Integer.toString(carte.getValue()));
        }
    }

    /**
     * Retire une image du paquet et la distribue
     * @param carteADonner La carte à retirer et à distribuer
     */
    public void give(Carte carteADonner) {
        for (Carte carte : cartes) {
            if(carte.equals(carteADonner.getType()) && carte.getValue() == carteADonner.getValue())
                cartes.remove(carte);
        }
    }

    /**
     * Mélange le paquet de cartes
     */
    public void shuffle() {
        Collections.shuffle(cartes);
    }
}