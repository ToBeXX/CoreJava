package day09;
class TestStudent02{
	public static void main(String[] args){
		Student02 s = new Student02("wangzy",true,32,10.0);
		// s.study();
		System.out.println(s.name+"\t"+s.age);
		
	}
}
class Student02{
	String name;
	boolean sex;
	int age;
	double score;
	
	public Student02(){}
	public Student02(String name,boolean sex,int age,double score){
		this.name = name ;		//���ֲ�����name��ֵ����Ա����name
		this.sex = sex;
		this.age = age;
		this.score = score;
	}
	public void study(){
		String name  = "wzy";
		System.out.println(name); //�ֲ�����name
		System.out.println(this.name);  //������ ��Ա����name
	}
	
}