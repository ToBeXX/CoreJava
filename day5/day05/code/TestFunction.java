
package p1;

public class TestFunction{
//函数
	/* public static void func(){
		//实现特定功能的代码：打印50个-组成的分割线
		for(int i=1;i<=30;i++){
			System.out.print("*");
		}
		System.out.println();
	} */
	public static void main(String[] args){
		//代码冗余，可读性低
		//可维护性差
		//提高代码的灵活性
	
		System.out.println("无竹令人俗，");
		//打印50个-组成的分割线
		func("+",10);
		System.out.println("无肉使人瘦。");
		//打印50个-组成的分割线
		func("-",20);
		System.out.println("不俗也不瘦，");
		//打印50个-组成的分割线
		func("*",30);
		System.out.println("竹笋烧猪肉。");
		//打印50个-组成的分割线
		func("/",40);
	}
//函数
	public static void func(String s,int a){//19、s="+"  22、s="-"  25、s="*"  28、s="/"
		//实现特定功能的代码：打印50个-组成的分割线
		for(int i=1;i<=a;i++){
			System.out.print(s);
		}
		System.out.println();
	}
}

