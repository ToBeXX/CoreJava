package code_day10;
//day9��ҵ�����һ���ü̳з���
class Worker{
	String name;
	int age;
	boolean sex;
	public Worker(){}
	public Worker(String name,int age,boolean sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
}
class Address extends Worker{
	String address;
	int zipCode;
	public Address(){}
	public Address(String name,int age,boolean sex,String address,int zipCode){
		super(name,age,sex);
		this.address = address;
		this.zipCode = zipCode;
	}
}
class TestExtends{
	public static void main(String[] args){
		Address a = new Address("mgx",22,true,"�����к������йش�001",10085);
		System.out.println(a.name+a.age+a.sex+a.address+a.zipCode);
	}
}