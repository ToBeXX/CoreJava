package com.baizhi.day19;

import java.io.EOFException;

public class TestException01 {
	public static void main(String[] args) throws EOFException{
		m1(3);
		
	}
	//�ؼ���  throws EOFException
	public static void m1(int n) throws EOFException,NullPointerException{
		if(n==0) throw new NullPointerException("��ָ���쳣");
		if(n==1) throw new IndexOutOfBoundsException("�±�Խ��");
		if(n==2) throw new RuntimeException("����ʱ�쳣");
		if(n==3) throw new EOFException();
	}
}
