package com.pattern.singleton;

/*
 * ¶öººÊ½µ¥Àý
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
