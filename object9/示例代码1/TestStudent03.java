package day09;
class TestStudent03{
	public static void main(String[] args){
		Student03 s = new Student03();
		s.m2();
	}
}
class Student03{
	String name;
	boolean sex;
	int age;
	double score;
	
	public Student03(){}
	public Student03(String name,boolean sex,int age,double score){
		this.name = name ;		//���ֲ�����name��ֵ����Ա����name
		this.sex = sex;
		this.age = age;
		this.score = score;
	}
	public void m1(){
		System.out.println("һ���д���");
	}
	public void m2(){
		//Ҫ����m1������һ���д���
		this.m1();			//���õ�ǰ�����m1����,this.��д�ɲ�д
		System.out.println("����һ���д���");
	}
	
}