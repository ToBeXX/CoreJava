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
			throw new RuntimeException("����ʱ�쳣");
		} catch (Exception e) {
			e.printStackTrace();		//ͨ�����ڵ���bug  --���ص�
			/*String message = e.getMessage();
			System.out.println(message);*/	//�˽�
		} 
	}
	
}
class Animal{
	public void m1()throws IOException{}
}
class Dog extends Animal{
	public void m1()throws EOFException,FileNotFoundException{}
}
