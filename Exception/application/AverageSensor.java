package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        // go through all the sensors in the list see which one is on
        // if they are all on then switch the average sensor on
        for(Sensor s : sensors) {
            if (!s.isOn()) {
                return false; // one of the sensors are off - so average sensor will not be switched on
            }
        }
        // when the loop ends and all sensors are on then average sensor is switched on
        return true;
    }

    @Override
    public void on() {
        for(Sensor s : sensors){
            s.on();
        }
    }

    @Override
    public void off() {
        for(Sensor s : sensors){
            s.off();
        }
    }

    @Override
    public int measure() {
        // go through all sensors find their readings and get an average
        if(!isOn() || sensors.isEmpty()){
            throw new IllegalStateException("Average sensor is off or no sensors have been detected");
        } else {
            int sum = 0;
            for (Sensor s : sensors) {
                sum += s.measure();
            }
            int average = sum / sensors.size();
            this.readings.add(average);


            return average;
        }
    }

    public List<Integer> readings(){
        return this.readings;
    }


}
