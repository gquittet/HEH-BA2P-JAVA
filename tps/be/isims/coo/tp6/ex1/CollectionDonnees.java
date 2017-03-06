package be.isims.coo.tp6.ex1;

import be.isims.coo.tp6.ex1.CompteEnBanque;




/**
 * CollectionDonnees
 */
public class CollectionDonnees {
    private double somme;
    private CompteEnBanque maximum;
    private int nbItems;

    /**
     * Crée une collection de données
     */
    public CollectionDonnees() {
        nbItems = 0;
    }

    /**
     * Ajoute un solde à la somme totale
     */
    public void add(CompteEnBanque x) {
        somme += x.getSolde();
        nbItems++;
    }

    /**
     * Retourne le maximum.
     * @return maxium Le compte en banque maximum
     */
    public CompteEnBanque getMaximum() {
        return maximum;
    }
}