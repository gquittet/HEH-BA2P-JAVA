package be.isims.ihm.tp2.ex1;

/**
 * IAffichage
 * Un affichage pour un pays
 */
public interface IAffichage {

    /**
     * Retourne la montant de la Facture suivant l'affichage du pays
     * @param text Le montant de la Facture en chaine de caractères
     * @return Le montant de la Facture suivant l'affichage du pays
     */
    public String affiche(String text);
}