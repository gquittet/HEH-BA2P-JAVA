package be.isims.coo.tp5.ex4;


/**
 * Vendeur
 * Un simple vendeur
 */
public class Vendeur extends Employe {
    private float tauxDeCommission;

    /**
     * Crée un nouveau vendeur
     * @param salaire Le salaire
     * @param tauxDeCommission Le taux de la commission en pourcentage
     */
    public Vendeur(float salaire, float tauxDeCommission) {
        super(salaire);
        setTauxDecommission(tauxDeCommission);
    }

    /**
     * Met à jour le taux de commission
     */
    public void setTauxDecommission(float tauxDeCommission) {
        this.tauxDeCommission = tauxDeCommission;
    }

    /**
     * Retourne le salaire
     * @return Le pourcentage sur les ventes
     */
    public float getSalaire(float vente) {
        return (vente * tauxDeCommission / 100);
    }
}