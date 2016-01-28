package com.pattern.observer;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrentConditionDispaly currentConditionDispaly =
				new CurrentConditionDispaly();
		
		StatisticsDispaly statisticsDispaly = 
				new StatisticsDispaly();
		
		WeatherData weatherData = new WeatherData();
		
		weatherData.registerObserver(currentConditionDispaly);
		weatherData.registerObserver(statisticsDispaly);
		
	
				// TODO Auto-generated method stub
				
				for(int i=0 ;i < 10; i++){
				
				  Random random=new Random();
				  weatherData.setTemperature(random.nextFloat());
				  weatherData.setPressure(random.nextFloat());
				  weatherData.setHumidity(random.nextFloat());
				  weatherData.notifyObservers();
				
	
	    }

    }
}
