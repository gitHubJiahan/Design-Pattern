package com.pattern.strategy;

public class Test {

	public static void main(String[] args) {
		
		// 变大
		SunWukong sunwukong = new SunWukong(new ChangeToBig());
		sunwukong.toChange();

		//	变小鸟
		sunwukong.set(new ChangeToBird());
		sunwukong.toChange();

		// 	变小鱼
		sunwukong.set(new ChangeToFish());
		sunwukong.toChange();
	}

}
