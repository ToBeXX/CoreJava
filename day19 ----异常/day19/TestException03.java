package com.baizhi.day19;

import java.io.EOFException;

public class TestException03 {
	public static void main(String[] args) {
		System.out.println(m1(3));
	}
	public static int m1(int n){
		try{
			if (n == 0)
				throw new EOFException("EOFException");
			return 0;
		}catch(EOFException e){
			System.out.println("������EOFException");
			return 1;
		}finally{		//����Ҫִ�еĴ���
			System.out.println("����Ҫִ�еĴ���");
//			return 3;		ͨ������� ��Ҫ��return��䶨����finally
		}
		
	}
}

