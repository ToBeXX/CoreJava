package com.baizhi.day15;

public class TestInteger04 {
	public static void main(String[] args) {
		Student01 student01 = new Student01("lizongl",0);
		Student01 student012 = new Student01("wangzhiy");//ц╩сп©╪йт
		System.out.println(student01);
		System.out.println(student012);
	}
}	
class Student01{
	String name;
	Double score;
	
	public Student01() {
		super();
	}
	
	public Student01(String name) {
		super();
		this.name = name;
	}

	public Student01(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String toString() {
		return "Student01 [name=" + name + ", score=" + score + "]";
	}

}
