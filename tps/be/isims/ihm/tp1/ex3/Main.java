package be.isims.ihm.tp1.ex3;

/**
 * Main
 * @author Guillaume Quittet
 * @since 9 mars 2017
 */
public class Main {

    /**
     * Commence un nouveau monde
     * @param args La liste d'arguments
     */
    public static void main(String[] args) {
        Repertoire root = new Repertoire("/");

        Repertoire bin = new Repertoire("bin");
        Repertoire home = new Repertoire("home");
        Repertoire usr = new Repertoire("usr");
        Fichier fichier1 = new Fichier("fichier1");
        Fichier fichier2 = new Fichier("fichier2");
        Fichier fichier3 = new Fichier("fichier3");
        Fichier programme = new Fichier("programme");

        Repertoire user = new Repertoire("user");

        root.ajouter(bin);
        root.ajouter(home);
        root.ajouter(usr);
        root.ajouter(fichier1);
        root.ajouter(fichier2);
        root.ajouter(fichier3);

        bin.ajouter(programme);

        home.ajouter(user);
        user.ajouter(fichier1);
        user.ajouter(fichier2);

        System.out.println("/");
        System.out.println(root.lister());
    }
}