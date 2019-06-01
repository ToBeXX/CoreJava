package day08;
class TestStudent01{
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
		
		//调用方法
		s.study("CoreJava");
		s.eat();
		s.sayHi();
		
	}
}
//类 
class Student{
	//属性
	String name;    //名字
	int age;		//年龄
	boolean sex;    //性别true-男 false-女 
	double score;   //成绩
	
	//方法 学习、吃、自我介绍
	public void study(String course){		//方法的声明
		System.out.println(name+"学习"+course);
	}
	public void eat(){
		System.out.println(name+"吃盒饭...");
	}
	public void sayHi(){
		System.out.println("我叫"+name+",今年"+age+"岁");
	}

}