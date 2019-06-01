package day09;
class TestStudent04{
	public static void main(String[] args){
		Student04 s = new Student04("wangzy",true,32,10.0);
		
	}
}
class Student04{
	String name;
	boolean sex;
	int age;
	double score;
	
	public Student04(){
		this("yanjy",true);
		System.out.println("你是无参构造器");
	}
	public Student04(String name,boolean sex){
		this();
		this.name = name;
		this.sex = sex;
	}
	public Student04(String name,boolean sex,int age,double score){
		this(name,sex);			//调用当前对象的有参构造
		this.age = age;
		this.score = score;
	}
	
	/* public Student04(String name,boolean sex,int age,double score){
		//这是一个注释
		this();
		System.out.println("你是有参构造器");
		
	} */
	
	
	
}