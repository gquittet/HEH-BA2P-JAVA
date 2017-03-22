package be.isims.ihm.tp2.ex2;


/**
 * Validateur
 * Vérifie si une chaine est valide
 */
public class Validateur {

    private IFormat format;
    private String text;

    /**
     * Créé le Validateur
     * @param format Le format à respecter
     * @param text La chaine à vérifier
     */
    public Validateur(IFormat format, String text) {
        this.format = format;
        this.text = text;
    }

    /**
     * Vérifie si la chaine est correcte
     * @return Vrai si la chaine est correcte et faux si la chaine
     * est incorrecte
     */
    public boolean isValid() {
        return format.isValid(text);
    }
}