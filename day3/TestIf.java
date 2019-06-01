package code_day3;
import java.util.Scanner;
//第10题
public class TestIf{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		int age = i.nextInt();
		judge(age);
	}
public static void judge(int a){
	if (a < 6){
		System.out.println("儿童");
	}
	else if(a>=6&&a<=13){
		System.out.println("少儿");
	}
	else if(a>=14&&a<=17){
		System.out.println("青少年");
	}
	else if(a>=18&&a<=35){
		System.out.println("青年");
	}
	else if(a>=36&&a<50){
		System.out.println("中年");
	}
	else{
		System.out.println("中老年");
	}
}
}
//第11题
class TestSwitch{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		int n = i.nextInt();
		print(n);
	}
	static void print(int a ){
		switch(a){
			case 1: System.out.println("贝贝"); break;
			case 2: System.out.println("晶晶"); break;
			case 3: System.out.println("欢欢"); break;
			case 4: System.out.println("迎迎"); break;
			case 5: System.out.println("妮妮"); break;
			default : System.out.println("北京欢迎你"); break;
		}
	}
}
//第12题
class Judge{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("请输入三个数字: ");
		int a = i.nextInt();
		int b = i.nextInt();
		int c = i.nextInt();
		judge(a,b,c);
	}
	public static void judge(int n1, int n2, int n3){
		if (n1 > n2){
			if(n1 > n3){
				System.out.println("最大的数为： "+ n1);
			}
				else {
					System.out.println("最大的数为："+ n3);
				}
			
		}
			else if(n2 > n3){
				System.out.println("最大的数为: "+ n2);
			}
			else {
				System.out.println("最大的数为："+ n3);
			}
		
	}
}
//第13题
class Year{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("请输入一个合法的年份：");
		int year = i.nextInt();
		judge(year);
	}
	public static void judge(int n){
		if (n%4 == 0){
			if (n%100 != 0){
				System.out.println(n+ "年是闰年");
			}
			else{
				if(n%400 == 0){
					System.out.println(n+ "年是闰年");
				}
				else{
					System.out.println(n + "年不是闰年");
				}
			}
			
		}
		else{
			System.out.println(n + "年不是闰年");
		}
		
	}
}
//第14题
class  Counter{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("请输入两个数字: ");
		int a = i.nextInt();
		int b = i.nextInt();
		System.out.println("请输入想要操作的选项:");
		System.out.println("1：+");
		System.out.println("2：-");
		System.out.println("3：*");
		System.out.println("4：/");
		int c = i.nextInt();
		counter(c,a,b);
	}
	public static void counter(int n1 ,int n2,int n3){
		switch(n1){
			case 1 : System.out.println("两数相加为："+ (n2+n3)); break;
			case 2 : System.out.println("两数相减为："+ (n2-n3)); break;
			case 3 : System.out.println("两数相乘为："+ (n2*n3)); break;
			case 4 : System.out.println("两数相除为："+ ((double)(n2)/(double)(n3))); break;
			default : System.out.println("选择操作有误！");
		}
		
	}
}
//第15题
class Charge{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("请输入货物重量（公斤）: ");
		double a = i.nextDouble();
		charge(a);
	}
	public static void charge(double n ){
		if (n <=20){
			System.out.println("货物运费为5元");
		}
		else if(n<=100){
			double n1 = n-20;
			double money = 5 + n1*0.2;
			System.out.println("货物的运费为: "+ money +"元");
		}
		else{
			double n2 = 5 + 80*0.2;
			double money = n2 + (n-100)*0.15;
			System.out.println("货物的运费为: "+ money+ "元");
			
		}
	}
}
//第16题
//第17题
class Sum{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("请输入一个三位数字: ");
		int a = i.nextInt();
		add(a);
	}
	public static void add(int n){
		int b = n%10;
		int c = n/10;
		int d = c%10;
		int e = n/100;
		int sum = b + d + e;
		System.out.println("各位数字相加总和为: "+ sum);
	}
}
//第18题
class Score{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("请输入学生成绩: ");
		int a = i.nextInt();
		judge(a);
	}
	public static void judge(int n ){
		if (n<60){
			System.out.println("不及格");
		}
		else if(n<=70){
			System.out.println("及格");
		}
		else if(n<80){
			System.out.println("良好");
		}
		else{
			System.out.println("优秀");
		}
	}
}
//第19题
class Division{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("请输入一个数字: ");
		int a = i.nextInt();
		division(a);
	}
	public static void division(int n){
		if(n%3 == 0){
			if(n%5 == 0){
				if(n%7 == 0){
					System.out.println("该数字能够被3，5，7同时整除");
				}
				else{
					System.out.println("该数字能够被3，5同时整除");
				}
			}
			else{
				System.out.println("该数字只能被整除");
			}
		}
		else if(n%5 == 0){
			if(n%7 == 0){
				System.out.println("该数字能够被5,7同时整除");
			}
			else{
				System.out.println("该数字只能被5整除");
			}
		}
		else if(n%7 == 0){
			System.out.println("该数字只能被7整除");
		}
		else{
			System.out.println("该数字不能被3，5，7整除");
		}
	}
}
//第20题



//第21题
class Scholarship{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
			System.out.println("请输入数学和语文成绩: ");
			int a = i.nextInt();
			int b = i.nextInt();
			getMoney(a,b);
	}
	public static void getMoney(int n1 , int n2){
		if (n1 >=80 && n2>=80){
			System.out.println("恭喜你获得了500奖学金");
		}
		else if (n1<30 && n2<30){
			System.out.println("你需要重修了");
		}
		else{
			System.out.println("你安全了");
		}
	}
}


//第22题
class Tip{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("请输入三个数字: ");
		int a = i.nextInt();
		int b = i.nextInt();
		int c = i.nextInt();
		if(a >1000 || b>1000 || c>1000){
			System.out.println("输入的数值有大于1000的");
		}
		else{
			System.out.println("没有大于1000的");
		}
	}
}



//第23题
class TestChar{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		char a = i.next().charAt(0);
		if(a >= 'A' && a <= 'Z'){
			System.out.println("该字符是字母");
		}
		else if(a >='a' && a <= 'z'){
			System.out.println("该字符是字母");
		}
		else{
			System.out.println("该字符不是字母");
		}
	}
}


//第24题
class Squart{
	public static void main(String[] args){
		Scanner i = new Scanner(System.in);
		System.out.println("请输入一个整数: ");
		int a = i.nextInt();
		long b = a*a;
		long c = a*a*a;
		System.out.println("该数字的平方为："+ b);
		System.out.println("该数字的三次方为："+ c);
	}
}


//第25题
class CharChange{
	
	public static void main(String[] args){
		Scanner i=new Scanner(System.in);
		System.out.println("请输入一个字母: ");
		char c=i.next().charAt(0);
		//确定输入的字符是大写还是小写
		//判断大写字符
		if(c>='A'&&c<='Z'){
			//转小写
			c+=32;
			System.out.println(c);
		}
		//判断小写字符
		else if(c>=97&&c<=122){
			//转大写
			c-=32;
			System.out.println(c);
		}
		//输入的不是字母
		else{
			System.out.println("输入的不是字母，无法转换大小写！");
		}
	}
}
//第26题同12题
//第27题
