package be.isims.coo.tp2.ex2;

/**
 * CompteBancaire - Un compte bancaire
 */
public class CompteBancaire {
    private double solde;

    /**
     * Crée un compte bancaire avec un solde
     * @param solde Le solde
     */
    public CompteBancaire(double solde) {
        setSolde(solde);
    }

    /** 
     * Incrémente le solde
     * @param argent L'argent à ajouter au solde
     */
    public void deposeArgent(double argent) {
        if (argent > 0)
            solde += argent;
    }

    /** 
     * Décrémente le solde
     * @param argent La somme d'argent à retirer du compte
     */
    public void retireArgent(double argent) {
        if (argent > 0)
            solde -= argent;
    }

    /**
     * Met à jour le solde du compte
     * @param solde Le nouveau solde du compte
     */
    public void setSolde(double solde) {
        this.solde = ( solde >= 0 ) ? solde : 0.0;
    }

    /**
     * Retourne le solde
     * @return solde Le solde du compte
     */
    public double getSolde() {
        return solde;
    }
    
    /**
     * Retourne la représentation en chaine de caractère du solde du compte
     * @return Le solde du compte en chaine de caractère
     */
    public String toString() {
        return "Solde : " + Double.toString(solde);
    }
}