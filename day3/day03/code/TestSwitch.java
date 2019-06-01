package p1;
import java.util.Scanner;
public class TestSwitch{
	public static void main(String[] args){
		/*
			周一：黄焖鸡
			周二：荷叶鸡
			周三：叫花鸡
			周四：道口烧鸡
			周五：新疆大盘鸡
			周末：荷叶粉蒸肉
		*/
		Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		//byte n=sc.nextByte();
		//short n=sc.nextShort();
		//char n=sc.next().charAt(0);
		//String JDK1.7
		String n=sc.next();
		//1、当代码数值匹配成功，不会跳出switch
		//2、当两个数值代表的操作代码相同时，可以省略前面的，把代码放在最后一个值后
		//break：跳出当前结构
		//default:当不满足所有的case,执行default,通常把default放在最后
		switch(n){
			
			//case 1:
			//case '一':
			case "Monday":
				System.out.println("黄焖鸡");break;
			//case 2:
			//case '二':
			case "星期二":
				System.out.println("荷叶鸡");break;
			//case 4:
			//case '三':
			case "星期三":
				System.out.println("叫花鸡");break;
			//case 3:
			//case '四':
			case "星期四":
				System.out.println("道口烧鸡");	break;
			//case 5:
			//case '五':
			case "星期五":
				System.out.println("新疆大盘鸡");break;
			/* case 6:	
			case 7:
				System.out.println("荷叶粉蒸肉");
				//System.out.println("荷叶粉蒸肉");break; */
			default:
				System.out.println("荷叶粉蒸肉");
		}
	}
}