package be.isims.ihm.tp3.ex1;

import java.util.*;

/**
 * Sujet
 */
public abstract class Sujet {

    protected List<Observateur> observateurs;
    protected int nombre;

    public Sujet() {
        observateurs = new ArrayList<Observateur>();
        nombre = 0;
    }

    public void add(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void remove(Observateur observateur) {
        observateurs.remove(observateur);
    }

    public void notifie() {
        for (Observateur observateur : observateurs) {
            observateur.actualise(nombre);
        }
    }
}