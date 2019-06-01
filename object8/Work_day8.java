package code_day8;
import java.util.*;
/*
第1题
. 定义一个 Person 类
1 定义姓名、年龄、身高、体重、成绩、性别属性。
2 定义有参无参构造方法。
3 定义吃方法、睡方法、自我介绍方法（打印所有的属性值）。
4 并在主函数中创建对象、为属性赋值、调用其方法
*/
class TestPerson{
	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person("mgx",19,178,120,93,true);
		p1.name = "xiaoya";
		p1.age = 18;
		p1.length = 165.0;
		p1.weight = 90.0;
		p1.score = 94;
		p1.sex = false;
		p1.eat();
		p1.sleep();
		p1.introduce();
		p2.eat();
		p2.sleep();
		p2.introduce();
	}
}
class Person{
	String name;
	int age;
	double length;
	double weight;
	double score;
	boolean sex;
	public Person(){}
	public Person(String a, int b,double c,double d,double e ,boolean f){
		name = a;
		age = b;
		length = c;
		weight = d;
		score =  e;
		sex = f;
	}
	public void eat(){
		System.out.println(name+"吃");
	}
	public void sleep(){
		System.out.println(name+"睡");
	}
	public void introduce(){
		System.out.println("我是"+name+" 我"+age+"岁了 "+"我"+length+"cm");
	}
}
/*
第2题
定义一个 Computer（电脑类）
1 定义品牌、大小、颜色属性
2 定义有参无参构造方法。
3 定义打游戏、放视频、敲代码方法
4 并在主函数中创建对象、为属性赋值、调用其方法
*/
class TestComputer{
	public static void main(String[] args){
		Computer p1 = new Computer();
		Computer p2 = new Computer("联想",21,"白色");
		p1.name = "华硕";
		p1.size = 18;
		p1.color = "黑色";
		p1.game();
		p1.vedio();
		p1.coding();
		p2.game();
		p2.vedio();
		p2.coding();
	}
}
class Computer{
	String name;
	int size;
	String color;
	public Computer(){}
	public Computer(String a,int b,String c){
		name = a;
		size = b;
		color = c;
	}
	public void game(){
		System.out.println("打游戏");
	}
	public void vedio(){
		System.out.println("放视频");
	}
	public void coding(){
		System.out.println("敲代码");
	}
}
/*
第3题
定义一个 Dog（狗）类
1 定义姓名、品种、年龄、性别属性
2 定义有参无参构造方法。
3 定义吃、睡、玩、叫方法
4 并在主函数中创建对象、为属性赋值、调用其方法
*/
class TestDog{
	public static void main(String[] args){
		Dog d1 = new Dog();
		Dog d2 = new Dog("贵妇","哈士奇",2,true);
		d1.name = "灯泡";
		d1.type = "萨摩耶";
		d1.age = 2;
		d1.sex = false;
		d1.eat();
		d1.sleep();
		d1.play();
		d1.bark();
		d2.eat();
		d2.sleep();
		d2.play();
		d2.bark();
	}
}
class Dog{
	String name;
	String type;
	int age;
	boolean sex;
	public Dog(){}
	public Dog(String a,String b,int c,boolean d){
		name = a;
		type = b;
		age = c;
		sex = d;
	}
	public void eat(){
		System.out.println("吃");
	}
	public void sleep(){
		System.out.println("睡");
	}
	public void play(){
		System.out.println("玩");
	}
	public void bark(){
		System.out.println("叫");
	}
}
/*
第4题
定义一个 Productor(商品)类
1 属性为：商品名、价格、数量、产地
2 提供有参数、无参数的构造方法
3 方法：show 方法，展示商品的信息。
4 创建多个对象，打印输出商品的信息；
5 并判断该商品是否短缺，如果数量=0，则打印”货品短缺”。
*/
class TestProductor{
	public static void main(String[] args){
		Productor d1 = new Productor();
		Productor d2 = new Productor("奥迪",40,13,"上海");
		d1.name = "宝马";
		d1.price = 43;
		d1.number = 20;
		d1.address = "德国";
		d1.show();
		d2.show();
		judge(d1);
		judge(d2);
	}
	public static void judge(Productor n){
		if(n.number == 0){
			System.out.println(n.name+"短缺");
		}
		else{
			System.out.println(n.name+"不短缺");
		}
	}
}
class Productor{
	String name;
	int price;
	int number;
	String address;
	public Productor(){}
	public Productor(String a,int b,int c,String d){
		name = a;
		price = b;
		number = c;
		address = d;
	}
	public void show(){
		System.out.println(name+"价格是"+price+"万；库存还有"+number+" 辆；生产自"+address);
	}
	
}
/*
第5题
. 猜数字游戏：
1 一个类 A 有一个成员变量 v，有一个初值 100。
2 定义一个类，对 A 类的成员变量 v 进行猜。
3 如果大了则提示大了，小了则提示小了，等于则提示猜测成
功
*/
class GuessNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Number n = new Number();
		System.out.println("请输入一个数字进行猜词游戏：");
		while(true){
			//boolean j = false;
			int num = sc.nextInt();
			boolean k = judge(n,num);
			if(k == true){
				System.out.println("恭喜你猜对了");
				break;
			}
		}
	}
	public static boolean judge(Number a,int i){
		if(a.v >i){
			System.out.println("哈哈，你猜小了，请重新输入：");
			return false;
		}
		else if(a.v < i){
			System.out.println("哈哈，你猜大了，请重新输入：");
			return false;
		}
		else{
			return true;
		}
	}
}
class Number{
	int v = 100;
}
/*
第6题
定义一个用户类(User),并创建多个用户对象：
属性：用户名、密码、年龄、电话、是否在线(是-true)
提供有参数、无参数的构造方法
方法：show 方法，展示用户的所有信息。
创建多个对象，打印输出用户的信息，并判断该用户是否在线，
在线-"用户处于登陆状态"；不在线-"用户暂未登陆
*/
class TestUser{
	public static void main(String[] args){
		User user1 = new User("a",1234,18,1234,false);
		User user2 = new User("a",2345,19,2345,true);
		User user3 = new User("a",3456,20,3456,false);
		User user4 = new User("a",4567,21,4567,true);
		judge(user1);
		judge(user2);
		judge(user3);
		judge(user4);
	}
	public static void judge(User n){
		if(n.isOnline == true){
			System.out.println("用户处于登陆状态");
		}
		else{
			System.out.println("用户暂未登陆");
		}
	}
}
class User{
	String name;
	int passWord;
	int age;
	int number;
	boolean isOnline;
	public User(){}
	public User(String a,int b,int c,int d,boolean e){
		name = a;
		age = b;
		number = c;
		isOnline = e;
	}
	public void show(){
		System.out.println("打印商品信息");
	}
}
/*
第7题
定义一个员工类(Employee):
属性:姓名,性别,生日月,工资,电话
提供无参数\有参数的构造方法
定义一个 show 方法,展示员工的所有信息. 创建多个员工对象
*/
class TestEmployee{
	public static void main(String[] args){
		Employee emp1 = new Employee("啊啊",false,1999,3000.0,123);
		Employee emp2 = new Employee("啊哦",true,1998,4000.0,234);
		Employee emp3 = new Employee("啊额",false,1978,5000.0,345);
		Employee emp4 = new Employee("啊呀",true,1994,6000.0,456);
		emp1.show();
		emp2.show();
		emp3.show();
		emp4.show();
	}
}
class Employee{
	String name;
	boolean sex;
	int birthday;
	double salary;
	int number;
	public Employee(){}
	public Employee(String a,boolean b,int c,double d,int e){
		name = a;
		sex = b;
		birthday = c;
		salary = d;
		number = e;
	}
	public void show(){
		System.out.println("打印员工信息");
	}
}
/*
第8题
定义一个学生类(Student)
定义姓名、年龄、成绩、性别属性
提供无参数\有参数的构造方法
定义一个 sayHi 方法,展示所有信息
定义多个 eat（吃）方法，构成方法重载
创建多个学生对象，为属性赋值，并且调用方法
*/
class TestStudent{
	public static void main(String[] args){
		Student student1 = new Student("小雅",18,90.1,false);
		Student student2 = new Student("mgx",19,90.2,true);
		Student student3 = new Student("haha",20,90.3,false);
		Student student4 = new Student("xixi",21,90.4,true);
		student1.sayHi();
		student2.sayHi();
		student3.sayHi();
		student4.sayHi();
		student1.eat();
		student1.eat("香蕉");
		student1.eat("米饭",2);
		student2.eat();
		student2.eat("苹果");
		student2.eat("面条",1);
		student3.eat();
		student3.eat("大蒜");
		student3.eat("肉",2);
		student4.eat();
		student4.eat("黄瓜");
		student4.eat("鸡爪",3);
	}
}
class Student{
	String name;
	int age;
	double score;
	boolean sex;
	public Student(){}
	public Student(String a ,int b,double c,boolean d){
		name = a;
		age = b;
		score = c;
		sex = d;
	}
	public void sayHi(){
		System.out.println("打印学生信息");
	}
	public void eat(){
		System.out.println(name+"吃饭");
	}
	public void eat(String food){
		System.out.println(name+"吃"+food);
	}
	public void eat(String food ,int time){
		System.out.println(name+"吃"+food+"花了"+time+"小时");
	}
}