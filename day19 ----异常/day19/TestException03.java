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
			System.out.println("处理了EOFException");
			return 1;
		}finally{		//必须要执行的代码
			System.out.println("必须要执行的代码");
//			return 3;		通常情况下 不要将return语句定义在finally
		}
		
	}
}

