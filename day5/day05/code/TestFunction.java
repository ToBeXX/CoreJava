
package p1;

public class TestFunction{
//����
	/* public static void func(){
		//ʵ���ض����ܵĴ��룺��ӡ50��-��ɵķָ���
		for(int i=1;i<=30;i++){
			System.out.print("*");
		}
		System.out.println();
	} */
	public static void main(String[] args){
		//�������࣬�ɶ��Ե�
		//��ά���Բ�
		//��ߴ���������
	
		System.out.println("���������ף�");
		//��ӡ50��-��ɵķָ���
		func("+",10);
		System.out.println("����ʹ���ݡ�");
		//��ӡ50��-��ɵķָ���
		func("-",20);
		System.out.println("����Ҳ���ݣ�");
		//��ӡ50��-��ɵķָ���
		func("*",30);
		System.out.println("���������⡣");
		//��ӡ50��-��ɵķָ���
		func("/",40);
	}
//����
	public static void func(String s,int a){//19��s="+"  22��s="-"  25��s="*"  28��s="/"
		//ʵ���ض����ܵĴ��룺��ӡ50��-��ɵķָ���
		for(int i=1;i<=a;i++){
			System.out.print(s);
		}
		System.out.println();
	}
}

