package day12;
class TestStatic{
	public static void main(String[] args){
		/*
		MyClass mc1 = new MyClass();
		mc1.value = 20;
		System.out.println(mc1.value);	//20
		
		MyClass mc2 = new MyClass();
		System.out.println(mc2.value);	//10
		
		mc1.a = 30;
		System.out.println(mc1.a);	//30
		System.out.println(mc2.a);	//30 
		*/
		
		System.out.println(MyClass.a);
		MyClass.m1();
		
		/* MyClass mc = new MyClass();
		mc.m2(); */
		
		MyClass mc = new A();		//多态
		mc.m1();
		
		System.out.println("....");
		//System  :类名 
		//out     :静态属性  ----> 对象类型的属性
		//println(): 方法
	}

}
class MyClass{
	int value = 10;
	static int a = 20;  //a 是一个静态属性
	
	public void m2(){
		System.out.println(a);
		m1();
	}
	public static void m1(){
		// m2();		//静态方法中访问非静态成员  --》编译报错
		// System.out.println(value);
		// System.out.println(this.a);  
		System.out.println("m1()....");
	}
}
class A extends MyClass{
	public static void m1(){
		System.out.println("m2()....");
	}
}