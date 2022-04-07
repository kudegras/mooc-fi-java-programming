package application;

public class StandardSensor implements Sensor {

    private int temp;

    public StandardSensor(int temp) {
        this.temp = temp;
    }

    public boolean isOn() {
        return true;
    }

    public void setOn() {

    }

    public void setOff() {

    }

    public int read() {
        return temp;
    }
}
