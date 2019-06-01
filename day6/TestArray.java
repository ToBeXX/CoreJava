package code_day6;
import java.util.*;
public class TestArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要记录的学生成绩个数: ");
		int student = sc.nextInt();
		double[] arr = new double[student];
		System.out.println("请输入"+student+"个学生的成绩：");
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
		System.out.println(a.length+"个同学平均成绩为："+sum/a.length);
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
//复制数组
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
//数组扩容
class ArrayExpand{
	public static void main(String[] args){
		
		/*数组扩充方法1
		
		//原本的数组old
		int [] old = {1,2,3};
		//创建新数组new
		int[] new1 = new int[old.length*2];
		//把old的元素放大new的位置
		for(int i = 0 ;i<old.length;i++){
			new1[i] = old[i];
		}
		//把新数组赋值给old
		 old = new1;
		//遍历old
		for(int i = 0 ;i<old.length;i++){
			System.out.println(old[i]);
		}
		*/
		
		/*
		//数组扩充方法2
		//System.arraycopy(原数组，原数组开始下标，新数组，新数组开始下标，长度)
		int [] old = {1,2,3};
		int[] arr = new int[old.length*2];
		System.arraycopy(old,0,arr,1,old.length);
		for(int i = 0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
		
		/*
		//数组扩充方法3
		//java.util.Arrays.copyOf(老数组，新长度)；
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
		可变长参数：可以接收多个相同类型的实参
		语法：数据类型... 变量名，放在参数表的最后
		使用：和数组一样
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