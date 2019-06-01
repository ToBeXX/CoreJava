package p1;
import java.util.Scanner;
public class TestChange{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
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

class TestPage{
	
	public static void main(String[] args){
		int n=55;
		int m=10;
		int i=6;
		if(n%m==0){
			//总条数n能整除每页显示的条数m
			int start=(i-1)*m+1;
			int end=i*m;
			System.out.println(start+"-----"+end);
		}else{
			//总条数不能整除每页显示的条数
			int k=n/m+1;
			if(i==k){
				//最后一页
				int start=(i-1)*m+1;
				int end=n;
				System.out.println(start+"-----"+end);
			}else{
				int start=(i-1)*m+1;
				int end=i*m;
				System.out.println(start+"-----"+end);
			}
			
		}
	}

}


