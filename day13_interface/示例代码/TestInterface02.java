package day13;
class TestInterface02{
	public static void main(String[] args){
		/* MyClass01 mc = new MyClass01();
		System.out.println(mc instanceof IA);
		System.out.println(mc instanceof IB);
		System.out.println(mc instanceof IC);
		System.out.println(mc instanceof ID); */
		
		/* IA ia = new MyClass01();
		ia.m1();
		ia.m2();
		// ia.m3();  //error
		IB ib = new MyClass01();
		ib.m3();
		
		IC ic = new MyClass01();
		ic.m4();
		
		ID id = new MyClass01();
		id.m5();
		
		
		ClassB cb = new MyClass01();
		cb.m6(); */
		
		/* IA ia = new MyClass01();
		if(ia instanceof IB){		//true
			System.out.println("=---------");
			IB ib =(IB)ia;
			ib.m3();
		}
		
		IC ic = (IC)ia;
		ic.m4();
		
		ID id = (ID)ia;
		id.m5();
		
		ClassB cb = (ClassB)ia;
		cb.m6(); */
		
		ClassB mc = new ClassB();
		IA ia  = (IA)mc;
		
		
	}
}
interface IA{
	void m1();
	void m2();
}
interface IB{
	void m3();
}
interface IC extends IA,IB{
	void m4();
}
interface ID {
	void m5();
}
class ClassB{
	public void m6(){
		
	}
}
class MyClass01 extends ClassB implements IC,ID {
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
	
}










