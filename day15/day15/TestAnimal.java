package com.baizhi.day15;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		System.out.println(a1.getClass());
		System.out.println(a2.getClass());
		System.out.println(a1.getClass() == a2.getClass());//false
		
		
		Animal a3 = new Animal("Dog1",10,true);
		Animal a4 = new Animal("Dog2",1,false);
		System.out.println(a3);  //Dog1
		System.out.println(a4);			
		
		
	}
}
class Animal{
	String name;
	int age;
	boolean sex;
	public Animal() {
		super();
	}
	public Animal(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String toString(){
		return name+"\t"+age+"\t"+sex;
	}
	//重写equlas方法
	public boolean equals(Object o){
//		1.比较两者是否为同一对象
		if(this==o) return true;
//		2.非空判断 判断o是否为null
		if(o==null) return false;
//		3.判断两者(this和o)类型是否一致
		if(this.getClass()!=o.getClass()) return false;
//		4.强制类型转换
		Animal a = (Animal)o;
//		5.比较属性值是否相同
		if(this.age==a.age && this.sex == a.sex 
				&& this.name.equals(a.name)){
			return true;
		}
		return false;
	}
}
class Dog extends Animal{}
class Cat extends Animal{}
