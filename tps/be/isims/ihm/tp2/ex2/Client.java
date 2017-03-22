package be.isims.ihm.tp2.ex2;


/**
 * Client
 * Une classe qui lance le programme
 */
public class Client {

    /**
     * C'est ici que tout commence
     * @param Une liste d'argument
     */
    public static void main(String[] args) {
        String txt = "6";
        Validateur valEntier = new Validateur(new FormatEntier(), txt);
        System.out.println("Est-ce que " + txt + " est un entier valide ? " +
                                                        valEntier.isValid());
        Validateur valMail = new Validateur(new FormatMail(), txt);
        System.out.println("Est-ce que " + txt + " est un mail valide ? " +
                                                        valMail.isValid());
        System.out.println("----------------------");
        txt = "toto@gmail.com";
        System.out.println("La chaine de caractère : " + txt);
        Validateur valEntier2=new Validateur(new FormatEntier(),txt);
        System.out.println("Est-ce que " + txt + " est un entier valide ? " + valEntier2.isValid());
        Validateur valMail2 = new Validateur(new FormatMail(), txt);
        System.out.println("Est-ce que " + txt + " est un mail valide ? " + valMail2.isValid());
    }
}