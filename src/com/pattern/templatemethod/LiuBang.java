package com.pattern.templatemethod;

/*
 * ���������
 */
public class LiuBang extends LifeTemplate {
	
	@Override
	public void setGoal() {
		// TODO Auto-generated method stub
		System.out.println("ൺ������ɷ����Ҳ!" + "��ʼ�ʳ�Ѳ����������˵");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
       System.out.println("ն���߶��𣬵ý����ţ���ı���������θ������Űܶ�����");
	}

	@Override
	public void achievement() {
		// TODO Auto-generated method stub
		System.out.println("�����¶�����������");
	}

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
    System.out.println("��������Ʒ�����Ӻ��������磬������ʿ�����ķ���");
	}

}
