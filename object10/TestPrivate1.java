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
class Employee{
	private String name ;
	private int birthday;
	private double salary;
	public Employee(){}
	public Employee(String name,int birthday,double salary){
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
		Employee[] a = new Employee[3];
		a[0] = new Employee("haha",123456,3000.0);
		a[1] = new Employee("hehe",234567,5800.0);
		a[2] = new Employee("xixi",245634,12000.0);
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
作业题
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
		System.out.println(name +"Dog sleep");
	}
	public void swim(){
		System.out.println(name+"Dog swim");
	}
}
class TestDodExtendsAnimal{
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.sleep();
		dog.swim(); 
	}
}