package p1;
import java.util.Scanner;
public class TestSwitch{
	public static void main(String[] args){
		/*
			��һ�����˼�
			�ܶ�����Ҷ��
			�������л���
			���ģ������ռ�
			���壺�½����̼�
			��ĩ����Ҷ������
		*/
		Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		//byte n=sc.nextByte();
		//short n=sc.nextShort();
		//char n=sc.next().charAt(0);
		//String JDK1.7
		String n=sc.next();
		//1����������ֵƥ��ɹ�����������switch
		//2����������ֵ����Ĳ���������ͬʱ������ʡ��ǰ��ģ��Ѵ���������һ��ֵ��
		//break��������ǰ�ṹ
		//default:�����������е�case,ִ��default,ͨ����default�������
		switch(n){
			
			//case 1:
			//case 'һ':
			case "Monday":
				System.out.println("���˼�");break;
			//case 2:
			//case '��':
			case "���ڶ�":
				System.out.println("��Ҷ��");break;
			//case 4:
			//case '��':
			case "������":
				System.out.println("�л���");break;
			//case 3:
			//case '��':
			case "������":
				System.out.println("�����ռ�");	break;
			//case 5:
			//case '��':
			case "������":
				System.out.println("�½����̼�");break;
			/* case 6:	
			case 7:
				System.out.println("��Ҷ������");
				//System.out.println("��Ҷ������");break; */
			default:
				System.out.println("��Ҷ������");
		}
	}
}