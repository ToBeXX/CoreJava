package day08;
class TestStudent{
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
		
		Student s1 = new Student();
		//Ϊ���Ը�ֵ
		s1.name = "faker";
		s1.age = 28;
		s1.sex = true;
		s1.score = 10.0;
		
		//��ȡ���Ե�ֵ
		String name = s1.name;
		int age = s1.age;
		boolean sex = s1.sex;
		double score = s1.score;
		
		System.out.println(name+"\t"+age+"\t"+sex+"\t"+score);
		
	}
}
//�� 
class Student{
	//���ԣ���Ա��������̬����
	//���������䡢��ߡ����ء��Ա𡢳ɼ�...
	String name;    //����
	int age;		//����
	boolean sex;    //�Ա�true-�� false-Ů 
	double score;   //�ɼ�
	
	//����
}