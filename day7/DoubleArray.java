package code_day7;
import java.util.*;
public class DoubleArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		arr[0] = new int[3];
 		arr[1] = new int[2];
		arr[2] = new int[1];
		for(int i =0 ;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}
		for(int i =0 ;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
				if(j == arr[i].length-1){
					System.out.println();
				}			
			}
		}
	}
}