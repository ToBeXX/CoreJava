package code_14;
interface Inter{
	void show();
}
/* class Outer{
	public static Inter method(){
		return new Inter(){
			public void show(){
				System.out.println("HelloWorld");
			}
		};
	}
} */
class Outer{
	public static Inter method(){
		class A implements Inter{
			public void show(){
				System.out.println("HelloWorld");
			}
		}
		return new A();
	}
}
class OuterDemo{
	public static void main(String[] args){
		Outer.method().show();
	}
}