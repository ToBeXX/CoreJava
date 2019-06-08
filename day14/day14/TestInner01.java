package com.baizhi.day14;

public class TestInner01 {
	public static void main(String[] args) {
		//创建静态内部类对象
		Outer01.Inner01 oi = new Outer01.Inner01();
		oi.inner_method();
		System.out.println(Outer01.Inner01.b);
	}
}
class Outer01{
	static int a;
	int c = 20;
	//静态内部类
	static class Inner01{
		static int b = 20;
		public void inner_method(){
			System.out.println("静态内部类的成员方法。。。。");
//			System.out.println(c);		//静态内部类中不能访问外部类的非静态成员
		}
	}
}
