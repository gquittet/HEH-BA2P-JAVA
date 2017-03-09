package be.isims.ihm.tp1.ex3;

import be.isims.ihm.tp1.ex3.Component;

/**
 * Fichier
 * @author Guillaume Quittet
 * @since 9 mars 2017
 */
public class Fichier extends Component {

    private String nom;

    /**
     * Crée un nouveau Fichier
     * @param nom Le nom du fichier
     */
    public Fichier(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le nom du fichier
     * @return nom Le nom du fichier
     */
    @Override
    public String lister() {
        return nom;
    }
}