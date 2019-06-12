package com.baizhi.day15;

public class TestObject {
	public static void main(String[] args) {
		//o是Object类型的引用
		Object o;
		o = new Student();
		Object o1 = new Person();
		
		Student student = new Student();
		System.out.println(student);
		System.out.println(student.hashCode());
		System.out.println(student.hashCode());//获取对象地址的整数表现形式（哈希值）
		
		System.out.println(o.getClass());
		System.out.println(o1.getClass());
		
		
	}
}
class Person{}
class Student extends Person{}
