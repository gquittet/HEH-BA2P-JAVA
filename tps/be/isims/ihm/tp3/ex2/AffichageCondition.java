package be.isims.ihm.tp3.ex2;


public class AffichageCondition extends Observateur {

    public AffichageCondition(StationMeteo sm) {
        super.sm = sm;
    }

    public void actualise() {
        int lastItem = sm.getTemperatures().size() - 1;
        int temperature = sm.getTemperatures().get(lastItem);
        System.out.print("Température : " +
                            Integer.toString(temperature) +
                            "‎°C - Humidité : " +
                            Integer.toString(sm.getHumidite()) + "%");
    }
}
