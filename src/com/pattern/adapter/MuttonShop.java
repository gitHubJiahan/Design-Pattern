package com.pattern.adapter;


/*
 *  Context �����
 */
public class MuttonShop {
	
	Mutton mutton;
	
	public MuttonShop(Mutton mutton) {
		// TODO Auto-generated constructor stub
		
		this.mutton = mutton ;
	}	
	
	public void saleMutton()
	{
		System.out.println("���ǳ��� �ǣ�" + mutton.getMutton());
	}
	
}
