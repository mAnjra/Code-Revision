import java.util.Random;

public class WeatherForecaster {
    private Random random;

    public WeatherForecaster() {
        this.random = new Random();
    }

    public String forecastWeather() {
        double probability = this.random.nextDouble();

        if (probability <= 0.1) {
            return "Sleet";
        } else if (probability <= 0.4) {
            return "Snow";
        } else {
            return "sunny";
        }
    }

    public int forecastTemperature(){
        return (int) (4*this.random.nextGaussian() -3 );//nextGaussian normal distribution
    }





}