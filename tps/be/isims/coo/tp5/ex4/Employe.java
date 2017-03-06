package be.isims.coo.tp5.ex4;


/**
 * Employe
 * Un simple employé.
 */
public class Employe {
    private String nom, prenom;
    private String idSecu;
    protected float salaire;

    /**
     * Crée un simple employé
     * @param salaire Le salaire de l'employé
     */
    public Employe(float salaire) {
        this.salaire = salaire;
    }

    /**
     * Paye le salarié
     * @return salaire Le salaire du salarié.
     */
    public float getSalaire() {
        return salaire;
    }

    /**
     * Écrit les informations à propos d'un employé.
     * @return boum boum boum
     */
    public String toString() {
        return nom + " " + prenom;
    }
}