package p1;
public class TestLocalVar{
	
	public static void main(String[] args){
		//System.out.println(n);//�Ҳ�������
		int n=3;//δ��ֵʹ�ã�δ��ʼ������n
		System.out.println(n);
		if(true){
			int a=5;
			int b=10;
			System.out.println(a);
			//System.out.println(n);//������ͻ
			System.out.println(b);
		}
		//System.out.println(a);�������÷�Χ
	}

}