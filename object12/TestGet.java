package code_day12;
class A{
	String name = "¶¯Îï";
	public int a = 0;
	public void m(){
		System.out.println("----A----");
	}
}
class B extends A{
	public int a = 1;
	public void m(){
		System.out.println("----B----");
	}
}
class TestA{
	public static void main(String[] args){
		String name = "¹·";
		A b = new B();
		System.out.println(b.a);
		System.out.println(b.name);
		b.m();
	}
}