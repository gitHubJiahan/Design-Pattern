package com.pattern.singleton;

/*
 * ����ʽ����
 */

public class HungrySingleton {
	
	private HungrySingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static HungrySingleton instance = new HungrySingleton();
	
	public static HungrySingleton getInstance()
	{
		return instance;
	}

}
