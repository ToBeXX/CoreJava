package day13;
class TestInterface01{
	public static void main(String[] args){
		MyInter01 mi = new MyClass();	//��̬��Ӧ��
		mi.m1();
		mi.m2();
	}
}
//�ӿ�
interface MyInter01{
	//������Ĭ�Ϲ������󷽷�
	void m1();
	void m2();
}
//ʵ����   implements
//MyClass ʵ���� MyInter01�ӿ�
class MyClass implements MyInter01{
	public void m1(){
		System.out.println("hello");
	}
	public void m2(){
		System.out.println("world");
	}
}










