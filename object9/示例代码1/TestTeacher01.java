package day09;
class TestTeacher01{
	public static void main(String[] args){
		//����Ӧ���ڲ���
		Teacher01 t1 = new Teacher01();
		t1.age = 18;
		Teacher01 t2 = new Teacher01();
		t2.age = 40;
		
		t1.compare(t2);
		
		//����һ��Teacher���͵�����  
		Teacher01[] ts = new Teacher01[3];
		//�洢���Teacher����
		ts[0] = t1;
		ts[1] = t2;
		ts[2] = new Teacher01();
		//ѭ������������  ��ȡ����Teacher���������
		for(int i=0;i<ts.length;i++){
			System.out.println(ts[i].age);
		}
		
		//����Ӧ���ڷ���ֵ
		Teacher01 t3 = getTeacher();
		System.out.println(t3.name);
		
	}
	//����һ��Teacher����
	public static Teacher01 getTeacher(){
		Teacher01 t = new Teacher01();
		t.name = "ly";
		return t;
		
	}
}
class Teacher01{
	String name;
	boolean sex;
	int age;
	
	
	public Teacher01(){}
	//�Ƚϵ�ǰ����ʹ�����������
	public void compare(Teacher01 t){
		if(this.age > t.age){
			System.out.println("�Һܳ���");
		}else if(this.age<t.age){
			System.out.println("����ϰ�");
		}else{
			System.out.println("����һ������");
		}
	}
	
	
}