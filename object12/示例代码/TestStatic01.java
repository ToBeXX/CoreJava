package day12;
class TestStatic01{
	public static void main(String[] args){
		MyClass01 mc = new MyClass01();
		System.out.println(mc.a);
	}
}
class MyClass01{
	
	{
		a = 20;
		System.out.println("aaaa");
	}
	int a = 10;
	public MyClass01(){
		System.out.println("bbbb");
	}
	
	
}