package p1;

public class TestReturnValue{
	//写一个函数，接收一个参数n，如果n是奇数返回n，n是偶数不返回
	public static void main(String[] args){
		int a=returnNumber(9);
		if(a==0){
			System.out.println("请输入奇数");
		}else{
			System.out.println(a);
		}
		
	}
	public static int returnNumber(int n){
		if(n%2!=0){
			return n;
		}
		return 0;
	}
}