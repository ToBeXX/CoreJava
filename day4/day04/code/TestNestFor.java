package p1;
public class TestNestFor{
	public static void main(String[] args){
		//��ӡ����5��*
		/*
			*****
			*****
			*****
		*/
		//��ӡ5��*
		/* for(int i=1;i<=5;i++){
			System.out.print("*");
		}
		System.out.println(); */
		//��ӡ����5��*
		/* for(int j=1;j<=3;j++){
			//��ӡ5��*
			for(int i=1;i<=5;i++){
				System.out.print("*");
			}
			System.out.println();
		} */
		//���ѭ�������������ڲ�ѭ����������
		/* for(int i=1;i<=9;i++){
			for(int j=1;j<=i ;j++){
				System.out.print(j+"*"+i+"="+i*j+'\t');
			}
			System.out.println();
		} */
		
		a:for(int i=1;i<=3;i++){
			b:for(int j=1;j<=5;j++){
				//if(j==3)break a;//break�����ڲ�ѭ���н��������ڲ�ѭ��
				if(j==3)continue a;//continue�����ڲ�ѭ�������������ڲ�ѭ��
				System.out.print("��"+i+"�е�"+j+"��"+'\t');
			}
			System.out.println();
		}
		
		
	
	}
}
}


