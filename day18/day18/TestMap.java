package com.baizhi.day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		//创建一个map集合
		Map<String,String> map = new HashMap<>();
		//增加
		map.put("黄嘉浩", "李毛毛");
		map.put("王志颖", "李毛毛");
		map.put("顾二飞", "迪丽热巴");
		map.put("谢雨辰", "凤姐");
		map.put("陶贯超", "范冰冰");
		
		//更新
		map.put("黄嘉浩", "索铭宣");
		//删除
		map.remove("顾二飞");
		//获取
		System.out.println(map.get("谢雨辰"));
		
		//获取个数
		System.out.println(map.size());
		
//		①键遍历
//		1.获取所有的键对应的set集合 Set<K>  keySet()：
		Set<String> keySet = map.keySet();
//		2.遍历set集合 获取key  调用get（key）获取值
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println(key+"--"+value);
		}
		System.out.println("==============================");
		
//		​②值遍历
//		1.获取所有值对应的集合   Collection<V> values()
		Collection<String> values = map.values();
//		2.遍历此集合，遍历出值
		for (String value : values) {
			System.out.println(value);
		}
		System.out.println("===============================");
		
//		​③键值对遍历
//		1.获取键值对对应的Set集合,键值对的表现形式是entry对象 entrySet();
		Set<Map.Entry<String, String>> set = map.entrySet();
//		2.遍历Set集合,得到所有的entry对象
		for(Map.Entry<String, String> entry:set){
//			3.通过getKey(),getValue()方法获取对应的键和值
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"--"+value);
		}

		
	}
}


