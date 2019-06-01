package code_day7;
import java.util.*;
/**
冒泡排序,将较小的数冒泡出去
*/
public class TestSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组的长度: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("请输入"+n+"个数值：");
		for (int i = 0;i<arr.length;i++){
			
			int score = sc.nextInt();
			arr[i] = score;
		}
		System.out.println("冒泡前的数组：");
		for (int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sort(arr);
	}
	public static void sort(int[] a){
		for(int i = 0;i<a.length;i++){
			for(int j = 0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("冒泡后的数组：");
		for(int k = 0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
	}
}
/**
选择排序,将较大的数选择出去
*/
class SelectSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组的长度: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("请输入"+n+"个数值：");
		for (int i = 0;i<arr.length;i++){
			
			int score = sc.nextInt();
			arr[i] = score;
		}
		System.out.println("选择排序前的数组：");
		for (int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sort(arr);
	}
	public static void sort(int[] a){
		for(int i = 0;i<a.length-1;i++){
			for(int j = i+1;j<a.length;j++){
				if(a[i]<a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("选择排序后的数组：");
		for(int k = 0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
	}
}