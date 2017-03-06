package be.isims.coo.tp3.ex2;

/**
 * Complexe - Un nombre complexe
 */
public class Complexe {
    private double partieReelle;
    private double partieImaginaire;

    /**
     * Crée un nombre complexe avec comme valeur par défaut 1
     */
    public Complexe() {
        this.partieReelle = this.partieImaginaire = 1;
    }

    /**
     * Crée un complexe
     * @param partieReelle La partie réelle
     * @param partieImaginaire La partie imaginaire
     */
    public Complexe(double partieReelle, double partieImaginaire) {
        this.partieReelle = partieReelle;
        this.partieImaginaire = partieImaginaire;
    }

    /**
     * Additionne deux complexes
     * @param b Le deuxième complexe
     * @return Un nouveau complexe
     */
    public Complexe addition(Complexe b) {
        double partieReelle, partieImaginaire;
        partieReelle = this.partieReelle + b.partieReelle;
        partieImaginaire = this.partieImaginaire + b.partieImaginaire;
        return new Complexe(partieReelle, partieImaginaire);
    }

    /**
     * Soustrait 2 complexes
     * @param b Le deuxième complexe
     * @return Un nouveau complexe qui est le résultat de la soustraction de 2 anciens
     */
    public Complexe soustraction(Complexe b) {
        double partieReelle, partieImaginaire;
        partieReelle = this.partieReelle - b.partieReelle;
        partieImaginaire = this.partieImaginaire - b.partieImaginaire;
        return new Complexe(partieReelle, partieImaginaire);
    }

    /**
     * Modifie la partie réelle
     * @param partieReelle La nouvelle partie réelle
     */
    public void setPartieReelle(double partieReelle) {
        this.partieReelle = partieReelle;
    }

    /**
     * Modifie la partie imaginaire
     * @param partieImaginaire La nouvelle partie imaginaire
     */
    public void setPartieImaginaire(double partieImaginaire) {
        this.partieImaginaire = partieImaginaire;
    }

    /**
     * Retourne la partie réelle
     * @return partieReelle La partie réelle
     */
    public double getPartieReelle() {
        return partieReelle;
    }

    /**
     * Retourne la partie imaginaire
     * @return partieImaginaire La partie imaginaire
     */
    public double getPartieImaginaire() {
        return partieImaginaire;
    }

    /**
     * Retourne une chaine de caractère avec la représentation du complexe
     * @return La représentation du complexe
     */
    public String toString() {
        return "(" + Double.toString(partieReelle) + "," + Double.toString(partieImaginaire) + ")";
    }
}