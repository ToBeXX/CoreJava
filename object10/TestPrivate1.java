package code_day10;
//第1题
class AirCondition{
	private String name;
	private int price;
	public void setName(String name){
		this.name = name;
	}
	public void getName(){
		System.out.println("空调的品牌是："+name);
	}
	public void setPrice(int price){
		this.price = price;
	}
	public void getPrice(){
		System.out.println("空调的价格是："+price);
	}
	public void powerOn(){
		System.out.println("开机");
	}
	public void poweOff(int minute){
		System.out.println("空调将在"+minute+"分钟后自动关闭");
	}
}
class TestAirCondition{
	public static void main(String[] args){
		AirCondition a = new AirCondition();
		a.setName("格力");
		a.setPrice(2800);
		a.getName();
		a.getPrice();
		a.powerOn();
		a.poweOff(18);
	}
}
//第二题
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
		System.out.println("在线人数为："+count);
	}
}
//第3题
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
		System.out.println("名字："+name+"生日"+birthday+"工资"+salary);
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
//示例代码
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
		System.out.println("狗吃骨头");
	}
	public void eat(String food){
		System.out.println("狗吃"+food);
	}
	public void swim(){
		System.out.println("游泳");
	}
}
class Cat1 extends Animala{
	public void eat(){
		System.out.println("猫吃鱼");
	}
	public void climbTree(){
		System.out.println("爬树");
	}
}
class bird1 extends Animala{
	public void eat(){
		System.out.println("鸟吃虫");
	}
	public void fly(){
		System.out.println("飞翔");
	}
}
class TestExtends{ 
	public static void main(String[] args){
		Dog1 d = new Dog1();
		d.name = "二狗子";
		d.age = 1;
		d.eat();
		d.eat("屎");
		d.sleep();
		d.swim();
		
	}
}
/*
作业题   Day09 面向对象-封装继承
*/
//第1题
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
输出结果为
Super()
Sub()
Super()
Sub(int)
Super(String)
Sub(String)
*/
//第2题
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
打印结果为
m1() in Sub
m1() in Super
m2() in Super
*/

//第3题
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
		Animal a = new Animal("二哈");
		a.eat();
		a.sleep();
	}
}
//第4题
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
//第5题
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
//第6题
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
		错误 主函数中不能访问类的私有属性
		System.out.println(mc1.value);
		System.out.println(mc2.value);
		*/
		//修改为
		System.out.println(mc1.getValue());
		System.out.println(mc2.getValue());
	}
}
class TestMyClass2{
	public static void main(String args[]){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(10);
		/*
		错误 主函数中不能访问类的私有属性
		System.out.println(mc1.value);
		System.out.println(mc2.value);
		*/
		//修改为
		System.out.println(mc1.getValue());
		System.out.println(mc2.getValue());
	}
}
/*
第7题
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
//编译不能通过   应该改为  super.value = vlaue;
*/
//第8题
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
运行结果如下
Meal()
Lunch()
Vegetable()
Potato()
Meat()
Vegetable()
Tomato()
Sandwich()
*/
//第9题
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
在父类中添加有参和无参的构造方法
public Super2(){}
	public Super2(String str){
		 
	 }
*/
//第10题 
class Super3{
	int method(){
		return 0;
	}
}
class Sub3 extends Super3{
	// 1
	public int method(){return 0;}  /*正确*/
	/* void method(){}   错误*/
	/* void method(int n){}  错误*/
}
//第11题
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
//全部能够编译通过
//第12题
/*
this 指的是当前对象
super 指的是当前对象的父类
*/
//第13题
class Instrument{
	public void play(){
		System.out.println("弹奏乐器");
	}
}
class Wind extends Instrument{
	public void play(){
		System.out.println("弹奏Wind");
	}
	public void playWind(){
		System.out.println("调用wind的play2方法");
	}
}
class Brass extends Instrument{
	public void play(){
		System.out.println("弹奏Brass");
	}
	public void playBrass(){
		System.out.println("调用Brass的play2方法");
	}
}
//第14题
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
//第15题
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
		BasePlusSalesEmployee base = new BasePlusSalesEmployee("马耿旭",5,3000.0,0.1,5000.0);
		System.out.println(base.getSalary(5));
		SalarieEmployee salaried = new SalarieEmployee("mgx",7,4000);
		System.out.println(salaried.getSalary(7));
	}
}
//第16题
/*
Java是（_单）（单|多）继承的语言，适用关键字（extends）定义2个类间的继承关系，子类
和父类必须满足（_is a _）(is a | like a | has a)的关系
*/
//第17题
/*
private 本类内部可以访问 不可以被继承
default 本类+同包  同包子类可以被继承
protected 本类+同包+子类  同包子类和不同包子类可以继承
public   公开     可以继承
*/
//第19题
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
		System.out.println("名字： "+name);
		System.out.println("年龄： "+age);
		System.out.println("学位： "+degree);
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
		System.out.println("专业： "+specialty);
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
		System.out.println("研究方向: "+studyDrection);
	}
}
class TestStudent{
	public static void main(String[] args){
		UnderGraduate a = new UnderGraduate("王军",23,"本科","工业自动化");
		a.show();
		System.out.println("=======================");
		Graduate b = new Graduate("刘君",27,"硕士","网络技术");
		b.show();
	}
}