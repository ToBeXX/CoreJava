package com.baizhi.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prac14 {
	public static void main(String[] args) {
		String s = "sdhajkaGHSDFsssdhfjksds2d4fsdf526342";
		//统计字符串中每个字符出现的次数
		//定义一个map集合，使用字符串中的字符 作为键，使用值来统计每个字符出现的次数
		Map<Character,Integer> map = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);	//获取字符串中的每一个字符
			int sum = 1;		//字符出现的次数,初始值为1
			if(map.containsKey(c)){
				sum = map.get(c)+1;		//获取值（已经出现的次数） 在值得基础上加+1

			}
			map.put(c, sum);
		}
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
		
	}
}
