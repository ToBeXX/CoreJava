package p1;
class Test{
//���������
public static void main(String[]args){
	//Ϊ�յ��ഴ��һ��a�Ķ��� �޲�
	AirConditioner a = new AirConditioner();
	
	//Ϊ�ഴ��һ��a1�Ķ���
	AirConditioner a1= new AirConditioner("����",3500);

	//a1��ֵ��42��setBrand
	a1.setBrand("Dell");
	
	//a1��ֵ��53��money
	a1.setMoney(2020.0);
	
	//����close���� ��42��
	a1.close(2);
	
	//����money��brand��ֵ ����ӡ
	//����brand��money��˽���� ������getMoney��getBrand
	System.out.println(a1.getMoney()+a1.getBrand());

	}
}
//����һ���յ���
class AirConditioner{
	//��String brand��Ϊ˽���� ����private
	private String brand;
	//��double money��Ϊ˽����
	private double money; 
	
	//Ĭ���޲ι��췽�� ��ӡ�յ�������
	public AirConditioner(){
	//��ӡ ������
		System.out.println("�յ�������...");
	}
	public AirConditioner(String brand,double money){
		//Ϊʵ��������ֵ
		this.brand = brand;
		this.money = money;
	}
	//����close���� ����һ������ ��n��ֵ ��ӡ�ڼ����Ӻ�ر�
	 public void close(int n){
		System.out.println("�յ�����"+ n +"���Ӻ�ر�");
	} 
	
	//set����Ϊ����brand��ֵ String����
	public void setBrand(String brand){
		this.brand=brand;
	}
	
	//get����ȡbrand��ֵ������
	public String getBrand(){
		return brand;
	}
	
	//set����Ϊ����money��ֵ double����
	public void setMoney(double money){
		this.money=money;
	}
	
	//get����ȡmoneyֵ������
	public double getMoney(){
		return money;
	}
}

class Test1{
	public static void main(String[]args){
		//ΪUser�ഴ��һ��u����
		User u = new User();
		//ΪUser�ഴ��һ��u1���� ����ֵ
		User u1 = new User("˾�캭",110120119,true);
		//ΪUser�ഴ��һ��u2���� ����ֵ
		User u2 = new User("Ԭ�ſ�",120120120,false);
		//ΪUser�ഴ��һ��u3���� ����ֵ
		User u3 = new User("¬��",110110110,true);
		//ΪUser�ഴ��һ��ua���� ����ֵ ����Ϊ3
		User [] ua =new User[3];
		//0�±����u1��ַ
		ua[0]=u1;
		//1�±����u2��ַ
		ua[1]=u2;
		//2�±����u3��ַ
		ua[2]=u3;
		//����һ���ۼ�����¼����
		int sum=0;
		//��������
		for(int i=0;i<ua.length;i++){
		//����������� true ���ۼ���sum+1
			if(ua[i].getOnline()==true){
				sum+=1;
			}
		//��ӡ���������ж�������
		System.out.println(ua[i].getName());
			
	}	//��ӡ�м�����sumֵ
		System.out.println("��"+sum+"������");
	}
}
//����һ��User��
class User{
	//����name Ϊ˽����
	private String name;
	//����passwordΪ˽����
	private double password;
	//����onlineΪ˽����
	private boolean online;
	
	//�����޲ι��췽��
	public User(){}

	//�вι��췽�� ������String double boolean����
	public User(String name,double password,boolean online){
		//�βθ�ʵ������name��ֵ
		this.name = name;
		//��ֵͬ��
		this.password = password;
		//��ֵͬ��
		this.online = online;
		}
	
	//��Ϊname����Ϊ˽���� ������setName��name��ֵ
	public void setName(String name){
		this.name=name;
	}
	//ȡֵ�� ������ get������()
	public String getName(){
		return name;
	}
	////��Ϊpassword����Ϊ˽���� ������setPassword��password��ֵ
	public void setPassword(double password){
		this.password=password;
	}
	//ȡֵ
	public double getPassword(){
		return password;
	}
	////��Ϊonline����Ϊ˽���� ������setOnline��online��ֵ
	public void setOnline(boolean online){
		this.online=online;
	}
	//ȡֵ
	public boolean getOnline(){
		return online;
	}
}

class Test2{
	//������
	public static void main(String[] args){
		//Ϊ�ഴ������ e1
		Employee e1 = new Employee();
		//Ϊe1����name��ֵ ��Ϊname���Է�װΪ˽���� ����setName
		e1.setName("������");
		//�������� e2
		Employee e2 = new Employee();
		//Ϊe2����name��ֵ ��Ϊname���Է�װΪ˽���� ����setName
		e2.setName("��ȫ��");
		e2.setSalary(7654.32);
		//�������� e3 
		Employee e3 = new Employee();
		//Ϊe3����name��ֵ ��Ϊname���Է�װΪ˽���� ����setName
		e3.setName("��С��");
		e3.setMonth(2);
		
		//����Employee���� em���� ����Ϊ3
		Employee[] em=new Employee[3];
		em[0]=e1;
		em[1]=e2;
		em[2]=e3;
		
		//�������
		e1.show();
		e2.show();
		e3.show();
		
	}
}
class Employee{
	//�������ԣ���װ ����private��Ϊ˽����
	private String name;
	private int month;
	private double salary;
	
	//����set ������ֵname
	public void setName(String name){
		this.name=name;
	}
	//����set ������ֵmonth
	public void setMonth(int month){
		this.month=month;
	}
	//����set ������ֵsalary
	public void setSalary(double salary){
		this.salary=salary;
	}
	//���� get����ȡֵname
	public String getName(){
		return name;
	}
	//���� get����ȡֵmonth
	public int getMonth(){
		return month;
	}
	//���� get����ȡֵsalary
	public double getSalary(){
		return salary;
	}
	
	//����show����
	public void show(){
		System.out.println(getName()+" "+getMonth()+" "+getSalary());
	}
	
}
//===================================================ʾ������!ʾ������!ʾ������!=======================================================
//===================================================������ ������ ������ ������ ������ ������ ������=======================================================

//�̳�ʾ������
class Test00{
	public static void main(String[]args){
		//����������
		Dog d = new Dog();
		//��������óԷ��� û�б����� ��ӡ�Է�
		d.eat();
		//���������˯����  ��ӡ˯��
		d.sleep();
		
		//����è����
		Cat c= new Cat();
		//è�������˯���� ��ӡ˯��
		c.sleep();
	}
}

//����һ��Animal��
class Animals{
	//����name��age
	String name;
	//String��int����
	int age;
	
	//���óԷ��� ��ӡ �Է�
	public void eat(){
		System.out.println("�Է�");
	}
	//����˯���� ��ӡ ˯��
	public void sleep(){
		System.out.println("˯��");
	}
}
//����һ�� ���� �̳� ������
class Dog extends Animals{
	//������ͬ �������� ���Ḳ�� �����ӡ����
	public void wangwang(){
		System.out.println("����");
	}
}
//����һ�� è�� �̳� ������
class Cat extends Animals{
}
//����һ������ �̳� ������
class Fish extends Animals{
}

//����ʾ������
class Test01{
	public static void main(String[]args){
		//�����µ϶���
		Audi d = new Audi();
		
		//����color���� Ĭ��ֵΪ��ɫ
		//��301�и����˸����Ĭ��ֵ ���Դ�ӡ ��ɫ
		d.color();
		//����money���� ������ ��ӡ50w
		d.money();
		//�����������
		Bmw c= new Bmw();
		//����color Ϊ��ɫ
		c.color();
	}
}
//��������
class Car{
	//����ΪString���͵���ɫ�ͼ۸�
	String color;
	String money;
	
	public void color(){
		System.out.println("��ɫ");
	}
	public void money(){
		System.out.println("1000");
	}
}
//�����µ���̳г���
class Audi extends Car{
	
	//���Ǹ��� Car������д ���Ǻ� ��ӡΪ��ɫ
	public void color(){
		System.out.println("��ɫ");
	}
	
	//���Ǹ��� money���� moneyΪ50w
	//��������� ֱ�Ӵ�ӡ�����Ĭ��moneyֵ1000
	public void money(){
		System.out.println("50W");
		
	} 
}
//����������̳г���
class Bmw extends Car{
}

//��װʾ������
class Test02{
	public static void main(String[] args){
		//ΪGame��������
		Game g = new Game();
		//����˽�л� ������set�����Ը�ֵ
		g.setName("��ͷ����");
		g.setAge(14);
		g.setBreed("�����˳�");
		//��getȡֵ getName
		System.out.println(g.getName()+"\t"+g.getAge()+"\t"+g.getBreed());

	}
}
class Game{
	//����name age breed�������Բ���װ
	private String name;
	private int age;	
	private String breed;;
	
	public void setName(String name){
		//�βθ�ʵ��������ֵ
		//��	set��ֵ		
		this.name = name;
	}
		//����	��get����
	public String getName(){
		return name;
	}
	
	//set������  get������  ������������ĸ��д
	//set����  ---��Ϊ���Ը�ֵ
	public void setAge(int age){
		if(age>=0&&age<=150){		//���ݼ��
			this.age = age;
		}
	}
	//get����  ---����ȡ���Ե�ֵ
	public int getAge(){
		return age;
	}
	//��set��breed��ֵ
	public void setBreed(String breed){
		this.breed = breed;
	}
	//��get����breed��ֵ
	public  String getBreed(){
		return breed;
	}
}

//�̳� �̳� ����
class Test03{
	public static void main(String[] args){
		Banana b = new Banana();
		b.taste = "��";
		b.money = 10;
		
		//������m1m2�ķ����Ǵ�ӡ�óԲ��󾭼�ʵ��
		//����̳к�û�и��Ƿ��� ���Ե���m1m2ֱ�Ӵ�ӡ
		b.m1();   	//�óԲ���
		b.m2();		//����ʵ��	
		
		Orange c = new Orange();
	//orange �̳е�Banana ���ҵ����������m3
	//��ӡ�� ��ɫ��
		c.m3();   //��ɫ�� 
		
	//Banana�̳е�Fruits �ҵ����������m1 m2
	//Ĭ��m1 m2�����Ǵ�ӡ �óԲ��� ����ʵ��
		c.m1();	  //�óԲ���
		
		c.m2();   //����ʵ��
	}
}
//����һ��Fruits��
class Fruits{
	//����ζ���ͼ۸�
	String taste;
	int money;
	//���巽��m1
	public void m1(){
		System.out.println("�óԲ���");
	}
	//���巽��m2
	public void m2(){
		System.out.println("����ʵ��");
	}
	//Ĭ���޲ι��췽��
	public Fruits(){}
}
//���� �㽶��̳�ˮ����
class Banana extends Fruits{
	public Banana(){}
//�㽶��ȸ�����һ��m3����
	public void m3(){
		System.out.println("��ɫ��");
	}
}
//���� һ�������� �̳��㽶��
class Orange extends Banana{
}

//=======================================================		 �ڶ���		==========================================================
//=======================================================		ʾ������	==========================================================
//=======================================================	 ��������������������������	==========================================================
//�̳�ʾ������
class Test000{
	public static void main(String[]args){
		//����������
		Dog d = new Dog();
		//��������óԷ��� û�б����� ��ӡ�Է�
		d.eat();
		//���������˯����  ��ӡ˯��
		d.sleep();
		
		//����è����
		Cat c= new Cat();
		//è�������˯���� ��ӡ˯��
		c.sleep();
	}
}

//����һ��Animal��
class Animals{
	//����name��age
	String name;
	//String��int����
	int age;
	
	//���óԷ��� ��ӡ �Է�
	public void eat(){
		System.out.println("�Է�");
	}
	//����˯���� ��ӡ ˯��
	public void sleep(){
		System.out.println("˯��");
	}
}
//����һ�� ���� �̳� ������
class Dog extends Animals{
	//������ͬ �������� ���Ḳ�� �����ӡ����
	public void wangwang(){
		System.out.println("����");
	}
}
//����һ�� è�� �̳� ������
class Cat extends Animals{
}
//����һ������ �̳� ������
class Fish extends Animals{
}

//����ʾ������
class Test010{
	public static void main(String[]args){
		//�����µ϶���
		Audi d = new Audi();
		
		//����color���� Ĭ��ֵΪ��ɫ
		//��301�и����˸����Ĭ��ֵ ���Դ�ӡ ��ɫ
		d.color();
		//����money���� ������ ��ӡ50w
		d.money();
		//�����������
		Bmw c= new Bmw();
		//����color Ϊ��ɫ
		c.color();
	}
}
//��������
class Car{
	//����ΪString���͵���ɫ�ͼ۸�
	String color;
	String money;
	
	public void color(){
		System.out.println("��ɫ");
	}
	public void money(){
		System.out.println("1000");
	}
}
//�����µ���̳г���
class Audi extends Car{
	
	//���Ǹ��� Car������д ���Ǻ� ��ӡΪ��ɫ
	public void color(){
		System.out.println("��ɫ");
	}
	
	//���Ǹ��� money���� moneyΪ50w
	//��������� ֱ�Ӵ�ӡ�����Ĭ��moneyֵ1000
	public void money(){
		System.out.println("50W");
		
	} 
}
//����������̳г���
class Bmw extends Car{
}

//��װʾ������
class Test020{
	public static void main(String[] args){
		//ΪGame��������
		Game g = new Game();
		//����˽�л� ������set�����Ը�ֵ
		g.setName("��ͷ����");
		g.setAge(14);
		g.setBreed("�����˳�");
		//��getȡֵ getName
		System.out.println(g.getName()+"\t"+g.getAge()+"\t"+g.getBreed());

	}
}
class Game{
	//����name age breed�������Բ���װ
	private String name;
	private int age;	
	private String breed;;
	
	public void setName(String name){
		//�βθ�ʵ��������ֵ
		//��	set��ֵ		
		this.name = name;
	}
		//����	��get����
	public String getName(){
		return name;
	}
	
	//set������  get������  ������������ĸ��д
	//set����  ---��Ϊ���Ը�ֵ
	public void setAge(int age){
		if(age>=0&&age<=150){		//���ݼ��
			this.age = age;
		}
	}
	//get����  ---����ȡ���Ե�ֵ
	public int getAge(){
		return age;
	}
	//��set��breed��ֵ
	public void setBreed(String breed){
		this.breed = breed;
	}
	//��get����breed��ֵ
	public  String getBreed(){
		return breed;
	}
}

//�̳� �̳� ����
class Test030{
	public static void main(String[] args){
		Banana b = new Banana();
		b.taste = "��";
		b.money = 10;
		
		//������m1m2�ķ����Ǵ�ӡ�óԲ��󾭼�ʵ��
		//����̳к�û�и��Ƿ��� ���Ե���m1m2ֱ�Ӵ�ӡ
		b.m1();   	//�óԲ���
		b.m2();		//����ʵ��	
		
		Orange c = new Orange();
	//orange �̳е�Banana ���ҵ����������m3
	//��ӡ�� ��ɫ��
		c.m3();   //��ɫ�� 
		
	//Banana�̳е�Fruits �ҵ����������m1 m2
	//Ĭ��m1 m2�����Ǵ�ӡ �óԲ��� ����ʵ��
		c.m1();	  //�óԲ���
		
		c.m2();   //����ʵ��
	}
}
//����һ��Fruits��
class Fruits{
	//����ζ���ͼ۸�
	String taste;
	int money;
	//���巽��m1
	public void m1(){
		System.out.println("�óԲ���");
	}
	//���巽��m2
	public void m2(){
		System.out.println("����ʵ��");
	}
	//Ĭ���޲ι��췽��
	public Fruits(){}
}
//���� �㽶��̳�ˮ����
class Banana extends Fruits{
	public Banana(){}
//�㽶��ȸ�����һ��m3����
	public void m3(){
		System.out.println("��ɫ��");
	}
}
//���� һ�������� �̳��㽶��
class Orange extends Banana{
}

//=======================================================		��ϰ��		==============================================================
//=======================================================		������������		==============================================================
class E{
	public static void main(){
		
	}
}
class Monkey{
	
}
class People extends Monkey{
	
}

