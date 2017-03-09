package be.isims.ihm.tp1.ex3;

import java.util.List;
import java.util.ArrayList;

import be.isims.ihm.tp1.ex3.Component;

/**
 * Composite
 * @author Guillaume Quittet
 * @since 9 mars 2017
 */
public class Composite extends Component {

    private List<Component> enfants;
    private String nom;

    /**
     * Crée un Composite
     * @param nom Le nom du Composite
     */
    public Composite(String nom) {
        this.nom = nom;
        enfants = new ArrayList<Component>();
    }

    /**
     * Ajoute un Component au tableau
     * @param c Le Component à ajouter au tableau
     */
    public void ajouter(Component c) {
        enfants.add(c);
    }

    /**
     * Supprime un Component du tableau
     * @param c Le component à supprimer du tableau
     */
    public void supprimer(Component c) {
        enfants.remove(c);
    }

    /**
     * Retourne la somme des bénéfices de tous les enfants
     * @return Les bénéfices des enfants
     */
    @Override
    public String lister() {
        String noms = "";
        for (Component c : enfants) {
            if(c instanceof Composite) {
                Composite b = (Composite) c;
                noms += b.getNom();
                noms += "\n";
                noms += b.lister();
                noms += "\n";
            }
            else {     
                noms += c.lister();
                noms += "\n";
            }
        }
        return noms;
    }

    /**
     * Retourne le nom du répertoire
     * @return nom Le nom du répertoire
     */
    public String getNom() {
        return nom;
    }
}