package com.pattern.singleton;

/*
 *  Ë«ÖØ¼ì²é
 */

public class DoubleCheckSingleton {
	
	private DoubleCheckSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static DoubleCheckSingleton instance = null;
	
	public static DoubleCheckSingleton getInstance()
	{
		if(null == instance)
		{
			synchronized (DoubleCheckSingleton.class) {
				if(null == instance)
				{
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}

}
