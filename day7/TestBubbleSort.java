//ð������
//3 7 5 4 8 ---  8 7 5 4 3
/**
	��0�֣�					i=0		j=4
		0--1��7 3 5 4 8		0		0		0-1		j  j+1
		1--2��7 5 3 4 8		0		1		1-2     j  j+1
		2--3��7 5 4 3 8		0		2		2-3
		3--4��7 5 4 8 3		0		3		3-4
	��1�֣�					i=1		j=3
		0--1��7 5 4 8 3		1       0 		0-1
		1--2��7 5 4 8 3		1		1		1-2
		2--3��7 5 8 4 3		1		2		2-3
	��2�֣�					i=2		j=2
		0--1��7 5 8 4 3		2		0		0-1
		1--2��7 8 5 4 3		2		1		1-2
	��3�֣�					i=3		j=1
		0--1��8 7 5 4 3		3		0		0-1

	�Ƚ�����i��array.length-1   0  <array.length-1
	�Ƚϴ���j: 					0  <array.length-1-i
*/
package p1;
public class TestBubbleSort{
	public static void main(String[] args){
		int []array={3,7,5,4,8};
		//���ƱȽ�����
		for(int i=0;i<array.length-1;i++){
			//����ÿ�ֱȽϵĴ���
			for(int j=0;j<array.length-1-i;j++){
				//�Ƚ�array[j]��array[j+1]
				if(array[j]<array[j+1]){
					int t=array[j];
					array[j]=array[j+1];
					array[j+1]=t;
				}
			}
			
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
	}
}