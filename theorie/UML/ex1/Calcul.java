/**
 * Calcul
 * @author Guillaume Quittet
 * @date 10-02-2017
 */
public class Calcul {

    /**
     * Calcule l'aire de tous les polygones
     * @param carres Tous les carres
     * @param triangles Tous les triangles
     * @return Aire totale de tous les polygones 
     */
    public float aireTotal(Carre[] carres, Triangle[] triangle) {
        float aireTotal = 0.0f;
        for (int i = 0; i < carres.length; i++) {
            aireTotal += carres[i].aire();
        }
        for (int i = 0; i < triangle.length; i++) {
            aireTotal += triangle[i].aire();
        }
        return aireTotal;
    }

    /**
     * Calcule le périmètre de tous les polygones
     * @param carres Tous les carres
     * @param triangles Tous les triangles
     * @return Périmètre total de tous les polygones 
     */
    public float perimetreTotal(Carre[] carres, Triangle[] triangle) {
        float perimetreTotal = 0.0f;
        for (int i = 0; i < carres.length; i++) {
            perimetreTotal += carres[i].perimetre();
        }
        for (int i = 0; i < triangle.length; i++) {
            perimetreTotal += triangle[i].perimetre();
        }
        return perimetreTotal;
    }
}