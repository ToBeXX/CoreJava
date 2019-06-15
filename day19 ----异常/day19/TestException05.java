package com.baizhi.day19;

public class TestException05 {
	public static void main(String[] args) {
		checkPassWord("13245");
	}
	public static void checkPassWord(String passWord){
		try {
			if(passWord.length()!=6) 
				//抛出一个密码长度不为6的异常
				throw new CheckPasswordException("密码长度不符合标准");
			System.out.println("密码输入成功");
		} catch (CheckPasswordException e) {
			e.printStackTrace();
		}
	}
}	
class CheckPasswordException extends Exception{
	//构造方法
	//有参、无参
	public CheckPasswordException(String message) {
		super(message);
	}
	public CheckPasswordException() {
		super();
	}
}