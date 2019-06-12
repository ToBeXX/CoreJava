package com.baizhi.day15;

public class TestInteger01 {
	public static void main(String[] args) {
		/*String--->int
		String--->Integer*/
		String s = "123";
		/*int i = Integer.parseInt(s);
		System.out.println(i);*/
		
		Integer integer = Integer.valueOf(s);
		System.out.println(integer);
		
		
	}
}
