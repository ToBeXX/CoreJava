package day12;
class TestFinal{
	public static void main(String[] args){
		/* final int a = 0;	//被final修饰的局部变量
		// a = 10;  //一旦赋值  不允许改变
		System.out.println(a); */
		// B b = new B();
		// b.a = 10;  //error
		/* System.out.println(b.a);
		System.out.println(B.b);	 */
		
		final int a = 10;
		// a = 11;
		
		/* final C c = new C();
		// c = new C();
		c.b = 20;
		c.b = 30; */
		
		C c = new C();
		c.m1();
		
		
	}
}
class B{
	final int a=20;				//常量
	final static int b;			//静态常量
	static {
		b=40;
	}
	public B(){}
	public final void m1(){
		
	}
	
}
class C extends B{
	int b;
	/* public final void m1(){
		
	} */ //error  不允许被覆盖
	
}