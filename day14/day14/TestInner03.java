package com.baizhi.day14;

public class TestInner03 {
	public static void main(String[] args) {
		//���������ڲ��࣬���Ҵ��������ڲ������,�����ڲ�����Person�������
		Person p = new Person(){
			//�����ڵ����ݾ��������ڲ��������
			public void m1(){
				System.out.println("�����ڲ����m1����");
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


