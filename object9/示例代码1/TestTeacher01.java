package day09;
class TestTeacher01{
	public static void main(String[] args){
		//引用应用于参数
		Teacher01 t1 = new Teacher01();
		t1.age = 18;
		Teacher01 t2 = new Teacher01();
		t2.age = 40;
		
		t1.compare(t2);
		
		//定义一个Teacher类型的数组  
		Teacher01[] ts = new Teacher01[3];
		//存储多个Teacher对象
		ts[0] = t1;
		ts[1] = t2;
		ts[2] = new Teacher01();
		//循环遍历此数组  获取所有Teacher对象的年龄
		for(int i=0;i<ts.length;i++){
			System.out.println(ts[i].age);
		}
		
		//引用应用于返回值
		Teacher01 t3 = getTeacher();
		System.out.println(t3.name);
		
	}
	//返回一个Teacher对象
	public static Teacher01 getTeacher(){
		Teacher01 t = new Teacher01();
		t.name = "ly";
		return t;
		
	}
}
class Teacher01{
	String name;
	boolean sex;
	int age;
	
	
	public Teacher01(){}
	//比较当前对象和传入对象的年龄
	public void compare(Teacher01 t){
		if(this.age > t.age){
			System.out.println("我很成熟");
		}else if(this.age<t.age){
			System.out.println("你好老啊");
		}else{
			System.out.println("咱俩一样年轻");
		}
	}
	
	
}