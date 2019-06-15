package com.baizhi.day18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		//创建了一个set集合
		Set<String> set = new HashSet<>();
		
		//增
		set.add("huxinz");
		set.add("liuchuny");
		set.add("yangdd");
		set.add("wangxx");
		set.add("wangxx");
		
		System.out.println(set.size());
		//遍历for-each
		/*for(String s:set){
			System.out.println(s);
		}*/
		
		//迭代器遍历
		//获取一个迭代器对象	iterator()
		Iterator<String> iterator = set.iterator();
		/*boolean hasNext()  判断指针后是否还有元素 
			E     next() 将指针跨过的元素进行返回 */
		while(iterator.hasNext()){	//如果后面还有元素   hashNext（）结果为true	
			System.out.println(iterator.next());	//则 返回后面的元素     next（）
		}		
		
		
		
		
		
		
	}
}
