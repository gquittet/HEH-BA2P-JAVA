package be.isims.coo.tp2.ex4;

/**
 * Facture
 */
public class Facture {
    private final float TAUX_TVA = 21;
    private int idFacture;
    private float montantHT;

    /**
     * Crée une facture avec le montant hors tva
     * @param montantHT Le montant hors tva
     */
    public Facture(float montantHT) {
        if(valideMontant(montantHT))
            this.montantHT = montantHT;
    }

    /**
     * Vérifie la validité du montant entré
     * @param montantHT Le montant
     * @return La validité du montant
     */
    private boolean valideMontant(float montantHT) {
        if(montantHT >= 0)
            return true;
        else
            System.err.println("[Erreur] : " + Float.toString(montantHT) + " n'est pas un montant valide.");
        return false;
    }

    /**
     * Retourne le montant hors tva
     * @return montantHT Le montant hors tva
     */
    public float getMontantHT() {
        return montantHT;
    }
    
    /**
     * Met à jour le montant hors tva
     * @param montantHT Le nouveau montant hors tva
     */
    public void setMontantHT(float montantHT) {
        if(valideMontant(montantHT))
            this.montantHT = montantHT;
        else
            System.err.println("[Erreur] : " + Float.toString(montantHT) + " n'est pas un montant valide.");            
    }
}