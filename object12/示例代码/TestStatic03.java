package day12;
class TestStatic03{
	public static void main(String[] args){
		Sub s = new Sub();
		Sub s1 = new Sub();
		//父类的类加载
		//子类的类加载
		//父类的构造方法
		//子类的构造方法
		//父类的构造方法
		//子类的构造方法
	}
}
class Super{
	static {
		System.out.println("父类的类加载");
	}
	public Super(){
		System.out.println("父类的构造方法");
	}
}
class Sub extends Super{
	static {
		System.out.println("子类的类加载");
	}
	public Sub(){
		System.out.println("子类的构造方法");
	}
	
}