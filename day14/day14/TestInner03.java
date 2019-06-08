package com.baizhi.day14;

public class TestInner03 {
	public static void main(String[] args) {
		//定义匿名内部类，并且创建匿名内部类对象,匿名内部类是Person类的子类
		Person p = new Person(){
			//括号内的内容就是匿名内部类的内容
			public void m1(){
				System.out.println("匿名内部类的m1方法");
			}
		};
		p.m1();
	}
	public static Person getPerson(int n){
		if(n%2==0){
			
			return new Person(){
				public void m1() {}
			};
		
		}else{
			
			return new Person(){
				public void m1() {}
			};
			
		}
	}
}
abstract class Person{
	public abstract void m1();
}


