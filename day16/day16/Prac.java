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
	//��дequals:
	public boolean equals(Object o){
//		1.�Է��ԣ��ж�this��oָ����Ƿ���ͬһ����
		if(this==o) return true;
//		2.�ǿ��жϣ��ж�o�Ƿ�Ϊnull  
		if(o==null) return false;
//		3.�Ƚ϶��������Ƿ�һ��
		if(this.getClass()!=o.getClass())  return false;
//		4.ǿת
		Student s = (Student)o;
//		5.��һ�Ƚ�����
		if(this.name.equals(s.getName())&&this.age==s.getAge()&&this.score==s.getScore()) 
			return true;
		return false;
		
	}
}