package p1;
import java.util.Scanner;
public class TestNestIf{
	public static void main(String[] args){
		/*
			100米赛跑
			用时15s之内的选手分别进入男子和女子决赛组
		*/
		Scanner sc=new Scanner(System.in);
		double time=sc.nextDouble();
		//double time=15.0;
		
		//char sex='M';
		
		if(time>15){
			System.out.println("淘汰");
		}else{
			char sex=sc.next().charAt(0);
			if(sex=='M'){
				System.out.println("男子决赛组");
			}else{
				System.out.println("女子决赛组");
			}
		}
		/* if(time<=15){
			//进入决赛
			if(sex=='M'){
				//进入男子决赛组
				System.out.println("男子决赛组");
			}else{
				//进入女子决赛组
				System.out.println("女子决赛组");
			}
		}else{
			System.out.println("你被淘汰了");
		} */
		
		
		
		
		
	}
}