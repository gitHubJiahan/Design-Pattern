package com.pattern.templatemethod;

/*
 *  ����ģ��
 */

public abstract class LifeTemplate {
	
	
	//  ģ�巽��
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
    	 System.out.println("��֮�����Ա���------");
     }
     
   public abstract void setGoal();
   
   public abstract void fight();
   
   public abstract void achievement();
   
   public abstract void saySomething();
   
   public void death()
   {
	   System.out.println("��������------");
   }
}
