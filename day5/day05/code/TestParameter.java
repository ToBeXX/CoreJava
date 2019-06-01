
package p1;

public class TestParameter{
	//写一个函数，提供两个参数，打印参数和
	
	public static void main(String[] args){
		double a=add(5,7.3);
		System.out.println(a);
		func();
	}
	//函数，有两个参数
	public static double add(int a,double b){
		double sum=a+b;
		//System.out.println(sum);
		return sum;//返回函数的结果，并且结束函数
		//return b;
	}
	public static void func(){
		for(int a=1;a<=30;a++){
			if(a==5)return;//结束函数
			System.out.println("*"+a);
		}
		
		//return;
	}
	
}