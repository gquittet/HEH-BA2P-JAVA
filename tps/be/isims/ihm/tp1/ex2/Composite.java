package be.isims.ihm.tp1.ex2;

import java.util.List;
import java.util.ArrayList;

import be.isims.ihm.tp1.ex2.Component;

/**
 * Composite
 * @author Guillaume Quittet
 * @since 9 mars 2017
 */
public class Composite extends Component {

    private List<Component> enfants;

    /**
     * Crée un Composite
     */
    public Composite() {
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
    public double benefice() {
        double benefice = 0.0;
        for (Component c : enfants) {
            benefice += c.benefice();
        }
        return benefice;
    }
}