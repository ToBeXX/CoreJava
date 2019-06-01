package code_day3;
import java.util.Scanner;
//��10��
public class TestIf{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		int age = i.nextInt();
		judge(age);
	}
public static void judge(int a){
	if (a < 6){
		System.out.println("��ͯ");
	}
	else if(a>=6&&a<=13){
		System.out.println("�ٶ�");
	}
	else if(a>=14&&a<=17){
		System.out.println("������");
	}
	else if(a>=18&&a<=35){
		System.out.println("����");
	}
	else if(a>=36&&a<50){
		System.out.println("����");
	}
	else{
		System.out.println("������");
	}
}
}
//��11��
class TestSwitch{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		int n = i.nextInt();
		print(n);
	}
	static void print(int a ){
		switch(a){
			case 1: System.out.println("����"); break;
			case 2: System.out.println("����"); break;
			case 3: System.out.println("����"); break;
			case 4: System.out.println("ӭӭ"); break;
			case 5: System.out.println("����"); break;
			default : System.out.println("������ӭ��"); break;
		}
	}
}
//��12��
class Judge{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("��������������: ");
		int a = i.nextInt();
		int b = i.nextInt();
		int c = i.nextInt();
		judge(a,b,c);
	}
	public static void judge(int n1, int n2, int n3){
		if (n1 > n2){
			if(n1 > n3){
				System.out.println("������Ϊ�� "+ n1);
			}
				else {
					System.out.println("������Ϊ��"+ n3);
				}
			
		}
			else if(n2 > n3){
				System.out.println("������Ϊ: "+ n2);
			}
			else {
				System.out.println("������Ϊ��"+ n3);
			}
		
	}
}
//��13��
class Year{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("������һ���Ϸ�����ݣ�");
		int year = i.nextInt();
		judge(year);
	}
	public static void judge(int n){
		if (n%4 == 0){
			if (n%100 != 0){
				System.out.println(n+ "��������");
			}
			else{
				if(n%400 == 0){
					System.out.println(n+ "��������");
				}
				else{
					System.out.println(n + "�겻������");
				}
			}
			
		}
		else{
			System.out.println(n + "�겻������");
		}
		
	}
}
//��14��
class  Counter{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("��������������: ");
		int a = i.nextInt();
		int b = i.nextInt();
		System.out.println("��������Ҫ������ѡ��:");
		System.out.println("1��+");
		System.out.println("2��-");
		System.out.println("3��*");
		System.out.println("4��/");
		int c = i.nextInt();
		counter(c,a,b);
	}
	public static void counter(int n1 ,int n2,int n3){
		switch(n1){
			case 1 : System.out.println("�������Ϊ��"+ (n2+n3)); break;
			case 2 : System.out.println("�������Ϊ��"+ (n2-n3)); break;
			case 3 : System.out.println("�������Ϊ��"+ (n2*n3)); break;
			case 4 : System.out.println("�������Ϊ��"+ ((double)(n2)/(double)(n3))); break;
			default : System.out.println("ѡ���������");
		}
		
	}
}
//��15��
class Charge{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("������������������: ");
		double a = i.nextDouble();
		charge(a);
	}
	public static void charge(double n ){
		if (n <=20){
			System.out.println("�����˷�Ϊ5Ԫ");
		}
		else if(n<=100){
			double n1 = n-20;
			double money = 5 + n1*0.2;
			System.out.println("������˷�Ϊ: "+ money +"Ԫ");
		}
		else{
			double n2 = 5 + 80*0.2;
			double money = n2 + (n-100)*0.15;
			System.out.println("������˷�Ϊ: "+ money+ "Ԫ");
			
		}
	}
}
//��16��
//��17��
class Sum{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("������һ����λ����: ");
		int a = i.nextInt();
		add(a);
	}
	public static void add(int n){
		int b = n%10;
		int c = n/10;
		int d = c%10;
		int e = n/100;
		int sum = b + d + e;
		System.out.println("��λ��������ܺ�Ϊ: "+ sum);
	}
}
//��18��
class Score{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("������ѧ���ɼ�: ");
		int a = i.nextInt();
		judge(a);
	}
	public static void judge(int n ){
		if (n<60){
			System.out.println("������");
		}
		else if(n<=70){
			System.out.println("����");
		}
		else if(n<80){
			System.out.println("����");
		}
		else{
			System.out.println("����");
		}
	}
}
//��19��
class Division{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("������һ������: ");
		int a = i.nextInt();
		division(a);
	}
	public static void division(int n){
		if(n%3 == 0){
			if(n%5 == 0){
				if(n%7 == 0){
					System.out.println("�������ܹ���3��5��7ͬʱ����");
				}
				else{
					System.out.println("�������ܹ���3��5ͬʱ����");
				}
			}
			else{
				System.out.println("������ֻ�ܱ�����");
			}
		}
		else if(n%5 == 0){
			if(n%7 == 0){
				System.out.println("�������ܹ���5,7ͬʱ����");
			}
			else{
				System.out.println("������ֻ�ܱ�5����");
			}
		}
		else if(n%7 == 0){
			System.out.println("������ֻ�ܱ�7����");
		}
		else{
			System.out.println("�����ֲ��ܱ�3��5��7����");
		}
	}
}
//��20��



//��21��
class Scholarship{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
			System.out.println("��������ѧ�����ĳɼ�: ");
			int a = i.nextInt();
			int b = i.nextInt();
			getMoney(a,b);
	}
	public static void getMoney(int n1 , int n2){
		if (n1 >=80 && n2>=80){
			System.out.println("��ϲ������500��ѧ��");
		}
		else if (n1<30 && n2<30){
			System.out.println("����Ҫ������");
		}
		else{
			System.out.println("�㰲ȫ��");
		}
	}
}


//��22��
class Tip{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("��������������: ");
		int a = i.nextInt();
		int b = i.nextInt();
		int c = i.nextInt();
		if(a >1000 || b>1000 || c>1000){
			System.out.println("�������ֵ�д���1000��");
		}
		else{
			System.out.println("û�д���1000��");
		}
	}
}



//��23��
class TestChar{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		char a = i.next().charAt(0);
		if(a >= 'A' && a <= 'Z'){
			System.out.println("���ַ�����ĸ");
		}
		else if(a >='a' && a <= 'z'){
			System.out.println("���ַ�����ĸ");
		}
		else{
			System.out.println("���ַ�������ĸ");
		}
	}
}


//��24��
class Squart{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("������һ������: ");
		int a = i.nextInt();
		long b = a*a;
		long c = a*a*a;
		System.out.println("�����ֵ�ƽ��Ϊ��"+ b);
		System.out.println("�����ֵ����η�Ϊ��"+ c);
	}
}


//��25��
class CharChange{
	
	public static void main(String[] args){
		Scanner i=new Scanner(System.in);
		System.out.println("������һ����ĸ: ");
		char c=i.next().charAt(0);
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
//��26��ͬ12��
//��27��
