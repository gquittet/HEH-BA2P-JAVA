package be.isims.coo.tp2.ex1;

import java.util.Scanner;

public class CahierNotesTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer le nom du cours : ");
        String courseName = scanner.nextLine();
        new CahierNotes().afficheMessage(courseName);
    }
}