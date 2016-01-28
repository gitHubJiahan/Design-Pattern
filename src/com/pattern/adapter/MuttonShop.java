package com.pattern.adapter;


/*
 *  Context 羊肉店
 */
public class MuttonShop {
	
	Mutton mutton;
	
	public MuttonShop(Mutton mutton) {
		// TODO Auto-generated constructor stub
		
		this.mutton = mutton ;
	}	
	
	public void saleMutton()
	{
		System.out.println("我们出售 是：" + mutton.getMutton());
	}
	
}
