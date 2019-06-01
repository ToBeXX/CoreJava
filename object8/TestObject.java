package code_day8;
public class TestObject{
	public static void main(String[] args){
		Student a = new Student();
		a.name = "haha";
		a.age = 18;
		a.sex = true;
		a.weight = 124;
		a.score = 100;
		System.out.println(a.name+"����"+a.score);
		a.eat();
		a.study(5);
		Student s = new Student("hehe",18,false,120,98);
		System.out.println(s.name+"����"+s.score);
		s.eat();
		s.study(10);
	}
}
class Student{
	String name;
	int age;
	boolean sex;
	double weight;
	double score;
	public Student(){}
	public Student(String name,int age,boolean sex,double weight,double score){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.score = score;
	}
	public void eat(){
		System.out.println(name+"�ڳԷ�");
	}
	public void study(int time){
		System.out.println(name+"ѧϰ��"+time+"Сʱ");
	}
}
/*
ʾ����ϰ(��һ��)
*/
class TestTeacher{
	public static void main(String[] args){
		//��������
		Teacher one = new Teacher();
		//����Ա������ֵ
		one.name = "xiaoya";
		one.age = 18;
		one.sex = false;
		//��ӡ��Ա������ֵ
		System.out.println(name+"����"+age+"�Ǹ�")
	}
}
class Teacher{
	//��Ա����
	String name;
	int age;
	boolean sex;
	//��������
	public void teach(String course){
		System.out.println(name+"�Ǹ�"+sex+"�̵���"+course);
	}
	//�������췽��
	public Teacher(){}
	
}
/*
ʾ����ϰ(��2��)
*/
class TestDog{
	public static void main(String[] args){
		//��������
		Dog one = new Dog();
		//����Ա������ֵ
		one.name = "����";
		one.age = 2;
		one.sex = false;
		//��ӡ��Ա������ֵ
		System.out.println(name+"����"+age+"�Ǹ�");
		//���÷���
		one.eat("��ͷ");
	}
}
class Dog{
	//��Ա����
	String name;
	int age;
	boolean sex;
	//��������
	public void eat(String thing){
		System.out.println(name+"����"+thing);
	}
	//�������췽��
	public Teacher(){}
	
}
/*
overload
*/
class TestOverLoad{
	public static void main(String[] args){
		MathTool mathTool = new MathTool();
		mathTool.add();
		mathTool.add(10.0);
		byte a = 10;
		mathTool.add(a);
		mathTool.add(10,11.0);
	}
}
class MathTool{
	public void add(){
		System.out.println("add()");
	}
	public void add(byte a){
		System.out.println("add(byte)");
	}
	public int add(double a){
		System.out.println("add(int)");
		return 10;
	} 
	public void add(double a,int b){
		System.out.println("add(double,int)");
	}
	public void add(int a,double b){
		System.out.println("add(int,double)");
	}
}
//����������ߴ��ֵ
class TestAddress{
	public static void main(String[] args){
		Address a = new Address();
		System.out.println(a);
		int b = a.age;
		System.out.println(b);
	}
}
class Address{
	String name;
	int age;
	double weight;
}