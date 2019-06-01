package day09;
class TestStudent03{
	public static void main(String[] args){
		Student03 s = new Student03();
		s.m2();
	}
}
class Student03{
	String name;
	boolean sex;
	int age;
	double score;
	
	public Student03(){}
	public Student03(String name,boolean sex,int age,double score){
		this.name = name ;		//将局部变量name赋值给成员变量name
		this.sex = sex;
		this.age = age;
		this.score = score;
	}
	public void m1(){
		System.out.println("一万行代码");
	}
	public void m2(){
		//要求有m1方法的一万行代码
		this.m1();			//调用当前对象的m1方法,this.可写可不写
		System.out.println("继续一万行代码");
	}
	
}