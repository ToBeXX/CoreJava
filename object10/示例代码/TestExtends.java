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
		c.name = "�л���԰è";
		c.age = 1;
		
		c.eat();
		c.sleep();
		c.climbTree();
		
		
		Bird b = new Bird();
		b.name = "������";
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
//Dog�� �̳���  Animal��  extends�̳еĹؼ���
class Dog extends Animal{    //Dog��̳���Animal��
	public void swim(){
		System.out.println("��Ӿ");
	}
}
class Cat extends Animal{
	public void climbTree(){
		System.out.println("����");
	}
}
class Bird extends Animal{
	public void fly(){
		System.out.println("flying");
	}
}





