/**
 * Polygone
 * @author Guillaume Quittet
 * @date 10-02-2017
 */
public class Polygone {
    private float longueurCote;
    private Carre[] carres;
    private Triangle[] triangles;

    /**
     * Crée les polygones
     * @param longueurCote La longueur d'un côté
     * @param nbreCarres Le nombre de carrés
     * @param nbreTriangles Le nombre de triangles
     */
    public Polygone(float longueurCote, int nbreCarres, int nbreTriangles) {
        this.longueurCote = longueurCote;
        carres = new Carre[nbreCarres];
        triangles = new Triangle[nbreTriangles];
        makeCarres(nbreCarres);
        makeTriangles(nbreTriangles);
    }

    /**
     * Crée les carrés
     * @param nbreCarres Le nombre de carrés
     */
    private void makeCarres(int nbreCarres) {
        for (int i = 0; i < nbreCarres; i++) {
            carres[i] = new Carre(longueurCote);
        }
    }

    /**
     * Crée les triangles
     * @param nbreTriangles Le nombre de triangles
     */
    private void makeTriangles(int nbreTriangles) {
        for (int i = 0; i < nbreTriangles; i++) {
            triangles[i] = new Triangle(longueurCote);
        }
    }

    /**
     * Retourne tous les carrés
     * @return carres Un tableau de carrés
     */
    public Carre[] getCarres() {
        return carres;
    }

    /**
     * Retourne tous els triangles
     * @return triangles Un tableau contenant tous les triangles
     */
    public Triangle[] getTriangles() {
        return triangles;
    }

    /**
     * Retourne la longueur d'un côté
     * @return longueurCote La longueur d'un côté
     */
    public float getLongueurCote() {
        return longueurCote;
    }
}