package day09;
class TestStudent02{
	public static void main(String[] args){
		Student02 s = new Student02("wangzy",true,32,10.0);
		// s.study();
		System.out.println(s.name+"\t"+s.age);
		
	}
}
class Student02{
	String name;
	boolean sex;
	int age;
	double score;
	
	public Student02(){}
	public Student02(String name,boolean sex,int age,double score){
		this.name = name ;		//将局部变量name赋值给成员变量name
		this.sex = sex;
		this.age = age;
		this.score = score;
	}
	public void study(){
		String name  = "wzy";
		System.out.println(name); //局部变量name
		System.out.println(this.name);  //访问了 成员变量name
	}
	
}