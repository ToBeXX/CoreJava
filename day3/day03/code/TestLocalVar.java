package p1;
public class TestLocalVar{
	
	public static void main(String[] args){
		//System.out.println(n);//找不到符号
		int n=3;//未赋值使用：未初始化变量n
		System.out.println(n);
		if(true){
			int a=5;
			int b=10;
			System.out.println(a);
			//System.out.println(n);//命名冲突
			System.out.println(b);
		}
		//System.out.println(a);超出作用范围
	}

}