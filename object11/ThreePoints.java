package code_day11;
//��1��
class MyClass{
	static int a;
	int b;
	
}
class TestMain{
	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		mc1.a = 100;
		
		mc1.b = 200;
		mc2.a = 300;
		mc2.b = 400;
		System.out.println(mc1.a);
		System.out.println(mc1.b);
		System.out.println(mc2.a);
		System.out.println(mc2.b);
	}
}
/*
300
200
300
400
*/
//��2��
/*
class MyClass1{
	int a ;
	static int b;
	void fa(){}
	static void fb(){}
	public void m1(){
		System.out.println(a);//1
		System.out.println(b);//2
		fa();//3
		fb();//4
	}
	public static void m2(){
		System.out.println(a); //5
		System.out.println(b);//6
		fa();//7
		fb();//8
	}
}
5��7����
ԭ���ǣ��޷��Ӿ�̬�����������÷Ǿ�̬����
*/
class MyClass2{
	static int count = 0;
	public MyClass2(){
		count++;
		System.out.println(count);
	}
}
class TestMyClass2{
	public static void main(String[] args){
		MyClass2 mc1 = new MyClass2();
		MyClass2 mc2 = new MyClass2();
		MyClass2 mc3 = new MyClass2();
	}
}
/*
1
2
3
*/
//��4��

class MyClass3{
	static int i = 10;
	static{
		i = 20;
		System.out.println("in static");
	}
	public MyClass3(){
		System.out.println("MyClass3()");
	}
	public MyClass3(int i){
		System.out.println("MyClass3()");
		this.i = i;
	}
}
class TestMyClass3{
	public static void main(String[] args){
		MyClass3 mc1 = new MyClass3();
		System.out.println(mc1.i);
		MyClass3 mc2 = new MyClass3(10);
		System.out.println(mc2.i);
	}
}
/*
in static
MyClass3()
20
MyClass3()
10
*/

//��5��
class Super{
	int i;
	public static void m1(){

		System.out.println("m1 in Super");
	}
	public void m2(){
		System.out.println("m2 in Super");
	}
}
class Sub extends Super{
	public static void m1(){
		System.out.println("m1 in Sub");
	}
	public void m2(){
		System.out.println("m2 in Sub");
	}
}
class TestSuper{
	public static void main(String[] args){
		Super sup = new Sub();
		sup.m1();
		sup.m2();
		Sub sub = (Sub)sup;
		sub.m1();
		sub.m2();
	}
}
/*
m1 in Super
m2 in Sub
m1 in Sub
m2 in Sub
*/
//��6��
/*
��̬�����в��ܵ��÷Ǿ�̬����

��̬�������ܱ�����

��̬�����ܹ�ʹ������ֱ�ӵ���

�����ڲ������κ�һ�����������µ��þ�̬����

��̬�ŷ����ﲻ����ʹ��this
*/
//��7��
//��14��
abstract class Shape{
	public abstract double area();
	public abstract double girth();
}
class Circle extends Shape{
	double radius;
	public double area(){
		return 3.14*radius*radius;
	}
	public double girth(){
		return 3.14*2*radius;
	}
}
class Rect extends Shape{
	double length;
	double width;
	public double area(){
		return (length+width)*2;
	}
	public double girth(){
		return length+width;
	}
}
class Square extends Shape{
	double length;
	public double area(){
		return length*length;
	}
	public double girth(){
		return length*4;
	}
}
//��15��
class MyClass4{
	static int count = 0;
	public MyClass4(){
		count++;
	}
}
class TestCount{
	public static void main(String[] args){
		MyClass4 a1 = new MyClass4();
		MyClass4 a2 = new MyClass4();
		MyClass4 a3 = new MyClass4();
		MyClass4 a4 = new MyClass4();
		MyClass4 a5 = new MyClass4();
		System.out.println(a5.count);
	}
}