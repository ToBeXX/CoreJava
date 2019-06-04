package code_day11;
//第2题
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
class Super2{
	public void method(){
		System.out.println("method() in Super");
	}
	public void method(int i ){
		System.out.println("method(int) in Super");
	}
	public void method (String str){
		System.out.println("method(String) in Super");
	}
}
class Sub2 extends Super2{
	public void method(){
		System.out.println("method() in Sub");
	}
	public void method (String str){
		System.out.println("method(String) in Sub");
	}
}
class TestSuperSub2{
	public static void main(String[] args){
		Super2 s = new Sub2();
		s.method(10);
		s.method();
		s.method("hello");
	}
}
/*
编译不通过
因为当s调用method（String str）  早父类中会找不到合适的方法 然后报错
修改方法是  在父类中添加参数表为字符串的有参method方法
*/

//第4题
class Super3{
	public void m(){
		System.out.println("m()in Super3");
	}
}
class Sub3 extends Super3{
	public void m(){
		System.out.println("m()in Sub3");
	}
}
class TestSuperSub3{
	public static void foo(Super3 s){
		s.m();
	}
	public static void main(String[] args){
		Sub3 sub = new Sub3();
		Super3 sup = new Super3();
		foo(sup);
		foo(sub);
	}
}
/*
m()in Super3
m()in Sub3
*/

//第5题
class Animal{
	int age;
}
class Dog extends Animal{}
class Cat extends Animal{}
class TestAnimal{
	public static void main(String[] args){
		/* Animal a = new Animal();
		a = null; */
		/* System.out.println(a.age); */
	}
	public static Animal getAnimal(){
		/* return null; */
		/* return new Animal(); */
		/* return new Dog(); */ 
		return new Cat(); 
		
	}
}
//全部能通过
//第6题
/* 
package corejava.chp7;
public class MyClass{
	private int value;
	public MyClass(){}
	MyClass (int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
}
package corejava.chp7;
public class TestMyClass1{
	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(10);
		System.out.println(mc1.value);
		System.out.println(mc2.value);
	}
}
package corejava.temp;
import corejava.chp7;
public class TestMyClass2{
	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		mc2.setValue(10);
		System.out.println(mc1.value);
		System.out.println(mc2.value);
	}
} 
*/
//第7题
//DE
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
class Super4{
	public Super4(){}
	public Super4(String str){
		
	}
}
class Sub4 extends Super4{
	public Sub4(){}
	public Sub4(String str){
		super(str);
	}
}
//第10题
class Super5{
	int method(){
		return 0;
	}
}
class Sub5 extends Super5{
	/* public int method(){return 0;}   对*/
	/* void method(){} */
	void method(int n){}//对
// 1
}
//第11题
class Super6{
	private void method(){}
}
class Sub6 extends Super6{
	/* public int method(){return 0;} 对 */
	/* void method(){}  对*/
	/* void method(int n){} 对 */
	/* private void method(){} 对 */
//1
}
//第12题
class AnimalE{
	private String name;
	public AnimalE(){}
	public AnimalE(String name){
		this.name = name;
	}
	// 1
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

}
class DogE extends AnimalE{
	//2
	public DogE(){}
	public DogE(String name ){
		super(name);
	}

}
class CatE extends AnimalE{
	//3
	public CatE(){}
	public CatE(String name ){
		super(name);
	}

}
class TestAnimalE{
	public static void main(String args[]){
		AnimalE[] as = new AnimalE[]{
			new DogE("Pluto"),
			new CatE("Tom"),
			new DogE("Snoopy"),
			new CatE("Garfield")
		};
		DogE[] dogs = getAllDog(as);
		for(int i = 0; i<dogs.length; i++){
			System.out.println(dogs[i].getName());
		}		
	}
	public static DogE[] getAllDog(AnimalE[] as){
		//4
		int count = 0;
		int j =0;
		for(int i = 0;i<as.length;i++){
			if(as[i] instanceof DogE){
				count+=1;
			}
		}
		DogE[] a = new DogE[count];
		for(int i = 0; i<as.length;i++){
			if(as[i] instanceof DogE){
				a[j] = (DogE)as[i];
				j++;
			}
		}
		return a;

	}
}
//第13题
//第14题
class Student{
	private String name;
	private int age;
	private String address;
	private String zipCode;
	private String mobile;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setZipCode(String ZipCode){
		this.zipCode = zipCode;
	}
	public String getZipCode(){
		return zipCode;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return mobile;
	}
	public Student(){}
	public Student(String name,int age,String address,String zipCode,String mobile){
		this.name = name;
		this.age = age;
		this.address = address;
		this.zipCode = zipCode;
		this.mobile = mobile;
	}
	public void getPostAddress(){
		System.out.println(address+zipCode);
	}
}
//第15题
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
	public Circle(){}
	public Circle(double radius){
		this.radius = radius;
	}
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
	public Rect(){}
	public Rect(double length,double width){
		this.length = length;
		this.width = width;
	}
	public double area(){
		return (length+width)*2;
	}
	public double girth(){
		return length+width;
	}
}
class Square extends Shape{
	double length;
	public Square(){}
	public Square(double length){
		this.length = length;
	}
	public double area(){
		return length*length;
	}
	public double girth(){
		return length*4;
	}
}
class TestShape{
	public static void main(String[] args){
		Circle c = new Circle(3);
		System.out.println(c.area()+" "+c.girth());
		Rect r = new Rect(3,4);
		System.out.println(r.area()+" "+r.girth());
		Square s = new Square(4);
		System.out.println(s.area()+" "+s.girth());
		Shape[] a = new Shape[]{new Circle(3),new Rect(3,4),new Square(4)};
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i].area()+" "+a[i].girth());
		}
	}
}
//第17题
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
		if(super.getMonth() == month){
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
			return hourSalary*hours*30+super.getSalary(month);
		}
		else return hourSalary*hours*30;
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
		System.out.println(base.getSalary(6));
		SalarieEmployee salaried = new SalarieEmployee("mgx",7,4000);
		System.out.println(salaried.getSalary(7));
		SalesEmployee sale = new SalesEmployee("xiaoya",9,4500.0,0.2);
		System.out.println(sale.getSalary(9));
		HourlyEmploree hour = new HourlyEmploree("小雅",9,35,8);
		System.out.println(hour.getSalary(8));
		Employee[] e = new Employee[]{new BasePlusSalesEmployee("马耿旭",5,3000.0,0.1,5000.0),new SalarieEmployee("mgx",7,4000),new SalesEmployee("xiaoya",9,4500.0,0.2),new HourlyEmploree("小雅",9,35,8)};
		for(int i = 0;i<e.length;i++){
			System.out.println(e[i].getSalary(9));
		}
	}
}
/*
多态练习
*/
//第1题
/* class AnimalF{
	public void eat(){
		System.out.println("animal eat()");
	}
	public void sleep(){
		System.out.println("animal sleep()");
	}
}
class CatF extends AnimalF{
	public void eat(){
		System.out.println(CatF eat()");
	}
	public void clibTree(){
		System.out.println("CatF clibTree()");
	}
}
class BirdF extends AnimalF{
	public void eat(){
		System.out.println("bird eat()");
	}
	public void fly(){
		System.out.println("bird fly()");
	}
}
class FishF extends AnimalF{
	public void eat(){
		System.out.println("FishF eat()");
	}
	public void swim(){
		System.out.println("Fish swim()");
	}
}
class TestAnimalF{
	public static void main(String[] args){
		AnimalF a = new AnimalF[]{}
	}
} */
	class AnimalF{
	private String name;
	public AnimalF(){}
	public AnimalF(String name){
		this.name = name;
	}
	// 1
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

}
class DogF extends AnimalF{
	//2
	public DogF(){}
	public DogF(String name ){
		super(name);
	}

}
class CatF extends AnimalF{
	//3
	public CatF(){}
	public CatF(String name ){
		super(name);
	}
}
class FishF extends AnimalF{
	public FishF(){}
	public FishF(String name ){
		super(name);
	}
	public void eat(){
		System.out.println("FishF eat()");
	}
	public void swim(){
		System.out.println("Fish swim()");
	}
}
class BirdF extends AnimalF{
	public BirdF(){}
	public BirdF(String name ){
		super(name);
	}
	public void eat(){
		System.out.println("bird eat()");
	}
	public void fly(){
		System.out.println("bird fly()");
	}
}
class TestAnimalF{
	public static void main(String args[]){
		AnimalF[] as = new AnimalF[]{
			new DogF("Pluto"),
			new CatF("Tom"),
			new DogF("Snoopy"),
			new CatF("Garfield"),
			new BirdF("xiaoya"),
			new FishF("xiaoliyu")
		};	
		System.out.println(getAllDog(as));
		for(int i = 0;i<as.length;i++){
			if(as[i] instanceof BirdF){
				BirdF a = (BirdF)as[i];
				a.fly();
			}
		}
	}
	public static int getAllDog(AnimalF[] as){
		int count = 0;
		int j =0;
		for(int i = 0;i<as.length;i++){
			if(as[i] instanceof DogF){
				count+=1;
			}
		}
		return count;
	}
	public static AnimalF getAnimal(int m){
		if(m >5000) return new DogF();
		else if(m > 3000) return new CatF();
		else if(m > 200) return new BirdF();
		else return new FishF();
	}
}
//第2题
//第3题
class SuperA{
	public void m(){
		foo();
	}
	public void foo(){
		System.out.println("foo() in Super");
	}
}
class SubA extends SuperA{
	public void foo(){
		System.out.println("foo() in Sub");
	}
}
class TestSuperSubA{
	public static void main(String args[]){
		SuperA s = new SubA();
		s.m();
	}
}
//foo() in Sub
/*
第四题
instanceof 关键字
*/
//第5题
