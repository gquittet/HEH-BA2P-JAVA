package be.isims.ihm.tp2.ex1;

/**
 * Facture
 * Une Classe Facture qui permet d'afficher un montant dans suivant
 * la convention d'affichage d'un pays
 */
public class Facture {

    private IAffichage affichage;
    private double montant;

    /**
     * Crée une Facture avec un montant
     * @param montant Le montant de la Facture
     */
    public Facture(double montant) {
        this.montant = montant;
    }

    /**
     * Change l'affichage de la Facture
     * @param affichage La nouvelle convention d'affichage
     */
    public void setAffichage(IAffichage affichage) {
        this.affichage = affichage;
    }

    /**
     * Renvoie la somme avec l'affichage du pays
     * @return L'affichage avec l'affichage du pays
     */
    public String affiche() {
        return affichage.affiche(Double.toString(montant));
    }

    /**
     * Met à jour le montant de la Facture
     * @param montant Le nouveau montant de la Facture
     */
    public void setMontant(double montant) {
        this.montant = montant;
    }

    /**
     * Retourne le montant de la Facture
     * @return Le montant de la Facture
     */
    public double getMontant() {
        return montant;
    }
}