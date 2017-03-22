package be.isims.ihm.tp2.ex1;


/**
 * AffichageBelgique
 * L'Affichage de la Belgique
 */
public class AffichageBelgique implements IAffichage {

    /**
     * Retourne la montant de la Facture suivant l'affichage de la Belgique
     * @param text Le montant de la Facture en chaine de caractères
     * @return Le montant de la Facture suivant l'affichage de la Belgique
     */
    public String affiche(String text) {
        return (text + " €");
    }
}