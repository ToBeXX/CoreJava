package com.baizhi.day18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet02 {
	public static void main(String[] args) {
		/*Set<Student> s = new HashSet<>();
		s.add(new Student("����",18,10.0));
		s.add(new Student("�˶���",12,9.9));
		s.add(new Student("����",48,5.0));
		s.add(new Student("����î",68,10.0));
		s.add(new Student("����î",68,10.0));
		s.remove(new Student("����î",68,10.0));
		
		for (Student student : s) {
			System.out.println(student);
		}*/
		Set<String> s = new LinkedHashSet<>();
		s.add("huxinz");
		s.add("liuchuny");
		s.add("yangdd");
		s.add("wangxx");
		for (String string : s) {
			System.out.println(string);
		}
	}
}
