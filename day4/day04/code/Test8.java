package p1;
public class Test8{
	public static void main(String[] args){
		//记录米数
		int sum=0;
		//迭代变量记录天数
		for(int i=1;;i++){
			//记录青蛙白天爬的米数
			sum+=3;
			//判断总米数是否大于7,为真，跳出循环
			if(sum>=7){
				System.out.println(i);
				break;
			}
			//继续执行晚上下坠2米
			sum-=2;
		}
	
	}
}
class Test9{
	public static void main(String[] args){
		int sum = 0;
		//循环1--100所有的数值
		for(int i=1;i<=100;i++){
			//判断当前数值个位上是否为3，如果为3，跳出当次循环
			if(i%10==3)continue;
			//求和
			sum+=i;
		}
		System.out.println(sum);
	}
}
class Test10{
	public static void main(String[] args){
		//记录纸张厚度
		double a=0.08;
		//记录对折次数
		int b=0;
		//循环如果纸的厚度大于8848130时结束循环
		do{
			//纸张对折是原本厚度的两倍
			a*=2;
			//对折次数每次加1
			b++;
		}while(a<=8848130);
		System.out.println(b);
	}
}
//0+2+22+222+2222+22222
class Test11{
	public static void main(String[] args){
		//第一个数值是多少
		int i=0;
		//定义累加器
		int sum = 0;
		//循环，5个数值相加，后面的数值是前一个数值*10+2
		for(int j=1;j<=5;j++){
			//后面的数值是前一个数值*10+2
			i=i*10+2;//2 22 222
			//数值相加
			sum+=i;//2 24 246
		}
		System.out.println(sum);
	}
}
class Test12{
	public static void main(String[] args){
		a:do{
			//欢迎语句
			System.out.println("-----------欢迎-----------");
			System.out.println("根据提示完成操作：");
			System.out.println("1、开户   2、存款   0、退出");
			java.util.Scanner sc =new java.util.Scanner(System.in);
			int n=sc.nextInt();
			//选择操作
			switch(n){
				case 1:
					System.out.println("开户");break;
				case 2:
					System.out.println("存钱");break;
				case 0:
					System.out.println("退出");break a;
				default:
					System.out.println("输入有误！");
			}
			
		}while(true);
	}
}
class Test13{
	public static void main(String[] args){
		//本金
		double a=10000;
		//循环5年
		for(int i=1;i<=5;i++){
			//本金=上一年的本金+利息
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
		//不定次循环/10
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









