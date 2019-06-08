package prac;
import java.util.Scanner;
class Prac{
	public static void main(String[] args){
		//1.接收数据
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		IA ia = new B();
		if(n>6&&n%2==0){
			//拆分整数
			for(int i=2;i<=n/2;i++){
				int j = n-i;
				//判断是否是质数
				//调用函数
				if(ia.isPrime(i)&&ia.isPrime(j)){
					System.out.println(i+" "+j);
				}	
			}
		}
	}
}
interface IA{
	public boolean isPrime(int n);
}
class B implements IA{
	public boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i==0) return false;
		}
		return true;
	}
}




