package com.pattern.templatemethod;

/*
 *  ���������
 */
public class XiangYu extends LifeTemplate {

	@Override
	public void setGoal() {
		// TODO Auto-generated method stub
		System.out.println("�˿�ȡ����֮Ҳ!" + "��ʼ�ʳ�Ѳ����������˵");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("���ǧ�ӵܹ��������Ƹ����ۣ����Ǹ��������أ���С��ʮ��ս�������������");

	}

	@Override
	public void achievement() {
		// TODO Auto-generated method stub
		System.out.println("��־�ߣ��첻�����Ƹ����ۣ��ٶ��ع�������");
		System.out.println("������裬�ݼ����棬����֮Χ����������");
	}

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		 System.out.println("��֮���ң��Һζ�֮!�Ҽ��뽭���ӵܰ�ǧ�˶ɽ�����������һ�����ݽ���������������"+
		"�Һ���Ŀ��֮���ݱ˲��ԣ������������ĺ���");
	}

}
