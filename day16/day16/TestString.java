package com.baizhi.day16;

public class TestString {
	public static void main(String[] args) {
		 String s = "abc";	//����ֵ��ʽ
		 String s1 = "abc"; 
		 System.out.println(s==s1);  //true
		 
		 String s2 = new String("abcd");	//���췽���Ĵ�����ʽ
		 String s3 = new String("abcd");	//���췽���Ĵ�����ʽ
		 System.out.println(s2==s3);	//false 
		
		 
		 /*System.out.println(s);
		 System.out.println(s2);*/
		 
		 
	}
}
