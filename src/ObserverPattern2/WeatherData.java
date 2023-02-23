package ObserverPattern2;

import java.util.Observable;

//no need to keep track of observers anymore
public class WeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    //constructor doesn't need to create a data structure to hold observers
    public WeatherData(){

    }
    public void measurementsChanged(){
        setChanged();
        notifyObservers(); //no data objects sent => PULL METHOD
    }
    public void setMeasurements(){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    //observers use the following getter methods to get at the weatherData object's state
    public float getTemp(){
        return temp;
    }
    public float getHumidity(){
        return humidity;
    }
    public float getPressure(){
        return pressure;
    }

}