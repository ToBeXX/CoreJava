package code_day9;
//����һ��Student�� �����в��޲ι��췽��
//Ϊ�вι��췽����ֵ this.Ϊʵ��������ֵ
//�������оֲ�����ʱ �ֲ���������
class Test{
	//������
	public static void main(String[]args){
	//����һ����Ϊg�Ķ���
	//����21���вι������ֵ 
		Dog g =	new Dog ("ɳ��",2,"��ʿ��");
	//g���õ�29��app�ķ���;
		g.app();
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
	//��ӡʵ������ ���Ϊnull 
	//���29-33������ �ȸ�ֵ�ٴ�ӡ
	//���ӡ���Ϊ ɳ��
		System.out.println(this.name);
	//�βθ�ʵ��������ֵ
		this.name = name;
	//ͬ��
		this.age = age;
	//ͬ��
		this.breed = breed;
	}
	//����app
	public void app(){
	//�������оֲ����������� ��ֲ���������������
	//��ӡname �Ǽ����� ��ӡthis.name��ɳ��
		String name="������";
		System.out.println(name);
	//this.nameΪʵ��������ֵ ��ʵ�θ�����ֵ 
	//��ӡ����ʵ��
		System.out.println(this.name);
		System.out.println(this.breed);
	}
}

class Test1{
	public static void main(String[]args){
		//����һ��C�Ķ��� 
		//�вι��췽�� ʵ��Ϊ����2��˹ �������73�и�ֵ
		Cat c= new Cat("����",2,"��˹");
		//����C2����
		c.c2();
	}
}
//����һ��Cat��
class Cat{
	//������� name ��String����
	String name;
	//age��int����
	int age;
	//breed��String����
	String breed;
	
	//�޲ι��췽�� 
	public Cat(){}
	//�вι��췽�� �β�ΪString int String����
	public Cat(String name,int age,String breed){
	//�βθ�ʵ��������ֵ �β�ֻ������49-58��
		this.name= name;
	//ͬ��
		this.age= age;
	//ͬ��
		this.breed= breed;
	//����ʵ������ ��ӡʵ������
		System.out.println(this.name+this.age+this.breed);
}
	//����һ��C1����
	public void c1(){
		System.out.println("è");
	}
	//��C2���ȵ���C1 �ȴ�ӡC1������ Ȼ���ٴ�ӡC2������
	public void c2(){
	//�����This ������Ч��俪ͷ��һ��
		c1();
		System.out.println("���");
	}
}

//����һ��Student�� �����в��޲ι��췽��
//Ϊ�вι��췽����ֵ this.Ϊʵ��������ֵ
class Test2{
	public static void main(String[]args){
	//��������a  Ϊ��106���βθ�ֵ
	Student a = new Student(true,59.9);
	//��������a1 	Ϊ��112���βθ�ֵ
	Student a1= new Student("˾�캭",24,false,60.1);
	}
}
class Student{
	//Student���е�����
	//����
	String name;
	//����
	int age;
	//�Ա�
	boolean sex;
	//�ɼ�
	double socre;
	
	//�޲ι��췽��
	public Student(){}
	//�вι��췽�� ����boolean��double��ֵ
	public Student(boolean sex,double socre){
		//�����вι��췽��sex ��107��ʵ������sex��ֵ
		this.sex=sex;
		//�����вι��췽��socre ��109��socre��ֵ
		this.socre=socre;
		//��ӡ��ֵ����β�
		System.out.println(this.sex+""+this.socre);
	}
	//�вι��췽�� ������������
	public Student(String name,int age,boolean sex,double socre){
	//����116.118�е�ʵ������ ��ӡsex��socre
		
		this(sex,socre);
		this.name=name;
		this.age=age;
	//�ٴ�ӡ97�и��βθ�ֵ��name��age
		System.out.println(this.name+this.age);
	}
}

class Test3{
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


class Test5{
	//������
	public static void main(String[]args){
	//����һ����Ϊg�Ķ���
	//����249���вι������ֵ 
		Game g = new Game ("�����ȷ�",2,"��һ�˳�");
	//g���õ�29��app�ķ���;
		g.app();
	}
}
//����һ��Game��
class Game{
	//Game�����������name��String����
	String name;
	//Game�������age������int����
	int year;
	//Game�������breed������String����
	String breed;
	
	//Game����޲ι��췽��
	public Game(){}
	//Game����вι��췽��
	public Game(String name,int year,String breed){
	//��ӡʵ������ ���Ϊnull 
	//���255-259������ �ȸ�ֵ�ٴ�ӡ
	//���ӡ���Ϊ �����ȷ�
		System.out.println(this.name);
	//�βθ�ʵ��������ֵ
		this.name = name;
	//ͬ��
		this.year = year;
	//ͬ��
		this.breed = breed;
	}
	//����app
	public void app(){
	//�������оֲ�������ͷ���� ��ֲ�������ͷ��������
	//��ӡname �ǽ�ͷ���� ��ӡthis.name�������ȷ�
		String name="��ͷ����";
		System.out.println(name);
	//this.nameΪʵ��������ֵ ��ʵ�θ�����ֵ 
	//��ӡ����ʵ��
		System.out.println(this.name);
		System.out.println(this.breed);
	}
}

class Test6{
	public static void main(String[]args){
		//����һ��F�Ķ��� 
		//�вι��췽�� ʵ��Ϊ������2������ �������295�и�ֵ
		Fish f= new Fish("������",2,"������");
		//����C2����
		f.f2();
	}
}
//����һ��Fish��
class Fish{
	//������� name ��String����
	String name;
	//age��int����
	int age;
	//breed��String����
	String breed;
	
	//�޲ι��췽�� 
	public Fish(){}
	//�вι��췽�� �β�ΪString int String����
	public Fish(String name,int age,String breed){
	//�βθ�ʵ��������ֵ �β�ֻ������295-304��
		this.name= name;
	//ͬ��
		this.age= age;
	//ͬ��
		this.breed= breed;
	//����ʵ������ ��ӡʵ������
		System.out.println(this.name+this.age+this.breed);
}
	//����һ��F1����
	public void f1(){
		System.out.println("��");
	}
	//��F2���ȵ���F1 �ȴ�ӡF1������ Ȼ���ٴ�ӡF2������
	public void f2(){
	//�����This ������Ч��俪ͷ��һ��
		f1();
		System.out.println("���");
	}
}

//����һ��Teacher�� �����в��޲ι��췽��
//Ϊ�вι��췽����ֵ this.Ϊʵ��������ֵ
class Test7{
	public static void main(String[]args){
	//��������a  Ϊ��341���βθ�ֵ
	Teacher a = new Teacher(true,59.9);
	//��������a1 	Ϊ��350���βθ�ֵ
	Teacher a1= new Teacher("��СС",18,false,100.0);
	}
}
class Teacher{
	//Student���е�����
	//����
	String name;
	//����
	int age;
	//�Ա�
	boolean sex;
	//�ɼ�
	double socre;
	
	//�޲ι��췽��
	public Teacher(){}
	//�вι��췽�� ����boolean��double��ֵ
	public Teacher(boolean sex,double socre){
		//�����вι��췽��sex ��334��ʵ������sex��ֵ
		this.sex=sex;
		//�����вι��췽��socre ��336��socre��ֵ
		this.socre=socre;
		//��ӡ��ֵ����β�
		System.out.println(this.sex+""+this.socre);
	}
	//�вι��췽�� ������������
	public Teacher(String name,int age,boolean sex,double socre){
	//����343.345�е�ʵ������ ��ӡsex��socre
		
		this(sex,socre);
		this.name=name;
		this.age=age;
	//�ٴ�ӡ356�и��βθ�ֵ��name��age
		System.out.println(this.name+this.age);
	}
}

class Test8{
	public static void main(String[]args){
	//��һ�ִ�������ķ��� ֱ�Ӵ���
		Computer c= new Computer();
		
	//�ڶ��ִ��� ������������ �ٷ���
		Computer c1;
		c1=new Computer();
		
	//��c1����name��ֵ
	c1.name="����";
	//δ��c�������Ը�ֵ ��ӡc.name��ΪĬ��ֵ null
	System.out.println(c.name);
		
	//����һ��c2���� c�����ֵ����c2
		Computer c2=c;
		c.name="DELL";
		c.money=5000;
		c.color="��ɫ";
	//��ӡc2.color��ʾ��ɫ	
		System.out.println(c2.color);
	//c2.money��ֵ������5000
	//c2.money++ ͬʱc.moneyҲ�����仯
	//c��������Ա仯 c2Ҳ��
		c2.money++;
	//���c��c2.money������ͬ��ַ ��ͬ���
		System.out.println(c.money);
		
	}
}
	//����һ��Computer��
class Computer{
	//name����ΪString
	String name;
	//money����Ϊint
	int money;
	//color����ΪString
	String color;
	
	//�޲ι��췽��
	public Computer(){}
}

class Test9{
	public static void main(String[]args){
		//����һ��������Ϊp
		person p = new person();
		//p�������������age��ֵΪ4
		p.age=88;
		//����һ��������Ϊp1
		person p1 = new person();
		//p1�����������age��ֵΪ6
		p1.age=25;
		
		//����add����                                                                 
		p.add(p1);
		
		//��������������� Ҫ�ǵðѺ����()�ĳ�[];
		person [] q=new person[3];
		q[0]=p ;
		q[1]=p1 ;
		//q[2]��������һ���µ�������ֵ
		//û�и�ֵ Ĭ��Ϊ0
		q[2]=new person();
		//��������x 
		for(int i=0;i<q.length;i++){
			System.out.println(q[i].age);
		}
	}
}
class person{
	String name;
	int age;
	double weight;
	
	
	//�޲ι��췽��
	public person(){}
	public void add(person c){
		if(this.age>c.age){
			System.out.println("�ұ����");
		}else if(this.age<c.age){
			System.out.println("�ұ���С");
		}else System.out.println("һ��");
	}
}
//==============================================================================================
class HomeWork{
	public static void main(String[]args){
		Worker a = new Worker();
		Worker a1 = new Worker("������",58,3000);
		
		a1.work(8);
	}
}
class Worker{
	String name;
	int age;
	double salary;
	
	public Worker(){}
	public Worker(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
		System.out.println(this.name+this.age+this.salary);
	}
	
	public void work(){}
	
	public void work(int hours){
		 System.out.println(this.name+hours+"Сʱ");
		
	} 
	
}

