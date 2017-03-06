package be.isims.coo.tp5.ex3;

import be.isims.coo.tp3.ex1.De;
import be.isims.coo.tp4.ex2.Carte;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * ArrayListTest
 * Le tp sur les ArrayList
 */
public class ArrayListTest {
    private List<Object> list;

    /**
     * Crée une ArrayList
     */
    public ArrayListTest() {
        list = new ArrayList<Object>();
        De de = new De();
        list.add(de);
        String[] type = new String[]{"As", "Carreau", "Trefle", "Coeur"};
        int value = new Random().nextInt(13) + 1;
        String carteType = type[value%4];
        Carte carte = new Carte(carteType, value);
        list.add(carte);
        Rectangle rectangle = new Rectangle(12, 12, 12, 12);
        list.add(rectangle);
        String chaineDeCaratere = new String("Allez salut !");
        list.add(chaineDeCaratere);
    }

    /**
     * Parcoure la liste et affiche ce qu'on nous demande
     */
    public void parcourir() {
        for (Object o : list) {
            if (o instanceof De) {
                De de = (De) o;
                int n = de.lancer();
                System.out.println(Integer.toString(n));
            } else if (o instanceof Carte) {
                Carte carte = (Carte) o;
                System.out.println(carte.getType() + " : " + Integer.toString(carte.getValue()));
            } else if (o instanceof Rectangle)
                System.out.println(o.toString());
            else if (o instanceof String)
                System.out.println(o);
        }
    }
}