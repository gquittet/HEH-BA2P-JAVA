package be.isims.ihm.tp2.ex1;

/**
 * AffichageAllemagne
 * L'affichage de l'Allemagne
 */
public class AffichageAllemagne implements IAffichage {

    /**
     * Retourne la montant de la Facture suivant l'affichage de l'Allemagne
     * @param text Le montant de la Facture en chaine de caractères
     * @return Le montant de la Facture suivant l'affichage de l'Allemagne
     */
    public String affiche(String text) {
        return ("€ " + text);
    }
}