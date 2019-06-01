package day08;
class TestStudent{
	public static void main(String[] args){
		//创建对象
		Student s = new Student();
		//为属性赋值
		s.name = "liukai";
		s.age = 38;
		s.sex = true;   
		s.score = 10.0;
		//获取属性的值
		System.out.println(s.name+"\t"+s.age+"\t"+s.sex+"\t"+s.score);
		
		Student s1 = new Student();
		//为属性赋值
		s1.name = "faker";
		s1.age = 28;
		s1.sex = true;
		s1.score = 10.0;
		
		//获取属性的值
		String name = s1.name;
		int age = s1.age;
		boolean sex = s1.sex;
		double score = s1.score;
		
		System.out.println(name+"\t"+age+"\t"+sex+"\t"+score);
		
	}
}
//类 
class Student{
	//属性，成员变量，静态数据
	//姓名、年龄、身高、体重、性别、成绩...
	String name;    //名字
	int age;		//年龄
	boolean sex;    //性别true-男 false-女 
	double score;   //成绩
	
	//方法
}