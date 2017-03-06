/**
 * Main
 * @author Guillaume Quittet
 * @date 10-02-2017
 */
public class Main {

    public static void main(String[] args) {
        Polygone polygone = new Polygone(3.5f, 3, 5);
        new AffichageText().affichage(polygone.getCarres(), polygone.getTriangles(), polygone.getLongueurCote());
    }
}