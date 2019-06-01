package code_day9;
class TestDog{
	//主函数
	public static void main(String[]args){
	//创建一个名为g的对象
	//调用有参构造给对象赋值 
		Dog g =	new Dog ("肉肉",1,"哈士奇");
	}
}
//创建一个Dog类
class Dog{
	//狗类里面的属性name是String类型
	String name;
	//狗类里面的age属性是int类型
	int age;
	//狗类里面的breed属性是String类型
	String breed;
	
	//狗类的无参构造方法
	public Dog(){}
	//狗类的有参构造方法
	public Dog(String name,int age,String breed){
	//形参给实例变量赋值
		this.name = name;
	//同上
		this.age = age;
	//同上
		this.breed = breed;
	}
	}
}
class TestCar{
	public static void main(String[]args){
	//第一种创建对象的方法 直接创建
		Car c= new Car();
		
	//第二种创建 先声明对象名 再分配
		Car c1;
		c1=new Car();
		
	//给c1对象name赋值
	c1.name="保时捷";
	//未给c对象属性赋值 打印c.name则为默认值 null
	System.out.println(c.name);
		
	//创建一个c2对象 c对象的值赋给c2
		Car c2=c;
		c.name="奥迪";
		c.money=400000;
		c.color="黑色";
	//打印c2.color显示黑色	
		System.out.println(c2.color);
	//c2.money的值现在是400000
	//c2.money++ 同时c.money也发生变化
	//c对象的属性变化 c2也变
		c2.money++;
	//输出c和c2.money都是相同地址 相同结果
		System.out.println(c.money);
		
	}
}
	//创建一个Car类
class Car{
	//name属性为String
	String name;
	//money属性为int
	int money;
	//color属性为String
	String color;
	
	//无参构造方法
	public Car(){}
}

class Test4{
	public static void main(String[]args){
		//创建一个对象名为a
		Animals a = new Animals();
		//a对象里面的属性age赋值为4
		a.age=4;
		//创建一个对象名为b
		Animals b = new Animals();
		//b对象里的属性age赋值为6
		b.age=6;
		
		//调用dog方法                                                                 
		a.dog(b);
		
		//创建对象接收数组 要记得把后面的()改成[];
		Animals [] x=new Animals[3];
		x[0]=a;
		x[1]=b;
		//x[2]用来接收一个新的数组数值
		//没有赋值 默认为0
		x[2]=new Animals();
		//遍历数组x 
		for(int i=0;i<x.length;i++){
			System.out.println(x[i].age);
		}
	}
}
class Animals{
	String name;
	int age;
	double weight;
	String color;
	
	//无参构造方法
	public Animals(){}
	public void dog(Animals c){
		if(this.age>c.age){
			System.out.println("我比你大");
		}else if(this.age<c.age){
			System.out.println("我比你小");
		}else System.out.println("一样");
	}
}
/*
仿照示例代码自己书写
*/
//this关键字
public class TestThis{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.m2();
	}
}
class Student{
	//成员变量
	String name;
	boolean sex;
	int age;
	double score;
	public Student(){}
	public Student(String name,boolean sex,int age,double score){
		/*
		this的第一种用法----this.
		将局部变量赋值给成员变量
		*/
		this();//必须是构造方法有效第一句
		//this();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.score = score;
	}
	public void m1(){
		System.out.println("有一万行代码");
	}
	public void m2(){
		//调用当前对象的m1方法
		this.m1();
		System.out.println("这里有两万行代码");
	}
}
//
class TestThis1{
	public static void main(String[] args){
		//声明对象
		Student1 s = new Student1("")
		//对象调用方法
		s.m2();
	}
}
class Student1{
	//成员变量
	String name;
	boolean sex;
	int age;
	//构造方法
	public Student1(){
		System.out.println("我是无参构造方法");
	}
	public Student1(String name,boolean sex,int age){
		//this 第二种用法----调用当前对象的无参构造方法
		this();
		//this第一种用法---this.
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//声明方法
	public void m1(){
		System.out.println("方法m1");
	}
	public void m2(){
		//this第一种用法---this.
		this.m1();
		System.out.println("方法m2");
	}
}
