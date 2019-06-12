package com.baizhi.day16;

public class TestString01 {
	public static void main(String[] args) {
		String s = "hsjkdalfhsdjk";
		//返回指定下标处对应的字符
		System.out.println(s.charAt(2));
		
		//将字符串转换成数组
		char[] charArray = s.toCharArray();
		for(int i=0;i<charArray.length;i++){
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		//返回指定字符串在s中出现的下标（第一次出现的下标,若s中不包含此字符串  则返回-1
		System.out.println(s.indexOf("sk"));
		//返回指定字符串在s中出现的下标（最后一次出现的下标,若s中不包含此字符串  则返回-1
		System.out.println(s.lastIndexOf("jd"));
		//indexOf(String s,int index):返回值指定字符串第一次出现的下标 ，从指定下标开始寻找
		System.out.println(s.indexOf("jk",5));
		
		//获取字符串的长度
		System.out.println(s.length());
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			System.out.print(c);
		}
		System.out.println();
		
		String s1 = " abc ";
		System.out.println(s1);
		System.out.println(s1.trim());		//去除字符串的前后空格 返回值类型 为String。中间的不包括
		
		String s2 = "123 ";
		int a = Integer.parseInt(s2.trim());	//去除空格后传参
		
		String s3 = "2019-6-11";
		String[] ss = s3.split("-");
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		//年-->2019
		System.out.println("年份为"+ss[0]);
		//月
		System.out.println("月份为"+ss[1]);
		//日
		System.out.println("日份为"+ss[2]);
		
		String s4 = "HSsajdkfJDshdjfHF";		
		//将其大写
		System.out.println(s4.toUpperCase());	//HSSAJDKFJDSHDJFHF
		//将其转换成小写
		System.out.println(s4.toLowerCase());	//hssajdkfjdshdjfhf
		String userString = "ASdk";	//用户输入的字符串
		String imageCode = "AsDk";			//程序员拥有的字符串
		//将二者全部转换成大写
		String str1 = userString.toUpperCase();
		String str2 = imageCode.toUpperCase();
		System.out.println(str1.equals(str2));
		
		//判断字符串 是否以sdk字符串结尾
		System.out.println(s4.endsWith("sdk"));	//false
		String s5 = "HelloWorld.java";
		System.out.println(s5.endsWith(".java")); //true
		System.out.println(s5.endsWith(".txt"));	//false
		
		//判断s4中是否包含 参数sadf字符串
		System.out.println(s4.contains("sadf"));	//false
		
		

		
	}
}	
