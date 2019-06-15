package com.baizhi.day19;

import java.io.EOFException;

public class TestException01 {
	public static void main(String[] args) throws EOFException{
		m1(3);
		
	}
	//关键字  throws EOFException
	public static void m1(int n) throws EOFException,NullPointerException{
		if(n==0) throw new NullPointerException("空指针异常");
		if(n==1) throw new IndexOutOfBoundsException("下标越界");
		if(n==2) throw new RuntimeException("运行时异常");
		if(n==3) throw new EOFException();
	}
}
