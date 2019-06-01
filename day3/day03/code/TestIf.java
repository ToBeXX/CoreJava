package p1;
import java.util.Scanner;
public class TestIf{
	public static void main(String[] args){
		//输入一个数
		//创建扫描器
		Scanner sc=new Scanner(System.in);
		//使用扫描器输入值
		int i=sc.nextInt();
		//输出这个数是奇数还是偶数
		/* if(i%2!=0){
			System.out.println("奇数");
		}
		if(i%2==0){
			System.out.println("偶数");
		} */
		
		if(i%2!=0)System.out.println(i+"是奇数");
	
		else System.out.println(i+"是偶数");//{只有一行代码时}，花括号可以省略
		
		
	}
}