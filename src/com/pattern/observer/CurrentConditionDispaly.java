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
		System.out.println("���ݿ�ʼ����...");
		System.out.println("��ǰ�¶ȣ� " + temp);
		System.out.println("��ǰʪ�� �� " + humidity  );
		System.out.println("��ǰ��ѹ�� " + pressure );
	}
	
	


}
