package be.isims.coo.tp2.ex3;

/**
 * MyDate
 */
public class MyDate {
    private int day, month, year;

    /**
     * Crée un date avec une date par défaut
     */
    public MyDate() {
        setMyDate(1, 1, 1900);
    }

    /**
     * Crée une date
     * @param day Le jour
     * @param month Le mois
     * @param year L'année
     */
    public MyDate(int day, int month, int year) {
        setMyDate(day, month, year);
    }

    /**
     * Met à jour la date
     * @param day Le jour
     * @param month Le mois
     * @param year L'année
     */
    public void setMyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Retourne la date
     * @return Un nouvelle date
     */
    public MyDate getMyDate() {
        return new MyDate(day, month, year);
    }

    /**
     * Retourne le jour
     * @return day Le jour
     */
    public int getDay() {
        return day;
    }

    /**
     * Retoune le mois
     * @return month Le mois
     */
    public int getMonth() {
        return month;
    }

    /**
     * Retourne l'année
     * @return year L'année
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Retourne la représentation en chaine de caractère de la date
     * @return La représentation en chaine de caractère de la date
     */
    public String toString() {
        return Integer.toString(day) + "/" + Integer.toString(month) + "/" + Integer.toString(year);
    }
}