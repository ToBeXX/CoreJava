package day12;
class TestAbstract01{
	public static void main(String[] args){
		// Animal animal = new Animal(); //�����಻�ܴ�������
		Animal animal  =  new Dog();	//ǿ��ʹ�ö�̬
		animal.eat();
	}
}
abstract class Animal{
	int a = 10;
	public abstract void eat();  //ֻ�з�������  û��ʵ��
	public abstract void sleep();		
	public Animal(){}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("Dog eat������");
	}
	public void sleep(){
		
	}
} 
abstract class Cat extends Animal{
	
} 