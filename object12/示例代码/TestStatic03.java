package day12;
class TestStatic03{
	public static void main(String[] args){
		Sub s = new Sub();
		Sub s1 = new Sub();
		//����������
		//����������
		//����Ĺ��췽��
		//����Ĺ��췽��
		//����Ĺ��췽��
		//����Ĺ��췽��
	}
}
class Super{
	static {
		System.out.println("����������");
	}
	public Super(){
		System.out.println("����Ĺ��췽��");
	}
}
class Sub extends Super{
	static {
		System.out.println("����������");
	}
	public Sub(){
		System.out.println("����Ĺ��췽��");
	}
	
}