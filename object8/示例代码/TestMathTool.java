package day08;
class TestMathTool{
	public static void main(String[] args){
		MathTool mathTool = new MathTool();
		mathTool.add();
		// mathTool.add(10.0);
		/* byte a = 10;
		mathTool.add(a); */
	
		mathTool.add(10,11.0);
		
	}
}
class MathTool{
	public void add(){
		System.out.println("add()");
	}
	/* public void add(byte a){
		System.out.println("add(byte)");
	} */
	public int add(int a){
		System.out.println("add(int)");
		return 10;
	} 
	public void add(double a,int b){
		System.out.println("add(double,int)");
	}
	public void add(int a,double b){
		System.out.println("add(int,double)");
	}
	
}