package be.isims.coo.tp6.ex1;


/**
 * CompteEnBanque
 * Un compte en banque
 */
public class CompteEnBanque {
    private double solde;
    private float tauxAnnuel;

    /**
     * Crée un compte en banque
     */
    public CompteEnBanque(double solde, float tauxAnnuel) {
        this.solde = solde;
        setTauxAnnuel(tauxAnnuel);
    }

    /**
     * Met à jour le taux annuel.
     * @param tauxAnnuel Le taux annuel en pourcentage
     */
    public void setTauxAnnuel(float tauxAnnuel) {
        this.tauxAnnuel = tauxAnnuel;
    }

    /**
     * Retourne le solde du compte
     */
    public double getSolde() {
        return solde;
    }
}