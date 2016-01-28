package com.pattern.singleton;

/*
 * ͬ����
 */
public class SynSingleton {
	
	private  SynSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static SynSingleton instance = null ;
	
	public static synchronized SynSingleton getInstance()
	{
		if( null == instance)
		{
			instance = new SynSingleton();
		}
		return instance;
	}

}
