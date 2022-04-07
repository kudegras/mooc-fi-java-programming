package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private int temp;
    private boolean on;

    public boolean isOn() {
        return on;
    }

    public void setOn() {
        on = true;
    }

    public void setOff() {
        on = false;
    }

    public int read() {

        if (!isOn()) {
            throw new IllegalStateException("The sensor is off!");
        }

        Random rnd = new Random();
        return rnd.nextInt(61) - 30;
    }
}
