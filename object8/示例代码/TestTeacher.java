package day08;
class TestTeacher{
	public static void main(String[] args){
		//创建对象
		Teacher t1 = new Teacher();
		//为属性赋值
		t1.name = "徐畅";
		t1.age = 40;
		t1.sex = true;
		
		//获取属性的值
		String name = t1.name;
		System.out.println(name);
		
		//调用方法
		t1.teach("Web");
		t1.eat("热干面");
		
		
		Teacher t2 = new Teacher();
		/* int a;
		System.out.println(a); */  //局部变量必须先赋值 后使用
		
		System.out.println(t2.name+"\t"+t2.age+"\t"+t2.sex);  //null 0 false
		
		
		
		
	}
}


class Teacher{
	//属性
	String name;
	int age;
	boolean sex;
	
	//方法
	public void teach(String course){
		String name = "wxx";  //局部变量 name
		System.out.println(name+"teach"+course);
	}
	public void eat(String food){
		System.out.println(name+"eat"+food);
	}
}