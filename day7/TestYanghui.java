package code_day7;
import java.util.*;
public class TestYanghui{
	public static void main(String[] args){
		/**
		杨辉三角形：
				1
			   1 1
			  1 2 1
			 1 3 3 1
			1 4 6 4 1
			...
		*/
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int[][] arr = new int[a][];
		 for(int i = 0;i<a;i++){
			 arr[i] = new int[i+1];
		 }
		 for(int j = 0;j<arr.length;j++){
			 for(int k = 0;k<arr[j].length;k++){
				 if(j == 0 || j ==1){
					 arr[j][k] = 1;
				 }
				 else if(k == 0 || k == arr[j].length-1){
					 arr[j][k] = 1;
				 }
				 else{
					 arr[j][k] = arr[j-1][k-1] + arr[j-1][k];
				 }
			 }
		 }
		 for(int i =0 ;i<arr.length;i++){
			for(int n=a-1-i;n>0;n--){
				System.out.print("  ");
				}
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"   ");
				if(j == arr[i].length-1){
					System.out.println();
				}			
			}
		}
	}
}