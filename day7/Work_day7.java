package code_day7;
import java.util.*;
//��1��
public class Work_day7{
	public static void main(String[] args){
		int[] a = {1,3,2,7,5};
		sort(a);
	}
	public static void sort(int[] a){
		for(int i = 0;i<a.length;i++){
			for(int j = 0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("ð�ݺ�����飺");
		for(int k = 0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
	}
}
//��2��
class SelectSort{
	public static void main(String[] args){
		int[] a = {1,3,2,7,5};
		sort(a);
	}
	public static void sort(int[] a){
		for(int i = 0;i<a.length-1;i++){
			for(int j = i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("ѡ�����������飺");
		for(int k = 0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
	}
}
//��3�⣨��������
/*
class SelectIsprime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�ڷ�����һ��������");
		int n = sc.nextInt();
		boolean[] arr = new boolean[n];
		for(int i = 0;i<arr.length;i++){
			arr[i] = true;
		}
		
	}
}
*/
//��4��
class AverageScore{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("������10��������");
		for (int i = 0;i<arr.length;i++){
			int score = sc.nextInt();
			arr[i] = score;
		}
		sort(arr);
		average(arr);
	}
	public static void sort(int[] a){
		for(int i = 0;i<a.length-1;i++){
			for(int j = i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
	public static void average(int[] n){
		int count = 0;
		for(int i = 1;i<n.length-1;i++){
			count+=n[i];
		}
		double a = count/(n.length-2);
		System.out.println("ƽ���ɼ�Ϊ��"+a);
	}
}
//��5��
class Rank{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int[] b = new int[3];
		int max = b[0];
		int min = b[0];
		for(int i =0 ;i<arr.length;i++){
			System.out.println("�������"+(i+1)+"λѡ�ֵĳɼ���");
			for(int j=0;j<arr[i].length;j++){
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}
		for(int i = 0;i<arr.length;i++){
			sort(arr[i]);
			double c = average(arr[i]);
			System.out.println("��"+(i+1)+"λƽ���ɼ�Ϊ��"+c);
			
		}
		
	}
	public static void sort(int[] a){
		for(int i = 0;i<a.length-1;i++){
			for(int j = i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
	public static double average(int[] n){
		int count = 0;
		for(int i = 1;i<n.length-1;i++){
			count+=n[i];
		}
		double a = count/(n.length-2);
		return a;
	}
}
//��6��
class JudgeArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ĳ���: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("������"+n+"����ֵ��");
		for (int i = 0;i<arr.length;i++){
			int score = sc.nextInt();
			arr[i] = score;
		}
		isOushu(arr);
		isJishu(arr);
		Arrays.sort(arr);
		System.out.println("��СֵΪ��"+arr[0]);
		System.out.println("���ֵΪ��"+arr[arr.length-1]);
	}
	public static void isOushu(int[] n){
		int onum = 0;

		for(int i = 0; i<n.length;i++){
			if(n[i] == 0){
				onum+=0;
			}
			else if(n[i]%2 == 0){
				onum+=1;
			}
		}
		System.out.println("ż����"+ onum+"��");
	}
	public static void isJishu(int[] n){

		int jnum = 0;
		for(int i = 0; i<n.length;i++){
			if(n[i] == 0){
				jnum+=0;
			}
			else if(n[i]%2 != 0){
				jnum+=1;
			}
		}
		System.out.println("������"+ jnum+"��");
	}
}
//��7��
class ArrayMerge{
	public static void main(String[] args){
		int[] A = {1,7,9,11,13,15,17,19};
		int[] B = {2,4,6,8,10};
		int a = A.length;
		int b = B.length;
		int c = a+b;
		int[] C = new int[c];
		System.arraycopy(A,0,C,0,a);
		System.arraycopy(B,0,C,a,b);
		Arrays.sort(C);
		for(int i = 0;i<C.length;i++){
			System.out.print(C[i]+" ");
		}
	}
}
//��8��
class CountNumber{
	public static void main(String[] args){
		int[] score = {72,89,65,58,87,91,53,82,71,93,76,68};
		int[] count = judge(score);
		for(int i = 0; i<count.length;i++){
			System.out.print(count[i]);
		}
	}
	public static int[] judge(int[] n){
		int[] b = new int[5];
		int counte = 0;
		int countd = 0;
		int countc = 0;
		int countb = 0;
		int counta = 0;
		for(int j = 0;j<n.length;j++){
			if(n[j]<60){
				counte+=1;
			}
			else if(n[j]<70){
				countd+=1;
			}
			else if(n[j]<80){
				countc+=1;
			}
			else if(n[j]<90){
				countb+=1;
			}
			else{
				counta+=1;
			}
		}
		b[0] = counte;
		b[1] = countd;
		b[2] = countc;
		b[3] = countb;
		b[4] = counta;
		return b;
 	}
}
//��9��
class DoArray{
	public static void main(String[] args){
		int[] old = {4,5,3,7,2,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("���������֣�1��2��3��4����");
		int number = sc.nextInt();
		switch(number){
			case 1: {
				System.out.println("������Ҫ���ӵ�Ԫ�أ�");
				int value = sc.nextInt();
				insert(value,old);
			}break;
			case 2: {
				System.out.println("������Ҫɾ����Ԫ�أ�");
				int value = sc.nextInt();
				delete(value,old);
			} break;
			case 3: {
				System.out.println("������Ҫ�޸ĵ�Ԫ�أ�");
				int value = sc.nextInt();
				update(value,old);
			} break;
			case 4: {
				System.out.println("������Ҫ�鿴Ԫ���±꣺");
				int temp = sc.nextInt();
				select(temp,old);
				
			} break;
		}
	}
	public static void insert(int n,int[] arr){
		arr = Arrays.copyOf(arr,arr.length+1);
		arr[arr.length] = n;
		for(int j = 0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}
	public static void delete(int n,int[] arr){
		int count = 0;
		for(int j=0;j<arr.length;j++){
			if(arr[j] == n){
				count+=1;
				for(int i = j ;i<arr.length;i++){
					if(i != arr.length-1){
						arr[i] = arr[i+1];
					}
					else{
					arr[i] = arr[i];
					}
				}
			}
			
		}
		arr = Arrays.copyOf(arr,arr.length-count);
		for(int l = 0;l<arr.length;n++){
			System.out.println(arr[n]);
		}
	}
	public static void update(int n ,int[] arr){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int j = 0;j<arr.length;j++){
			if(arr[j] == n){
				count+=1;
				System.out.println("������Ҫ�޸ĵ�Ԫ��ֵ��");
				int num = sc.nextInt();
				arr[j] = num;
			}
		}
		if(count == 0){
			System.out.println("Ԫ�ز����ڣ�");
		}
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void select(int n,int[] arr){

			System.out.println(arr[n]);

	}
}
//��10��
class MakeNew{
	public static void main(String[] args){
		int[] oldArr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int number = countNumber(oldArr);
		int[] new1 = new int[number];
		int j = 0;
		for(int i = 0;i<oldArr.length;i++){
			if(oldArr[i] == 0){
				continue;
			}
			else{
				new1[j] = oldArr[i];
				j++;
			}
		}
		for(int k = 0; k<new1.length;k++){
			System.out.print(new1[k]+" ");
		}
	}
	public static int countNumber(int[] a){
		int count = 0;
		for(int i = 0;i<a.length;i++){
			if(a[i] != 0){
				count+=1;
			}
		}
		return count;
	}
}
//��11��
class UpArray{
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++){
			arr[i] = i;
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		invert(arr);
	}
	public static void invert(int[] n){
		int a = n.length/2;
		for(int i = 0;i<a;i++){
			int temp = n[i];
			n[i] = n[n.length-1-i];
			n[n.length-1-i] = temp;
		}
		for(int j=0;j<n.length;j++){
			System.out.print(n[j]+" ");
		}
	}
}
//��12��
class GetMin{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ĳ���: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("������"+n+"����ֵ��");
		for (int i = 0;i<arr.length;i++){
			int score = sc.nextInt();
			arr[i] = score;
		}
		min(arr);
	}
	public static void min(int[] a){
		for(int i = 0;i<a.length-1;i++){
			for(int j = i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("��С����Ϊ��"+a[0]);
	}
}
//��13��
class ForArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ������: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("������"+n+"��ͬѧ�ĳɼ���");
		for (int i = 0;i<arr.length;i++){
			int score = sc.nextInt();
			arr[i] = score;
		}
		average(arr);
		sort(arr);
	}
	public static void sort(int[] a){
		for(int i = 0;i<a.length-1;i++){
			for(int j = i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("��߷�Ϊ��"+a[0]);
		System.out.println("��ͷ�Ϊ��"+a[a.length-1]);
	}
	public static void average(int[] n){
		int count = 0;
		for(int i = 1;i<n.length-1;i++){
			count+=n[i];
		}
		double a = count/(n.length-2);
		System.out.println("ƽ����Ϊ��"+a);
	}
}
//��14��
class ArrayString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];
		System.out.println("������5��ͬѧ��������");
		for(int i = 0;i<str.length;i++){
			String a = sc.next();
			str[i] = a;
		}
		for(int i = 0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
}
//��15��
class JudgeOk{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ĳ���: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("������"+n+"����ֵ��");
		for (int i = 0;i<arr.length;i++){
			int score = sc.nextInt();
			arr[i] = score;
		}
		judge(arr);
	}
	public static void judge(int[] n){
		int count1 = 0;
		int count2 = 0;
		for(int i = 0;i<n.length;i++){
			if(n[i] == 1 || n[i] == 2 || n[i] == 3){
				count1+=1;
			}
			else{
				count2+=1;
			}
		}
		System.out.println("�Ϸ�������Ϊ��"+count1);
		System.out.println("���Ϸ�������Ϊ��"+count2);
	}
}
//��16��
//��17�⣨��������
//��18��
class TestYanghui{
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int[][] arr = new int[a][];
		 for(int i = 0;i<a;i++){
			 arr[i] = new int[i+1];
		 }
		 for(int j = 0;j<arr.length;j++){
			 for(int k = 0;k<arr[j].length;k++){
				 if(j == 0 || j ==1){
					 arr[j][k] = 1;
				 }
				 else if(k == 0 || k == arr[j].length-1){
					 arr[j][k] = 1;
				 }
				 else{
					 arr[j][k] = arr[j-1][k-1] + arr[j-1][k];
				 }
			 }
		 }
		 for(int i =0 ;i<arr.length;i++){
			for(int n=a-1-i;n>0;n--){
				System.out.print("  ");
				}
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"   ");
				if(j == arr[i].length-1){
					System.out.println();
				}			
			}
		}
	}
}
//��19��
