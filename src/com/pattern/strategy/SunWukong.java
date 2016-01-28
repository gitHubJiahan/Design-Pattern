package com.pattern.strategy;



/*
 *  Context  ËïÎò¿Õ
 */

public class SunWukong {
	
	Change change;
	
	public SunWukong(Change change) {
		// TODO Auto-generated constructor stub
		this.change = change ;
	}
	
   public void set(Change fight)
   {
	   this.change = fight ;
   }
	
   public void toChange()
   {
	   change.changeSomething();
   }

}
