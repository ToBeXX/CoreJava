package p1;
import java.util.Scanner;
public class TestChange{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		//ȷ��������ַ��Ǵ�д����Сд
		//�жϴ�д�ַ�
		if(c>='A'&&c<='Z'){
			//תСд
			c+=32;
			System.out.println(c);
		}
		//�ж�Сд�ַ�
		else if(c>=97&&c<=122){
			//ת��д
			c-=32;
			System.out.println(c);
		}
		//����Ĳ�����ĸ
		else{
			System.out.println("����Ĳ�����ĸ���޷�ת����Сд��");
		}
		
	
	}
}

class TestPage{
	
	public static void main(String[] args){
		int n=55;
		int m=10;
		int i=6;
		if(n%m==0){
			//������n������ÿҳ��ʾ������m
			int start=(i-1)*m+1;
			int end=i*m;
			System.out.println(start+"-----"+end);
		}else{
			//��������������ÿҳ��ʾ������
			int k=n/m+1;
			if(i==k){
				//���һҳ
				int start=(i-1)*m+1;
				int end=n;
				System.out.println(start+"-----"+end);
			}else{
				int start=(i-1)*m+1;
				int end=i*m;
				System.out.println(start+"-----"+end);
			}
			
		}
	}

}


