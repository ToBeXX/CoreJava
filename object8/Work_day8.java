package code_day8;
import java.util.*;
/*
��1��
. ����һ�� Person ��
1 �������������䡢��ߡ����ء��ɼ����Ա����ԡ�
2 �����в��޲ι��췽����
3 ����Է�����˯���������ҽ��ܷ�������ӡ���е�����ֵ����
4 �����������д�������Ϊ���Ը�ֵ�������䷽��
*/
class TestPerson{
	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person("mgx",19,178,120,93,true);
		p1.name = "xiaoya";
		p1.age = 18;
		p1.length = 165.0;
		p1.weight = 90.0;
		p1.score = 94;
		p1.sex = false;
		p1.eat();
		p1.sleep();
		p1.introduce();
		p2.eat();
		p2.sleep();
		p2.introduce();
	}
}
class Person{
	String name;
	int age;
	double length;
	double weight;
	double score;
	boolean sex;
	public Person(){}
	public Person(String a, int b,double c,double d,double e ,boolean f){
		name = a;
		age = b;
		length = c;
		weight = d;
		score =  e;
		sex = f;
	}
	public void eat(){
		System.out.println(name+"��");
	}
	public void sleep(){
		System.out.println(name+"˯");
	}
	public void introduce(){
		System.out.println("����"+name+" ��"+age+"���� "+"��"+length+"cm");
	}
}
/*
��2��
����һ�� Computer�������ࣩ
1 ����Ʒ�ơ���С����ɫ����
2 �����в��޲ι��췽����
3 �������Ϸ������Ƶ���ô��뷽��
4 �����������д�������Ϊ���Ը�ֵ�������䷽��
*/
class TestComputer{
	public static void main(String[] args){
		Computer p1 = new Computer();
		Computer p2 = new Computer("����",21,"��ɫ");
		p1.name = "��˶";
		p1.size = 18;
		p1.color = "��ɫ";
		p1.game();
		p1.vedio();
		p1.coding();
		p2.game();
		p2.vedio();
		p2.coding();
	}
}
class Computer{
	String name;
	int size;
	String color;
	public Computer(){}
	public Computer(String a,int b,String c){
		name = a;
		size = b;
		color = c;
	}
	public void game(){
		System.out.println("����Ϸ");
	}
	public void vedio(){
		System.out.println("����Ƶ");
	}
	public void coding(){
		System.out.println("�ô���");
	}
}
/*
��3��
����һ�� Dog��������
1 ����������Ʒ�֡����䡢�Ա�����
2 �����в��޲ι��췽����
3 ����ԡ�˯���桢�з���
4 �����������д�������Ϊ���Ը�ֵ�������䷽��
*/
class TestDog{
	public static void main(String[] args){
		Dog d1 = new Dog();
		Dog d2 = new Dog("��","��ʿ��",2,true);
		d1.name = "����";
		d1.type = "��ĦҮ";
		d1.age = 2;
		d1.sex = false;
		d1.eat();
		d1.sleep();
		d1.play();
		d1.bark();
		d2.eat();
		d2.sleep();
		d2.play();
		d2.bark();
	}
}
class Dog{
	String name;
	String type;
	int age;
	boolean sex;
	public Dog(){}
	public Dog(String a,String b,int c,boolean d){
		name = a;
		type = b;
		age = c;
		sex = d;
	}
	public void eat(){
		System.out.println("��");
	}
	public void sleep(){
		System.out.println("˯");
	}
	public void play(){
		System.out.println("��");
	}
	public void bark(){
		System.out.println("��");
	}
}
/*
��4��
����һ�� Productor(��Ʒ)��
1 ����Ϊ����Ʒ�����۸�����������
2 �ṩ�в������޲����Ĺ��췽��
3 ������show ������չʾ��Ʒ����Ϣ��
4 ����������󣬴�ӡ�����Ʒ����Ϣ��
5 ���жϸ���Ʒ�Ƿ��ȱ���������=0�����ӡ����Ʒ��ȱ����
*/
class TestProductor{
	public static void main(String[] args){
		Productor d1 = new Productor();
		Productor d2 = new Productor("�µ�",40,13,"�Ϻ�");
		d1.name = "����";
		d1.price = 43;
		d1.number = 20;
		d1.address = "�¹�";
		d1.show();
		d2.show();
		judge(d1);
		judge(d2);
	}
	public static void judge(Productor n){
		if(n.number == 0){
			System.out.println(n.name+"��ȱ");
		}
		else{
			System.out.println(n.name+"����ȱ");
		}
	}
}
class Productor{
	String name;
	int price;
	int number;
	String address;
	public Productor(){}
	public Productor(String a,int b,int c,String d){
		name = a;
		price = b;
		number = c;
		address = d;
	}
	public void show(){
		System.out.println(name+"�۸���"+price+"�򣻿�滹��"+number+" ����������"+address);
	}
	
}
/*
��5��
. ��������Ϸ��
1 һ���� A ��һ����Ա���� v����һ����ֵ 100��
2 ����һ���࣬�� A ��ĳ�Ա���� v ���в¡�
3 �����������ʾ���ˣ�С������ʾС�ˣ���������ʾ�²��
��
*/
class GuessNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Number n = new Number();
		System.out.println("������һ�����ֽ��в´���Ϸ��");
		while(true){
			//boolean j = false;
			int num = sc.nextInt();
			boolean k = judge(n,num);
			if(k == true){
				System.out.println("��ϲ��¶���");
				break;
			}
		}
	}
	public static boolean judge(Number a,int i){
		if(a.v >i){
			System.out.println("���������С�ˣ����������룺");
			return false;
		}
		else if(a.v < i){
			System.out.println("��������´��ˣ����������룺");
			return false;
		}
		else{
			return true;
		}
	}
}
class Number{
	int v = 100;
}
/*
��6��
����һ���û���(User),����������û�����
���ԣ��û��������롢���䡢�绰���Ƿ�����(��-true)
�ṩ�в������޲����Ĺ��췽��
������show ������չʾ�û���������Ϣ��
����������󣬴�ӡ����û�����Ϣ�����жϸ��û��Ƿ����ߣ�
����-"�û����ڵ�½״̬"��������-"�û���δ��½
*/
class TestUser{
	public static void main(String[] args){
		User user1 = new User("a",1234,18,1234,false);
		User user2 = new User("a",2345,19,2345,true);
		User user3 = new User("a",3456,20,3456,false);
		User user4 = new User("a",4567,21,4567,true);
		judge(user1);
		judge(user2);
		judge(user3);
		judge(user4);
	}
	public static void judge(User n){
		if(n.isOnline == true){
			System.out.println("�û����ڵ�½״̬");
		}
		else{
			System.out.println("�û���δ��½");
		}
	}
}
class User{
	String name;
	int passWord;
	int age;
	int number;
	boolean isOnline;
	public User(){}
	public User(String a,int b,int c,int d,boolean e){
		name = a;
		age = b;
		number = c;
		isOnline = e;
	}
	public void show(){
		System.out.println("��ӡ��Ʒ��Ϣ");
	}
}
/*
��7��
����һ��Ա����(Employee):
����:����,�Ա�,������,����,�绰
�ṩ�޲���\�в����Ĺ��췽��
����һ�� show ����,չʾԱ����������Ϣ. �������Ա������
*/
class TestEmployee{
	public static void main(String[] args){
		Employee emp1 = new Employee("����",false,1999,3000.0,123);
		Employee emp2 = new Employee("��Ŷ",true,1998,4000.0,234);
		Employee emp3 = new Employee("����",false,1978,5000.0,345);
		Employee emp4 = new Employee("��ѽ",true,1994,6000.0,456);
		emp1.show();
		emp2.show();
		emp3.show();
		emp4.show();
	}
}
class Employee{
	String name;
	boolean sex;
	int birthday;
	double salary;
	int number;
	public Employee(){}
	public Employee(String a,boolean b,int c,double d,int e){
		name = a;
		sex = b;
		birthday = c;
		salary = d;
		number = e;
	}
	public void show(){
		System.out.println("��ӡԱ����Ϣ");
	}
}
/*
��8��
����һ��ѧ����(Student)
�������������䡢�ɼ����Ա�����
�ṩ�޲���\�в����Ĺ��췽��
����һ�� sayHi ����,չʾ������Ϣ
������ eat���ԣ����������ɷ�������
�������ѧ������Ϊ���Ը�ֵ�����ҵ��÷���
*/
class TestStudent{
	public static void main(String[] args){
		Student student1 = new Student("С��",18,90.1,false);
		Student student2 = new Student("mgx",19,90.2,true);
		Student student3 = new Student("haha",20,90.3,false);
		Student student4 = new Student("xixi",21,90.4,true);
		student1.sayHi();
		student2.sayHi();
		student3.sayHi();
		student4.sayHi();
		student1.eat();
		student1.eat("�㽶");
		student1.eat("�׷�",2);
		student2.eat();
		student2.eat("ƻ��");
		student2.eat("����",1);
		student3.eat();
		student3.eat("����");
		student3.eat("��",2);
		student4.eat();
		student4.eat("�ƹ�");
		student4.eat("��צ",3);
	}
}
class Student{
	String name;
	int age;
	double score;
	boolean sex;
	public Student(){}
	public Student(String a ,int b,double c,boolean d){
		name = a;
		age = b;
		score = c;
		sex = d;
	}
	public void sayHi(){
		System.out.println("��ӡѧ����Ϣ");
	}
	public void eat(){
		System.out.println(name+"�Է�");
	}
	public void eat(String food){
		System.out.println(name+"��"+food);
	}
	public void eat(String food ,int time){
		System.out.println(name+"��"+food+"����"+time+"Сʱ");
	}
}