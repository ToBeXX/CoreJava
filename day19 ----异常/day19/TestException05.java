package com.baizhi.day19;

public class TestException05 {
	public static void main(String[] args) {
		checkPassWord("13245");
	}
	public static void checkPassWord(String passWord){
		try {
			if(passWord.length()!=6) 
				//�׳�һ�����볤�Ȳ�Ϊ6���쳣
				throw new CheckPasswordException("���볤�Ȳ����ϱ�׼");
			System.out.println("��������ɹ�");
		} catch (CheckPasswordException e) {
			e.printStackTrace();
		}
	}
}	
class CheckPasswordException extends Exception{
	//���췽��
	//�вΡ��޲�
	public CheckPasswordException(String message) {
		super(message);
	}
	public CheckPasswordException() {
		super();
	}
}