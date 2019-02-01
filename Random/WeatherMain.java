import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WeatherMain{
    public static void main(String[] args){
        WeatherForecaster weatherForecaster = new WeatherForecaster();
        ArrayList<String> days = new ArrayList<String>();
        Collections.addAll(days, "Mon","Tue","Wed","Thur","Fri","Sat","Sun");

        System.out.println("Weather forecast for the next week:");
        for(String day : days){
            String wForecaster = weatherForecaster.forecastWeather();
            int tForcaster = weatherForecaster.forecastTemperature();

            System.out.println(day+": "+wForecaster+ " "+ tForcaster+" degrees.");
        }
    }
}