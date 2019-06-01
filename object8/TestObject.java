package code_day8;
public class TestObject{
	public static void main(String[] args){
		Student a = new Student();
		a.name = "haha";
		a.age = 18;
		a.sex = true;
		a.weight = 124;
		a.score = 100;
		System.out.println(a.name+"得了"+a.score);
		a.eat();
		a.study(5);
		Student s = new Student("hehe",18,false,120,98);
		System.out.println(s.name+"得了"+s.score);
		s.eat();
		s.study(10);
	}
}
class Student{
	String name;
	int age;
	boolean sex;
	double weight;
	double score;
	public Student(){}
	public Student(String name,int age,boolean sex,double weight,double score){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.score = score;
	}
	public void eat(){
		System.out.println(name+"在吃饭");
	}
	public void study(int time){
		System.out.println(name+"学习了"+time+"小时");
	}
}
/*
示例练习(第一遍)
*/
class TestTeacher{
	public static void main(String[] args){
		//创建对象
		Teacher one = new Teacher();
		//给成员变量赋值
		one.name = "xiaoya";
		one.age = 18;
		one.sex = false;
		//打印成员变量的值
		System.out.println(name+"年龄"+age+"是个")
	}
}
class Teacher{
	//成员变量
	String name;
	int age;
	boolean sex;
	//声明方法
	public void teach(String course){
		System.out.println(name+"是个"+sex+"教的是"+course);
	}
	//声明构造方法
	public Teacher(){}
	
}
/*
示例练习(第2遍)
*/
class TestDog{
	public static void main(String[] args){
		//创建对象
		Dog one = new Dog();
		//给成员变量赋值
		one.name = "灯泡";
		one.age = 2;
		one.sex = false;
		//打印成员变量的值
		System.out.println(name+"年龄"+age+"是个");
		//调用方法
		one.eat("骨头");
	}
}
class Dog{
	//成员变量
	String name;
	int age;
	boolean sex;
	//声明方法
	public void eat(String thing){
		System.out.println(name+"爱吃"+thing);
	}
	//声明构造方法
	public Teacher(){}
	
}
/*
overload
*/
class TestOverLoad{
	public static void main(String[] args){
		MathTool mathTool = new MathTool();
		mathTool.add();
		mathTool.add(10.0);
		byte a = 10;
		mathTool.add(a);
		mathTool.add(10,11.0);
	}
}
class MathTool{
	public void add(){
		System.out.println("add()");
	}
	public void add(byte a){
		System.out.println("add(byte)");
	}
	public int add(double a){
		System.out.println("add(int)");
		return 10;
	} 
	public void add(double a,int b){
		System.out.println("add(double,int)");
	}
	public void add(int a,double b){
		System.out.println("add(int,double)");
	}
}
//测试引用里边存的值
class TestAddress{
	public static void main(String[] args){
		Address a = new Address();
		System.out.println(a);
		int b = a.age;
		System.out.println(b);
	}
}
class Address{
	String name;
	int age;
	double weight;
}