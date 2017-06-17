package be.isims.coo.tp2.ex3;

import java.util.Calendar;
import java.util.Date;

/**
 * CardioFreq
 */
public class CardioFreq {
    private String nom, prenom;
    private MyDate dateDeNaissance;

    /**
     * Crée un objet cardio fréquence
     * @param nom Le nom d'une personne
     * @param prenom Le prénom d'une personne
     * @param dateDeNaissance La date de naissance d'une personne
     */
    public CardioFreq(String nom, String prenom, MyDate dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }

    /**
     * Retourne l'age d'une personne
     * @return age L'age d'une personne
     */
    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        int currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int age;
        if (currentMonth >= dateDeNaissance.getMonth()) {
            age = currentYear - dateDeNaissance.getYear();
            if (currentMonth == dateDeNaissance.getMonth()) {
                if(currentDay >= dateDeNaissance.getDay())
                    age = currentYear - dateDeNaissance.getYear();
                else
                    age = currentYear - dateDeNaissance.getYear() - 1;
            }
        } else {
            age = currentYear - dateDeNaissance.getYear() - 1;
        }
        return age;
    }

    /**
     * Retourne la fréquence cardiaque maximale
     * @return La fréquence cardiaque maximale
     */
    public int getFCM() {
        return 220 - getAge();
    }

    /**
     * Retourne l'intervale dans lequel est compris la fréquence cardiaque cible
     * @return L'intervale dans lequel est compris la fréquence cardiaque cible
     */
    public double[] getFCC() {
        double[] fcc = new double[2];
        fcc[0] = getFCM() * 0.6;
        fcc[1] = getFCM() * 0.8;
        return fcc;
    }

    /**
     * Retourne le nom de la personne
     * @return Le nom de la personne
     */
    public String getNom() {
        return nom;
    }

    /**
     * Met à jour le nom de la personne
     * @param nom Le nom de la personne
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le prénom de la personne
     * @return Le prénom de la personne
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Met à jour le prénom de la personne
     * @param prenom Le prénom de la personne
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Retourne la date de naissance d'une personne
     * @return La date de naissance d'une personne
     */
    public MyDate getDateDeNaissance() {
        return dateDeNaissance;
    }
    
    /**
     * Met à jour la date de naissance
     * @param dateDeNaissance La nouvelle date de naissance
     */
    public void setDateDeNaissance(MyDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
}