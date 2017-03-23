package be.isims.ihm.tp3.ex1;


import java.util.*;

/**
 * Saisi
 */
public class Saisi extends Sujet {

    public Saisi() {
        super();
    }

    public void setNombre(int nombre) {
        super.nombre = nombre;
        super.notifie();
    } 
}