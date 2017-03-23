package be.isims.ihm.tp3.ex1;

import java.util.*;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        // On instancie notre Sujet
        Saisi saisi = new Saisi();
        // On instancie les sujets concrets
        ConvBin convB = new ConvBin();
        ConvHex convH = new ConvHex();
        ConvOctale convO = new ConvOctale();

        saisi.add(convB);
        saisi.add(convH);
        saisi.add(convO);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Saisir un entier :");
            saisi.setNombre(sc.nextInt());
        }
    }
}