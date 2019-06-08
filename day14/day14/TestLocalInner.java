package com.baizhi.day14;

public class TestLocalInner {
	public static void main(String[] args) {

		Outer02 o = new Outer02();
		o.m1();	
	}
}

class Outer02 {
	private int a = 20;
	public void m1() {
		final int b = 20;
		// 定义一个局部内部类
		class Inner02 {
			public void m2(){
				System.out.println("局部内部类的m1方法。。。");
				System.out.println(a);
				System.out.println(b);
			}
		}
		// 创建局部内部类对象
		Inner02 i = new Inner02();
		i.m2();
	}
}
