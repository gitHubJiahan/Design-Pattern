package com.pattern.decorator;

/*
 *  ����װ����
 */
public class AtLive implements People {
	
	People person;
	String decoratorAtFamily =  "�ҵ����� ��";
	
	
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
