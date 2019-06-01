package p1;
import java.util.Scanner;
public class TestBreakContinue{
	public static void main(String[] args){
		
		/* int i=1;
		for(;;){
			//if(i==5)continue;
			System.out.println("HelloWorld"+i);
			if(i==5)break;
		} */
		Scanner sc=new Scanner(System.in);
		char c;
		for(;;){
			System.out.println("黄嘉浩上机编码！");
			c=sc.next().charAt(0);
			if(c=='Y')break;
		}
		/* int i=1;
		while(i<15){
			i++;
			if(i==11){
				break;//结束循环结构
				//continue;
				
			}
			System.out.println("HelloWorld"+i);
			
		} */
		/* Scanner sc = new Scanner(System.in);
		char c;
		while(true){
			System.out.println("黄嘉浩上级编码");
			c=sc.next().charAt(0);
			if(c=='Y'){
				break;
			}
		} */
	}
}