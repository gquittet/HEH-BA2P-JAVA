package be.isims.ihm.tp2.ex2;


/**
 * IFormat
 * Un format de String
 */
public interface IFormat {

    /**
     * Vérifie si le format du String est correct
     * @param text Le String à vérifier
     * @return Vrai si la chaine est valide et Faux si la chaine est invalide
     */
    public boolean isValid(String text);
}