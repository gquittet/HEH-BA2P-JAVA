package be.isims.coo.tp3.ex3;

import java.util.ArrayList;
import  java.util.List;


/**
 * Relationnel - Représente une fraction
 */
public class Relationnel {
    private int numerateur;
    private int denominateur;

    /**
     * Crée une fraction
     * @param numerateur Le numérateur de la fraction
     */
    public Relationnel(int numerateur) {
        this.numerateur = numerateur;
        denominateur = 1;
    }

    /**
     * Crée une fraction
     * @param numerateur Le numérateur de la fraction
     * @param denominateur Le dénominateur de la fraction
     */
    public Relationnel(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    /**
     * Additionne 2 fractions
     * @param r Une fraction
     * @return Une nouvelle fraction qui est le résultat de la somme de 2 précédentes
     */
    public Relationnel plus(Relationnel r) {
        int denominateur = this.denominateur * r.denominateur;
        int numerateurA = this.numerateur * denominateur;
        int numerateurB = r.numerateur * denominateur;
        int numerateur = numerateurA + numerateurB;
        return new Relationnel(numerateur, denominateur);
    }


    /*
        ===========================================================================
        Cette partie contient l'algorithme pour calculer le pdcd de façon itérative
        Il est très optimisé car c'est celui d'Euclide.
        ===========================================================================
    */


    /**
     * Compute the pgdc of 2 Integer
     * @param a An Integer
     * @param b An Integer
     * @return The pgdc of 2 Integer
     */
    private int pgdc_it(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    /*
        ===========================================================================
        Cette partie contient l'algorithme pour calculer le pgdc de façon récursive
        Cet algorithme est très optimisé car il est d'Euclide.
        ===========================================================================
    */

    /**
     * Compute the pgdc of 2 Integer
     * @param a An Integer
     * @param b An Integer
     * @return The pgdc of 2 Integer
     */
    private int pgdc_rec(int a, int b) {
        if (b == 0)
            return a;
        else
            return pgdc_rec(b, a % b);
    }

    /**
     * Simplifie la fraction
     */
    private void formeReduite() {
        int pgdc = pgdc_it(numerateur, denominateur);
        numerateur = numerateur / pgdc;
        denominateur = denominateur / pgdc;
    }

    /**
     * Retourne le numérateur de la fraction
     * @return numerateur Le numérateur
     */
    public int getNumerateur() {
        return numerateur;
    }

    /**
     * Retourne le dénominateur
     * @return denominateur Le dénominateur
     */
    public int getDenominateur() {
        return denominateur;
    }

    /**
     * Retourne le représentation d'une fraction sous forme d'une chaine de caractère
     * @return La représentation d'une fraction
     */
    public String toString() {
        if (denominateur == 1)
            return Integer.toString(numerateur);
        return Integer.toString(numerateur) + "/" + Integer.toString(denominateur);
    }
}