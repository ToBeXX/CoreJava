package code_day6;
import java.util.*;
public class TestArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ��¼��ѧ���ɼ�����: ");
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
		System.out.println(a.length+"��ͬѧƽ���ɼ�Ϊ��"+sum/a.length);
	}
}
class TestArray1{
	public static void main(String[] srgs){
		int[] a = new int[5];
		for(int i = 0 ; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}
//��������
class CopyArray{
	public static void main(String[] srgs){
		int[] arr1 = new int[]{10,2,4,23,56,90};
		int[] arr2 = new int[arr1.length];
		for(int i = 0 ; i < arr1.length;i++){
			arr2[i] = arr1[i];
		}
		arr2[2] = 20;
		for (int a = 0 ;a<arr1.length;a++ ){
			System.out.println(arr1[a]);
			System.out.println(arr2[a]);
		}
	}
}
//��������
class ArrayExpand{
	public static void main(String[] args){
		
		/*�������䷽��1
		
		//ԭ��������old
		int [] old = {1,2,3};
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
		*/
		
		/*
		//�������䷽��2
		//System.arraycopy(ԭ���飬ԭ���鿪ʼ�±꣬�����飬�����鿪ʼ�±꣬����)
		int [] old = {1,2,3};
		int[] arr = new int[old.length*2];
		System.arraycopy(old,0,arr,1,old.length);
		for(int i = 0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
		
		/*
		//�������䷽��3
		//java.util.Arrays.copyOf(�����飬�³���)��
		int [] old = {1,2,3};
		old = Arrays.copyOf(old,old.length*2);
		for(int i = 0 ;i<old.length;i++){
			System.out.println(old[i]);
		}
		*/
	}
}
class ArrayChangeLength{
	public static void main(String[] args){
		/*
		�ɱ䳤���������Խ��ն����ͬ���͵�ʵ��
		�﷨����������... �����������ڲ���������
		ʹ�ã�������һ��
		*/
		funtion(1,2,3,4,5,6,7);
	}
	public static void funtion(int... a){
		for(int i = 0 ;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
class Test{
	public static void main(String[] args){
		int a[] = new int[3];
	}
}