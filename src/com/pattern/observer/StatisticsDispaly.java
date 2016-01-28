package com.pattern.observer;

import java.util.ArrayList;

public class StatisticsDispaly implements DisplayElement, Observer {
	
	private float avgTemp, avgHum , avgPresu;
	private float maxTemp, maxHumidity, maxPressure ;
	private float minTemp , minHumidity , minPressure;
	private ArrayList<Float> temps;
	private ArrayList<Float> humidities;
	private ArrayList<Float> pressures;
	
	public StatisticsDispaly() {
		// TODO Auto-generated constructor stub
		avgTemp =0;
		avgHum =0;
		avgPresu =0;
		maxTemp = 0;
		maxHumidity =0;
		maxPressure =0;
		minTemp =0;
		minHumidity = 0;
		minPressure =0;
		temps = new ArrayList<>();
		humidities = new ArrayList<>();
		pressures = new ArrayList<>();
			
	}

	@Override
	public void Update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
		getDataFromTemp(temp);
		getDataFromHumidity(humidity);
		getDataFromPressu(pressure);
	
		displayInfo();
		
			
		
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("���ݸ�����...");
		
		System.out.println("=======================");		
		System.out.println("��ǰ�¶�����---");
		System.out.println("ƽ���¶� ��" + avgTemp);
		System.out.println("����¶ȣ�" + maxTemp);
		System.out.println("����¶ȣ� " + minTemp);
		
		System.out.println("=======================");		
		System.out.println("��ǰʪ������---");
		System.out.println("ƽ��ʪ�� ��" + avgHum );
		System.out.println("���ʪ�ȣ�" + maxHumidity);
		System.out.println("���ʪ�ȣ� " + minHumidity);
		
		System.out.println("=======================");		
		System.out.println("��ǰ��ѹ����---");
		System.out.println("ƽ����ѹ ��" + avgPresu);
		System.out.println("�����ѹ��" + maxPressure);
		System.out.println("�����ѹ�� " + minPressure);

	}
	
	
	public void getDataFromTemp(Float temp)
	{
		temps.add(temp);
		
		float sum= 0;
		for(int i =0 ; i<temps.size(); i++)
		{
			
			if(maxTemp < temps.get(i))
			{
				maxTemp = temps.get(i);
			}
			
			if(minTemp > temps.get(i))
			{
				minTemp = temps.get(i);
			}
			
			sum += temps.get(i);
			
		}
		
		avgTemp = sum/temps.size();
	};
	
	public void getDataFromHumidity(Float humidity)
	{
		humidities.add(humidity);

		float sum= 0;
		for(int i =0 ; i<humidities.size(); i++)
		{
			
			if(maxHumidity < humidities.get(i))
			{
				maxHumidity = humidities.get(i);
			}
			
			if(minHumidity > humidities.get(i))
			{
				minHumidity = humidities.get(i);
			}
			
			sum += humidities.get(i);
			
		}
		
		avgHum = sum/humidities.size();
	}
	
	public void getDataFromPressu(Float pressure)
	{
		pressures.add(pressure);
		float sum= 0;
		for(int i =0 ; i<pressures.size(); i++)
		{
			
			if(maxPressure < pressures.get(i))
			{
				maxPressure = pressures.get(i);
			}
			
			if(minPressure > pressures.get(i))
			{
				minPressure = pressures.get(i);
			}
			
			sum += pressures.get(i);
			
		}
		
		avgPresu = sum/pressures.size();
		
	}

}
