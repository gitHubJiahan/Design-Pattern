package com.pattern.decorator;

public class AtWork implements People {

	People person;
	String decoratorAtWork =  "�ҵĹ��� ��";

	
	public AtWork(People person) {
		// TODO Auto-generated constructor stub
		this.person = person ;
	}
	
	public void setDecoratorAtWork(String str)
	{
		decoratorAtWork =  decoratorAtWork + str ;
	}
	
	@Override
	public void decorativeLife() {
		// TODO Auto-generated method stub
		person.decorativeLife();
		System.out.println(decoratorAtWork);
		
	}

}
