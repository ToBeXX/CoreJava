package code_day9;
//第1题
//声明ClassA类
class ClassA{
	//有参方法
	public void method(int value){
		System.out.println(value);
	}
	//无参方法
	public void method(){
		System.out.println(value);
	}
	int value;
}
class TestClassA{
	public static void main(String[] args){
		//用无参构造方法创建对象classA
		ClassA classA = new ClassA();
		//给示例变量赋值
		classA.value = 10;
		//调用无参method方法
		classA.method();
		//调用有参method方法并传入参数20
		classA.method(20);
	}
}
/*
结果打印
10
20
选 C
*/
//第2题
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
不能编译通过
int method（int i）缺少返回值
添加 return i;
*/
/*
第3题
关于构造方法，下列说法正确的是：
A.每个类中都有至少一个构造方法
B.一个类中可以有多个构造方法
C.构造方法可以有返回值
D.构造方法可以有多个参数
选择 B  D
*/
//第4题
class MyClass{
	int value;
}
class TestRef{
	public static void main(String[] args){
		//声明变量a
		int a = 10;
		//声明变量b 将a的值赋值给b
		int b = a;
		//b自增1
		b++;
		System.out.println(a);
		//创建对象mc1
		MyClass mc1 = new MyClass();
		//初始化mc1的成员变量
		mc1.value = 10;
		//声明对象mc2将mc1对象的首地址给mc2
		MyClass mc2 = mc1;
		//将成员变量的值加1
		mc2.value ++;
		System.out.println(mc1.value);
	}
}
//运行结果为 10  11
//第5题
class  MyClass1{
	//声明成员变量value
	int value;
	//有参无参构造方法
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
编译不能通过
因为MyClass1类中没有有参构造方法
所以在构造mc2时找不到相应的构造方法
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
//第6题
//定义一个Dog类
class Dog{
	//定义一个name属性，该属性为String类型
	String name;
	//定义一个age属性，该属性为int类型
	int age;
	//定义一个sexual属性，该属性为boolean类型
	//true表示公，false表示母
	boolean sexual;
	public Dog(){
		
	}
	public Dog(String name ,int age,boolean sexual){
		//分别根据参数，设置Dog类的属性
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
		//创建一个Dog对象，调用有参数的构造方法
		//名字为joy，年龄为2岁，性别为母
		d = new Dog("joy",2,false);
		//调用Dog对象的play方法
		d.play();
		//调用Dog对象的有参的play方法，参数为30
		d.play(30);
	}
}
//第7题
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
//选择C
//第8题
class ClassF{
	int value;
}
class TestClassF{
	public static void main(String[] args){
		//声明变量value
		int value = 10;
		//调用changeInt()方法
		changeInt(value);
		System.out.println(value);
		//创建对象ca
		ClassF ca = new ClassF();
		//初始化ca的成员变量
		ca.value = 10;
		//调用changeObject()方法
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
//选择C
//第9题
/* 
class Student{
	public void Student(){}//错误，构造方法没有返回值
	void init(){
		age = 10;
		name = "limy";
	}
	public Student(String name){
		this.init();
		this.name = name;
	}
	public Student(String name,int age){
		//this(name) 必须是构造方法中有效代码第一句
		this.init();
		this(name);
		this.age = age;
	}
	int age;
	String name;
} 
*/
//修改后为：
class Student{
	public  Student(){}//错误，构造方法没有返回值，将 void去掉
	void init(){
		age = 10;
		name = "limy";
	}
	public Student(String name){
		this.init();
		this.name = name;
	}
	public Student(String name,int age){
		//this(name) 必须是构造方法中有效代码第一句，交换this.init()  this(name)交换顺序
		this(name);
		this.init();
		this.age = age;
	}
	int age;
	String name;
}
//第10题
class Worker{
	//声明成员变量 name age salary add（add为引用类型）
	String name;
	int age;
	double salary;
	Address add;
	/* String address;
	int zipCode; */
	public Worker(){}
	public Worker(String name,int age,double salary,Address add){
		//给成员变量赋值
		this.name = name;
		this.age = age;
		this.salary = salary;
		//调用有参Address构造方法给address 和 zipCode 赋值
		this.add = add;
	}
	public void work(){
		System.out.println("work()");
	}
	public void work(int hours){
		System.out.println(name+"工作了："+hours+"小时");
	}
}
//第11题
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
//第12题
class TestAddress{
	public static void main(S tring[] args){
		Address a=new Address("北京市海淀区清华园1号",100084);
		Worker work = new Worker("zhangsan",25,2500,a);
		System.out.println(work.name+";年龄："+work.age+"；工资："+work.salary);
	}
}
 /* 
 //第二种方法
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
		System.out.println(name+"工作了："+hours+"小时");
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
		Address a=new Address("北京市海淀区清华园1号",100084);
		Worker w = new Worker("zhangsan",25,2500,a);
		System.out.println(w.name+" 年龄："+w.age+" 工资："+w.salary+" 住址： "+a.address+" 邮编： "+a.zipCode);
	}
}
 */
 
 
 
 class Practice{
	public static void main(String[] args){
		Address a=new Address("北京市海淀区清华园1号",100084);
		Worker w=new Worker("zhangsan",25,2500,a);
		Address add = w.add;
		add.address();
		System.out.println(w.name+" 年龄："+w.age+" 工资："+w.salary+" 住址： "+w.add.address+" 邮编： "+a.zipCode);
	}
}
