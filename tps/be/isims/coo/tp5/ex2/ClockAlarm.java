package be.isims.coo.tp5.ex2;

import horloge.Clock;

/**
 * ClockAlarm
 * Une horloge améliorée qui possède une alarme
 */
public class ClockAlarm extends Clock {
    private int heureAlarm, minuteAlarm, secondeAlarm;
    private boolean on;

    /**
     * Crée une alarme
     */
    public ClockAlarm() {
        super();
    }

    /**
     * Désactive l'alarme
     */
    public void mettreAlarmOff() {
        on = false;
    }

    /**
     * Active l'alarme
     */
    public void mettreAlarmOn() {
        on = true;
    }

    /**
     * Change l'état de la machine
     */
    public void setAlarm(int heureAlarm, int minuteAlarm, int secondeAlarm) {
        this.heureAlarm = heureAlarm;
        this.minuteAlarm = minuteAlarm;
        this.secondeAlarm = secondeAlarm;
    }

    public boolean getAlarmState() {
        return on;
    }
}