package com.baizhi.day15;

public class TestEquals {
	public static void main(String[] args) {
		Animal a1 = new Animal("Animal1",10,true);
		Animal a2 = new Animal("Animal1",10,true);
		Animal a3 = new Animal("Animal2",2,false);
		
		System.out.println(a1==a2);		//fasle
		System.out.println(a1==a3);		//false
		
		//�Ƚ�a1��a2��������������Ƿ�һ��
		System.out.println(a1.equals(a2));
		
		
	}
}
