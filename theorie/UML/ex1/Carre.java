/**
 * Carre
 * @author Guillaume Quittet
 * @date 10-02-2017
 */
public class Carre {
    private float longueurCote;

    /**
     * Crée un carré
     * @param longueurCote La longueur d'un côté
     */
    public Carre(float longueurCote) {
        this.longueurCote = longueurCote;
    }

    /**
     * Retourne la longueur d'un côté
     * @return longueurCote La longueur d'un côté
     */
    public float getLongueurCote() {
        return longueurCote;
    }

    /**
     * Retoune l'aire du carré
     * @return L'aire du carré
     */
    public float aire() {
        return (longueurCote * longueurCote);
    }

    /**
     * Retourne le périmètre du carré
     * @return Le périmètre du carré
     */
    public float perimetre() {
        return (longueurCote * 4);
    }
}