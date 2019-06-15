package com.baizhi.day19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Prac {
	public static void main(String[] args) {
		/*
			1.(Map)编程：创建一个银行用户 BankUser 类，用户信息为用户 id、用户名 userName、余额 balance; 
			(1) 利用 HashMap 存储用户信息：id 作为键，用户作为值，创建多个用户对象进行存储 
		*/
		
		Map<String,BankUser> map = new HashMap<>();
		BankUser bu1 = new BankUser("2222","黄嘉浩",10000.0); 
		BankUser bu2 = new BankUser("2223","洪欣宇",10010.0); 
		BankUser bu3 = new BankUser("2224","刘恒",10.0); 
		BankUser bu4 = new BankUser("2225","郑德福",10.0); 
		
		map.put(bu1.getId(),bu1);
		map.put(bu2.getId(),bu2);
		map.put(bu3.getId(),bu3);
		map.put(bu4.getId(),bu4);
		
//		键值对遍历
//		(2) 遍历打印输出所有银行的用户名和对应的余额 
		Set<Entry<String, BankUser>> entrySet = map.entrySet();
		for(Entry<String,BankUser> entry:entrySet){
			BankUser bankUser = entry.getValue();
			System.out.println(bankUser.getUserName()+"--"+bankUser.getBalance());
		}
		
		
//		(3) 键盘输入一个用户名，检测是否存在此用户，存在-打印用户信息；不存在-打印查无此人 
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		//键遍历
		boolean flag = true;
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			BankUser bankUser = map.get(key);
			if(s.equals(bankUser.getUserName())){
				System.out.println(bankUser);
				flag = false;
			}
		}
		if(flag) System.out.println("查无此人");
		
//		(4) 打印输出余额大于 2000 的用户信息
		//值遍历
		Collection<BankUser> values = map.values();
		for (BankUser bankUser : values) {
			if(bankUser.getBalance()>2000){
				System.out.println(bankUser);
			}
		}
		
		
		
	}
}
