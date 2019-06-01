package p1;
import java.util.Scanner;
public class TestMulIf{
	public static void main(String[] args){
		/*
			月半中500万怎么花？
				>=500,法拉利
				>=200,保时捷911
				>=100,奔驰
				>=50,宝马
				>=20,比亚迪
				>=5,五菱之光
				<5,继续骑小刀
		*/
		int money=0;
		
		if(money>=500){
			System.out.println("法拉利");
		}else if(money>=200){
			System.out.println("保时捷911");
		}else if(money>=100){
			System.out.println("奔驰");
		}else if(money>=50){
			System.out.println("宝马");
		}else if(money>=20){
			System.out.println("比亚迪");
		}else if(money>=5){
			System.out.println("五菱之光");
		}else{
			System.out.println("继续骑小刀");
		}
		
	}
}