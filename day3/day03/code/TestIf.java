package p1;
import java.util.Scanner;
public class TestIf{
	public static void main(String[] args){
		//����һ����
		//����ɨ����
		Scanner sc=new Scanner(System.in);
		//ʹ��ɨ��������ֵ
		int i=sc.nextInt();
		//������������������ż��
		/* if(i%2!=0){
			System.out.println("����");
		}
		if(i%2==0){
			System.out.println("ż��");
		} */
		
		if(i%2!=0)System.out.println(i+"������");
	
		else System.out.println(i+"��ż��");//{ֻ��һ�д���ʱ}�������ſ���ʡ��
		
		
	}
}