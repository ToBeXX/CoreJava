package p1;
public class TestNestFor{
	public static void main(String[] args){
		//打印三行5颗*
		/*
			*****
			*****
			*****
		*/
		//打印5颗*
		/* for(int i=1;i<=5;i++){
			System.out.print("*");
		}
		System.out.println(); */
		//打印三行5颗*
		/* for(int j=1;j<=3;j++){
			//打印5颗*
			for(int i=1;i<=5;i++){
				System.out.print("*");
			}
			System.out.println();
		} */
		//外层循环控制行数，内层循环控制列数
		/* for(int i=1;i<=9;i++){
			for(int j=1;j<=i ;j++){
				System.out.print(j+"*"+i+"="+i*j+'\t');
			}
			System.out.println();
		} */
		
		a:for(int i=1;i<=3;i++){
			b:for(int j=1;j<=5;j++){
				//if(j==3)break a;//break用在内层循环中结束的是内层循环
				if(j==3)continue a;//continue用在内层循环中跳出的是内层循环
				System.out.print("第"+i+"行第"+j+"列"+'\t');
			}
			System.out.println();
		}
		
		
	
	}
}
}


