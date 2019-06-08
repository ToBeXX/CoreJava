package code_day14;
class Student{
	String name;
	int age;
	String address;
	public Student(){}
	public Student(String name,int age,String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String toString(){
		return "名字："+name+";年龄："+age+";地址："+address;
	}
}
class TestStudent{
	public static void main(String[] args){
		Student s = new Student("马耿旭",22,"长垣县");
		System.out.println(s);
	}
}