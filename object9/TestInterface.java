package code_day9;
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
interface Bulb{
	public abstract void light();
}
class YellowLight implements Bulb{
	public void light(){
		System.out.println("发黄光");
	}
}
class RedLight implements Bulb{
	public void light(){
		System.out.println("发红光");
	}
}
class Light{
	Bulb bulb;
	public void setBulb(Bulb bulb){
		this.bulb = bulb;
	}
	public void lightOn(){
		bulb.light();
	}
}
class TestInterface1{
	public static void main(String[] args){
		Light light = new Light();
		RedLight redlight = new RedLight();
		light.setBulb(redlight);
		light.lightOn();
		YellowLight yellowlight = new YellowLight();
		light.setBulb(yellowlight);
		light.lightOn();
	}
}