package com.baizhi.day14;

public class TestInner {
	public static void main(String[] args) {
		//创建成员内部类对象
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		oi.m1();
		
	}
}
class Outer{
	private int a = 10;
	int b = 20;			//外部类的成员变量
	static int c = 40;	//外部类的静态属性
	//成员内部类
	class Inner{
		int b = 30;		//内部类的成员变量
//		static          int d = 30;	//内部类中不能定义静态成员
		public void m1(){
			System.out.println(a);
			System.out.println(this.b);		//30
			System.out.println(Outer.this.b);		//20  --->外部类的成员变量
			System.out.println(Outer.this.c);		//40
		}
		/*public static void m2(){
			
		}*/
	}	
}
