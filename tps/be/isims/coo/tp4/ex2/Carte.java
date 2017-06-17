package be.isims.coo.tp4.ex2;

/**
 * Carte
 * Une carte à jouer
 */
public class Carte {
    private String type;
    private int value;

    /**
     * Crée une carte
     * @param type Le type de la carte
     * @param value La valeur de la carte
     */
    public Carte(String type, int value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Retourne le type de la carte
     * @return type Le type de la carte
     */
    public String getType() {
        return type;
    }

    /**
     * Retourne la valeur de la carte
     * @return value La valeur de la carte
     */
    public int getValue() {
        return value;
    }
}