package day09;
class TestTeacher{
	public static void main(String[] args){
		//�������������� 
		Teacher t = new Teacher();
		System.out.println(t);		//��ӡ���ǵ�ַ
		
		//����������
		Teacher t1;
		//��Ϊ�����ռ�
		t1 = new Teacher();
		
		t.name = "xuc";
		System.out.println(t1.name);		//null
		t1.name = "fanmw";
		t1.age = 41;
		t1.sex = true;
	
		Teacher t2 = t1;
		t2.age++;
		System.out.println(t1.age);		//42  
		
		int a = 10;
		int b = 10;
		a++;
		System.out.println(b);
		
		Teacher t3 = null;
		t3.age = 10;
		
		
		
		
		
	}
}
class Teacher{
	String name;
	boolean sex;
	int age;
	
	public Teacher(){}
	
}