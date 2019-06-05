package day13;
class TestInterface03{
	public static void main(String[] args){
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
			if(as[i] instanceof Shoutable){
				count++;
			}
		}
		System.out.println(count);
		
		//让as数组中会游泳动物游泳
		for(int i=0;i<as.length;i++){
			if(as[i] instanceof Swimable){
				Swimable sa = (Swimable)as[i];
				sa.swim();
			}
		}
		
	}
}
interface Shoutable{
	public void shout();
}
interface Swimable{
	public void swim();
}
class Animal{
	public void eat(){
		System.out.println("animal eat....");
	}
	public void sleep(){
		System.out.println("animal sleep....");
	}
}
class Dog extends Animal implements Shoutable,Swimable{
	public void shout(){
		System.out.println("shout...");
	}
	public void swim(){
		System.out.println("swimming...");
	}
}
class Cat extends Animal implements Shoutable{
	public void climbTree(){
		System.out.println("climbTree...");
	}
	public void shout(){
		System.out.println("shout...");
	}
}
class Fish extends Animal implements Swimable{
	public void swim(){
		System.out.println("swimming...");
	}
}
class Bird extends Animal implements Shoutable{
	public void fly(){
		System.out.println("fly...");
	}
	public void shout(){
		System.out.println("shout...");
	}
}












