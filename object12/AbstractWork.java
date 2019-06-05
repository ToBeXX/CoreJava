package code_day12;
/*
中午
*/
//第1题
abstract class Employee{
	String name;
	String id;
	public void eat(){
		System.out.println("Employee eat()");
	}
	//抽象方法work
	public abstract void work();
}
//继承Employee必须将抽象work方法实现
class Coder extends Employee{
	//work抽象方法的实现
	public void work(){
		System.out.println("id:"+id+" name:"+name+" 写代码");
	}
}
class Teacher1 extends Employee{
	//work抽象方法的实现
	public void work(){
		System.out.println("id:"+id+" name:"+name+" 讲课");
	}
}
class ControlComputer extends Employee{
	//work抽象方法的实现
	public void work(){
		System.out.println("id:"+id+" name:"+name+" 拉网线");
	}
}
//第2题
abstract class Super{
	abstract void m();
	abstract void m2();
}
class Sub extends Super{
	//抽象方法的实现
	public void m(){
		
	}
	public void m2(){
		
	}
}
abstract class Sub1 extends Super{
	//抽象方法的实现
	public void m(){
		
	}
	public void m2(){
		
	}
}
//第3题
abstract class Teacher{
	//抽象类的 teach 和 add 抽象方法
	abstract void teach();
	abstract int add(int a,int b);
}
abstract class MathTeacher extends Teacher{
	abstract void teachMath();
}
class RealMathTeacher extends MathTeacher{
	//实现父类的三个抽象方法
	public void teach(){
		
	}
	public int add(int a ,int b){
		return a+b;
	}
	public void teachMath(){
		
	}
	//自己独有的TeachHighMath方法
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
//第4题
abstract class Employeee{
	String name;
	String id;
	double salary;
	//抽象类Employeee的抽象work方法
	abstract void work();
}
class NormalEmployee extends Employeee{
	//继承抽象类 实现父类的抽象方法
	public void work(){}
}
class Manager extends Employeee{
	double extraMoney;
	//继承抽象类 实现父类的抽象方法
	public void work(){}
}
/*
晚上练习题
*/
//第1题
class MyClass{
	static int a;
	int b;
	
}
class TestMain{
	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		//静态变量更改为100
		mc1.a = 100;
		//mc1对象的b值赋值为200
		mc1.b = 200;
		//静态变量更改为300
		mc2.a = 300;
		//mc2的b值赋值为400
		mc2.b = 400;
		System.out.println(mc1.a);//打印300
		System.out.println(mc1.b);//打印200
		System.out.println(mc2.a);//打印300
		System.out.println(mc2.b);//打印400
	}
}
/*
300
200
300
400
*/
//第2题
/*
class MyClass1{
	//非静态变量
	int a ;
	//静态变量
	static int b;
	//非静态方法
	void fa(){}
	//静态方法
	static void fb(){}
	public void m1(){
		System.out.println(a);//1
		System.out.println(b);//2
		fa();//3
		fb();//4
	}
	public static void m2(){
		//无法从静态上下文中引用非静态变量
		System.out.println(a); //5
		System.out.println(b);//6
		//无法从静态上下文中引用非静态变量
		fa();//7
		fb();//8
	}
}
5、7报错
原因是：无法从静态上下文中引用非静态变量
*/
//第3题
class MyClass2{
	//静态count，所有类共有
	static int count = 0;
	public MyClass2(){
		count++;
		System.out.println(count);
	}
}
class TestMyClass2{
	public static void main(String[] args){
		//创建一个对象，将count+1,输出为1
		MyClass2 mc1 = new MyClass2();
		//创建一个对象，将count+1,输出为2
		MyClass2 mc2 = new MyClass2();
		//创建一个对象，将count+1,输出为3
		MyClass2 mc3 = new MyClass2();
	}
}
/*
1
2
3
*/

//第4题
class MyClass3{
	//静态变量跟静态代码块只有在类加载的时候加载一次
	//类加载的时候静态变量i值为10
	static int i = 10;
	//然后静态代码块加载到工作区，将i更改为20然后打印in static
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
		//调用该无参构造输出 MyClass3
		MyClass3 mc1 = new MyClass3();
		//打印i值 此时i值为20
		System.out.println(mc1.i);
		//调用无参输出MyClass3()，此时将i值更改为10
		MyClass3 mc2 = new MyClass3(10);
		//打印此时的i值为10
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
//第5题
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
		//静态方法可以覆盖但是没有多态 所以会调用其引用类型的方法，所以打印 m1 in Super
		sup.m1();
		//m2不是静态方法，所以有多态，调用是会找其对象类型的方法，打印 m2 in Sub
		sup.m2();
		Subv sub = (Subv)sup;
		//将对象强转为子类类型，会调用其子类的m1  打印m1 in Sub
		sub.m1();
		//打印m2 in sub
		sub.m2();
	}
}
/*
m1 in Super
m2 in Sub
m1 in Sub
m2 in Sub
*/

//第6题
/*
静态方法中不能调用非静态方法

静态方法能被覆盖

静态方法能够使用类名直接调用

可以在不产生任何一个对象的情况下调用静态方法

静态放方法里不可以使用this
*/

//第7题
/*
 当类中有final修饰的成员变量时，
 每个构造方法必须都有给属性赋值的语句，
 避免创造对象时误使用没有给final修饰的成员变量赋值的构造方法
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
编译不通过，把254的无参构造方法改为 public MyClass6(){value = 10;}
*/
//第8题
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
		//此处只是将fvalue的值传给局部变量value，并没有改变fvalue的值
		mc.changeValue(fvalue);  //4
		
	}
}
//编译通过
//第9题
class MyValue{
	int value;
}
class TestFinal{
	public static void main(String[] args){
		/*final修饰引用时，只是让引用中所存的指向对象的地址不可变，
		该对象中的成员变量还是可以修改的
		*/
		final MyValue mv = new MyValue();
		mv.value = 100;
		//1
		System.out.println(mv.value);
	}
}
//编译通过，如果在//1处加上  mv = new MyValue(); 则不能编译通过
//第10题
class Super10{
	public final void m1(){
		System.out.println("m1() in Super");
	}
	public void m1(int i){
		System.out.println("m1(int) in Super");
	}
}
class Sub10 extends Super10{
	//与父类的m1（int i）方法构成多态
	public void m1(int i){
		System.out.println("m1(int) in Sub");
	}
	//与子类的m1（int i）构成方法重载
	public void  m1(double d){
		System.out.println("m1(double) in Sub");
	}
}
class TestMain10{
	public static void main(String args[]){
		Sub10 s = new Sub10();
		//子类继承父类的m1方法，将会打印m1（） in super
		s.m1();
		//调用子类的m1（int i）打印m1(int) in Sub
		s.m1(10);
		//调用子类的m1（double i）打印m1(double) in Sub
		s.m1(1.5);
	}
}
/*
m1() in Super
m1(int) in Sub
m1(double) in Sub
*/
//第11题
abstract class MyAbstractClass{
	public abstract void m1(); //1
	abstract protected void m2(); //2
}
class MySubClass extends MyAbstractClass{
	public void m1(){} //3
	protected void m2(){} //4
}
/*
2 3 有错
应该修改为;
2 处将{}去掉
3处加上public
*/
/*
第12题
A. abstract 类中可以没有 abstract 方法  √
B. abstract 类的子类也可以是 abstract 类   √
C. abstract 类不能创建对象，但可以声明引用  √
D. abstract 方法不能有方法体  ×
*/
abstract class E{
	int a;
	String name;
	public final void m(){}
}
/*
第13题
A. abstract final void m()      ×
B. public void final m()        ×
C. static abstract void m()     ×
D. private final void m()       √
E. private abstract void m()    ×   
F. public static final void m() √ 
*/
//第14题
abstract class Shape{
	//抽象Shape类有两个抽象方法
	public abstract double area();
	public abstract double girth();
}
class Circle extends Shape{
	double radius;
	//继承抽象父类，必须实现两个抽象方法
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
	//继承抽象父类，必须实现两个抽象方法
	public double area(){
		return (length+width)*2;
	}
	public double girth(){
		return length+width;
	}
}
class Square extends Shape{
	double length;
	//继承抽象父类，必须实现两个抽象方法
	public double area(){
		return length*length;
	}
	public double girth(){
		return length*4;
	}
}
//第15题
class MyClass4{
	//定义一个静态的count用来对创造的对象个数计数，初始值为0
	static int count = 0;
	//使用无参构造方法创造对象时就让count加1
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
		//创造多个对象之后打印count查看创造了多少个对象
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