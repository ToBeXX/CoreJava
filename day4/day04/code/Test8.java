package p1;
public class Test8{
	public static void main(String[] args){
		//��¼����
		int sum=0;
		//����������¼����
		for(int i=1;;i++){
			//��¼���ܰ�����������
			sum+=3;
			//�ж��������Ƿ����7,Ϊ�棬����ѭ��
			if(sum>=7){
				System.out.println(i);
				break;
			}
			//����ִ��������׹2��
			sum-=2;
		}
	
	}
}
class Test9{
	public static void main(String[] args){
		int sum = 0;
		//ѭ��1--100���е���ֵ
		for(int i=1;i<=100;i++){
			//�жϵ�ǰ��ֵ��λ���Ƿ�Ϊ3�����Ϊ3����������ѭ��
			if(i%10==3)continue;
			//���
			sum+=i;
		}
		System.out.println(sum);
	}
}
class Test10{
	public static void main(String[] args){
		//��¼ֽ�ź��
		double a=0.08;
		//��¼���۴���
		int b=0;
		//ѭ�����ֽ�ĺ�ȴ���8848130ʱ����ѭ��
		do{
			//ֽ�Ŷ�����ԭ����ȵ�����
			a*=2;
			//���۴���ÿ�μ�1
			b++;
		}while(a<=8848130);
		System.out.println(b);
	}
}
//0+2+22+222+2222+22222
class Test11{
	public static void main(String[] args){
		//��һ����ֵ�Ƕ���
		int i=0;
		//�����ۼ���
		int sum = 0;
		//ѭ����5����ֵ��ӣ��������ֵ��ǰһ����ֵ*10+2
		for(int j=1;j<=5;j++){
			//�������ֵ��ǰһ����ֵ*10+2
			i=i*10+2;//2 22 222
			//��ֵ���
			sum+=i;//2 24 246
		}
		System.out.println(sum);
	}
}
class Test12{
	public static void main(String[] args){
		a:do{
			//��ӭ���
			System.out.println("-----------��ӭ-----------");
			System.out.println("������ʾ��ɲ�����");
			System.out.println("1������   2�����   0���˳�");
			java.util.Scanner sc =new java.util.Scanner(System.in);
			int n=sc.nextInt();
			//ѡ�����
			switch(n){
				case 1:
					System.out.println("����");break;
				case 2:
					System.out.println("��Ǯ");break;
				case 0:
					System.out.println("�˳�");break a;
				default:
					System.out.println("��������");
			}
			
		}while(true);
	}
}
class Test13{
	public static void main(String[] args){
		//����
		double a=10000;
		//ѭ��5��
		for(int i=1;i<=5;i++){
			//����=��һ��ı���+��Ϣ
			a=a+a*0.003;
		}
		System.out.println(a);
		
	}
}
//123 12 1 0
//1234 123 12 1 0
class Test14{
	public static void main(String[] args){
		int n=1234897890;
		int i=0;
		//������ѭ��/10
		do{
			n/=10;
			i++;
			if(n==0){
				System.out.println(i);
				break;
			}
		}while(true);
	}
}









