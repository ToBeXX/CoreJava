package code_day12;
/*
����
*/
//��1��
abstract class Employee{
	String name;
	String id;
	public void eat(){
		System.out.println("Employee eat()");
	}
	//���󷽷�work
	public abstract void work();
}
//�̳�Employee���뽫����work����ʵ��
class Coder extends Employee{
	//work���󷽷���ʵ��
	public void work(){
		System.out.println("id:"+id+" name:"+name+" д����");
	}
}
class Teacher1 extends Employee{
	//work���󷽷���ʵ��
	public void work(){
		System.out.println("id:"+id+" name:"+name+" ����");
	}
}
class ControlComputer extends Employee{
	//work���󷽷���ʵ��
	public void work(){
		System.out.println("id:"+id+" name:"+name+" ������");
	}
}
//��2��
abstract class Super{
	abstract void m();
	abstract void m2();
}
class Sub extends Super{
	//���󷽷���ʵ��
	public void m(){
		
	}
	public void m2(){
		
	}
}
abstract class Sub1 extends Super{
	//���󷽷���ʵ��
	public void m(){
		
	}
	public void m2(){
		
	}
}
//��3��
abstract class Teacher{
	//������� teach �� add ���󷽷�
	abstract void teach();
	abstract int add(int a,int b);
}
abstract class MathTeacher extends Teacher{
	abstract void teachMath();
}
class RealMathTeacher extends MathTeacher{
	//ʵ�ָ�����������󷽷�
	public void teach(){
		
	}
	public int add(int a ,int b){
		return a+b;
	}
	public void teachMath(){
		
	}
	//�Լ����е�TeachHighMath����
	public void TeachHightMath(){
		
	}
}
class TestTeacher{
	public static void main(String[] args){
		Teacher t = new RealMathTeacher();
		int a = t.add(2,4);
		System.out.println(a);
	}
}
//��4��
abstract class Employeee{
	String name;
	String id;
	double salary;
	//������Employeee�ĳ���work����
	abstract void work();
}
class NormalEmployee extends Employeee{
	//�̳г����� ʵ�ָ���ĳ��󷽷�
	public void work(){}
}
class Manager extends Employeee{
	double extraMoney;
	//�̳г����� ʵ�ָ���ĳ��󷽷�
	public void work(){}
}
/*
������ϰ��
*/
//��1��
class MyClass{
	static int a;
	int b;
	
}
class TestMain{
	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		//��̬��������Ϊ100
		mc1.a = 100;
		//mc1�����bֵ��ֵΪ200
		mc1.b = 200;
		//��̬��������Ϊ300
		mc2.a = 300;
		//mc2��bֵ��ֵΪ400
		mc2.b = 400;
		System.out.println(mc1.a);//��ӡ300
		System.out.println(mc1.b);//��ӡ200
		System.out.println(mc2.a);//��ӡ300
		System.out.println(mc2.b);//��ӡ400
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
	//�Ǿ�̬����
	int a ;
	//��̬����
	static int b;
	//�Ǿ�̬����
	void fa(){}
	//��̬����
	static void fb(){}
	public void m1(){
		System.out.println(a);//1
		System.out.println(b);//2
		fa();//3
		fb();//4
	}
	public static void m2(){
		//�޷��Ӿ�̬�����������÷Ǿ�̬����
		System.out.println(a); //5
		System.out.println(b);//6
		//�޷��Ӿ�̬�����������÷Ǿ�̬����
		fa();//7
		fb();//8
	}
}
5��7����
ԭ���ǣ��޷��Ӿ�̬�����������÷Ǿ�̬����
*/
//��3��
class MyClass2{
	//��̬count�������๲��
	static int count = 0;
	public MyClass2(){
		count++;
		System.out.println(count);
	}
}
class TestMyClass2{
	public static void main(String[] args){
		//����һ�����󣬽�count+1,���Ϊ1
		MyClass2 mc1 = new MyClass2();
		//����һ�����󣬽�count+1,���Ϊ2
		MyClass2 mc2 = new MyClass2();
		//����һ�����󣬽�count+1,���Ϊ3
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
	//��̬��������̬�����ֻ��������ص�ʱ�����һ��
	//����ص�ʱ��̬����iֵΪ10
	static int i = 10;
	//Ȼ��̬�������ص�����������i����Ϊ20Ȼ���ӡin static
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
		//���ø��޲ι������ MyClass3
		MyClass3 mc1 = new MyClass3();
		//��ӡiֵ ��ʱiֵΪ20
		System.out.println(mc1.i);
		//�����޲����MyClass3()����ʱ��iֵ����Ϊ10
		MyClass3 mc2 = new MyClass3(10);
		//��ӡ��ʱ��iֵΪ10
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
class Superv{
	int i;
	public static void m1(){

		System.out.println("m1 in Super");
	}
	public void m2(){
		System.out.println("m2 in Super");
	}
}
class Subv extends Superv{
	public static void m1(){
		System.out.println("m1 in Sub");
	}
	public void m2(){
		System.out.println("m2 in Sub");
	}
}
class TestSuperv{
	public static void main(String[] args){
		Superv sup = new Subv();
		//��̬�������Ը��ǵ���û�ж�̬ ���Ի�������������͵ķ��������Դ�ӡ m1 in Super
		sup.m1();
		//m2���Ǿ�̬�����������ж�̬�������ǻ�����������͵ķ�������ӡ m2 in Sub
		sup.m2();
		Subv sub = (Subv)sup;
		//������ǿתΪ�������ͣ�������������m1  ��ӡm1 in Sub
		sub.m1();
		//��ӡm2 in sub
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

��̬�����ܱ�����

��̬�����ܹ�ʹ������ֱ�ӵ���

�����ڲ������κ�һ�����������µ��þ�̬����

��̬�ŷ����ﲻ����ʹ��this
*/

//��7��
/*
 ��������final���εĳ�Ա����ʱ��
 ÿ�����췽�����붼�и����Ը�ֵ����䣬
 ���ⴴ�����ʱ��ʹ��û�и�final���εĳ�Ա������ֵ�Ĺ��췽��
*/
class MyClass6{
	final int value;
	public MyClass6(){
		value =10;
	}
	public MyClass6(int value){
		this.value = value;
		/* value = 10; */
	}
}
class TestMain6{
	public static void main(String[] args){
		MyClass6 mc = new MyClass6();
		/* mc.value++; */
		/* MyClass6 mc1 = new MyClass6(20); */
		System.out.println(mc.value);
		/* System.out.println(mc1.value); */
	}
}
/*
���벻ͨ������254���޲ι��췽����Ϊ public MyClass6(){value = 10;}
*/
//��8��
class MyClass7{
	public void printValue(final int value){
		System.out.println(value);
	}
	public void changeValue(int value){
		value = value*2;
		System.out.println(value);
	}
}
class TestMain7{
	public static void main(String[] args){
		MyClass7 mc = new MyClass7();
		int value = 5;
		final int fvalue = 10;
		mc.printValue(value);    //1
		mc.printValue(fvalue);   //2
		mc.changeValue(value);   //3
		//�˴�ֻ�ǽ�fvalue��ֵ�����ֲ�����value����û�иı�fvalue��ֵ
		mc.changeValue(fvalue);  //4
		
	}
}
//����ͨ��
//��9��
class MyValue{
	int value;
}
class TestFinal{
	public static void main(String[] args){
		/*final��������ʱ��ֻ���������������ָ�����ĵ�ַ���ɱ䣬
		�ö����еĳ�Ա�������ǿ����޸ĵ�
		*/
		final MyValue mv = new MyValue();
		mv.value = 100;
		//1
		System.out.println(mv.value);
	}
}
//����ͨ���������//1������  mv = new MyValue(); ���ܱ���ͨ��
//��10��
class Super10{
	public final void m1(){
		System.out.println("m1() in Super");
	}
	public void m1(int i){
		System.out.println("m1(int) in Super");
	}
}
class Sub10 extends Super10{
	//�븸���m1��int i���������ɶ�̬
	public void m1(int i){
		System.out.println("m1(int) in Sub");
	}
	//�������m1��int i�����ɷ�������
	public void  m1(double d){
		System.out.println("m1(double) in Sub");
	}
}
class TestMain10{
	public static void main(String args[]){
		Sub10 s = new Sub10();
		//����̳и����m1�����������ӡm1���� in super
		s.m1();
		//���������m1��int i����ӡm1(int) in Sub
		s.m1(10);
		//���������m1��double i����ӡm1(double) in Sub
		s.m1(1.5);
	}
}
/*
m1() in Super
m1(int) in Sub
m1(double) in Sub
*/
//��11��
abstract class MyAbstractClass{
	public abstract void m1(); //1
	abstract protected void m2(); //2
}
class MySubClass extends MyAbstractClass{
	public void m1(){} //3
	protected void m2(){} //4
}
/*
2 3 �д�
Ӧ���޸�Ϊ;
2 ����{}ȥ��
3������public
*/
/*
��12��
A. abstract ���п���û�� abstract ����  ��
B. abstract �������Ҳ������ abstract ��   ��
C. abstract �಻�ܴ������󣬵�������������  ��
D. abstract ���������з�����  ��
*/
abstract class E{
	int a;
	String name;
	public final void m(){}
}
/*
��13��
A. abstract final void m()      ��
B. public void final m()        ��
C. static abstract void m()     ��
D. private final void m()       ��
E. private abstract void m()    ��   
F. public static final void m() �� 
*/
//��14��
abstract class Shape{
	//����Shape�����������󷽷�
	public abstract double area();
	public abstract double girth();
}
class Circle extends Shape{
	double radius;
	//�̳г����࣬����ʵ���������󷽷�
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
	//�̳г����࣬����ʵ���������󷽷�
	public double area(){
		return (length+width)*2;
	}
	public double girth(){
		return length+width;
	}
}
class Square extends Shape{
	double length;
	//�̳г����࣬����ʵ���������󷽷�
	public double area(){
		return length*length;
	}
	public double girth(){
		return length*4;
	}
}
//��15��
class MyClass4{
	//����һ����̬��count�����Դ���Ķ��������������ʼֵΪ0
	static int count = 0;
	//ʹ���޲ι��췽���������ʱ����count��1
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
		//����������֮���ӡcount�鿴�����˶��ٸ�����
		System.out.println(a5.count);
	}
}
class F{
	int a(){
		return 0;
	}
}
class EE extends F{
	int a(String n){
		return 0;
	}
	/* public double a(){
		return 0.0;
	} */
}