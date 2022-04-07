package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> temps;

    public AverageSensor() {
        sensors = new ArrayList<>();
        temps = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return temps;
    }

    public boolean isOn() {
        for (Sensor s : sensors) {
            if (s.isOn()) {
                return true;
            }
        }
        
        return false;
    }

    public void setOn() {
        for (Sensor s : sensors) {
            s.setOn();
        }
    }

    public void setOff() {
        for (Sensor s : sensors) {
            s.setOff();
        }
    }

    public int read() {

        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("Average sensor should be on and have sensors!");
        }

        int temp = (int) sensors.stream().map(s -> s.read()).mapToInt(i -> i).average().getAsDouble();
        temps.add(temp);
        return temp;
    }
}
