package code_day11;
import java.util.*;
//第1题
interface IA1{
	void m1();
	int a = 100;
}
class MyClass implements IA1{
	//添加public 因为接口中的方法默认为公开抽象的
	public void m1(){}  
}
class TestInterface{
	public static void main(String[] args){
		IA1 ia = new MyClass();
		ia.m1();
		//打印出100，因为接口中的属性，默认为公开静态常量
		System.out.println(IA1.a);
	}
}
//第2题
interface IA2{
	void m1();
	void m2();
}
abstract class MyClass2 implements IA2{
	public void m1(){}
}
class MyClassB extends MyClass2{
	public void m2(){}
}
//第3题
interface IA{
	void ma();
}
interface IB extends IA{
	void mb();
}
interface IC{
	void mc();
}
interface ID extends IB,IC{
	void md();
}
class ClassE implements ID{
	public void ma(){
		System.out.println("ma()");
	}
	public void mb(){
		System.out.println("mb()");
	}
	public void mc(){
		System.out.println("mc()");
	}
	public void md(){
		System.out.println("md()");
	}
}
class TestClassE{
	public static void main(String[] args){
		IC ic = new ClassE();
		IB ib = (IB)ic;
		ib.ma();
		ib.mb();
		ic.mc();
		ID id = (ID)ic;
		id.md();
	}
}
//第4题
interface IA4{
	void ma();
}
interface IB4{
	void mb();
}
class MySuper implements IA4{
	public void ma(){}
}
class MySub extends MySuper implements IB4{
	public void mb(){}
}
class TestMain4{
	public static void main(String[] args){
		MySuper ms = new MySub();
		System.out.println(ms instanceof IA4);
		System.out.println(ms instanceof IB4);
		System.out.println(ms instanceof MySuper);
		System.out.println(ms instanceof MySub);
	}
}
/*
true
true
true
true
*/
//第5题
/*
抽象类可以有构造方法，接口没有构造方法
接口和抽象类都有属性
接口中 可以有非抽象方法，接口中都是抽象方法
抽象类和接口都不能创建对象
一个类最多可以继承一个抽象类，但是可以实现多个接口
*/
//第6题
interface Light{
	void shine();
}
class ReadLight implements Light{
	public void shine(){
		System.out.println("Red Light shine in Red");
	}
}
class YellowLight implements Light{
	public void shine(){
		System.out.println("Yellow Light shine in Yellow");
	}
}
class GreenLight implements Light{
	public void shine(){
		System.out.println("Green Light shine in Green");
	}
}
class Lamp{
	private Light light;
	public void setLight(Light light){
		this.light = light;
	}
	public void on(){
		light.shine();
	}
}
class TestLamp{
	public static void main(String[] args){
		Light[] ls = new Light[3];
		ls[0] = new ReadLight();
		ls[1] = new YellowLight();
		ls[2] = new GreenLight();
		Lamp lamp = new Lamp();
		for(int i = 0;i<ls.length;i++){
			lamp.setLight(ls[i]);
			lamp.on();
		}
	}
}
/*
Red Light shine in Red
Yellow Light shine in Yellow
Green Light shine in Green
*/
//第7题
interface JavaTeacher{
	void teach();
}
class TeacherA implements JavaTeacher{
	public void teach(){
		System.out.println("TeacherA teach java");
	}
}
class TeacherB implements JavaTeacher{
	public void teach(){
		System.out.println("TeacherB teach java");
	}
}
class School{
	public static JavaTeacher getTeacher(int i){
		if(i == 0)return new TeacherA();
		else return new TeacherB();
	}
}
class TestTeacher{
	public static void main(String[] args){
		JavaTeacher jt = School.getTeacher(0);
		jt.teach();
		jt = School.getTeacher(10);
		jt.teach();
	}
}
/*
TeacherA teach java
TeacherB teach java
*/
//第8题
abstract class Animal{
	public abstract void eat();
}
interface Pet{
	void play();
}
class Dog extends Animal implements Pet{
	public void eat(){
		System.out.println("Dog eat bones");
	}
	public void play(){
		System.out.println("Play with Dog");
	}
}
class Cat extends Animal implements Pet{
	public void eat(){
		System.out.println("Cat eat fish");
	}
	public void play(){
		System.out.println("Play with Cat");
	}
} 
class Wolf extends Animal{
	public void eat(){
		System.out.println("Wolf eat meat");
	}
}
class TestAnimal{
	public static void main(String[] args){
		Animal[] as = new Animal[3];
		as[0] = new Dog();
		as[1] = new Cat();
		as[2] = new Wolf();
		for(int i = 0;i<as.length;i++){
			if(as[i] instanceof Animal){
				as[i].eat();
			}
		}
		for(int i = 0;i<as.length;i++){
			if(as[i] instanceof Pet){
				Pet p = (Pet)as[i];
				p.play();
			}
		}
	}
}
//第9题
interface ExtraMoney{
	int someMoney();
}
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
class SalarieEmployee extends Employee implements ExtraMoney{
	private double monthSalary;
	public SalarieEmployee(){}
	public SalarieEmployee(String name, int month,double monthSalary){
		super(name,month);
		this.monthSalary = monthSalary;
	}
	public double getSalary(int month){
		if(super.getMonth() == month){
			return monthSalary+super.getSalary(month);
		}
		else return monthSalary;
	}
	public int someMoney(){
		return 2000;
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
class BasePlusSalesEmployee extends SalesEmployee implements ExtraMoney{
	private double baseMoney;
	public BasePlusSalesEmployee(){}
	public BasePlusSalesEmployee(String name,int month,double saleMoney,double extraMoney,double baseMoney){
		super(name ,month,saleMoney,extraMoney);
		this.baseMoney = baseMoney;
	}
	public double getSalary(int month){
		return baseMoney+super.getSalary(month)-super.getSaleMoney();
	}
	public int someMoney(){
		return 1000;
	}
}
class TestSalary{
	public static void main(String[] args){
		BasePlusSalesEmployee base = new BasePlusSalesEmployee("马耿旭",5,3000.0,0.1,5000.0);
		System.out.println(base.getSalary(6));
		SalarieEmployee salaried = new SalarieEmployee("mgx",7,4000);
		System.out.println(salaried.getSalary(7));
		System.out.println("发放的加班费为：");
		Employee[] e = new Employee[2];
		e[0] = new BasePlusSalesEmployee("马耿旭",5,3000.0,0.1,5000.0);
		e[1] = new SalarieEmployee("mgx",7,4000);
		int count1 = 0;
		int count2 = 0;
		for(int i = 0;i<e.length;i++){
			if(e[i] instanceof ExtraMoney){
				if(e[i] instanceof BasePlusSalesEmployee){
					count1+=1;
				}
			}
			if(e[i] instanceof SalarieEmployee){
					count2+=1;
				}
		}
		System.out.println(count1*1000+count2*2000);
	}
}
//第10题
interface ServiceInterface{
	void doService1();
	void doService2();
	void doService3();
}
abstract class AbstractService implements ServiceInterface{
	public void doService1(){}
	public void doService2(){}
	public void doService3(){}
}
/*
第一种
*/
class MyService1 implements ServiceInterface{
	public void doService1(){
		System.out.println("doService1()");
	}
	public void doService2(){
		System.out.println("doService2()");
	}
	public void doService3(){
		System.out.println("doService3()");
	}
}
/*
第2种
*/
class MyService2 extends AbstractService{
	public void doService1(){
		System.out.println("doService1()");
	}
}
/*
第一种方法是直接实现接口
第二种方法是继承已经实现了接口的父类
区别：第一种必须将接口中的所有抽象方法都进行实现，第二种可以选择性的覆盖自己想要覆盖的方法，但是失去了唯一的一次继承的机会。
AbstractService类给开发提供了多种选择，不必实现接口中的全部方法也能实现该功能。
*/
//第11题
interface IsPrime{
	boolean isPrime();
}
class Prime1 implements IsPrime{
	public boolean isPrime(){
		return false;
	}
}
class Prime2 implements IsPrime{
	public boolean isPrime(){
		return true;
	}
}
class JudgeIsPrime{
	public static IsPrime getIsPrime(int a){
		if(a == 1) return new Prime1();
		int count = 0;
		for(int i = 2;i<a;i++){
			if(a%i!=0){
				count+=1;
			}
		}
		if(count == a-2) return new Prime2();
		else return new Prime1();
	}
}
class TestGdGuess{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个大于6的整数：");
		int number = sc.nextInt();
		divid(number);
	}
	public static void divid(int n){
		for(int num1 = 1;num1>n/2;num1++){
			int num2 = n-num1;
			IsPrime i = JudgeIsPrime.getIsPrime(num1);
			IsPrime e = JudgeIsPrime.getIsPrime(num2);
			if(i.isPrime() && e.isPrime()){
				System.out.println(n+"= "+num1+" + "+num2);
			}
		}
	}
}
class E{
	static int count;
	{
		count++;
	}
}
class TestE{
	public static void main(String[] args){
		E i = new E();
		E i2 = new E();
		System.out.println(E.count);
	}
}