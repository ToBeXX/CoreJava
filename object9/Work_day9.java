package code_day9;
//��1��
//����ClassA��
class ClassA{
	//�вη���
	public void method(int value){
		System.out.println(value);
	}
	//�޲η���
	public void method(){
		System.out.println(value);
	}
	int value;
}
class TestClassA{
	public static void main(String[] args){
		//���޲ι��췽����������classA
		ClassA classA = new ClassA();
		//��ʾ��������ֵ
		classA.value = 10;
		//�����޲�method����
		classA.method();
		//�����в�method�������������20
		classA.method(20);
	}
}
/*
�����ӡ
10
20
ѡ C
*/
//��2��
class ClassB{
	void method(){
		System.out.println("method()");
	}
	int method(int i ){
		System.out.println("method(int)");
		return i;
	}
	public static void main(String[] args){
		ClassB b = new ClassB();
		b.method();
		System.out.println(b.method(10));
	}
}
/*
���ܱ���ͨ��
int method��int i��ȱ�ٷ���ֵ
��� return i;
*/
/*
��3��
���ڹ��췽��������˵����ȷ���ǣ�
A.ÿ�����ж�������һ�����췽��
B.һ�����п����ж�����췽��
C.���췽�������з���ֵ
D.���췽�������ж������
ѡ�� B  D
*/
//��4��
class MyClass{
	int value;
}
class TestRef{
	public static void main(String[] args){
		//��������a
		int a = 10;
		//��������b ��a��ֵ��ֵ��b
		int b = a;
		//b����1
		b++;
		System.out.println(a);
		//��������mc1
		MyClass mc1 = new MyClass();
		//��ʼ��mc1�ĳ�Ա����
		mc1.value = 10;
		//��������mc2��mc1������׵�ַ��mc2
		MyClass mc2 = mc1;
		//����Ա������ֵ��1
		mc2.value ++;
		System.out.println(mc1.value);
	}
}
//���н��Ϊ 10  11
//��5��
class  MyClass1{
	//������Ա����value
	int value;
	//�в��޲ι��췽��
	public MyClass1(){}
	public MyClass1(int i){}
}
class TestMyClass{
	public static void main(String args[]){
		MyClass1 mc1 = new MyClass1();
		MyClass1 mc2 = new MyClass1(10);
		System.out.println(mc1.value);
		System.out.println(mc2.value);
	}
}
/*
���벻��ͨ��
��ΪMyClass1����û���вι��췽��
�����ڹ���mc2ʱ�Ҳ�����Ӧ�Ĺ��췽��
class  MyClass1{
	int value;
	public MyClass1(){}
	public MyClass1(int i){}
}
class TestMyClass{
	public static void main(String args[]){
		MyClass1 mc1 = new MyClass1();
		MyClass1 mc2 = new MyClass1(10);
		System.out.println(mc1.value);
		System.out.println(mc2.value);
	}
}
*/
//��6��
//����һ��Dog��
class Dog{
	//����һ��name���ԣ�������ΪString����
	String name;
	//����һ��age���ԣ�������Ϊint����
	int age;
	//����һ��sexual���ԣ�������Ϊboolean����
	//true��ʾ����false��ʾĸ
	boolean sexual;
	public Dog(){
		
	}
	public Dog(String name ,int age,boolean sexual){
		//�ֱ���ݲ���������Dog�������
		this.name = name;
		this.age = age;
		this.sexual = sexual;
	}
	public void play(){
		System.out.println(name+"play");
	}
	public void play(int n){
		System.out.println(name+"play"+n+"minute");
	}
}
class TestDog{
	public static void main(String[] args){
		Dog d;
		//����һ��Dog���󣬵����в����Ĺ��췽��
		//����Ϊjoy������Ϊ2�꣬�Ա�Ϊĸ
		d = new Dog("joy",2,false);
		//����Dog�����play����
		d.play();
		//����Dog������вε�play����������Ϊ30
		d.play(30);
	}
}
//��7��
class ClassC{
	public ClassC(){
		System.out.println("ClassC()");
	}
}
class ClassD{
	public ClassD(){
		System.out.println("ClassD()");
	}
}
class ClassE{
	ClassC c = new ClassC();
	ClassD d;
	public ClassE(){
		System.out.println("ClassE()");
		d = new ClassD();
	}
}
class TestConstructor{
	public static void main(String arg[]){
		ClassE ee = new ClassE();
	}
}
//ѡ��C
//��8��
class ClassF{
	int value;
}
class TestClassF{
	public static void main(String[] args){
		//��������value
		int value = 10;
		//����changeInt()����
		changeInt(value);
		System.out.println(value);
		//��������ca
		ClassF ca = new ClassF();
		//��ʼ��ca�ĳ�Ա����
		ca.value = 10;
		//����changeObject()����
		changeObject(ca);
		System.out.println(ca.value);
	}
	public static void changeInt(int value){
		value++;
	}
	public static void changeObject(ClassF ca){
		ca.value++;
	}
}
//ѡ��C
//��9��
/* 
class Student{
	public void Student(){}//���󣬹��췽��û�з���ֵ
	void init(){
		age = 10;
		name = "limy";
	}
	public Student(String name){
		this.init();
		this.name = name;
	}
	public Student(String name,int age){
		//this(name) �����ǹ��췽������Ч�����һ��
		this.init();
		this(name);
		this.age = age;
	}
	int age;
	String name;
} 
*/
//�޸ĺ�Ϊ��
class Student{
	public  Student(){}//���󣬹��췽��û�з���ֵ���� voidȥ��
	void init(){
		age = 10;
		name = "limy";
	}
	public Student(String name){
		this.init();
		this.name = name;
	}
	public Student(String name,int age){
		//this(name) �����ǹ��췽������Ч�����һ�䣬����this.init()  this(name)����˳��
		this(name);
		this.init();
		this.age = age;
	}
	int age;
	String name;
}
//��10��
class Worker{
	//������Ա���� name age salary add��addΪ�������ͣ�
	String name;
	int age;
	double salary;
	Address add;
	/* String address;
	int zipCode; */
	public Worker(){}
	public Worker(String name,int age,double salary,Address add){
		//����Ա������ֵ
		this.name = name;
		this.age = age;
		this.salary = salary;
		//�����в�Address���췽����address �� zipCode ��ֵ
		this.add = add;
	}
	public void work(){
		System.out.println("work()");
	}
	public void work(int hours){
		System.out.println(name+"�����ˣ�"+hours+"Сʱ");
	}
}
//��11��
class Address{
	String address;
	int zipCode;
	public Address(){}
	public Address(String address,int zipCode){
		this.address = address;
		this.zipCode = zipCode;
		System.out.println(address+zipCode);
	}
}
//��12��
class TestAddress{
	public static void main(S tring[] args){
		Address a=new Address("�����к������廪԰1��",100084);
		Worker work = new Worker("zhangsan",25,2500,a);
		System.out.println(work.name+";���䣺"+work.age+"�����ʣ�"+work.salary);
	}
}
 /* 
 //�ڶ��ַ���
class Worker{
	String name;
	int age;
	double salary;
	Address add;
	public Worker(){}
	public Worker(String name,int age,double salary,Address add){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.add = add;
	}
	public void work(){
		System.out.println("work()");
	}
	public void work(int hours){
		System.out.println(name+"�����ˣ�"+hours+"Сʱ");
	}
}
//11
class Address{ 
	String address;
	int zipCode;
	public Address(){}
	public Address(String address,int zipCode){
		this.address = address;
		this.zipCode = zipCode;
		System.out.println(address+zipCode);
	}
}
//12
class Practice{
	public static void main(String[] args){
		Address a=new Address("�����к������廪԰1��",100084);
		Worker w = new Worker("zhangsan",25,2500,a);
		System.out.println(w.name+" ���䣺"+w.age+" ���ʣ�"+w.salary+" סַ�� "+a.address+" �ʱࣺ "+a.zipCode);
	}
}
 */
 
 
 
 class Practice{
	public static void main(String[] args){
		Address a=new Address("�����к������廪԰1��",100084);
		Worker w=new Worker("zhangsan",25,2500,a);
		Address add = w.add;
		add.address();
		System.out.println(w.name+" ���䣺"+w.age+" ���ʣ�"+w.salary+" סַ�� "+w.add.address+" �ʱࣺ "+a.zipCode);
	}
}
