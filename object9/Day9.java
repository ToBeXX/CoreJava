package code_day9;
//创建一个Student类 定义有参无参构造方法
//为有参构造方法赋值 this.为实例变量赋值
//方法内有局部变量时 局部变量优先
class Test{
	//主函数
	public static void main(String[]args){
	//创建一个名为g的对象
	//给第21行有参构造对象赋值 
		Dog g =	new Dog ("沙雕",2,"哈士奇");
	//g调用第29行app的方法;
		g.app();
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
	//打印实例变量 结果为null 
	//如果29-33在上面 先赋值再打印
	//则打印结果为 沙雕
		System.out.println(this.name);
	//形参给实例变量赋值
		this.name = name;
	//同上
		this.age = age;
	//同上
		this.breed = breed;
	}
	//方法app
	public void app(){
	//方法内有局部变量吉娃娃 则局部变量吉娃娃优先
	//打印name 是吉娃娃 打印this.name是沙雕
		String name="吉娃娃";
		System.out.println(name);
	//this.name为实例变量的值 是实参赋给的值 
	//打印的是实参
		System.out.println(this.name);
		System.out.println(this.breed);
	}
}

class Test1{
	public static void main(String[]args){
		//创建一个C的对象 
		//有参构造方法 实参为土豆2波斯 给下面第73行赋值
		Cat c= new Cat("土豆",2,"波斯");
		//调用C2方法
		c.c2();
	}
}
//创建一个Cat类
class Cat{
	//类的属性 name 是String类型
	String name;
	//age是int类型
	int age;
	//breed是String类型
	String breed;
	
	//无参构造方法 
	public Cat(){}
	//有参构造方法 形参为String int String类型
	public Cat(String name,int age,String breed){
	//形参给实例变量赋值 形参只能用在49-58行
		this.name= name;
	//同上
		this.age= age;
	//同上
		this.breed= breed;
	//调用实例变量 打印实例变量
		System.out.println(this.name+this.age+this.breed);
}
	//创建一个C1方法
	public void c1(){
		System.out.println("猫");
	}
	//在C2中先调用C1 先打印C1输出语句 然后再打印C2输出语句
	public void c2(){
	//如果加This 放在有效语句开头第一句
		c1();
		System.out.println("活的");
	}
}

//创建一个Student类 定义有参无参构造方法
//为有参构造方法赋值 this.为实例变量赋值
class Test2{
	public static void main(String[]args){
	//创建对象a  为第106行形参赋值
	Student a = new Student(true,59.9);
	//创建对象a1 	为第112行形参赋值
	Student a1= new Student("司潇涵",24,false,60.1);
	}
}
class Student{
	//Student类中的属性
	//姓名
	String name;
	//年龄
	int age;
	//性别
	boolean sex;
	//成绩
	double socre;
	
	//无参构造方法
	public Student(){}
	//有参构造方法 输入boolean和double的值
	public Student(boolean sex,double socre){
		//调用有参构造方法sex 给107行实例变量sex赋值
		this.sex=sex;
		//调用有参构造方法socre 给109行socre赋值
		this.socre=socre;
		//打印赋值后的形参
		System.out.println(this.sex+""+this.socre);
	}
	//有参构造方法 输入四种类型
	public Student(String name,int age,boolean sex,double socre){
	//调用116.118行的实例变量 打印sex和socre
		
		this(sex,socre);
		this.name=name;
		this.age=age;
	//再打印97行给形参赋值的name和age
		System.out.println(this.name+this.age);
	}
}

class Test3{
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


class Test5{
	//主函数
	public static void main(String[]args){
	//创建一个名为g的对象
	//给第249行有参构造对象赋值 
		Game g = new Game ("守望先锋",2,"第一人称");
	//g调用第29行app的方法;
		g.app();
	}
}
//创建一个Game类
class Game{
	//Game类里面的属性name是String类型
	String name;
	//Game类里面的age属性是int类型
	int year;
	//Game类里面的breed属性是String类型
	String breed;
	
	//Game类的无参构造方法
	public Game(){}
	//Game类的有参构造方法
	public Game(String name,int year,String breed){
	//打印实例变量 结果为null 
	//如果255-259在上面 先赋值再打印
	//则打印结果为 守望先锋
		System.out.println(this.name);
	//形参给实例变量赋值
		this.name = name;
	//同上
		this.year = year;
	//同上
		this.breed = breed;
	}
	//方法app
	public void app(){
	//方法内有局部变量街头篮球 则局部变量街头篮球优先
	//打印name 是街头篮球 打印this.name是守望先锋
		String name="街头篮球";
		System.out.println(name);
	//this.name为实例变量的值 是实参赋给的值 
	//打印的是实参
		System.out.println(this.name);
		System.out.println(this.breed);
	}
}

class Test6{
	public static void main(String[]args){
		//创建一个F的对象 
		//有参构造方法 实参为狗蛋儿2金龙鱼 给下面第295行赋值
		Fish f= new Fish("狗蛋儿",2,"金龙鱼");
		//调用C2方法
		f.f2();
	}
}
//创建一个Fish类
class Fish{
	//类的属性 name 是String类型
	String name;
	//age是int类型
	int age;
	//breed是String类型
	String breed;
	
	//无参构造方法 
	public Fish(){}
	//有参构造方法 形参为String int String类型
	public Fish(String name,int age,String breed){
	//形参给实例变量赋值 形参只能用在295-304行
		this.name= name;
	//同上
		this.age= age;
	//同上
		this.breed= breed;
	//调用实例变量 打印实例变量
		System.out.println(this.name+this.age+this.breed);
}
	//创建一个F1方法
	public void f1(){
		System.out.println("鱼");
	}
	//在F2中先调用F1 先打印F1输出语句 然后再打印F2输出语句
	public void f2(){
	//如果加This 放在有效语句开头第一句
		f1();
		System.out.println("活的");
	}
}

//创建一个Teacher类 定义有参无参构造方法
//为有参构造方法赋值 this.为实例变量赋值
class Test7{
	public static void main(String[]args){
	//创建对象a  为第341行形参赋值
	Teacher a = new Teacher(true,59.9);
	//创建对象a1 	为第350行形参赋值
	Teacher a1= new Teacher("王小小",18,false,100.0);
	}
}
class Teacher{
	//Student类中的属性
	//姓名
	String name;
	//年龄
	int age;
	//性别
	boolean sex;
	//成绩
	double socre;
	
	//无参构造方法
	public Teacher(){}
	//有参构造方法 输入boolean和double的值
	public Teacher(boolean sex,double socre){
		//调用有参构造方法sex 给334行实例变量sex赋值
		this.sex=sex;
		//调用有参构造方法socre 给336行socre赋值
		this.socre=socre;
		//打印赋值后的形参
		System.out.println(this.sex+""+this.socre);
	}
	//有参构造方法 输入四种类型
	public Teacher(String name,int age,boolean sex,double socre){
	//调用343.345行的实例变量 打印sex和socre
		
		this(sex,socre);
		this.name=name;
		this.age=age;
	//再打印356行给形参赋值的name和age
		System.out.println(this.name+this.age);
	}
}

class Test8{
	public static void main(String[]args){
	//第一种创建对象的方法 直接创建
		Computer c= new Computer();
		
	//第二种创建 先声明对象名 再分配
		Computer c1;
		c1=new Computer();
		
	//给c1对象name赋值
	c1.name="联想";
	//未给c对象属性赋值 打印c.name则为默认值 null
	System.out.println(c.name);
		
	//创建一个c2对象 c对象的值赋给c2
		Computer c2=c;
		c.name="DELL";
		c.money=5000;
		c.color="白色";
	//打印c2.color显示白色	
		System.out.println(c2.color);
	//c2.money的值现在是5000
	//c2.money++ 同时c.money也发生变化
	//c对象的属性变化 c2也变
		c2.money++;
	//输出c和c2.money都是相同地址 相同结果
		System.out.println(c.money);
		
	}
}
	//创建一个Computer类
class Computer{
	//name属性为String
	String name;
	//money属性为int
	int money;
	//color属性为String
	String color;
	
	//无参构造方法
	public Computer(){}
}

class Test9{
	public static void main(String[]args){
		//创建一个对象名为p
		person p = new person();
		//p对象里面的属性age赋值为4
		p.age=88;
		//创建一个对象名为p1
		person p1 = new person();
		//p1对象里的属性age赋值为6
		p1.age=25;
		
		//调用add方法                                                                 
		p.add(p1);
		
		//创建对象接收数组 要记得把后面的()改成[];
		person [] q=new person[3];
		q[0]=p ;
		q[1]=p1 ;
		//q[2]用来接收一个新的数组数值
		//没有赋值 默认为0
		q[2]=new person();
		//遍历数组x 
		for(int i=0;i<q.length;i++){
			System.out.println(q[i].age);
		}
	}
}
class person{
	String name;
	int age;
	double weight;
	
	
	//无参构造方法
	public person(){}
	public void add(person c){
		if(this.age>c.age){
			System.out.println("我比你大");
		}else if(this.age<c.age){
			System.out.println("我比你小");
		}else System.out.println("一样");
	}
}
//==============================================================================================
class HomeWork{
	public static void main(String[]args){
		Worker a = new Worker();
		Worker a1 = new Worker("王铁柱",58,3000);
		
		a1.work(8);
	}
}
class Worker{
	String name;
	int age;
	double salary;
	
	public Worker(){}
	public Worker(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
		System.out.println(this.name+this.age+this.salary);
	}
	
	public void work(){}
	
	public void work(int hours){
		 System.out.println(this.name+hours+"小时");
		
	} 
	
}

