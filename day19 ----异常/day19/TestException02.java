package com.baizhi.day19;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class TestException02 {
	public static void main(String[] args){
		try{
			m1(4);
		}catch(FileNotFoundException e){
			System.out.println("�쳣�Ѳ���");
		}
	}
	public static void m1(int n) throws FileNotFoundException{
		try{
			if (n == 0)
				throw new NullPointerException("��ָ���쳣");
			if (n == 1)
				throw new IndexOutOfBoundsException("�±�Խ��");
			if (n == 2)
				throw new RuntimeException("����ʱ�쳣");
			if (n == 3)
				throw new EOFException();
			if(n==4)
				throw new FileNotFoundException("�ļ��Ҳ����쳣");
		}catch(EOFException e){
			System.out.println("�׳�EOFException");
		}catch(ClassCastException e){
			System.out.println("ǿ������ת���쳣");
		}catch (RuntimeException e){
			System.out.println("�׳�RuntimeException");	
		}
		
	}
}
