package com.pattern.decorator;

/*
 * ѧУװ����
 */

public class AtSchool implements People {
	
	
	People person;
	String decoratorAtSchool =  "����ѧ���� ��";

	public AtSchool(People person) {
		// TODO Auto-generated constructor stub
		this.person = person;
	}

    public void  setDecoratorAtSchool(String str)
    {
    	decoratorAtSchool =  decoratorAtSchool + str ;
    }

	@Override
	public void decorativeLife() {
		// TODO Auto-generated method stub
		
		person.decorativeLife();
		System.out.println(decoratorAtSchool);
		
	}

	


	

	

}
