package p1;
import java.util.Scanner;
public class TestMulIf{
	public static void main(String[] args){
		/*
			�°���500����ô����
				>=500,������
				>=200,��ʱ��911
				>=100,����
				>=50,����
				>=20,���ǵ�
				>=5,����֮��
				<5,������С��
		*/
		int money=0;
		
		if(money>=500){
			System.out.println("������");
		}else if(money>=200){
			System.out.println("��ʱ��911");
		}else if(money>=100){
			System.out.println("����");
		}else if(money>=50){
			System.out.println("����");
		}else if(money>=20){
			System.out.println("���ǵ�");
		}else if(money>=5){
			System.out.println("����֮��");
		}else{
			System.out.println("������С��");
		}
		
	}
}