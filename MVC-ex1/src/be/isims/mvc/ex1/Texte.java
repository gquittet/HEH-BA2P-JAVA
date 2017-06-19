package be.isims.mvc.ex1;

import java.util.ArrayList;
import java.util.List;

/**
   Classe Sujet : Texte
*/

public class Texte {

    private List<Observer> obs;
    private String texte;

    public Texte(String texte) {
	obs = new ArrayList<Observer>();
	this.texte = texte;
    }

    public void ajouter(Observer ob) {
	obs.add(ob);
    }

    public void supprimer(Observer ob) {
	obs.remove(ob);
    }

    public void notifie() {
	for (Observer ob : obs) {
	    ob.actualise();
	}
    }

    public List<Observer> getObservers() {
	return obs;
    }

    public String getTexte() {
	return texte;
    }

}
