package com.pattern.singleton;

/*
 *   单例 ：一山不容二虎
 *   懒汉式
 */

public class SimpleSingleton {
	
	private  SimpleSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static SimpleSingleton instance = null ;
	
	public static SimpleSingleton getInstance()
	{
		if( null == instance)
		{
			instance = new SimpleSingleton();
		}
		return instance;
	}

}
