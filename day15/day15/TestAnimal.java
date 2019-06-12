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
	//��дequlas����
	public boolean equals(Object o){
//		1.�Ƚ������Ƿ�Ϊͬһ����
		if(this==o) return true;
//		2.�ǿ��ж� �ж�o�Ƿ�Ϊnull
		if(o==null) return false;
//		3.�ж�����(this��o)�����Ƿ�һ��
		if(this.getClass()!=o.getClass()) return false;
//		4.ǿ������ת��
		Animal a = (Animal)o;
//		5.�Ƚ�����ֵ�Ƿ���ͬ
		if(this.age==a.age && this.sex == a.sex 
				&& this.name.equals(a.name)){
			return true;
		}
		return false;
	}
}
class Dog extends Animal{}
class Cat extends Animal{}
