package code_day6;
import java.util.*;
public class BankPorject{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] cardId = new int[6];
		int[] passWorld = new int[6];
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
	public static boolean judgeMathing(int[] n1,int[] n2){
		
	}
}