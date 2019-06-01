package p1;
class Test{
//主函数入口
public static void main(String[]args){
	//为空调类创建一个a的对象 无参
	AirConditioner a = new AirConditioner();
	
	//为类创建一个a1的对象
	AirConditioner a1= new AirConditioner("格力",3500);

	//a1赋值给42行setBrand
	a1.setBrand("Dell");
	
	//a1赋值给53行money
	a1.setMoney(2020.0);
	
	//调用close方法 第42行
	a1.close(2);
	
	//接收money和brand的值 并打印
	//由于brand和money是私有类 所以是getMoney和getBrand
	System.out.println(a1.getMoney()+a1.getBrand());

	}
}
//创建一个空调类
class AirConditioner{
	//把String brand变为私有类 加上private
	private String brand;
	//把double money变为私有类
	private double money; 
	
	//默认无参构造方法 打印空调开机了
	public AirConditioner(){
	//打印 输出语句
		System.out.println("空调开机了...");
	}
	public AirConditioner(String brand,double money){
		//为实例变量赋值
		this.brand = brand;
		this.money = money;
	}
	//调用close方法 输入一个数字 给n赋值 打印在几分钟后关闭
	 public void close(int n){
		System.out.println("空调将在"+ n +"分钟后关闭");
	} 
	
	//set方法为属性brand赋值 String类型
	public void setBrand(String brand){
		this.brand=brand;
	}
	
	//get方法取brand的值并返回
	public String getBrand(){
		return brand;
	}
	
	//set方法为属性money赋值 double类型
	public void setMoney(double money){
		this.money=money;
	}
	
	//get方法取money值并返回
	public double getMoney(){
		return money;
	}
}

class Test1{
	public static void main(String[]args){
		//为User类创建一个u对象
		User u = new User();
		//为User类创建一个u1对象 并赋值
		User u1 = new User("司潇涵",110120119,true);
		//为User类创建一个u2对象 并赋值
		User u2 = new User("袁闻楷",120120120,false);
		//为User类创建一个u3对象 并赋值
		User u3 = new User("卢飞",110110110,true);
		//为User类创建一个ua数组 并赋值 长度为3
		User [] ua =new User[3];
		//0下标代表u1地址
		ua[0]=u1;
		//1下标代表u2地址
		ua[1]=u2;
		//2下标代表u3地址
		ua[2]=u3;
		//创建一个累加器记录次数
		int sum=0;
		//遍历数组
		for(int i=0;i<ua.length;i++){
		//如果数组中有 true 则累加器sum+1
			if(ua[i].getOnline()==true){
				sum+=1;
			}
		//打印数组中所有对象名字
		System.out.println(ua[i].getName());
			
	}	//打印有计数器sum值
		System.out.println("有"+sum+"人在线");
	}
}
//创建一个User类
class User{
	//属性name 为私有性
	private String name;
	//属性password为私有性
	private double password;
	//属性online为私有性
	private boolean online;
	
	//接收无参构造方法
	public User(){}

	//有参构造方法 参数是String double boolean类型
	public User(String name,double password,boolean online){
		//形参给实例变量name赋值
		this.name = name;
		//赋值同上
		this.password = password;
		//赋值同上
		this.online = online;
		}
	
	//因为name属性为私有性 所以用setName给name赋值
	public void setName(String name){
		this.name=name;
	}
	//取值用 对象名 get属性名()
	public String getName(){
		return name;
	}
	////因为password属性为私有性 所以用setPassword给password赋值
	public void setPassword(double password){
		this.password=password;
	}
	//取值
	public double getPassword(){
		return password;
	}
	////因为online属性为私有性 所以用setOnline给online赋值
	public void setOnline(boolean online){
		this.online=online;
	}
	//取值
	public boolean getOnline(){
		return online;
	}
}

class Test2{
	//主函数
	public static void main(String[] args){
		//为类创建对象 e1
		Employee e1 = new Employee();
		//为e1属性name赋值 因为name属性封装为私有性 所以setName
		e1.setName("王铁柱");
		//创建对象 e2
		Employee e2 = new Employee();
		//为e2属性name赋值 因为name属性封装为私有性 所以setName
		e2.setName("张全蛋");
		e2.setSalary(7654.32);
		//创建对象 e3 
		Employee e3 = new Employee();
		//为e3属性name赋值 因为name属性封装为私有性 所以setName
		e3.setName("王小花");
		e3.setMonth(2);
		
		//创建Employee类型 em数组 长度为3
		Employee[] em=new Employee[3];
		em[0]=e1;
		em[1]=e2;
		em[2]=e3;
		
		//属性输出
		e1.show();
		e2.show();
		e3.show();
		
	}
}
class Employee{
	//定义属性，封装 加上private变为私有性
	private String name;
	private int month;
	private double salary;
	
	//定义set 方法赋值name
	public void setName(String name){
		this.name=name;
	}
	//定义set 方法赋值month
	public void setMonth(int month){
		this.month=month;
	}
	//定义set 方法赋值salary
	public void setSalary(double salary){
		this.salary=salary;
	}
	//定义 get方法取值name
	public String getName(){
		return name;
	}
	//定义 get方法取值month
	public int getMonth(){
		return month;
	}
	//定义 get方法取值salary
	public double getSalary(){
		return salary;
	}
	
	//定义show方法
	public void show(){
		System.out.println(getName()+" "+getMonth()+" "+getSalary());
	}
	
}
//===================================================示例代码!示例代码!示例代码!=======================================================
//===================================================↓↓↓ ↓↓↓ ↓↓↓ ↓↓↓ ↓↓↓ ↓↓↓ ↓↓↓=======================================================

//继承示例代码
class Test00{
	public static void main(String[]args){
		//创建狗对象
		Dog d = new Dog();
		//狗对象调用吃方法 没有被覆盖 打印吃饭
		d.eat();
		//狗对象调用睡方法  打印睡觉
		d.sleep();
		
		//创建猫对象
		Cat c= new Cat();
		//猫对象调用睡方法 打印睡觉
		c.sleep();
	}
}

//创建一个Animal类
class Animals{
	//属性name和age
	String name;
	//String和int类型
	int age;
	
	//调用吃方法 打印 吃饭
	public void eat(){
		System.out.println("吃饭");
	}
	//调用睡方法 打印 睡觉
	public void sleep(){
		System.out.println("睡觉");
	}
}
//创建一个 狗类 继承 动物类
class Dog extends Animals{
	//参数表不同 构成重载 不会覆盖 不会打印汪汪
	public void wangwang(){
		System.out.println("汪汪");
	}
}
//创建一个 猫类 继承 动物类
class Cat extends Animals{
}
//创建一个鱼类 继承 动物类
class Fish extends Animals{
}

//覆盖示例代码
class Test01{
	public static void main(String[]args){
		//创建奥迪对象
		Audi d = new Audi();
		
		//调用color属性 默认值为黑色
		//第301行覆盖了父类的默认值 所以打印 白色
		d.color();
		//调用money方法 被覆盖 打印50w
		d.money();
		//创建宝马对象
		Bmw c= new Bmw();
		//调用color 为黑色
		c.color();
	}
}
//创建车类
class Car{
	//属性为String类型的颜色和价格
	String color;
	String money;
	
	public void color(){
		System.out.println("黑色");
	}
	public void money(){
		System.out.println("1000");
	}
}
//创建奥迪类继承车类
class Audi extends Car{
	
	//覆盖父类 Car方法重写 覆盖后 打印为白色
	public void color(){
		System.out.println("白色");
	}
	
	//覆盖父类 money方法 money为50w
	//如果不覆盖 直接打印父类的默认money值1000
	public void money(){
		System.out.println("50W");
		
	} 
}
//创建宝马类继承车类
class Bmw extends Car{
}

//封装示例代码
class Test02{
	public static void main(String[] args){
		//为Game创建对象
		Game g = new Game();
		//属性私有化 所以用set给属性赋值
		g.setName("街头篮球");
		g.setAge(14);
		g.setBreed("第三人称");
		//用get取值 getName
		System.out.println(g.getName()+"\t"+g.getAge()+"\t"+g.getBreed());

	}
}
class Game{
	//创建name age breed三个属性并封装
	private String name;
	private int age;	
	private String breed;;
	
	public void setName(String name){
		//形参给实例变量赋值
		//用	set赋值		
		this.name = name;
	}
		//返回	用get接收
	public String getName(){
		return name;
	}
	
	//set属性名  get属性名  属性名的首字母大写
	//set方法  ---》为属性赋值
	public void setAge(int age){
		if(age>=0&&age<=150){		//数据检测
			this.age = age;
		}
	}
	//get方法  ---》获取属性的值
	public int getAge(){
		return age;
	}
	//用set给breed赋值
	public void setBreed(String breed){
		this.breed = breed;
	}
	//用get接收breed的值
	public  String getBreed(){
		return breed;
	}
}

//继承 继承 代码
class Test03{
	public static void main(String[] args){
		Banana b = new Banana();
		b.taste = "甜";
		b.money = 10;
		
		//父类中m1m2的方法是打印好吃不贵经济实惠
		//子类继承后没有覆盖方法 所以调用m1m2直接打印
		b.m1();   	//好吃不贵
		b.m2();		//经济实惠	
		
		Orange c = new Orange();
	//orange 继承的Banana 先找到父类里面的m3
	//打印出 黄色的
		c.m3();   //黄色的 
		
	//Banana继承的Fruits 找到父类里面的m1 m2
	//默认m1 m2方法是打印 好吃不贵 经济实惠
		c.m1();	  //好吃不贵
		
		c.m2();   //经济实惠
	}
}
//创建一个Fruits类
class Fruits{
	//属性味道和价格
	String taste;
	int money;
	//定义方法m1
	public void m1(){
		System.out.println("好吃不贵");
	}
	//定义方法m2
	public void m2(){
		System.out.println("经济实惠");
	}
	//默认无参构造方法
	public Fruits(){}
}
//创建 香蕉类继承水果类
class Banana extends Fruits{
	public Banana(){}
//香蕉类比父类多出一个m3方法
	public void m3(){
		System.out.println("黄色的");
	}
}
//创建 一个橘子类 继承香蕉类
class Orange extends Banana{
}

//=======================================================		 第二遍		==========================================================
//=======================================================		示例代码	==========================================================
//=======================================================	 ↓↓↓↓↓↓↓↓↓↓↓↓↓	==========================================================
//继承示例代码
class Test000{
	public static void main(String[]args){
		//创建狗对象
		Dog d = new Dog();
		//狗对象调用吃方法 没有被覆盖 打印吃饭
		d.eat();
		//狗对象调用睡方法  打印睡觉
		d.sleep();
		
		//创建猫对象
		Cat c= new Cat();
		//猫对象调用睡方法 打印睡觉
		c.sleep();
	}
}

//创建一个Animal类
class Animals{
	//属性name和age
	String name;
	//String和int类型
	int age;
	
	//调用吃方法 打印 吃饭
	public void eat(){
		System.out.println("吃饭");
	}
	//调用睡方法 打印 睡觉
	public void sleep(){
		System.out.println("睡觉");
	}
}
//创建一个 狗类 继承 动物类
class Dog extends Animals{
	//参数表不同 构成重载 不会覆盖 不会打印汪汪
	public void wangwang(){
		System.out.println("汪汪");
	}
}
//创建一个 猫类 继承 动物类
class Cat extends Animals{
}
//创建一个鱼类 继承 动物类
class Fish extends Animals{
}

//覆盖示例代码
class Test010{
	public static void main(String[]args){
		//创建奥迪对象
		Audi d = new Audi();
		
		//调用color属性 默认值为黑色
		//第301行覆盖了父类的默认值 所以打印 白色
		d.color();
		//调用money方法 被覆盖 打印50w
		d.money();
		//创建宝马对象
		Bmw c= new Bmw();
		//调用color 为黑色
		c.color();
	}
}
//创建车类
class Car{
	//属性为String类型的颜色和价格
	String color;
	String money;
	
	public void color(){
		System.out.println("黑色");
	}
	public void money(){
		System.out.println("1000");
	}
}
//创建奥迪类继承车类
class Audi extends Car{
	
	//覆盖父类 Car方法重写 覆盖后 打印为白色
	public void color(){
		System.out.println("白色");
	}
	
	//覆盖父类 money方法 money为50w
	//如果不覆盖 直接打印父类的默认money值1000
	public void money(){
		System.out.println("50W");
		
	} 
}
//创建宝马类继承车类
class Bmw extends Car{
}

//封装示例代码
class Test020{
	public static void main(String[] args){
		//为Game创建对象
		Game g = new Game();
		//属性私有化 所以用set给属性赋值
		g.setName("街头篮球");
		g.setAge(14);
		g.setBreed("第三人称");
		//用get取值 getName
		System.out.println(g.getName()+"\t"+g.getAge()+"\t"+g.getBreed());

	}
}
class Game{
	//创建name age breed三个属性并封装
	private String name;
	private int age;	
	private String breed;;
	
	public void setName(String name){
		//形参给实例变量赋值
		//用	set赋值		
		this.name = name;
	}
		//返回	用get接收
	public String getName(){
		return name;
	}
	
	//set属性名  get属性名  属性名的首字母大写
	//set方法  ---》为属性赋值
	public void setAge(int age){
		if(age>=0&&age<=150){		//数据检测
			this.age = age;
		}
	}
	//get方法  ---》获取属性的值
	public int getAge(){
		return age;
	}
	//用set给breed赋值
	public void setBreed(String breed){
		this.breed = breed;
	}
	//用get接收breed的值
	public  String getBreed(){
		return breed;
	}
}

//继承 继承 代码
class Test030{
	public static void main(String[] args){
		Banana b = new Banana();
		b.taste = "甜";
		b.money = 10;
		
		//父类中m1m2的方法是打印好吃不贵经济实惠
		//子类继承后没有覆盖方法 所以调用m1m2直接打印
		b.m1();   	//好吃不贵
		b.m2();		//经济实惠	
		
		Orange c = new Orange();
	//orange 继承的Banana 先找到父类里面的m3
	//打印出 黄色的
		c.m3();   //黄色的 
		
	//Banana继承的Fruits 找到父类里面的m1 m2
	//默认m1 m2方法是打印 好吃不贵 经济实惠
		c.m1();	  //好吃不贵
		
		c.m2();   //经济实惠
	}
}
//创建一个Fruits类
class Fruits{
	//属性味道和价格
	String taste;
	int money;
	//定义方法m1
	public void m1(){
		System.out.println("好吃不贵");
	}
	//定义方法m2
	public void m2(){
		System.out.println("经济实惠");
	}
	//默认无参构造方法
	public Fruits(){}
}
//创建 香蕉类继承水果类
class Banana extends Fruits{
	public Banana(){}
//香蕉类比父类多出一个m3方法
	public void m3(){
		System.out.println("黄色的");
	}
}
//创建 一个橘子类 继承香蕉类
class Orange extends Banana{
}

//=======================================================		练习题		==============================================================
//=======================================================		↓↓↓↓↓↓		==============================================================
class E{
	public static void main(){
		
	}
}
class Monkey{
	
}
class People extends Monkey{
	
}

