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
		System.out.println("���֣�"+name+"����"+birthday+"����"+salary);
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
��ҵ��
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