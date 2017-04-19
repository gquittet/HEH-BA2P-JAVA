package be.isims.ihm.tp3.ex2;

import java.util.Collections;
import java.util.List;

public class AffichageStatistique extends Observateur {

    public AffichageStatistique(StationMeteo sm) {
        super.sm = sm;
    }

    public void actualise() {
        List<Integer> temperatures = sm.getTemperatures();
        Collections.sort(temperatures);
        int min = temperatures.get(0);
        int max = temperatures.get(temperatures.size() - 1);
        int temperaturesSum = temperatures.stream().mapToInt(Integer::intValue).sum();
        float moyenne = (float) temperaturesSum / temperatures.size();
        System.out.println(" >> Température min/max/moy : " + Integer.toString(min) + "‎°C/ " + Integer.toString(max) + "‎°C/ " + Float.toString(moyenne) + "‎°C");
    }
}
