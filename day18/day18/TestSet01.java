package com.baizhi.day18;

import java.util.HashSet;
import java.util.Set;

public class TestSet01 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("»Æ¼ÎºÆ",58,10.0));
		set.add(new Student("ÍõÖ¾Ó±",48,9.9));
		set.add(new Student("ÀîÃ«Ã«",38,10.0));
		set.add(new Student("Ğ»Óê³½",48,9.8));
		set.add(new Student("Ğ»Óê³½",48,9.8));
		
		
		for (Student student : set) {
			System.out.println(student);
		}
	}
}
