package p1;

public class TestRicursion{
	//函数递归  阶乘 1*2*3*4*5
	public static void main(String[] args){
		//int a=jieCheng(20);
		//System.out.println(a);
		int b=fabo(12);
		System.out.println(b);
	}
	public static int jieCheng(int n){
		if(n==1) return 1;
		int i=n*jieCheng(n-1);
		return i;
	}
	//5 5*4! 120
	//4 4*3! 24
	//3 3*2! 6
	//2 2*1! 2
	//1 1
	//斐波那契数列 1 1 2 3 5 8 13 21 34
	public static int fabo(int n){
		if(n==1||n==2)return 1;
		int sum=fabo(n-1)+fabo(n-2);
		return sum;
	}
	
	
	
	/* public static int jieCheng1(int n){//5
		int i=n*jieCheng2(n-1);
		return i;
	}
	public static int jieCheng2(int n){//4
		int i=n*jieCheng3(n-1);
		return i;
	}
	public static int jieCheng3(int n){//3
		int i=n*jieCheng4(n-1);
		return i;
	}
	public static int jieCheng4(int n){//2
		int i=n*jieCheng5(n-1);
		return i;
	} */
	/* public static int jieCheng5(int n){//1
		return 1;
	} */
}