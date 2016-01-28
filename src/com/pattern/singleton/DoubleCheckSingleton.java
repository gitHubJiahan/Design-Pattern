package com.pattern.singleton;

/*
 *  ˫�ؼ��
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
