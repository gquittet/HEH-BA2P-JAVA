import java.awt.Rectangle;

/**
 * Carre
 * Un carre qui est l'enfant
 */
public class Carre extends Rectangle {

    /**
     * Crée un carré
     * @param x La position en X du centre
     * @param y La position en Y du centre
     * @param size La taille d'un cote 
     */
    public Carre(int x, int y, int size) {
        super(x - size / 2, y - size / 2, size, size);
    }

    /**
     * Retourne l'aire du carré
     * @return L'aire du carré
     */
    public float getArea() {
        return (getHeight() * getWidth());
    }
}