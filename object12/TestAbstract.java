package code_day12;
//ʾ������
class TestAbstract01{
	public static void main(String[] args){
		// Animal animal = new Animal(); //�����಻����new��������
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
//����̳г����࣬����ʵ�ָ���ĳ��󷽷��������������ҲӦ��Ϊ������
class Dog extends Animal{
	//ʵ�ֳ������еĳ���eat����
	public void eat(){
		System.out.println("Dog eat������");
	}
	//ʵ�ֳ������еĳ���sleep����
	public void sleep(){
		
	}
} 
//Cat��û��ʵ�ָ���ĳ��󷽷������Ը�������ǳ����
abstract class Cat extends Animal{
	
} 
