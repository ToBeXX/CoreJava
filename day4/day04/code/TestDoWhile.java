package p1;
import java.util.Scanner;
public class TestDoWhile{
	public static void main(String[] args){
		//��ӡ10��HelloWorld
		/* int i=1;
		do{
			System.out.println("helloWorld"+i);
			i++;
		}while(i<=10); */
		
		//����1--100�ĺ�
		int i=1;
		int sum=0;
		do{
			//System.out.println(i);
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println(sum);
		
		//�Ƽκ��ϻ����룬��ʦ��飬�ظ�Y,���Է�ѧ���ظ�N����������
		Scanner sc = new Scanner(System.in);
		char c;
		do{
			System.out.println("�Ƽκ�ͬѧ�ڱ��룡");
			System.out.print("����ʦ��飺");
			c=sc.next().charAt(0);
		}while(c!='Y');
		
		System.out.println("�ƺƿ��Է�ѧ�ˣ�");
		
		
	}
}