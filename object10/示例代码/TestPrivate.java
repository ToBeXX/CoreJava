package day10;
class TestPrivate{
	public static void main(String[] args){
		/* Person p1 = new Person();
		p1.name = "lizl";
		p1.age = 66;
		p1.sex = false;
		System.out.println(p1.name+"\t"+p1.age+"\t"+p1.sex); */
		
		Person p2 = new Person();
		// p2.name = "huangjh";
		p2.setName("huangjiah");
		// p2.age = 850;
		p2.setAge(85);
		p2.setSex (true);
		System.out.println(p2.getName()+"\t"+p2.getAge()+"\t"+p2.getSex());

	}
}
class Person{
	private String name;
	private int age;	//age����˽�л�
	private boolean sex;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	//set������  get������  ������������ĸ��д
	//set����  ---��Ϊ���Ը�ֵ
	public void setAge(int age){
		if(age>=0&&age<=150){		//���ݼ��
			this.age = age;
		}
	}
	//get����  ---����ȡ���Ե�ֵ
	public int getAge(){
		return age;
	}
	public void setSex(boolean sex){
		this.sex = sex;
	}
	public  boolean getSex(){
		return sex;
	}
	
}