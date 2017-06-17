package be.isims.coo.tp4.ex1;

/**
 * Ordinogramme
 */
public class Ordinogramme {
    private int[][] elements;

    /** 
    * Crée un ordinogramme
    */
    public Ordinogramme() {
        elements = new int[11][2];
        elements[0][0] = 0;
        elements[1][0] = 10;
        elements[2][0] = 20;
        elements[3][0] = 30;
        elements[4][0] = 40;
        elements[5][0] = 50;
        elements[6][0] = 60;
        elements[7][0] = 70;
        elements[8][0] = 80;
        elements[9][0] = 90;
        elements[10][0] = 100;
    }

    /**
     * Incrémente l'intervalle dans lequel se trouve un entier n 
     * @param n Un entier n
     */
    public void add(int n) {
        if (n >= 0 && n < 10)
            elements[0][1] += 1;
        else if (n >= 10 && n < 20)
           elements[1][1] += 1;
        else if (n >= 20 && n < 30)
            elements[2][1] += 1;
        else if (n >= 30 && n < 40)
            elements[3][1] += 1;
        else if (n >= 40 && n < 50)        
            elements[4][1] += 1;
        else if (n >= 50 && n < 60)        
            elements[5][1] += 1;
        else if (n >= 60 && n < 70)        
            elements[6][1] += 1;
        else if (n >= 70 && n < 80)        
            elements[7][1] += 1;
        else if (n >= 80 && n < 90)        
            elements[8][1] += 1;
        else if (n >= 90 && n < 100)        
            elements[9][1] += 1;
        else if (n == 100)
            elements[10][1] += 1;
        else {
            System.err.println("[Erreur] : Le nombre entré n'est pas compris entre 0 et 100.");
            System.exit(-1);
        }
    }

    /**
     * Affiche l'ordinogramme
     */
    public void print() {
        for (int i = 0; i < elements.length; i++) {
            if (i < elements.length - 1)
                System.out.print(Integer.toString(elements[i][0]) + 
                                    " - " + 
                                    Integer.toString(elements[i][0] + 9) + 
                                    " : ");
            else
                System.out.print(Integer.toString(elements[i][0]) + " : ");            
            for (int j = 0; j < elements[i][1]; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}