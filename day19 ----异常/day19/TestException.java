package com.baizhi.day19;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestException {
	public static void main(String[] args) {
		/*
		1.�忨            ��Ƭ��ʶ��
		2.��������    �������
		3.������    ���㡢������Χ
		4.��Ǯ            �������ϣ�����һ��
		5.ȡ��            �̿�
		*/
		int[] a = new int[2];
//		System.out.println(a[2]);
		
		BankUser bu = null;
		if(bu!=null){
			bu.getUserName();
		}
		
//		String s = "12dgf";
//		int b = Integer.parseInt(s);
		
//		Class.forName("BankUser");
//		System.out.println(5/0);
		
		
		System.out.println("helloWorld");
		m1();
		
	}
	public static void m1(){
		System.out.println("hello");
		//�ֶ������쳣  
		//�׳��쳣  �ؼ��֣�throw ������return 
		throw new RuntimeException();
		
//		System.out.println("world");
	}
	
	
//	throw new RuntimeException();  error
}
