package com.pattern.strategy;

public class Test {

	public static void main(String[] args) {
		
		// ���
		SunWukong sunwukong = new SunWukong(new ChangeToBig());
		sunwukong.toChange();

		//	��С��
		sunwukong.set(new ChangeToBird());
		sunwukong.toChange();

		// 	��С��
		sunwukong.set(new ChangeToFish());
		sunwukong.toChange();
	}

}
