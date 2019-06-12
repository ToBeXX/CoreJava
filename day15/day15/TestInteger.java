package com.baizhi.day15;

public class TestInteger {
	public static void main(String[] args) {
		int a = 10;
//		Integer——int
//	​	int-->Integer
		Integer integer = new Integer(a);  //构造方法
		Integer integer1 = Integer.valueOf(a);  //通过Intger类提供的静态方法valueOf(int a);
		
//	​	Integer-->int
		int b = integer.intValue();	//通过Intger类中的成员方法intValue();
		System.out.println(b);
		
//		2.Integer——String
		String s = "123";
//		​a.String-->Integer
		Integer integer2 = new Integer(s);		//构造方法
		Integer integer3 = Integer.valueOf(s);	//通过Intger类提供的静态方法valueOf(String s);
		
//		b.Integer-->String
		String string = integer2.toString();	//调用toString方法
		System.out.println(string);
		
//		3.int——String
//	​	a.int——String类型
		String s1 = a+"";		//字符串拼接
//	​	b.String——类型
		int c = Integer.parseInt(s); 	//Integer类中提供的静态的parseInt(String s);方法
		System.out.println(c);
	}
}


