package be.isims.ihm.tp1.ex2;

import java.util.ArrayList;
import java.util.List;

import be.isims.ihm.tp1.ex2.Component;

/**
 * Magasin
 * @author Guillaume Quittet
 * @since 9 mars 2017
 */
public class Magasin extends Component {

    private double benefice;

    /**
     * Crée un Magasin
     * @param benefice Le bénéfice du Magasin
     */
    public Magasin(double benefice) {
        this.benefice = benefice;
    }

    /**
     * Retourne les bénéfice du Magasin
     * @return benefice Les bénéfices du Magasin
     */
    @Override
    public double benefice() {
        return benefice;
    }
}