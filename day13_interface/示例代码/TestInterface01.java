package day13;
class TestInterface01{
	public static void main(String[] args){
		MyInter01 mi = new MyClass();	//多态的应用
		mi.m1();
		mi.m2();
	}
}
//接口
interface MyInter01{
	//方法是默认公开抽象方法
	void m1();
	void m2();
}
//实现类   implements
//MyClass 实现了 MyInter01接口
class MyClass implements MyInter01{
	public void m1(){
		System.out.println("hello");
	}
	public void m2(){
		System.out.println("world");
	}
}










