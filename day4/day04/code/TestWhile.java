package p1;
public class TestWhile{
	public static void main(String[] args){
		//��ӡ10��HelloWorld
		/* int i=1;
		while(i<=10){
			System.out.println("HelloWorld"+i);
			i++;
		} */
		//����1--100�ĺ�
		int i=1;
		//�ۼ�������ѭ����ÿ�εĸı����������
		int sum=0;
		while(i<=100){
			//System.out.println(i);
			//sum=sum+i;
			sum+=i;
			i++;
			//System.out.println(sum);
		}
		System.out.println(sum);
		//����1--100���ڵ�������?
		
		
	}
}