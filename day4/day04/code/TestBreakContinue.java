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
			System.out.println("�Ƽκ��ϻ����룡");
			c=sc.next().charAt(0);
			if(c=='Y')break;
		}
		/* int i=1;
		while(i<15){
			i++;
			if(i==11){
				break;//����ѭ���ṹ
				//continue;
				
			}
			System.out.println("HelloWorld"+i);
			
		} */
		/* Scanner sc = new Scanner(System.in);
		char c;
		while(true){
			System.out.println("�Ƽκ��ϼ�����");
			c=sc.next().charAt(0);
			if(c=='Y'){
				break;
			}
		} */
	}
}