package p1;

public class TestReturnValue{
	//дһ������������һ������n�����n����������n��n��ż��������
	public static void main(String[] args){
		int a=returnNumber(9);
		if(a==0){
			System.out.println("����������");
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