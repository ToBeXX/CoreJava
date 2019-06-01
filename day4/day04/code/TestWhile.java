package p1;
public class TestWhile{
	public static void main(String[] args){
		//打印10个HelloWorld
		/* int i=1;
		while(i<=10){
			System.out.println("HelloWorld"+i);
			i++;
		} */
		//计算1--100的和
		int i=1;
		//累加器：把循环内每次的改变的量加起来
		int sum=0;
		while(i<=100){
			//System.out.println(i);
			//sum=sum+i;
			sum+=i;
			i++;
			//System.out.println(sum);
		}
		System.out.println(sum);
		//计算1--100以内的奇数和?
		
		
	}
}