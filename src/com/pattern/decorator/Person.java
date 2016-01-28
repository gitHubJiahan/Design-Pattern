package com.pattern.decorator;

/*
 *   具体被装饰的对象
 */

public class Person implements People {
	
	String name;
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name ;
	}

	@Override
	public void decorativeLife() {
		// TODO Auto-generated method stub
		System.out.println(name + "装饰的人生——");
		
	}

}
