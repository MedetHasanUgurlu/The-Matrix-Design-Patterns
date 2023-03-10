package observer.imp;

import observer.DisplayElement;
import observer.Observer;
import observer.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject whetherData;


    public CurrentConditionsDisplay(Subject whetherData){
        this.whetherData = whetherData;
        whetherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
