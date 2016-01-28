package com.pattern.adapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mutton mutton = new Mutton() {
			
			@Override
			public String getMutton() {
				// TODO Auto-generated method stub
				return "—Ú»‚";
			}
		};
		
		MuttonShop shop1 = new MuttonShop(mutton);
		shop1.saleMutton();
		
		
		DogMeat dogMeat = new DogMeat() {
			
			@Override
			public String getDogMeat() {
				// TODO Auto-generated method stub
				return "π∑»‚";
			}
		};
		
		
		// œÎƒ√π∑»‚µ±—Ú»‚¬Ú
		MeatAdapter meatadapter = new MeatAdapter(dogMeat);
		MuttonShop shop2 = new MuttonShop(meatadapter);
		shop2.saleMutton();
		

	}

}
