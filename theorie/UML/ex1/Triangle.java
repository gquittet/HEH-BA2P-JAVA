import java.math.*;

/**
 * Triangle
 * @author Guillaume Quittet
 * @date 10-02-2017
 */
public class Triangle {
    private float longueurCote;

    /**
     * Crée un triangle
     * @param longueurCote La longueur d'un côté
     */
    public Triangle(float longueurCote) {
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
     * Calcul la hauteur du triangle
     * @return La hauteur du triangle
     */
    private float hauteur() {
        return (float) ((Math.sqrt(3)/2) * longueurCote);
    }

    /**
     * Retoune l'aire du triangle
     * @return L'aire du triangle
     */
    public float aire() {
        float hauteur = hauteur();        
        return ((longueurCote * hauteur)/2);
    }

    /**
     * Retourne le périmètre du triangle
     * @return Le périmètre du triangle
     */
    public float perimetre() {
        return (longueurCote * 3);
    }
}