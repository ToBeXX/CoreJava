package com.baizhi.day14;

public class TestInner01 {
	public static void main(String[] args) {
		//������̬�ڲ������
		Outer01.Inner01 oi = new Outer01.Inner01();
		oi.inner_method();
		System.out.println(Outer01.Inner01.b);
	}
}
class Outer01{
	static int a;
	int c = 20;
	//��̬�ڲ���
	static class Inner01{
		static int b = 20;
		public void inner_method(){
			System.out.println("��̬�ڲ���ĳ�Ա������������");
//			System.out.println(c);		//��̬�ڲ����в��ܷ����ⲿ��ķǾ�̬��Ա
		}
	}
}
