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
		// ����һ���ֲ��ڲ���
		class Inner02 {
			public void m2(){
				System.out.println("�ֲ��ڲ����m1����������");
				System.out.println(a);
				System.out.println(b);
			}
		}
		// �����ֲ��ڲ������
		Inner02 i = new Inner02();
		i.m2();
	}
}
