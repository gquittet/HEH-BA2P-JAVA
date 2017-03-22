package be.isims.ihm.tp2.ex2;


/**
 * FormatEntier
 * Le format d'un entier
 */
public class FormatEntier implements IFormat {

    /**
     * Vérifie si le format du String est un entier
     * @param text Le String à vérifier
     * @return Vrai si la chaine est un entier si pas renvoie faux
     */
    public boolean isValid(String text) {
        int x;
        try {
            x = Integer.parseInt(text);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}