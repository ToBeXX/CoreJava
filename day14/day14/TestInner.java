package com.baizhi.day14;

public class TestInner {
	public static void main(String[] args) {
		//������Ա�ڲ������
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		oi.m1();
		
	}
}
class Outer{
	private int a = 10;
	int b = 20;			//�ⲿ��ĳ�Ա����
	static int c = 40;	//�ⲿ��ľ�̬����
	//��Ա�ڲ���
	class Inner{
		int b = 30;		//�ڲ���ĳ�Ա����
//		static          int d = 30;	//�ڲ����в��ܶ��徲̬��Ա
		public void m1(){
			System.out.println(a);
			System.out.println(this.b);		//30
			System.out.println(Outer.this.b);		//20  --->�ⲿ��ĳ�Ա����
			System.out.println(Outer.this.c);		//40
		}
		/*public static void m2(){
			
		}*/
	}	
}
