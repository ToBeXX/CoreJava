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
		return "���֣�"+name+";���䣺"+age+";��ַ��"+address;
	}
}
class TestStudent{
	public static void main(String[] args){
		Student s = new Student("����",22,"��ԫ��");
		System.out.println(s);
	}
}