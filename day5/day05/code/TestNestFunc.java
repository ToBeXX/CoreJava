package p1;

public class TestNestFunc{
	//函数嵌套调用
	public static void main(String[] args){
		ma();
	}
	public static void ma(){
		System.out.println("ma-------------start");
		ma();
		System.out.println("ma---------------end");
	}//当函数自己调用自己时，会出现栈空间溢出的错误
	/* public static void mb(){
		System.out.println("mb-------------start");
		mc();
		System.out.println("mb---------------end");
	}
	public static void mc(){
		System.out.println("mc-------------start");
		System.out.println("mc---------------end");
	} */
}