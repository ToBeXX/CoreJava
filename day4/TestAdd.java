package code_day4;
import java.util.Scanner;
//第一题
public class TestAdd{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);	
		System.out.println("请输入要计算的数：");
		int a = i.nextInt();
		add(a);
	}
	public static void add(int n){
		int sum = 0;
		for (int i = 1; i<=100; i++){
			sum+=i;
		}
		System.out.println(n+"的和为："+ sum);
	}
}
//第二题
class EvenNumber{
	public static void main(String[] args){
		int a = 100;
		int sum = 0;
		for (int i =1 ; i<=100;i++ ){
			if(i%2 == 0){
				sum+=i;
			}
		}
		System.out.println("100以内的偶数和为："+ sum);
	}
}
//第三题
class SevenNumber{
	public static void main(String[] args){
		int a = 1000;
		int sum = 0;
		for (int i =1 ; i<=1000;i++ ){
			if(i%7 != 0){
				sum+=i;
			}
		}
		System.out.println("1000以内不能被7整除数的和为："+ sum);
	}
}
//第4题
class Factorial{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);	
		System.out.println("请输入要算阶乘的数：");
		int a = i.nextInt();
		factorial(a);
	}
	public static void  factorial(int n){
		int sum = 1;
		for (int i = 1; i<=n;i++){
			sum*=i;
		}
		System.out.println(n+"的阶乘为: "+sum);
	}
}
//第5题
class Water{
	public static void main(String[] args){
		int a = 80;
		int b = a/5;
		System.out.println("小和尚"+b+"次能把水缸挑满");
	}
}
//第6题
class TestFor{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		
		for(int e = 0; ; e++){
			int a = i.nextInt();
			if(a == 0) break;
		}
		
	}
}
//第7题
class Average{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		double[] a = new double[5];
		System.out.println("请输入五名同学的成绩");
		for(int b = 0 ; b<5;b++){
			a[b] = i.nextDouble();
		}
		average(a);
	}
	public static void average(double[] n){
		double sum = 0;
		for(int a = 0;a<n.length; a++){
			sum+=n[a];
		}
		 double b = sum/n.length;
		 System.out.println("五名同学的平均成绩为: "+ b);
	}
}
//第8题
class Climb{
	public static void main(String[] args){
		int n = 7;
		int day = 4;
		int night = 1;
		int total = day-night;
		double finaly = (double)n/(double)total;
		int a = (int)finaly;
		if (finaly - a != 0){
			System.out.println("需要"+(a+1)+"天");
		}
		else{
			System.out.println("需要"+a+"天");
		}
	}
}
//第9题
class SomeAdd{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);	
		System.out.println("请输入要计算的数：");
		int a = i.nextInt();
		add(a);
	}
	public static void add(int n){
		int sum = 0;
		for (int i = 1; i<=n; i++){
			if(i%10 == 3) continue;
			else{
				sum+=i;
			}
			
		}
		System.out.println(n+"的和为(除去个数为三的数字外)："+ sum);
	}
}
//第10题
class Ten{
	public static void main(String[] args){
		double n = 8848.13*1000;
		double a = 0.08;
		int count = 0;
		while(a < n){
			a*=2;
			count+=1;
		}
		System.out.println(count+"次能赶上珠穆朗玛峰！");
	}
}
//第18题
class Tree{
	public static void main(String[] args){
		form1();
		form2();
		form1();
		form1();
	}
	public static void form1(){
		System.out.println("   *");
	}
	public static void form2(){
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("*******");
	}
}
