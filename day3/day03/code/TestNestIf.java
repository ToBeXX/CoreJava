package p1;
import java.util.Scanner;
public class TestNestIf{
	public static void main(String[] args){
		/*
			100������
			��ʱ15s֮�ڵ�ѡ�ֱַ�������Ӻ�Ů�Ӿ�����
		*/
		Scanner sc=new Scanner(System.in);
		double time=sc.nextDouble();
		//double time=15.0;
		
		//char sex='M';
		
		if(time>15){
			System.out.println("��̭");
		}else{
			char sex=sc.next().charAt(0);
			if(sex=='M'){
				System.out.println("���Ӿ�����");
			}else{
				System.out.println("Ů�Ӿ�����");
			}
		}
		/* if(time<=15){
			//�������
			if(sex=='M'){
				//�������Ӿ�����
				System.out.println("���Ӿ�����");
			}else{
				//����Ů�Ӿ�����
				System.out.println("Ů�Ӿ�����");
			}
		}else{
			System.out.println("�㱻��̭��");
		} */
		
		
		
		
		
	}
}