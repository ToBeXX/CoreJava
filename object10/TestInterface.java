package code_day10;
//接口
public class TestInterface{
	public static void main(String[] args){
		IA a1 = new MyClass();
		a1.m1();
		a1.m2();
		System.out.println(a1.a);
	}
}
//定义一个接口
interface IA{
	//公开静态常量
	public static final int a = 10;
	public static final double b = 20.0;
	//公开抽象方法
	public abstract void m1();
	public abstract void m2();
}
//接口的实现---关键字：implements
class MyClass implements IA{
	//接口中抽象方法的实现
	public void m1(){}
	public void m2(){}
}

/*
接口实现解耦和
*/
//定义灯泡接口
interface Bulb{
	//有一个发光的抽象方法
	public abstract void light();
}
//定义黄灯类实现灯泡接口
class YellowLight implements Bulb{
	//实现接口中的方法
	public void light(){
		System.out.println("发黄光");
	}
}
//定义红灯类实现灯泡接口
class RedLight implements Bulb{
	//实现接口中的方法
	public void light(){
		System.out.println("发红光");
	}
}
//定义电灯类
class Light{
	//定义灯泡接口属性
	Bulb bulb;
	//声明方法用来传递实现的串口
	public void setBulb(Bulb bulb){
		this.bulb = bulb;
	}
	//声明发光方法，会调用实现了接口的发光方法
	public void lightOn(){
		bulb.light();
	}
}
class TestInterface1{
	public static void main(String[] args){
		//创造一个灯对象
		Light light = new Light();
		//创造红灯对象
		RedLight redlight = new RedLight();
		
		light.setBulb(redlight);
		light.lightOn();
		//创造黄灯对象
		YellowLight yellowlight = new YellowLight();
		light.setBulb(yellowlight);
		light.lightOn();
	}
}



//Static 
class TestStatic{
	public static void main(String[] args){
		System.out.println(Static.age);
		System.out.println(Static.a(3));
	}	
}
class Static{
	static int age = 10;
	static String name = "xiaoya";
	double salary = 3000.0; 
	public static int a(int ab){
		System.out.println("我是女生。漂亮的女生");
		return age;
	}
}