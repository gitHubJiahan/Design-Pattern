package com.pattern.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private float temperature;
	private float humidity;
	private float pressure;
	public  ArrayList<Observer> observers;
	
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<>();
	}
	

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if( observers.size() != 0)
		{
			for( Observer obser : observers)
			{
				if( o.equals(obser))
				{
					observers.remove(o);
					return ;
				}
			}
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i=0; i<observers.size(); i++)
		{
			observers.get(i).Update(temperature, humidity, pressure);
			
			
		}

	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}


	
	
	

}
