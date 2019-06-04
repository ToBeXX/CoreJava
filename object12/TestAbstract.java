package code_day12;
//示例代码
class TestAbstract01{
	public static void main(String[] args){
		// Animal animal = new Animal(); //抽象类不能用new创建对象
		Animal animal  =  new Dog();	//强制使用多态
		animal.eat();
	}
}
abstract class Animal{
	int a = 10;
	public abstract void eat();  //只有方法声明  没有实现
	public abstract void sleep();		
	public Animal(){}
}
//子类继承抽象父类，必须实现父类的抽象方法，否则这个子类也应该为抽象类
class Dog extends Animal{
	//实现抽象父类中的抽象eat方法
	public void eat(){
		System.out.println("Dog eat。。。");
	}
	//实现抽象父类中的抽象sleep方法
	public void sleep(){
		
	}
} 
//Cat类没有实现父类的抽象方法，所以该类必须是抽象的
abstract class Cat extends Animal{
	
} 
