package be.isims.coo.tp4.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Carre
 * La classe du carré magique
 */
public class Carre {
    private int ordre;
    private int[][] carre;

    /**
     * Crée le carré magique
     * @param ordre La taille du tableau
     */
    public Carre(int ordre) {
        this.ordre = ordre;
        carre = new int[ordre][ordre];
    }

    /**
     * Charge la configuration d'un fichier
     * @param fileName Le nom du fichier à charger
     */
    public void load(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("be/isims/coo/tp4/ex3", fileName));
        } catch (FileNotFoundException fnfe) {
            System.err.println("[Error]: " + fnfe.getMessage());
            System.exit(-1);
        }
        for (int i = 0; i < ordre; i++) {
            for (int j = 0; j < ordre; j++) {
                carre[j][i] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    /**
     * Affiche le carré magique
     */
    public void print() {
        for (int i = 0; i < ordre; i++) {
            for (int j = 0; j < ordre; j++) {
                System.out.print(Integer.toString(carre[j][i]) + " ");
            }
            System.out.println(" ");
        }
    }

    /**
     * Calcule la somme d'une certaine ligne
     * @param line La ligne dont on veut calculer la somme
     * @return somme La somme d'une ligne
     */
    public int lineSum(int line) {
        int somme = 0;
        for (int i = 0; i < ordre; i++) {
            somme += carre[i][line - 1];
        }
        return somme;
    }
    
    /**
     * Retourne la somme d'une colonne
     * @param column La colonne en question
     * @return somme La somme de la colonne
     */
    public int columnSum(int column) {
        int somme = 0;
        for (int i = 0; i < ordre; i++) {
            somme += carre[column - 1][i];
        }
        return somme;
    }

    /**
     * Retourne la somme de la diagonale principale
     * @return somme La somme de la diagonale principale
     */
    public int diagonalSum() {
        int somme = 0;
        for (int i = 0; i < ordre; i++) {
            somme += carre[i][i];
        }
        return somme;
    }

    /**
     * Teste si le tableau est magique ou non
     * @return magic Si le tableau est magique ou non
     */
    public boolean isMagic() {
        int sommeLigne;
        int sommeColonne;
        int sommeDiagonale = diagonalSum();
        boolean magic = false;
        for (int i = 0; i < ordre; i++) {
            sommeLigne = lineSum(i + 1);
            sommeColonne = columnSum(i + 1);
            // On teste si les variables ligne, colonne est diagonale sont égales entre elles
            magic = (sommeDiagonale == sommeLigne && sommeDiagonale == sommeColonne) ? true : false;
            if (!magic)
                break;
        }
        return magic;
    }
}