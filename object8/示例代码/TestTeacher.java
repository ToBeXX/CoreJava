package day08;
class TestTeacher{
	public static void main(String[] args){
		//��������
		Teacher t1 = new Teacher();
		//Ϊ���Ը�ֵ
		t1.name = "�쳩";
		t1.age = 40;
		t1.sex = true;
		
		//��ȡ���Ե�ֵ
		String name = t1.name;
		System.out.println(name);
		
		//���÷���
		t1.teach("Web");
		t1.eat("�ȸ���");
		
		
		Teacher t2 = new Teacher();
		/* int a;
		System.out.println(a); */  //�ֲ����������ȸ�ֵ ��ʹ��
		
		System.out.println(t2.name+"\t"+t2.age+"\t"+t2.sex);  //null 0 false
		
		
		
		
	}
}


class Teacher{
	//����
	String name;
	int age;
	boolean sex;
	
	//����
	public void teach(String course){
		String name = "wxx";  //�ֲ����� name
		System.out.println(name+"teach"+course);
	}
	public void eat(String food){
		System.out.println(name+"eat"+food);
	}
}