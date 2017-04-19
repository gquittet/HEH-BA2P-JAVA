package be.isims.ihm.tp3.ex2;

public class Donnees {

    private int temperature;
    private int humidite;

    public Donnees(int temperature, int humidite) {
        this.temperature = temperature;
        this.humidite = humidite;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public int getHumidite() {
        return this.humidite;
    }
}
