package day10;
class TestExtends01{
	public static void main(String[] args){
		Dog01 d = new Dog01();
		d.name = "������";
		d.age = 1;
		d.eat();		
		d.sleep();
		d.swim();
		
	}
}
class Animal01{
	String name;
	int age;
	
	public void eat(){
		System.out.println("animal eat");
	}
	public void sleep(){
		System.out.println("animal sleep");
	}
}
class Dog01 extends Animal01{  
	public void eat(){
		System.out.println("animal eat");
	}
	//�������и��Ǹ���ĳԷ���
	public void eat(String food){
		System.out.println("dog eat gutou");
	}
	
	public void swim(){
		System.out.println("��Ӿ");
	}
}
class Cat01 extends Animal01{
	public void climbTree(){
		System.out.println("����");
	}
}
class Bird01 extends Animal01{
	public void fly(){
		System.out.println("flying");
	}
}





