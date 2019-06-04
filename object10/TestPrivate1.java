package code_day10;
//��1��
class AirCondition{
	private String name;
	private int price;
	public void setName(String name){
		this.name = name;
	}
	public void getName(){
		System.out.println("�յ���Ʒ���ǣ�"+name);
	}
	public void setPrice(int price){
		this.price = price;
	}
	public void getPrice(){
		System.out.println("�յ��ļ۸��ǣ�"+price);
	}
	public void powerOn(){
		System.out.println("����");
	}
	public void poweOff(int minute){
		System.out.println("�յ�����"+minute+"���Ӻ��Զ��ر�");
	}
}
class TestAirCondition{
	public static void main(String[] args){
		AirCondition a = new AirCondition();
		a.setName("����");
		a.setPrice(2800);
		a.getName();
		a.getPrice();
		a.powerOn();
		a.poweOff(18);
	}
}
//�ڶ���
class User{
	private String name;
	private int passWorld;
	private boolean isOnline;
	public User(){}
	public User(String name, int passWorld,boolean isOnline){
		this.name = name;
		this.passWorld = passWorld;
		this.isOnline = isOnline;
	}
	public boolean getIsOnline(){
		return isOnline;
	}
}
class TestUser{
	public static void main(String[] args){
		User[] user = new User[3] ;
		user[0] = new User("haha",123456,true);
		user[1] = new User("hehe",234567,false);
		user[2] = new User("xixi",245634,true);
		int count = 0;
		for(int i = 0;i<user.length;i++){
			if(user[i].getIsOnline() == true){
				count+=1;
			}
		}
		System.out.println("��������Ϊ��"+count);
	}
}
//��3��
class Employee1{
	private String name ;
	private int birthday;
	private double salary;
	public Employee1(){}
	public Employee1(String name,int birthday,double salary){
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
	}
	public void setName(String name){
		this.name = name;
	}
	public void getName(){
		System.out.println(name);
	}
	public void setBirthday(int birthday){
		this.birthday = birthday;
	}
	public void getBirthday(){
		System.out.println(birthday);
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void getSalary(){
		System.out.println(salary);
	}
	public void show(){
		System.out.println("���֣�"+name+"����"+birthday+"����"+salary);
	}
}
class TestEmployee{
	public static void main(String[] args){
		Employee1[] a = new Employee1[3];
		a[0] = new Employee1("haha",123456,3000.0);
		a[1] = new Employee1("hehe",234567,5800.0);
		a[2] = new Employee1("xixi",245634,12000.0);
		for(int i = 0;i<a.length;i++){
			a[i].show();
		}
	}
}
//ʾ������
class Animala{  
	String name;
	int age;
	public void eat(){
		System.out.println("animal eat");
	}
	public void sleep(){
		System.out.println("animal sleep");
	}
}
class Dog1 extends Animala{
	public void eat(){
		System.out.println("���Թ�ͷ");
	}
	public void eat(String food){
		System.out.println("����"+food);
	}
	public void swim(){
		System.out.println("��Ӿ");
	}
}
class Cat1 extends Animala{
	public void eat(){
		System.out.println("è����");
	}
	public void climbTree(){
		System.out.println("����");
	}
}
class bird1 extends Animala{
	public void eat(){
		System.out.println("��Գ�");
	}
	public void fly(){
		System.out.println("����");
	}
}
class TestExtends{ 
	public static void main(String[] args){
		Dog1 d = new Dog1();
		d.name = "������";
		d.age = 1;
		d.eat();
		d.eat("ʺ");
		d.sleep();
		d.swim();
		
	}
}
/*
��ҵ��   Day09 �������-��װ�̳�
*/
//��1��
class Super{
	public Super(){
		System.out.println("Super()");
	}
	public Super(String str){
		System.out.println("Super(String)");
	}
}
class Sub extends Super{
	public Sub(){
		System.out.println("Sub()");
	}
	public Sub(int i){
		System.out.println("Sub(int)");
	}
	public Sub(String str){
		super(str);
		System.out.println("Sub(String)");
	}
}
class TestSuperSub{
	public static void main(String[] args){
		Sub s1 = new Sub();
		Sub s2 = new Sub(10);
		Sub s3 = new Sub("hello");
	}
}
/*
������Ϊ
Super()
Sub()
Super()
Sub(int)
Super(String)
Sub(String)
*/
//��2��
class Super1{
	public void m1(){
		System.out.println("m1() in Super" );
	}
	public void m2(){
		System.out.println("m2() in Super" );
	}
}
class Sub1 extends Super1{
	public void m1(){
		System.out.println("m1() in Sub");
		super.m1();
	}
}
class TestSuperSub1{
	public static void main(String args[]){
		Sub1 s = new Sub1();
		s.m1();
		s.m2();
	}
}
/*
��ӡ���Ϊ
m1() in Sub
m1() in Super
m2() in Super
*/

//��3��
class Animal{
	String name;
	public void eat(){
		System.out.println(name+" animal eat()");
	}
	public void sleep(){
		System.out.println(name+" animal sleep()");
	}
	public Animal(){}
	public Animal(String name){
		this.name = name;
	}
}
class TestAnimal{
	public static void main(String[] args){
		Animal a = new Animal("����");
		a.eat();
		a.sleep();
	}
}
//��4��
class Dog extends Animal{
	public Dog(){
		super("Dog");
	}
	public void run(){
		System.out.println("Dog run");
	}
	public void shout(){
		System.out.println("Dog shout");
	}
	public void sleep(){
		System.out.println(name +" Dog sleep");
	}
	public void swim(){
		System.out.println(name+" Dog swim");
	}
}
class TestDogExtendsAnimal{
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.sleep();
		dog.swim(); 
	}
}
//��5��
class Cat extends Animal{
	public Cat(){
		super("xiaomaomi");
	}
	public void climb(){
		System.out.println("cat climb");
	}
	public void shout(){
		System.out.println("cat shout");
	}
	public void sleep(){
		System.out.println(name +" cat sleep");
	}
}
class TestCatExtendsAnimal{
	public static void main(String[] args){
		Cat cat = new Cat();
		cat.sleep();
		cat.climb(); 
	}
}
//��6��
class MyClass{
	private int value;
	public MyClass(){}
	MyClass(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
}
class TestMyClass1{
	public static void main(String args[]){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(10);
		/*
		���� �������в��ܷ������˽������
		System.out.println(mc1.value);
		System.out.println(mc2.value);
		*/
		//�޸�Ϊ
		System.out.println(mc1.getValue());
		System.out.println(mc2.getValue());
	}
}
class TestMyClass2{
	public static void main(String args[]){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(10);
		/*
		���� �������в��ܷ������˽������
		System.out.println(mc1.value);
		System.out.println(mc2.value);
		*/
		//�޸�Ϊ
		System.out.println(mc1.getValue());
		System.out.println(mc2.getValue());
	}
}
/*
��7��
//MyClass.java
//package corejava.chp7;
class MyClass{
	int value;
}
//MySubClass.java
//import corejava.chp7.MyClass;
public class MySubClass extends MyClass{
	public MySubClass(int value){
		this.value = value;
	}
}
//���벻��ͨ��   Ӧ�ø�Ϊ  super.value = vlaue;
*/
//��8��
class Meal{
	public Meal(){
		System.out.println("Meal()");
	}
}
class Lunch extends Meal{
	public Lunch(){
		System.out.println("Lunch()");
	}
}
class Vegetable {
	public Vegetable(){
		System.out.println("Vegetable()");
	}
}
class Potato extends Vegetable{
	public Potato(){
		System.out.println("Potato()");
	}
}
class Tomato extends Vegetable{
	public Tomato(){
		System.out.println("Tomato()");
	}
}
class Meat{
	public Meat(){
		System.out.println("Meat()");
	}
}
class Sandwich extends Lunch{
	Potato p = new Potato();
	Meat m = new Meat();
	Tomato t = new Tomato();
	public Sandwich(){
		System.out.println("Sandwich()");
	}
}
class TestSandwich{
	public static void main(String args[]){
		Sandwich s = new Sandwich();
	}
}
/*
���н������
Meal()
Lunch()
Vegetable()
Potato()
Meat()
Vegetable()
Tomato()
Sandwich()
*/
//��9��
class Super2{
	public Super2(){}
	public Super2(String str){
		 
	 }
}
class Sub2 extends Super2{
	public Sub2(){}
	public Sub2(String str){
		super(str);
	}
}
/*
�ڸ���������вκ��޲εĹ��췽��
public Super2(){}
	public Super2(String str){
		 
	 }
*/
//��10�� 
class Super3{
	int method(){
		return 0;
	}
}
class Sub3 extends Super3{
	// 1
	public int method(){return 0;}  /*��ȷ*/
	/* void method(){}   ����*/
	/* void method(int n){}  ����*/
}
//��11��
class Super4{
	private void method(){}
}
class Sub4 extends Super4{
	//1
	/* void method(){}
	private void method(){}
	public int method(){return 0;}
	void method(int n){} */
}
//ȫ���ܹ�����ͨ��
//��12��
/*
this ָ���ǵ�ǰ����
super ָ���ǵ�ǰ����ĸ���
*/
//��13��
class Instrument{
	public void play(){
		System.out.println("��������");
	}
}
class Wind extends Instrument{
	public void play(){
		System.out.println("����Wind");
	}
	public void playWind(){
		System.out.println("����wind��play2����");
	}
}
class Brass extends Instrument{
	public void play(){
		System.out.println("����Brass");
	}
	public void playBrass(){
		System.out.println("����Brass��play2����");
	}
}
//��14��
class Shape{
	public double area(){
		return 0.0;
	}
	public double girth(){
		return 0.0;
	}
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
class Employee{
	private String name;
	private int month;
	public Employee(){}
	public int getMonth(){
		return month;
	}
	public Employee(String name,int month){
		this.name = name;
		this.month = month;
	}
	public double getSalary(int month){
		if(this.month == month){
			return 100.0;
		}
		else return 0.0;
	}	
}
class SalarieEmployee extends Employee{
	private double monthSalary;
	public SalarieEmployee(){}
	public SalarieEmployee(String name, int month,double monthSalary){
		super(name,month);
		this.monthSalary = monthSalary;
	}
	public double getSalary(int month){
		if(getMonth() == month){
			return monthSalary+super.getSalary(month);
		}
		else return monthSalary;
	}
}
class HourlyEmploree extends Employee{
	private double hourSalary;
	private int hours;
	public HourlyEmploree(){}
	public HourlyEmploree(String name,int month,double hourSalary,int hours){
		super(name,month);
		this.hourSalary = hourSalary;
		this.hours = hours;
	}
	public double getSalary(int month){
		if(super.getMonth() == month){
			return hourSalary*hours+super.getSalary(month);
		}
		else return hourSalary*hours;
	}
}
class SalesEmployee extends Employee{
	private double saleMoney;
	private double extraMoney;
	public SalesEmployee(){}
	public SalesEmployee(String name,int month,double saleMoney,double extraMoney){
		super(name,month);
		this.saleMoney = saleMoney;
		this.extraMoney = extraMoney;
	}
	public double getSalary(int month){
		if(super.getMonth() == month){
			return (saleMoney+saleMoney*extraMoney+super.getSalary(month));
		}
		else return saleMoney+saleMoney*extraMoney;
	}
	public int getMonth(){
		return super.getMonth();
	}
	public double getSaleMoney(){
		return saleMoney;
	}
}
class BasePlusSalesEmployee extends SalesEmployee{
	private double baseMoney;
	public BasePlusSalesEmployee(){}
	public BasePlusSalesEmployee(String name,int month,double saleMoney,double extraMoney,double baseMoney){
		super(name ,month,saleMoney,extraMoney);
		this.baseMoney = baseMoney;
	}
	public double getSalary(int month){
		return baseMoney+super.getSalary(month)-super.getSaleMoney();
	}
}
class TestSalary{
	public static void main(String[] args){
		BasePlusSalesEmployee base = new BasePlusSalesEmployee("����",5,3000.0,0.1,5000.0);
		System.out.println(base.getSalary(5));
		SalarieEmployee salaried = new SalarieEmployee("mgx",7,4000);
		System.out.println(salaried.getSalary(7));
	}
}
//��16��
/*
Java�ǣ�_��������|�ࣩ�̳е����ԣ����ùؼ��֣�extends������2�����ļ̳й�ϵ������
�͸���������㣨_is a _��(is a | like a | has a)�Ĺ�ϵ
*/
//��17��
/*
private �����ڲ����Է��� �����Ա��̳�
default ����+ͬ��  ͬ��������Ա��̳�
protected ����+ͬ��+����  ͬ������Ͳ�ͬ��������Լ̳�
public   ����     ���Լ̳�
*/
//��19��
class Student{
	private String name;
	private int age;
	private String degree;
	public Student(){}
	public Student(String name,int age,String degree){
		this.name = name;
		this.age = age;
		this.degree = degree;
	}
	public void show(){
		System.out.println("���֣� "+name);
		System.out.println("���䣺 "+age);
		System.out.println("ѧλ�� "+degree);
	}
}
class UnderGraduate extends Student{
	private String specialty;
	public UnderGraduate(){}
	public UnderGraduate(String name,int age,String degree,String specialty){
		super(name,age,degree);
		this.specialty = specialty;
	}
	public void show(){
		super.show();
		System.out.println("רҵ�� "+specialty);
	}
}
class Graduate extends Student{
	private String studyDrection;
	public Graduate(){}
	public Graduate(String name,int age,String degree,String studyDrection){
		super(name,age,degree);
		this.studyDrection = studyDrection;
	}
	public void show(){
		super.show();
		System.out.println("�о�����: "+studyDrection);
	}
}
class TestStudent{
	public static void main(String[] args){
		UnderGraduate a = new UnderGraduate("����",23,"����","��ҵ�Զ���");
		a.show();
		System.out.println("=======================");
		Graduate b = new Graduate("����",27,"˶ʿ","���缼��");
		b.show();
	}
}