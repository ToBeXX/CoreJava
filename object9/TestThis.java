package code_day9;
class TestDog{
	//������
	public static void main(String[]args){
	//����һ����Ϊg�Ķ���
	//�����вι��������ֵ 
		Dog g =	new Dog ("����",1,"��ʿ��");
	}
}
//����һ��Dog��
class Dog{
	//�������������name��String����
	String name;
	//���������age������int����
	int age;
	//���������breed������String����
	String breed;
	
	//������޲ι��췽��
	public Dog(){}
	//������вι��췽��
	public Dog(String name,int age,String breed){
	//�βθ�ʵ��������ֵ
		this.name = name;
	//ͬ��
		this.age = age;
	//ͬ��
		this.breed = breed;
	}
	}
}
class TestCar{
	public static void main(String[]args){
	//��һ�ִ�������ķ��� ֱ�Ӵ���
		Car c= new Car();
		
	//�ڶ��ִ��� ������������ �ٷ���
		Car c1;
		c1=new Car();
		
	//��c1����name��ֵ
	c1.name="��ʱ��";
	//δ��c�������Ը�ֵ ��ӡc.name��ΪĬ��ֵ null
	System.out.println(c.name);
		
	//����һ��c2���� c�����ֵ����c2
		Car c2=c;
		c.name="�µ�";
		c.money=400000;
		c.color="��ɫ";
	//��ӡc2.color��ʾ��ɫ	
		System.out.println(c2.color);
	//c2.money��ֵ������400000
	//c2.money++ ͬʱc.moneyҲ�����仯
	//c��������Ա仯 c2Ҳ��
		c2.money++;
	//���c��c2.money������ͬ��ַ ��ͬ���
		System.out.println(c.money);
		
	}
}
	//����һ��Car��
class Car{
	//name����ΪString
	String name;
	//money����Ϊint
	int money;
	//color����ΪString
	String color;
	
	//�޲ι��췽��
	public Car(){}
}

class Test4{
	public static void main(String[]args){
		//����һ��������Ϊa
		Animals a = new Animals();
		//a�������������age��ֵΪ4
		a.age=4;
		//����һ��������Ϊb
		Animals b = new Animals();
		//b�����������age��ֵΪ6
		b.age=6;
		
		//����dog����                                                                 
		a.dog(b);
		
		//��������������� Ҫ�ǵðѺ����()�ĳ�[];
		Animals [] x=new Animals[3];
		x[0]=a;
		x[1]=b;
		//x[2]��������һ���µ�������ֵ
		//û�и�ֵ Ĭ��Ϊ0
		x[2]=new Animals();
		//��������x 
		for(int i=0;i<x.length;i++){
			System.out.println(x[i].age);
		}
	}
}
class Animals{
	String name;
	int age;
	double weight;
	String color;
	
	//�޲ι��췽��
	public Animals(){}
	public void dog(Animals c){
		if(this.age>c.age){
			System.out.println("�ұ����");
		}else if(this.age<c.age){
			System.out.println("�ұ���С");
		}else System.out.println("һ��");
	}
}
/*
����ʾ�������Լ���д
*/
//this�ؼ���
public class TestThis{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.m2();
	}
}
class Student{
	//��Ա����
	String name;
	boolean sex;
	int age;
	double score;
	public Student(){}
	public Student(String name,boolean sex,int age,double score){
		/*
		this�ĵ�һ���÷�----this.
		���ֲ�������ֵ����Ա����
		*/
		this();//�����ǹ��췽����Ч��һ��
		//this();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.score = score;
	}
	public void m1(){
		System.out.println("��һ���д���");
	}
	public void m2(){
		//���õ�ǰ�����m1����
		this.m1();
		System.out.println("�����������д���");
	}
}
//
class TestThis1{
	public static void main(String[] args){
		//��������
		Student1 s = new Student1("")
		//������÷���
		s.m2();
	}
}
class Student1{
	//��Ա����
	String name;
	boolean sex;
	int age;
	//���췽��
	public Student1(){
		System.out.println("�����޲ι��췽��");
	}
	public Student1(String name,boolean sex,int age){
		//this �ڶ����÷�----���õ�ǰ������޲ι��췽��
		this();
		//this��һ���÷�---this.
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//��������
	public void m1(){
		System.out.println("����m1");
	}
	public void m2(){
		//this��һ���÷�---this.
		this.m1();
		System.out.println("����m2");
	}
}
