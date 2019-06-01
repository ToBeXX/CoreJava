package p1;
import java.util.Scanner;
public class TestDoWhile{
	public static void main(String[] args){
		//打印10个HelloWorld
		/* int i=1;
		do{
			System.out.println("helloWorld"+i);
			i++;
		}while(i<=10); */
		
		//计算1--100的和
		int i=1;
		int sum=0;
		do{
			//System.out.println(i);
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println(sum);
		
		//黄嘉浩上机编码，老师检查，回复Y,可以放学，回复N，继续编码
		Scanner sc = new Scanner(System.in);
		char c;
		do{
			System.out.println("黄嘉浩同学在编码！");
			System.out.print("请老师检查：");
			c=sc.next().charAt(0);
		}while(c!='Y');
		
		System.out.println("浩浩可以放学了！");
		
		
	}
}