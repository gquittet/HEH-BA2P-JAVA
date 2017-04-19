package be.isims.ihm.tp3.ex2;


import java.util.List;
import java.util.ArrayList;

/**
* Une station météo
*/
public class StationMeteo {

    private List<Observateur> obs;
    private List<Integer> temperatures;
    private int humidite;

    /**
    * Crée un objet météo
    */
    public StationMeteo() {
        obs = new ArrayList<Observateur>();
        temperatures = new ArrayList<Integer>();
    }

    /**
    * Ajoute un Observateur à la collection des Observateurs
    * @param ob L'Observateur à ajouter
    */
    public void addObservateur(Observateur ob) {
        this.obs.add(ob);
    }

    /**
    * Ajoute des données à la collection de données
    * @param a La température
    * @param b Le taux d'humidité
    */
    public void ajouterDonnees(int a, int b) {
        temperatures.add(a);
        this.humidite = b;
        notifie();
    }

    public void notifie() {
        for (Observateur ob : obs) {
            ob.actualise();
        }
    }

    public List<Integer> getTemperatures() {
        return this.temperatures;
    }

    public int getHumidite() {
        return this.humidite;
    }
}
