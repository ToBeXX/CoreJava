package com.baizhi.day16;

public class Prac {
	public static void main(String[] args) {
		Student s1 =  new Student("huangjh",18,10.0);
		Student s3 =  new Student("huangjh",18,10.0);
		Student s2 =  new Student("lizonglei",38,10.0);
		System.out.println(s1.equals(s3));
	}
}
class Student{
	private String name;
	private int age;
	private double score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public Student() {
		super();
	}
	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score
				+ "]";
	}
	//重写equals:
	public boolean equals(Object o){
//		1.自反性，判断this和o指向的是否是同一对象
		if(this==o) return true;
//		2.非空判断，判断o是否为null  
		if(o==null) return false;
//		3.比较对象类型是否一致
		if(this.getClass()!=o.getClass())  return false;
//		4.强转
		Student s = (Student)o;
//		5.逐一比较属性
		if(this.name.equals(s.getName())&&this.age==s.getAge()&&this.score==s.getScore()) 
			return true;
		return false;
		
	}
}