package day08;
class TestStudent01{
	public static void main(String[] args){
		//��������
		Student s = new Student();
		//Ϊ���Ը�ֵ
		s.name = "liukai";
		s.age = 38;
		s.sex = true;   
		s.score = 10.0;
		//��ȡ���Ե�ֵ
		System.out.println(s.name+"\t"+s.age+"\t"+s.sex+"\t"+s.score);
		
		//���÷���
		s.study("CoreJava");
		s.eat();
		s.sayHi();
		
	}
}
//�� 
class Student{
	//����
	String name;    //����
	int age;		//����
	boolean sex;    //�Ա�true-�� false-Ů 
	double score;   //�ɼ�
	
	//���� ѧϰ���ԡ����ҽ���
	public void study(String course){		//����������
		System.out.println(name+"ѧϰ"+course);
	}
	public void eat(){
		System.out.println(name+"�Ժз�...");
	}
	public void sayHi(){
		System.out.println("�ҽ�"+name+",����"+age+"��");
	}

}