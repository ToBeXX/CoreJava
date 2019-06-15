package com.baizhi.day18;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	public static void main(String[] args) {
		SortedSet<String> s = new TreeSet<>();
		s.add("huxinzhe");
		s.add("liuchuny");
		s.add("byangdd");
		s.add("dwangxx");
		for (String string : s) {
			System.out.println(string);
		}
		
		/*SortedSet<Student> s = new TreeSet<>();
		s.add(new Student("Áõºã",18,10.0));
		s.add(new Student("¹Ë¶ş·É",12,9.9));
		s.add(new Student("ÀîÅÊ",48,5.0));
		s.add(new Student("ÂíÓñÃ®",68,10.0));
		s.add(new Student("ÂíÓñÃ®2",68,10.0));
		
		for (Student student : s) {
			System.out.println(student);
		}*/
		
		
	}
}
