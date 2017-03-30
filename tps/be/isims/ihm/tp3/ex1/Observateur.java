package be.isims.ihm.tp3.ex1;

/**
 * Observateur
 * L'interface qui actualise notre Sujet
 */
public abstract class Observateur {

    protected Saisi saisi;

    /**
     * La fonction qui actualise le Sujet
     */
    public abstract void actualise();
}