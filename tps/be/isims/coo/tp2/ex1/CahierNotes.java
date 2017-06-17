package be.isims.coo.tp2.ex1;

/**
 * CahierNotes
 * La représentation d'un cahier de notes
 */
public class CahierNotes {
    private String nomCours;

    /**
     * Crée un cahier de notes
     */
    public CahierNotes() {
        nomCours = "TR2TI2 – Techniques Informatiques 2";
    }

    /**
     * Affiche un message et met à jour le nom du nomCours
     * @param nomCours Le nom du cours
     */
    public void afficheMessage(String nomCours) {
        this.nomCours = nomCours;
        System.out.println("Bienvenue au cahier de notes de "+nomCours+" !");
    }

    /**
     * Retourne le nom du cours
     * @return nomCours Le nom du cours
     */
    public String getNomCours() {
        return nomCours;
    }
    
    /**
     * Change le nom du cours
     * @param nomCours Le nouveau nom du cours
     */
    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }
}