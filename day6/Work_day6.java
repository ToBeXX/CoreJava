package code_day6;
import java.util.*;
/*
//��һ��
//A B  ��  c D��  Ӧ�ø�Ϊ int[] a = {1,2,3}    int[] a = new int[]{1,2,3};
A. int[] a;
B. int a[] = new int[3];
C. int[] a; a = {1,2,3,4,5};
D. int[] a = new int[3]{1,2,3};
//�ڶ���
//ѡ��D
public class Ex2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		expand(a);
		changeArray(a);
		printArray(a);
	}
	public static void expand(int[] a){
		int[] newArray = new int[a.length * 2];
		System.arraycopy(a, 0, newArray, 0, a.length);
		a = newArray;
		}
	public static void changeArray(int[] a){
		a[0] = 10;
	}
	public static void printArray(int[] a){
		for(int i = 0; i<a.length; i++){
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
}
��ѡ����������
A. 10 2 3 4 5
B. 1 2 3 4 5
C. 10 2 3 4 5 0 0 0 0 0
D. 1 2 3 4 5 0 0 0 0 0

//������
*/
 //��3��
 class Average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ĳ���: ");
		int n = sc.nextInt();
		double[] arr = new double[n];
		System.out.println("�����볤��Ϊ"+n+"�������ֵ��");
		for (int i = 0;i<arr.length;i++){
			
			double score = sc.nextDouble();
			arr[i] = score;
		}
		average(arr);
	}
	public static void average(double[] a){
		double sum = 0;
		for (int n = 0;n<a.length;n++){
			sum+=a[n];
		}
		System.out.println("�����ƽ��ֵΪ��"+sum/a.length);
	}
}
//��4��
class ArrayAdd{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		a = arrayAdd(a);
		for(int i = 0 ;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	public static int[] arrayAdd(int[] n){
		for(int i = 0 ; i<n.length; i++){
			n[i]+=1;
		}
		return n;
	}
}
//��5��
class JudgeArray{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		Scanner i = new Scanner(System.in);
		System.out.println("������Ҫ���Ҹ���������:");
		int num = i.nextInt();
		judgeCount(arr,num);
	}
	public static void judgeCount(int[] a ,int n ){
		int count = 0;
		for(int i = 0; i<a.length;i++){
			if(a[i] == n){
				count+=1;
			}
		}
		System.out.println(n+" ������ "+count+"��");
	}
}
//��6��
class PrintAddress{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		Scanner i = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�ַ������:");
		int num = i.nextInt();
		printAddress(arr,num);
	}
	public static void printAddress(int[] a ,int n ){
		int count = 0;
		for(int i = 0; i<a.length;i++){
			if(a[i] == n){
				count += 1;
				System.out.println(n+" ���±�Ϊ "+i);
			}
		}
		if(count == 0){
			System.out.println("-1");
		}
	}
}
//��7��
class PrintMax{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		/*
		Scanner i = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�ַ������:");
		int num = i.nextInt();
		*/
		judgeMax(arr);
	}
	public static void judgeMax(int[] a ){
		/*
		int min;
		int max;
		for(int i = 0; i<a.length;i++){
			min = a[i];
			max = a[i+1];
			if(min > max){
				int temp = min;
				min = max;
				max = temp;
			}
		}
		*/
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		
	}
}
//��8��
class Reversal{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		System.out.println("�ߵ�ǰ��");
		for(int i = 0 ;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
		reversal(arr);
	}
	public static void reversal(int[] a){
		int[] b =  new int[a.length];
		for(int i = 0 ;i<(a.length/2);i++){
			int temp;
			int n = a.length-i-1;
			temp = a[i];
			a[i] = a[n];
			a[n] = temp;
		}
		System.out.println("�ߵ���");
		for(int i = 0 ;i<a.length;i++){
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
//��9��
class AverageStudent{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������༶����: ");
		int student = sc.nextInt();
		double[] arr = new double[student];
		System.out.println("������"+student+"��ѧ���ĳɼ���");
		for (int i = 0;i<arr.length;i++){
			
			double score = sc.nextDouble();
			arr[i] = score;
		}
		average(arr);
	}
	public static void average(double[] a){
		double sum = 0;
		for (int n = 0;n<a.length;n++){
			sum+=a[n];
		}
		System.out.println("�༶ƽ���ɼ�Ϊ��"+sum/a.length);
	}
}
//��11��
class ArrayOddNmmber{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		isOddNumber(arr);
	}
	public static void isOddNumber(int[] a){
		for(int i = 0;i<a.length;i++){
			if(a[i]%2 != 0){
				System.out.println("a["+i+"]������: "+a[i]);
			}
		}
	}
}
//��10��
class ArrayPrime{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		isPrime(arr);
	}
	public static void isPrime(int[] a){
		
		for(int i = 0;i<a.length;i++){
			int count = 0;
			if(a[i] == 1) continue;
			for(int j = 2;j<a[i];j++){
				if(a[i]%j != 0){
					count+=1;
				}
			}
			if(count == a[i]-2){
				System.out.println("a["+i+"]������: "+a[i]);
			}
		}
	}
}
//��12��
class ArrayTirple{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		isTirple(arr);
	}
	public static void isTirple(int[] a){
		for(int i = 0;i<a.length;i++){
			if(a[i] == 0) continue;
			if(a[i]%3 == 0){
				System.out.println("a["+i+"]��3�ı���: "+a[i]);
			}
		}
	}
}
//��13��
class PassSeven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ָ���: ");
		int number = sc.nextInt();
		int[] arr = new int[number];
		System.out.println("������"+number+"�����ֵ�ֵ��");
		for (int i = 0;i<arr.length;i++){
			int value = sc.nextInt();
			arr[i] = value;
		}
		passSeven(arr);
	}
	public static void passSeven(int[] a){
		for (int n = 0;n<a.length;n++){
			int num1 = a[n];
			if(num1%7 == 0){
				System.out.println(num1+"���߹�");continue;
			}
			else{
				while(num1/10 != 0){
					num1/=10;
					int num2 = num1%10;
					if(num2 == 7){
						System.out.println(a[n]+"���߹�");
					}
				}
			}
		}
	}
}
//��14��
class ArrayExpand1{
	public static void main(String[] args){
		int[] old = {1,2,3,4,5,6};
		System.out.println("--------����һ--------");
		//����������new
		int[] new1 = new int[old.length+1];
		//��old��Ԫ�طŴ�new��λ��
		for(int i = 0 ;i<old.length;i++){
			new1[i] = old[i];
		}
		//�������鸳ֵ��old
		 old = new1;
		//����old
		for(int i = 0 ;i<old.length;i++){
			System.out.println(old[i]);
		}
		System.out.println("--------������--------");
		int[] arr = new int[old.length+1];
		System.arraycopy(old,0,arr,0,old.length);
		for(int i = 0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("--------������--------");
		old = Arrays.copyOf(old,old.length+1);
		for(int i = 0 ;i<old.length;i++){
			System.out.println(old[i]);
		}
	}
}
//��15��
class ArrayExpand2{
	public static void main(String[] args){
		int[] old = {1,2,3,4,5,6};
		System.out.println("--------����һ--------");
		//����������new
		int[] new1 = new int[old.length+2];
		//��old��Ԫ�طŴ�new��λ��
		for(int i = 0 ;i<old.length;i++){
			new1[i] = old[i];
		}
		//�������鸳ֵ��old
		 old = new1;
		//����old
		for(int i = 0 ;i<old.length;i++){
			System.out.println(old[i]);
		}
		System.out.println("--------������--------");
		int[] arr = new int[old.length+2];
		System.arraycopy(old,0,arr,0,old.length);
		for(int i = 0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("--------������--------");
		old = Arrays.copyOf(old,old.length+2);
		for(int i = 0 ;i<old.length;i++){
			System.out.println(old[i]);
		}
	}
}
//��16��
class ArrayExpand3{
	public static void main(String[] args){
		int[] old = {1,2,3,4,5,6};
		System.out.println("--------����һ--------");
		//����������new
		int[] new1 = new int[old.length*2];
		//��old��Ԫ�طŴ�new��λ��
		for(int i = 0 ;i<old.length;i++){
			new1[i] = old[i];
		}
		//�������鸳ֵ��old
		 old = new1;
		//����old
		for(int i = 0 ;i<old.length;i++){
			System.out.println(old[i]);
		}
		System.out.println("--------������--------");
		int[] arr = new int[old.length*2];
		System.arraycopy(old,0,arr,0,old.length);
		for(int i = 0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("--------������--------");
		old = Arrays.copyOf(old,old.length*2);
		for(int i = 0 ;i<old.length;i++){
			System.out.println(old[i]);
		}
	}
}
//��17��
class ArrayInsert{
	public static void main(String[] args){
		int[] a = {1,2,3};
		insert(1,4,a);
	}
	public static void insert(int pos,int value,int[] arr){
		arr = Arrays.copyOf(arr,arr.length+1);
		for(int i = arr.length-1;i>pos;i--){
			arr[i] = arr[i-1];
		}
		arr[pos] = value;
		for(int j = 0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}
}
//��18��
class ArrayDelete{
	public static void main(String[] args){
		int[] a = {1,2,3};
		delete(1,a);
	}
	public static void delete(int pos,int[] arr){
		
		for(int i = pos ;i<arr.length;i++){
			if(i != arr.length-1){
				arr[i] = arr[i+1];
			}
			else{
			arr[i] = arr[i];
			}
		}
		arr = Arrays.copyOf(arr,arr.length-1);
		for(int n = 0;n<arr.length;n++){
			System.out.println(arr[n]);
		}
	}
}
//��19��
class ArrayUpdate{
	public static void main(String[] args){
		int[] a = {1,2,3};
		update(1,5,a);
	}
	public static void update(int pos,int value ,int[] arr){
		arr[pos] = value;
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
//��20��
class ArraySelect{
	public static void main(String[] args){
		int[] a = {1,2,3};
		select(a);
	}
	public static void select(int[] arr){
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
//��21��
/*
class Bank{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] cardId = new int[6];
		int[] passWorld = new int[6];
		
		
	}
	public static void open(){
		
		System.out.println("������6λ��Ҫ�������˺�Id��");
		for(int i = 0;i<6;i++){
			cardId[i] = sc.nextInt();
		}
		System.out.println("������6λ���룺");
		for(int j = 0;j<6;j++){
			passWorld[i] = sc.nextInt();
		}
		
		System.out.println("�����ɹ�");
	}
	public static void updatePassWorld(){}
	public static void saveMoney(){
		int[] blance ;
		System.out.println("��������λ����");
		int money = sc.nextInt();
		balance = new int[money];
		System.out.println("���");
		for(int k = 0;k<6;j++){
			passWorld[i] = sc.nextInt();
		}
		System.out.println("���ɹ�");
	}
	public static void getMoney(){
		System.out.println("����ȡ��Ǯ����");
		int n1 = sc.nextInt();
		int count = 1;
		for(int i = 0;i<balance.length;i++){
			if(i != balance.length-1 ){
				count*=balance[i+1];
				count+=balance[i];
			}
			
		}
	}
	public static void selectMoney(){
		System.out.println("���Ϊ��");
		for(int i = 0;i<balance.length;i++){
			System.out.print("blance[i]");
		}
	}
	public static void transMoney(){
		
	}
	public static void quit(){
		System.out.println("---ִ���˳�����---");
	}
	public static void selectType(){
		do{
			System.out.println("==============��ӭʹ��ATM�������з���==============");
			System.out.println("1:����2:���3:ȡ��4:ת��5:��ѯ���6:�޸����� 0:�˳�");
			System.out.println("===================================================");
			System.out.println("�����������ţ�");
			int number = sc.nextInt();
			switch(number){
				case 1: open();  break;
				case 2:  break;
				case 3:  break;
				case 4:  break;
				case 5:  break;
				case 6:  break;
				case 0:System.out.println("---ִ���˳�����---");break;
				default: System.out.println("---�����������������---");
			}
		}while(number != 0);
	}
}
*/