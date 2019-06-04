package day12;
class TestAbstract01{
	public static void main(String[] args){
		// Animal animal = new Animal(); //抽象类不能创建对象
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
class Dog extends Animal{
	public void eat(){
		System.out.println("Dog eat。。。");
	}
	public void sleep(){
		
	}
} 
abstract class Cat extends Animal{
	
} 