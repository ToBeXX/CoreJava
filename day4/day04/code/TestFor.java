package p1;
import java.util.Scanner;
public class TestFor{
	public static void main(String[] args){
		//打印10个HelloWorld
		for(int i=1;i<=10;i++){
			System.out.println("HelloWorld"+i);
		}
		//计算1--100的和
		int sum =0;
		for(int i=1;i<=100;i++){
			//System.out.println(i);
			sum+=i;
		}
		System.out.println(sum);
	}
}