package be.isims.ihm.tp2.ex1;


/**
 * AffichageRoyaumeUni
 * L'affichage du Royaume Uni
 */
public class AffichageRoyaumeUni implements IAffichage {

    /**
     * Retourne la montant de la Facture suivant l'affichage du Royaume Uni
     * @param text Le montant de la Facture en chaine de caractères
     * @return Le montant de la Facture suivant l'affichage du Royaume Uni
     */
    public String affiche(String text) {
        return ("£ " + text);
    }
}