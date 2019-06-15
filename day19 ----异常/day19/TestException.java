package com.baizhi.day19;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestException {
	public static void main(String[] args) {
		/*
		1.插卡            磁片不识别
		2.输入密码    密码错误
		3.输入金额    余额不足、超出范围
		4.吐钱            机器故障，少了一半
		5.取卡            吞卡
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
		//手动创建异常  
		//抛出异常  关键字：throw 类似于return 
		throw new RuntimeException();
		
//		System.out.println("world");
	}
	
	
//	throw new RuntimeException();  error
}
