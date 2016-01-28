package com.pattern.observer;

public class CurrentConditionDispaly implements Observer, DisplayElement {
	
	
	private float temp;
	private float humidity;
	private float pressure;
	
	public CurrentConditionDispaly() {
		// TODO Auto-generated constructor stub
		temp = 0;
		humidity =0;
		pressure =0;
	}

	@Override
	public void Update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp ;
		this.humidity = humidity;
		this.pressure = pressure;
		
		displayInfo();
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("数据开始跟新...");
		System.out.println("当前温度： " + temp);
		System.out.println("当前湿度 ： " + humidity  );
		System.out.println("当前气压： " + pressure );
	}
	
	


}
