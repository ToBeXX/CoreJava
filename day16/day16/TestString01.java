package com.baizhi.day16;

public class TestString01 {
	public static void main(String[] args) {
		String s = "hsjkdalfhsdjk";
		//����ָ���±괦��Ӧ���ַ�
		System.out.println(s.charAt(2));
		
		//���ַ���ת��������
		char[] charArray = s.toCharArray();
		for(int i=0;i<charArray.length;i++){
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		//����ָ���ַ�����s�г��ֵ��±꣨��һ�γ��ֵ��±�,��s�в��������ַ���  �򷵻�-1
		System.out.println(s.indexOf("sk"));
		//����ָ���ַ�����s�г��ֵ��±꣨���һ�γ��ֵ��±�,��s�в��������ַ���  �򷵻�-1
		System.out.println(s.lastIndexOf("jd"));
		//indexOf(String s,int index):����ֵָ���ַ�����һ�γ��ֵ��±� ����ָ���±꿪ʼѰ��
		System.out.println(s.indexOf("jk",5));
		
		//��ȡ�ַ����ĳ���
		System.out.println(s.length());
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			System.out.print(c);
		}
		System.out.println();
		
		String s1 = " abc ";
		System.out.println(s1);
		System.out.println(s1.trim());		//ȥ���ַ�����ǰ��ո� ����ֵ���� ΪString���м�Ĳ�����
		
		String s2 = "123 ";
		int a = Integer.parseInt(s2.trim());	//ȥ���ո�󴫲�
		
		String s3 = "2019-6-11";
		String[] ss = s3.split("-");
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		//��-->2019
		System.out.println("���Ϊ"+ss[0]);
		//��
		System.out.println("�·�Ϊ"+ss[1]);
		//��
		System.out.println("�շ�Ϊ"+ss[2]);
		
		String s4 = "HSsajdkfJDshdjfHF";		
		//�����д
		System.out.println(s4.toUpperCase());	//HSSAJDKFJDSHDJFHF
		//����ת����Сд
		System.out.println(s4.toLowerCase());	//hssajdkfjdshdjfhf
		String userString = "ASdk";	//�û�������ַ���
		String imageCode = "AsDk";			//����Աӵ�е��ַ���
		//������ȫ��ת���ɴ�д
		String str1 = userString.toUpperCase();
		String str2 = imageCode.toUpperCase();
		System.out.println(str1.equals(str2));
		
		//�ж��ַ��� �Ƿ���sdk�ַ�����β
		System.out.println(s4.endsWith("sdk"));	//false
		String s5 = "HelloWorld.java";
		System.out.println(s5.endsWith(".java")); //true
		System.out.println(s5.endsWith(".txt"));	//false
		
		//�ж�s4���Ƿ���� ����sadf�ַ���
		System.out.println(s4.contains("sadf"));	//false
		
		

		
	}
}	
