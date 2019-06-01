package day10;
class TestExtends{
	public static void main(String[] args){
		Dog d = new Dog();
		d.name = "wangcai";
		d.age = 10;
		
		d.eat();
		d.sleep();
		d.swim();
		
		
		Cat c = new Cat();
		c.name = "中华田园猫";
		c.age = 1;
		
		c.eat();
		c.sleep();
		c.climbTree();
		
		
		Bird b = new Bird();
		b.name = "雷震子";
		b.age = 2;
		
		b.eat();
		b.sleep();
		b.fly();
		
		
		
	}
}
class Animal{
	String name;
	int age;
	
	public void eat(){
		System.out.println("animal eat");
	}
	public void sleep(){
		System.out.println("animal sleep");
	}
}
//Dog类 继承于  Animal类  extends继承的关键字
class Dog extends Animal{    //Dog类继承于Animal类
	public void swim(){
		System.out.println("游泳");
	}
}
class Cat extends Animal{
	public void climbTree(){
		System.out.println("爬树");
	}
}
class Bird extends Animal{
	public void fly(){
		System.out.println("flying");
	}
}





