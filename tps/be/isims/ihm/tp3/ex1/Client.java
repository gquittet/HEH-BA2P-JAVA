package be.isims.ihm.tp3.ex1;

import java.util.*;

/**
 * Client
 * La classe qui lance tout
 */
public class Client {

    /**
     * C'est ici que tout commence
     * @param args Une liste d'arguments
     */
    public static void main(String[] args) {
        // On instancie notre Sujet
        Saisi saisi = new Saisi();
        // On instancie les sujets concrets
        ConvBin convB = new ConvBin(saisi);
        ConvHex convH = new ConvHex(saisi);
        ConvOctale convO = new ConvOctale(saisi);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Saisir un entier :");
            saisi.setNombre(sc.nextInt());
        }
    }
}