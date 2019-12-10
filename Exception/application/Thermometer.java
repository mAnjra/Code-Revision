package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private Random random = new Random();
    private boolean isOn = false;


    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
            if(isOn){
                return random.nextInt(60) -30;
            }
            throw new IllegalStateException("Thermometer is Off");

        /*
        Random num = new Random();
        int low = -30;
        int high = 30;
        int n = num.nextInt(high - low) + low;
        return n;
*/

    }
}
