package com.baizhi.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prac14 {
	public static void main(String[] args) {
		String s = "sdhajkaGHSDFsssdhfjksds2d4fsdf526342";
		//ͳ���ַ�����ÿ���ַ����ֵĴ���
		//����һ��map���ϣ�ʹ���ַ����е��ַ� ��Ϊ����ʹ��ֵ��ͳ��ÿ���ַ����ֵĴ���
		Map<Character,Integer> map = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);	//��ȡ�ַ����е�ÿһ���ַ�
			int sum = 1;		//�ַ����ֵĴ���,��ʼֵΪ1
			if(map.containsKey(c)){
				sum = map.get(c)+1;		//��ȡֵ���Ѿ����ֵĴ����� ��ֵ�û����ϼ�+1

			}
			map.put(c, sum);
		}
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
		
	}
}
