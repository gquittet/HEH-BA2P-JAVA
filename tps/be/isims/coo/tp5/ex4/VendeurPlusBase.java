package be.isims.coo.tp5.ex4;


/**
 * VendeurPlusBase
 * Un vendeur level 2
 */
public class VendeurPlusBase extends Vendeur {
    private float tauxDeCommission;

    /**
     * Crée un vendeur plus cheaté
     * @param salaire Son salaire de riche
     * @param tauxDeCommission Le taux de transfert de ma bite
     */
    public VendeurPlusBase(float salaire, float tauxDeCommission) {
        super(salaire, tauxDeCommission);
    }

    /**
     * Retourne le salaire en fonction de la vente
     * @return ta mere
     */
    public float getSalaire(float vente) {
        return (salaire + (vente * tauxDeCommission / 100));
    }
}