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
			1.(Map)��̣�����һ�������û� BankUser �࣬�û���ϢΪ�û� id���û��� userName����� balance; 
			(1) ���� HashMap �洢�û���Ϣ��id ��Ϊ�����û���Ϊֵ����������û�������д洢 
		*/
		
		Map<String,BankUser> map = new HashMap<>();
		BankUser bu1 = new BankUser("2222","�Ƽκ�",10000.0); 
		BankUser bu2 = new BankUser("2223","������",10010.0); 
		BankUser bu3 = new BankUser("2224","����",10.0); 
		BankUser bu4 = new BankUser("2225","֣�¸�",10.0); 
		
		map.put(bu1.getId(),bu1);
		map.put(bu2.getId(),bu2);
		map.put(bu3.getId(),bu3);
		map.put(bu4.getId(),bu4);
		
//		��ֵ�Ա���
//		(2) ������ӡ����������е��û����Ͷ�Ӧ����� 
		Set<Entry<String, BankUser>> entrySet = map.entrySet();
		for(Entry<String,BankUser> entry:entrySet){
			BankUser bankUser = entry.getValue();
			System.out.println(bankUser.getUserName()+"--"+bankUser.getBalance());
		}
		
		
//		(3) ��������һ���û���������Ƿ���ڴ��û�������-��ӡ�û���Ϣ��������-��ӡ���޴��� 
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		//������
		boolean flag = true;
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			BankUser bankUser = map.get(key);
			if(s.equals(bankUser.getUserName())){
				System.out.println(bankUser);
				flag = false;
			}
		}
		if(flag) System.out.println("���޴���");
		
//		(4) ��ӡ��������� 2000 ���û���Ϣ
		//ֵ����
		Collection<BankUser> values = map.values();
		for (BankUser bankUser : values) {
			if(bankUser.getBalance()>2000){
				System.out.println(bankUser);
			}
		}
		
		
		
	}
}
