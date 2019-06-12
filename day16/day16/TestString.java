package com.baizhi.day16;

public class TestString {
	public static void main(String[] args) {
		 String s = "abc";	//字面值形式
		 String s1 = "abc"; 
		 System.out.println(s==s1);  //true
		 
		 String s2 = new String("abcd");	//构造方法的创建方式
		 String s3 = new String("abcd");	//构造方法的创建方式
		 System.out.println(s2==s3);	//false 
		
		 
		 /*System.out.println(s);
		 System.out.println(s2);*/
		 
		 
	}
}
