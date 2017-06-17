package be.isims.ihm.tp2.ex2;


/**
 * FormatMail
 * Le format d'un mail
 */
public class FormatMail implements IFormat {

    /**
     * Vérifie si le format du String est un mail
     * @param text Le String à vérifier
     * @return Vrai si la chaine est un mail si pas renvoie faux
     */
    public boolean isValid(String text) {
        return !(text.indexOf("@") == -1);
    }
}
