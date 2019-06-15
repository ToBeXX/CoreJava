package com.baizhi.day19;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class TestException02 {
	public static void main(String[] args){
		try{
			m1(4);
		}catch(FileNotFoundException e){
			System.out.println("异常已捕获");
		}
	}
	public static void m1(int n) throws FileNotFoundException{
		try{
			if (n == 0)
				throw new NullPointerException("空指针异常");
			if (n == 1)
				throw new IndexOutOfBoundsException("下标越界");
			if (n == 2)
				throw new RuntimeException("运行时异常");
			if (n == 3)
				throw new EOFException();
			if(n==4)
				throw new FileNotFoundException("文件找不到异常");
		}catch(EOFException e){
			System.out.println("抛出EOFException");
		}catch(ClassCastException e){
			System.out.println("强制类型转换异常");
		}catch (RuntimeException e){
			System.out.println("抛出RuntimeException");	
		}
		
	}
}
