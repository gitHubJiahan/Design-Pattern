package com.pattern.decorator;

/*
 *  生活装饰类
 */
public class AtLive implements People {
	
	People person;
	String decoratorAtFamily =  "我的生活 ：";
	
	
    public AtLive(People person) {
		// TODO Auto-generated constructor stub	
    	this.person = person ;
	}
    

	public void setDecoratorAtFamily(String str)
	{
		decoratorAtFamily =  decoratorAtFamily + str ;
	}
	

	@Override
	public void decorativeLife() {
		// TODO Auto-generated method stub
		person.decorativeLife();
		System.out.println(decoratorAtFamily);
	}

}
