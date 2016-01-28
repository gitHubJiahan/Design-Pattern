package com.pattern.templatemethod;

/*
 *  人生模板
 */

public abstract class LifeTemplate {
	
	
	//  模板方法
	public void lifetime()
	 {
		birth();
		setGoal();
		fight();
		achievement();
		saySomething();
		death();	
	 }
	
    public void birth()
     {
    	 System.out.println("人之初，性本善------");
     }
     
   public abstract void setGoal();
   
   public abstract void fight();
   
   public abstract void achievement();
   
   public abstract void saySomething();
   
   public void death()
   {
	   System.out.println("人死灯灭------");
   }
}
