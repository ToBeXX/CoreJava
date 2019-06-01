package code_day5;
import java.util.Scanner;
//第18题
public class TestFuntion{
	public static void main(String[] args){
		/*
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		*/
		for(int i = 100;i<10000;i++){
			judge(i);
		}
	}
	 public static void judge(int n ){
		int a = n%10;
		int b = n/100;
		int c = n/10%10;
		int n1 = 1;
		int n2 = 1;
		int n3 = 1;
		for(int i = 1; i<=a; i++ ){
			n1*=i;
		}
		for(int i = 1; i<=b; i++ ){
			n2*=i;
		}
		for(int i = 1; i<=c; i++ ){
			n3*=i;
		}
		if(n == n1+n2+n3){
			System.out.println(n+"这个三位数可以的");
		}
	}
}
//第19题
class JgGuess{
	public static void main(String[] srgs){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个自然数（不能是0以及负数）");
		int number = sc.nextInt();
		step(number);
	}
	public static void step(int n ){
		if (n == 1){
			System.out.println("输入即为1");
		}
		while(n != 1){
			if (n%2 == 0){
				n /= 2;
				System.out.print(" 除2 ");
			}
			else{
				n*=3;
				n+=1;
				System.out.print(" 乘3加1 ");
			}
		}
		System.out.println();
		System.out.println("经过以上步骤角谷猜想成功");
	}
}
//第22题
class GdGuess{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个大于6的偶数：");
		int number = sc.nextInt();
		System.out.println("这个偶数由以下质数组成：");
		int a = number/2;
		for(int num1 = 1; num1<= a;num1++){
			int num2 = number - num1;
			if (isPrime(num1) && isPrime(num2)){
				System.out.println(num1+" "+num2);
			}
		}
	}
	public static boolean isPrime(int n){
		int count = 0;
		for(int i = 2;i < n; i++){
			if (n%i == 0){
				return false;
			}
			else{
				count+=1;
			}
		}
		if(count == n-2){
			return true;
		}
		else return false;
	}
}
//第23题
class Hannoi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入圆盘数：");
		int n = sc.nextInt();
		hannoi(n,'A','B','C');
	}
	public static void hannoi(int n,char a,char b,char c){
		if(n == 1){
			System.out.println(a + "--->" + c);
		}
		else{
			hannoi(n-1,a, c, b);
			System.out.println(a + "--->" + c);
			hannoi(n-1,b,a,c);
		}
	}
}
