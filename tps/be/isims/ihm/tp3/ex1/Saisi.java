package be.isims.ihm.tp3.ex1;


import java.util.*;

/**
 * Saisi
 */
public class Saisi {

    protected List<Observateur> observateurs;
    protected int nombre;

    public Saisi() {
        observateurs = new ArrayList<Observateur>();
        nombre = 0;
    }

    public void attach(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void notifie() {
        for (Observateur observateur : observateurs) {
            observateur.actualise();
        }
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
        notifie();
    }

    public int getNombre() {
        return nombre;
    }
}