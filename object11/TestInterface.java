package code_day11;
import java.util.*;
//��1��
interface IA1{
	void m1();
	int a = 100;
}
class MyClass implements IA1{
	public void m1(){}
}
class TestInterface{
	public static void main(String[] args){
		IA1 ia = new MyClass();
		ia.m1();
		System.out.println(IA1.a);
	}
}
//��2��
//��3��
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
		ClassE a = (ClassE)ic;
		a.ma();
		a.mb();
		a.mc();
		a.md();
	}
}
//��9��
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
		BasePlusSalesEmployee base = new BasePlusSalesEmployee("����",5,3000.0,0.1,5000.0);
		System.out.println(base.getSalary(6));
		SalarieEmployee salaried = new SalarieEmployee("mgx",7,4000);
		System.out.println(salaried.getSalary(7));
		System.out.println(base.someMoney()+salaried.someMoney());
	}
}
//
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
��һ��
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
��2��
*/
class MyService2 extends AbstractService{
	public void doService1(){
		System.out.println("doService1()");
	}
}
/*
��һ�ַ�����ֱ��ʵ�ֽӿ�
�ڶ��ַ����Ǽ̳��Ѿ�ʵ���˽ӿڵĸ���
���𣺵�һ�ֱ��뽫�ӿ��е����г��󷽷�������ʵ�֣��ڶ��ֿ���ѡ���Եĸ����Լ���Ҫ���ǵķ���������ʧȥ��Ψһ��һ�μ̳еĻ��ᡣ
AbstractService��������ṩ�˶���ѡ�񣬲���ʵ�ֽӿ��е�ȫ������Ҳ��ʵ�ָù��ܡ�
*/
//��11��
interface IsPrime{
	boolean isPrime(int a);
}
class JudgeIsPrime implements IsPrime{
	public boolean isPrime(int a){
		int count = 0;
		if (a == 1) return false;
		else{
			for(int i = 2;i<a;i++){
				if(a%i == 0){
					count+=1;
				}
			}
		}
		if(count == 0) return true;
		else return false;
	}
}
class TestGdGuess{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������6��������");
		int number = sc.nextInt();
		divid(number);
	}
	public static void divid(int n){
		for(int num1 = 1;num1>n/2;num1++){
			int num2 = n-num1;
			IsPrime a = new JudgeIsPrime();
			IsPrime b = new JudgeIsPrime();
			if(a.isPrime(num1) == true && b.isPrime(num2) == true){
				System.out.println(n+"= "+num1+" + "+num2);
			}
		}
	}
}