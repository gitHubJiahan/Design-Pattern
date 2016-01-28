package com.pattern.singleton;

/*
 *   ���� ��һɽ���ݶ���
 *   ����ʽ
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
