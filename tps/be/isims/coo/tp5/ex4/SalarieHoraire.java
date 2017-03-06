package be.isims.coo.tp5.ex4;


/**
 * SalaireHoraire
 * Crée un salarié qui gagne en fonction du nombre d'heures prestées.
 */
public class SalaireHoraire extends Salarie {
    protected float heuresTravail;

    /**
     * Crée un salarié
     * @param salaire Le salaire du salairé
     * @param heuresTravail Le nombre d'heures de travai du salarié
     */
    public SalaireHoraire(float salaire, float heuresTravail) {
        super(salaire);
        this.heuresTravail = heuresTravail;
    }

    /**
     * Retourne le salaire du salarié.
     * @return Le salaire.
     */
    public float getSalaire() {
        if (heuresTravail <= 38)
            return salaire;
        else {
            return (salaire + getBonus());
        }
    }

    /**
     * Retourne le bonus si l'employé travaille plus.
     * @return Le bonus.
     */
    private float getBonus() {
        return ((salaire + ((salaire / 100) * 30)) * (38 - heuresTravail));
    }


}