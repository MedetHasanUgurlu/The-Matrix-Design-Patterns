package observer;

import observer.imp.CurrentConditionsDisplay;
import observer.imp.ForecastDisplay;
import observer.imp.StatisticsDisplay;
import observer.imp.WhetherData;

public class Main {
    public static void main(String[] args) {
        WhetherData whetherData = new WhetherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(whetherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(whetherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(whetherData);

        whetherData.setMeasurements(80, 65, 30.4f);
        whetherData.setMeasurements(82, 70, 29.2f);
        whetherData.setMeasurements(78, 90, 29.2f);

    }
}