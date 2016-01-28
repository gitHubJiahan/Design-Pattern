package com.pattern.templatemethod;

/*
 *  项羽的人生
 */
public class XiangYu extends LifeTemplate {

	@Override
	public void setGoal() {
		// TODO Auto-generated method stub
		System.out.println("彼可取而代之也!" + "遇始皇出巡，项羽如是说");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("领八千子弟过江东，破釜沉舟，拜亚父，击暴秦，大小七十余战，八岁而霸天下");

	}

	@Override
	public void achievement() {
		// TODO Auto-generated method stub
		System.out.println("有志者，天不负，破釜沉舟，百二秦关终属楚");
		System.out.println("四面楚歌，虞姬相随，垓下之围，霸气不灭");
	}

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		 System.out.println("天之亡我，我何渡之!且籍与江东子弟八千人渡江而西，今无一还，纵江东父兄怜而王我"+
		"我何面目见之？纵彼不言，籍独不愧于心乎？");
	}

}
