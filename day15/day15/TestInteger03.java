package com.baizhi.day15;

public class TestInteger03 {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1==i2);		//false
		
		//�Զ�װ��   -----��valueOf
		Integer i3 = 12;
		Integer i4 = 12;
		System.out.println(i3==i4);		//true
		
		
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5==i6);		//false �����˻������ķ�Χ��-128~127��
		
		
	}
}
