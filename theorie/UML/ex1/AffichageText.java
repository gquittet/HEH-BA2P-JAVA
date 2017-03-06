/**
 * AffichageText
 * @author Guillaume Quittet
 * @date 10-02-2017
 */
public class AffichageText {
    private Calcul calcul;

    public AffichageText() {
        calcul = new Calcul();
    }

    /**
     * Appelle les fonctions d'affichage pour afficher le périmètre total et l'aire totale
     * @param carres Tous les carres
     * @param triangles Tous les triangles
     * @param longueur La longueur d'un côté
     */
    public void affichage(Carre[] carres, Triangle[] triangles, float longueur) {
        affichagePerimetre(carres, triangles, longueur);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        affichageAire(carres, triangles, longueur);
    }

    /**
     * Affiche le périmètre total
     * @param carres Tous les carres
     * @param triangles Tous les triangles
     * @param longueur La longueur d'un côté
     */
    private void affichagePerimetre(Carre[] carres, Triangle[] triangles, float longueur) {
        System.out.println("Perimetre total :\n-----------------");
        for (int i = 0; i < carres.length; i++) {
            System.out.println("Carre " + Integer.toString(i + 1));
            System.out.println("Cote 1 : " + Float.toString(longueur));
            System.out.println("Cote 2 : " + Float.toString(longueur));
            System.out.println("Cote 3 : " + Float.toString(longueur));
            System.out.println("Cote 4 : " + Float.toString(longueur));
        }
        for (int i = 0; i < triangles.length; i++) {
            System.out.println("Triangle " + Integer.toString(i + 1));
            System.out.println("Cote 1 : " + Float.toString(longueur));
            System.out.println("Cote 2 : " + Float.toString(longueur));
            System.out.println("Cote 3 : " + Float.toString(longueur));
        }
        System.out.println("Total : " + Float.toString(calcul.perimetreTotal(carres, triangles)));
    }

    /**
     * Affiche l'aire totale
     * @param carres Tous les carres
     * @param triangles Tous les triangles
     * @param longueur La longueur d'un côté
     */
    private void affichageAire(Carre[] carres, Triangle[] triangles, float longueur) {
        System.out.println("Aire total :\n------------");
        for (int i = 0; i < carres.length; i++) {
            System.out.println("Carre " + Integer.toString(i + 1));
            System.out.println("Cote 1 : " + Float.toString(longueur));
            System.out.println("Cote 2 : " + Float.toString(longueur));
            System.out.println("Cote 3 : " + Float.toString(longueur));
            System.out.println("Cote 4 : " + Float.toString(longueur));
        }
        for (int i = 0; i < triangles.length; i++) {
            System.out.println("Triangle " + Integer.toString(i + 1));
            System.out.println("Cote 1 : " + Float.toString(longueur));
            System.out.println("Cote 2 : " + Float.toString(longueur));
            System.out.println("Cote 3 : " + Float.toString(longueur));
        }
        System.out.println("Total : " + Float.toString(calcul.aireTotal(carres, triangles)));
    }
}