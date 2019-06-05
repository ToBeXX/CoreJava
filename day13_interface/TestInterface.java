package code_day13;
/*
示例代码上午
*/
//测试类
class TestInterface{
	public static void main(String[] args){
		Interface m = new SubInterface();	//多态的应用
		m.m1();
		m.m2();
	}
}
//接口
interface Interface{
	//属性是默认公开静态常量 public static final
	int a = 10;
	//方法是默认公开抽象方法 public abstract
	void m1();
	void m2();
}
//实现类   implements
//SubInterface 实现了 Interface接口
class SubInterface implements Interface{
	public void m1(){
		System.out.println("hello");
	}
	public void m2(){
		System.out.println("world");
	}
}

class TestInterface1{
	public static void main(String[] args){
		// Class a = new Class();	//错误 抽象类不能创建对象
		   Class a;  //抽象类可以声明引用
		
		// MyInterface m = new MyInterface();  //错误  接口不能创建对象 
		// MyInterface m  接口可以声明引用
		
		System.out.println(Class.b);	//20
		System.out.println(MyInterface.b);	//30
		System.out.println(MyInterface.a);	//40  能打印出来  因为接口中的属性默认为公开静态常量，可以用接口名直接访问
		// MyInterface.a = 50;  error
		// MyInterface.b = ;
		
	}
}
//定义的抽象类
abstract class Class{
	//非静态变量
	int a=10;
	//静态变量
	static int b = 20;
	//抽象类中有构造方法  在子类构造对象时先去创建父类对象时使用
	public Class(){}
	//抽象类中可以有非抽象方法
	public void m1(){}
	//公开抽象方法  抽象类中可以没有抽象方法
	/* public abstract void m2(); */
}
//接口 关键字interface   声明：interface 接口名
interface MyInterface{
	int a = 40;    				//属性是默认公开静态常量    public static final int a = 40;
	static int b = 30;
	// public MyInterface(){}   	错误  接口没有构造方法
	// public void m1(){}		//方法默认为公开抽象方法 public abstract void m1();
	/* public abstract void m2(); */	//与void m2(); 等价
	void m2();
}
/*
示例代码下午
*/
class TestInterface2{
	public static void main(String[] args){
		//声明一个动物类型数组as，里边有 dog cat fish bird dog五个对象
		Animal[] as = new Animal[]{
			new Dog(),
			new Cat(),
			new Fish(),
			new Bird(),
			new Dog()
		};
		//判断as数组中，会叫的动物个数
		int count = 0;
		for(int i=0;i<as.length;i++){
			//用instanceof进行判断是  可以理解为这个东西是不是会干什么
			//判断as[i]是不是会叫
			if(as[i] instanceof Shoutable){
				count++;
			}
		}
		System.out.println(count);
		
		//让as数组中会游泳动物游泳
		for(int i=0;i<as.length;i++){
			//判断是否会游泳
			if(as[i] instanceof Swimable){
				//如果会游泳将其强转为会游泳的类型
				Swimable sa = (Swimable)as[i];
				//调用游泳方法
				sa.swim();
			}
		}
		
	}
}
//接口  具有叫方法
interface Shoutable{
	public void shout();
}
//接口  具有游泳方法
interface Swimable{
	public void swim();
}
//动物类中具有吃方法和睡觉方法
class Animal{
	public void eat(){
		System.out.println("animal eat....");
	}
	public void sleep(){
		System.out.println("animal sleep....");
	}
}
//狗继承动物类，实现叫接口和游泳接口，必须实现这两个接口中的方法
class Dog extends Animal implements Shoutable,Swimable{
	public void shout(){
		System.out.println("shout...");
	}
	public void swim(){
		System.out.println("swimming...");
	}
}
//猫继承动物类 实现叫接口，必须实现叫接口中的叫方法
class Cat extends Animal implements Shoutable{
	//猫类中有自己的爬树方法
	public void climbTree(){
		System.out.println("climbTree...");
	}
	public void shout(){
		System.out.println("shout...");
	}
}
//鱼实现游泳接口，实现游泳接口中的游泳方法
class Fish extends Animal implements Swimable{
	public void swim(){
		System.out.println("swimming...");
	}
}
//鸟实现叫接口。必须实现叫接口的叫方法
class Bird extends Animal implements Shoutable{
	public void fly(){
		System.out.println("fly...");
	}
	public void shout(){
		System.out.println("shout...");
	}
}
/*
换灯泡示例代码第一遍
*/
class TestInterface3{
	public static void main(String[] args){
		//创建一个台灯对象
		Temp t = new Temp();
		//准备一个灯泡对象
		Light l = new WhiteLight();
		//调用台灯中的装灯泡方法将准备好的灯泡装进去
		t.setLight(l);
		//调用发光方法
		t.on(); 
	}
}
//定义一个灯泡接口具有亮方法
interface Light{
	void shine();
}
//定义一个台灯类
class Temp{
	//有一个灯泡类型的属性
	private Light light;
	//有一个按灯泡的方法，将准备好的灯泡按上去
	public void setLight(Light light){
		this.light = light;
	}
	//有一个亮方法，让台灯的灯泡发光
	public void on(){
		light.shine();
	}
} 
//定义一个灯泡类
class GreenLight implements Light{
	public void shine(){
		System.out.println("绿的发光");
	}
}
//红灯泡实现灯泡接口，发红光
class RedLight implements Light{
	public void shine(){
		System.out.println("发红光...");
	}
}
//白灯泡实现灯泡接口，发白光
class WhiteLight implements Light{
	public void shine(){
		System.out.println("发白光...");
	}
}
//第二遍
//首先有一个灯泡接口
interface Bulb{
	void shine();
}
//有不同类型的灯泡实现这个接口
class GreenBulb implements Bulb{
	public void shine(){
		System.out.println("发绿光");
	}
}
class YellowBulb implements Bulb{
	public void shine(){
		System.out.println("发黄光");
	}
}
//有一个台灯类，里边有灯泡属性，具有按灯泡的方法，具有打开灯泡的方法
class Lamp1{
	Bulb bulb;
	public void setBulb(Bulb bulb){
		this.bulb = bulb;
	}
	public void lightOn(){
		bulb.shine();
	}
}
//测试类
class TestLamp{
	public static void main(String[] args){
		//先创建一个台灯对象
		Lamp1 l = new Lamp1();
		//再创建一个灯泡
		YellowBulb yellowBulb = new YellowBulb(); 
		//调用台灯中的装灯泡方法将灯泡装进去
		l.setBulb(yellowBulb);
		//调用发光方法
		l.lightOn();
		//创建一个绿色灯泡
		GreenBulb greenBulb = new GreenBulb();
		//将灯泡换成绿色灯泡
		l.setBulb(greenBulb);
		//调用发光方法
		l.lightOn();
	}
}
//第三遍
interface Bulb1{
	void shine();
}
//有不同类型的灯泡实现这个接口
class BuleBulb implements Bulb1{
	public void shine(){
		System.out.println("发蓝光");
	}
}
class BlackBulb implements Bulb1{
	public void shine(){
		System.out.println("发黑光");
	}
}
//有一个台灯类，里边有灯泡属性，具有按灯泡的方法，具有打开灯泡的方法
class Lamp2{
	Bulb1 bulb;
	public void setBulb(Bulb1 bulb){
		this.bulb = bulb;
	}
	public void lightOn(){
		bulb.shine();
	}
}
//测试类
class TestLamp1{
	public static void main(String[] args){
		//先创建一个台灯对象
		Lamp2 l = new Lamp2();
		//再创建一个灯泡
		BuleBulb buleBulb = new BuleBulb(); 
		//调用台灯中的装灯泡方法将灯泡装进去
		l.setBulb(buleBulb);
		//调用发光方法
		l.lightOn();
		//再创建一个灯泡
		BlackBulb blackBulb = new BlackBulb();
		//将灯泡换成黑色灯泡
		l.setBulb(blackBulb);
		//调用发光方法
		l.lightOn();
	}
}