package day09;
class TestStudent01{
	public static void main(String[] args){
		Student s = new Student();		//创建对象
		s.name = "yanjy";
		s.age = 25;
		System.out.println(s.name+s.age+s.sex+s.score);
		
		Student s1 = new Student("wangzy",true,32,10.0);
		
	}
}
class Student{
	String name = "wangzy";
	boolean sex;
	int age;
	double score;
	
	public Student(){}
	public Student(String n,boolean s,int a,double sc){
		name = n;
		sex = s;
		age = a;
		score = sc;
	}
}