package code_day6;
import java.util.*;
/*
//第一题
//A B  对  c D错  应该改为 int[] a = {1,2,3}    int[] a = new int[]{1,2,3};
A. int[] a;
B. int a[] = new int[3];
C. int[] a; a = {1,2,3,4,5};
D. int[] a = new int[3]{1,2,3};
//第二题
//选择D
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
请选择输出结果：
A. 10 2 3 4 5
B. 1 2 3 4 5
C. 10 2 3 4 5 0 0 0 0 0
D. 1 2 3 4 5 0 0 0 0 0

//第三题
*/
 //第3题
 class Average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组的长度: ");
		int n = sc.nextInt();
		double[] arr = new double[n];
		System.out.println("请输入长度为"+n+"的数组的值：");
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
		System.out.println("数组的平均值为："+sum/a.length);
	}
}
//第4题
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
//第5题
class JudgeArray{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		Scanner i = new Scanner(System.in);
		System.out.println("请输入要查找个数的数字:");
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
		System.out.println(n+" 数字有 "+count+"个");
	}
}
//第6题
class PrintAddress{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		Scanner i = new Scanner(System.in);
		System.out.println("请输入要查找地址的数字:");
		int num = i.nextInt();
		printAddress(arr,num);
	}
	public static void printAddress(int[] a ,int n ){
		int count = 0;
		for(int i = 0; i<a.length;i++){
			if(a[i] == n){
				count += 1;
				System.out.println(n+" 的下标为 "+i);
			}
		}
		if(count == 0){
			System.out.println("-1");
		}
	}
}
//第7题
class PrintMax{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		/*
		Scanner i = new Scanner(System.in);
		System.out.println("请输入要查找地址的数字:");
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
//第8题
class Reversal{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		System.out.println("颠倒前：");
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
		System.out.println("颠倒后：");
		for(int i = 0 ;i<a.length;i++){
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
//第9题
class AverageStudent{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入班级人数: ");
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
		System.out.println("班级平均成绩为："+sum/a.length);
	}
}
//第11题
class ArrayOddNmmber{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		isOddNumber(arr);
	}
	public static void isOddNumber(int[] a){
		for(int i = 0;i<a.length;i++){
			if(a[i]%2 != 0){
				System.out.println("a["+i+"]是奇数: "+a[i]);
			}
		}
	}
}
//第10题
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
				System.out.println("a["+i+"]是质数: "+a[i]);
			}
		}
	}
}
//第12题
class ArrayTirple{
	public static void main(String[] args){
		int[] arr = {7,4,5,3,5,2,5,8,1,9,6,0};
		isTirple(arr);
	}
	public static void isTirple(int[] a){
		for(int i = 0;i<a.length;i++){
			if(a[i] == 0) continue;
			if(a[i]%3 == 0){
				System.out.println("a["+i+"]是3的倍数: "+a[i]);
			}
		}
	}
}
//第13题
class PassSeven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字个数: ");
		int number = sc.nextInt();
		int[] arr = new int[number];
		System.out.println("请输入"+number+"个数字的值：");
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
				System.out.println(num1+"逢七过");continue;
			}
			else{
				while(num1/10 != 0){
					num1/=10;
					int num2 = num1%10;
					if(num2 == 7){
						System.out.println(a[n]+"逢七过");
					}
				}
			}
		}
	}
}
//第14题
class ArrayExpand1{
	public static void main(String[] args){
		int[] old = {1,2,3,4,5,6};
		System.out.println("--------方法一--------");
		//创建新数组new
		int[] new1 = new int[old.length+1];
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
		System.out.println("--------方法二--------");
		int[] arr = new int[old.length+1];
		System.arraycopy(old,0,arr,0,old.length);
		for(int i = 0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("--------方法三--------");
		old = Arrays.copyOf(old,old.length+1);
		for(int i = 0 ;i<old.length;i++){
			System.out.println(old[i]);
		}
	}
}
//第15题
class ArrayExpand2{
	public static void main(String[] args){
		int[] old = {1,2,3,4,5,6};
		System.out.println("--------方法一--------");
		//创建新数组new
		int[] new1 = new int[old.length+2];
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
		System.out.println("--------方法二--------");
		int[] arr = new int[old.length+2];
		System.arraycopy(old,0,arr,0,old.length);
		for(int i = 0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("--------方法三--------");
		old = Arrays.copyOf(old,old.length+2);
		for(int i = 0 ;i<old.length;i++){
			System.out.println(old[i]);
		}
	}
}
//第16题
class ArrayExpand3{
	public static void main(String[] args){
		int[] old = {1,2,3,4,5,6};
		System.out.println("--------方法一--------");
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
		System.out.println("--------方法二--------");
		int[] arr = new int[old.length*2];
		System.arraycopy(old,0,arr,0,old.length);
		for(int i = 0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("--------方法三--------");
		old = Arrays.copyOf(old,old.length*2);
		for(int i = 0 ;i<old.length;i++){
			System.out.println(old[i]);
		}
	}
}
//第17题
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
//第18题
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
//第19题
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
//第20题
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
//第21题
/*
class Bank{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] cardId = new int[6];
		int[] passWorld = new int[6];
		
		
	}
	public static void open(){
		
		System.out.println("请输入6位想要开户的账号Id：");
		for(int i = 0;i<6;i++){
			cardId[i] = sc.nextInt();
		}
		System.out.println("请输入6位密码：");
		for(int j = 0;j<6;j++){
			passWorld[i] = sc.nextInt();
		}
		
		System.out.println("开户成功");
	}
	public static void updatePassWorld(){}
	public static void saveMoney(){
		int[] blance ;
		System.out.println("请输入存款位数：");
		int money = sc.nextInt();
		balance = new int[money];
		System.out.println("请存款：");
		for(int k = 0;k<6;j++){
			passWorld[i] = sc.nextInt();
		}
		System.out.println("存款成功");
	}
	public static void getMoney(){
		System.out.println("输入取款钱数：");
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
		System.out.println("余额为：");
		for(int i = 0;i<balance.length;i++){
			System.out.print("blance[i]");
		}
	}
	public static void transMoney(){
		
	}
	public static void quit(){
		System.out.println("---执行退出功能---");
	}
	public static void selectType(){
		do{
			System.out.println("==============欢迎使用ATM自助银行服务==============");
			System.out.println("1:开户2:存款3:取款4:转账5:查询余额6:修改密码 0:退出");
			System.out.println("===================================================");
			System.out.println("请输入操作编号：");
			int number = sc.nextInt();
			switch(number){
				case 1: open();  break;
				case 2:  break;
				case 3:  break;
				case 4:  break;
				case 5:  break;
				case 6:  break;
				case 0:System.out.println("---执行退出功能---");break;
				default: System.out.println("---输入错误，请重新输入---");
			}
		}while(number != 0);
	}
}
*/