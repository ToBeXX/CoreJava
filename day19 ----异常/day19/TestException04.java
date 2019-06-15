package com.baizhi.day19;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException04 {
	public static void main(String[] args) {
		m1();
	}
	public static void m1(){
		//alt + shift+ z--->try/catch
		try {
			System.out.println("-----------");
			System.out.println("-----------");
			System.out.println("-----------");
			throw new RuntimeException("运行时异常");
		} catch (Exception e) {
			e.printStackTrace();		//通常用于调试bug  --》重点
			/*String message = e.getMessage();
			System.out.println(message);*/	//了解
		} 
	}
	
}
class Animal{
	public void m1()throws IOException{}
}
class Dog extends Animal{
	public void m1()throws EOFException,FileNotFoundException{}
}
