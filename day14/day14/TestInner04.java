package com.baizhi.day14;

public class TestInner04 {
	public static void main(String[] args) {
		//���������ڲ���,�����ڲ���ʵ����IA�ӿ�  ����ʵ�ֽӿ��е����з���
		IA ia = new IA(){
			public void m1(){
				System.out.println("m1.11111....");
			}
		};
		m2(ia);
		
		m2(new IA(){
			public void m1(){
				System.out.println("m2 ...22222");
			}
		});
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
	}
	public static void m2(IA ia){
		ia.m1();
	}
}
interface IA{
	void m1();
}
