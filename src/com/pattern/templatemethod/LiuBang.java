package com.pattern.templatemethod;

/*
 * 刘邦的人生
 */
public class LiuBang extends LifeTemplate {
	
	@Override
	public void setGoal() {
		// TODO Auto-generated method stub
		System.out.println("嗟乎，大丈夫当如此也!" + "遇始皇出巡，刘邦如是说");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
       System.out.println("斩白蛇而起，得将韩信，用谋张良，萧何辅政，屡败而生！");
	}

	@Override
	public void achievement() {
		// TODO Auto-generated method stub
		System.out.println("王天下而孤老王座！");
	}

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
    System.out.println("大风起兮云飞扬，威加海内兮归故乡，安得猛士兮守四方！");
	}

}
