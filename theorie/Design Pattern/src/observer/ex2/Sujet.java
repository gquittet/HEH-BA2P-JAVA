package observer.ex2;

import java.util.*;

/**
 * Sujet
 */
public abstract class Sujet {

    protected List<Observateur> observateurs;

    public Sujet() {
        observateurs = new ArrayList<Observateur>();
    }

    public void add(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void remove(Observateur observateur) {
        observateurs.remove(observateur);
    }

    public void clique() {
        
    }
}