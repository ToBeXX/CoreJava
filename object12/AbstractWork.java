package code_day12;
abstract class Employee{
	String name;
	String id;
	public void eat(){
		System.out.println("Employee eat()");
	}
	public abstract void work();
}
class Coder extends Employee{
	public void work(){
		System.out.println("id:"+id+" name:"+name+" 写代码");
	}
}
class Teacher1 extends Employee{
	public void work(){
		System.out.println("id:"+id+" name:"+name+" 讲课");
	}
}
class ControlComputer extends Employee{
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
	//1d
	public void m(){
		
	}
	public void m2(){
		
	}
}
abstract class Sub1 extends Super{
	//2
	public void m(){
		
	}
	public void m2(){
		
	}
}
//第3题
abstract class Teacher{
	abstract void teach();
	abstract int add(int a,int b);
}
abstract class MathTeacher extends Teacher{
	abstract void teachMath();
}
class RealMathTeacher extends MathTeacher{
	public void teach(){
		
	}
	public int add(int a ,int b){
		return a+b;
	}
	public void teachMath(){
		
	}
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
	abstract void work();
}
class NormalEmployee extends Employeee{
	public void work(){}
}
class Manager extends Employeee{
	double extraMoney;
	public void work(){}
}