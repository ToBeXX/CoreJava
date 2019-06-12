package com.baizhi.day15;

public class TestEquals {
	public static void main(String[] args) {
		Animal a1 = new Animal("Animal1",10,true);
		Animal a2 = new Animal("Animal1",10,true);
		Animal a3 = new Animal("Animal2",2,false);
		
		System.out.println(a1==a2);		//fasle
		System.out.println(a1==a3);		//false
		
		//比较a1和a2两个对象的内容是否一致
		System.out.println(a1.equals(a2));
		
		
	}
}
