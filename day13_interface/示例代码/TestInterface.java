package day13;
class TestInterface{
	public static void main(String[] args){
		// ClassA a = new ClassA();	//error
		// ClassA a;
		
		// MyInter mi = new MyInter();  //error 
		// MyInter mi;
		
		System.out.println(ClassA.b);	//20
		System.out.println(MyInter.b);	//30
		System.out.println(MyInter.a);	//40
		// MyInter.a = 50;  error
		// MyInter.b = 50;
		
	}
}
//����ĳ�����
abstract class ClassA{
	int a=10;
	static int b = 20;
	public ClassA(){}
	public void m1(){}
	public abstract void m2();
}
//�ӿ� interface
interface MyInter{
	int a = 40;    				//Ĭ��Ϊ  public static final int a = 40;
	static int b = 30;
	// public MyInter(){}   	error  �����й��췽��
	// public void m1(){}		// Ĭ�϶���public abstract void m1();
	public abstract void m2();
}











