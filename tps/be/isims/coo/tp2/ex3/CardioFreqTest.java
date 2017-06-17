package be.isims.coo.tp2.ex3;

import java.util.Scanner;

/**
 * CardioFreqTest
 */
public class CardioFreqTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Prenom : ");
        String prenom = scanner.nextLine();
        System.out.print("Jour de naissance : ");
        String day = scanner.nextLine();
        System.out.print("Mois de naissance : ");
        String month = scanner.nextLine();
        System.out.print("Annee de naissance : ");
        String year = scanner.nextLine();
        MyDate dateDeNaissance = new MyDate(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
        CardioFreq cardioFreq = new CardioFreq(nom, prenom, dateDeNaissance);
        System.out.println("---------------------------------------");
        System.out.println("Nom : " + cardioFreq.getNom());
        System.out.println("Prenom : " + cardioFreq.getPrenom());
        System.out.println("Age : " + cardioFreq.getAge());
        System.out.println("FCM : " + cardioFreq.getFCM());
        String fccMin = Double.toString(cardioFreq.getFCC()[0]);
        String fccMax = Double.toString(cardioFreq.getFCC()[1]);
        System.out.println("FCC : " + fccMin + " - " + fccMax);
   }
}