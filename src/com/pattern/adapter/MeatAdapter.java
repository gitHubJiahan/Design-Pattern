package com.pattern.adapter;


/*
 *  ������
 */

public class MeatAdapter implements Mutton {
	
	public DogMeat dogMeat;
	
	public MeatAdapter(DogMeat dogMeat) {
		// TODO Auto-generated constructor stub
		this.dogMeat = dogMeat ;
		
	}

	@Override
	public String getMutton() {
		// TODO Auto-generated method stub	
		return  dogMeat.getDogMeat();
	}

}
