package day12;
class TestStatic02{
	public static void main(String[] args){
		/* System.out.println(MyClass02.a);
		System.out.println(MyClass02.a); */
		
		MyClass02 mc = new MyClass02();
		MyClass02 mc1 = new MyClass02();
		
	}
}
class MyClass02{
	static{
		a = 30;
		System.out.println("¿‡º”‘ÿ...");
	}
	static int a = 20;
	
	public MyClass02(){
		System.out.println("bbbb");
	}
	
	
}