package com.baizhi.day18;

import java.util.HashSet;
import java.util.Set;

public class TestSet01 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("�Ƽκ�",58,10.0));
		set.add(new Student("��־ӱ",48,9.9));
		set.add(new Student("��ëë",38,10.0));
		set.add(new Student("л�곽",48,9.8));
		set.add(new Student("л�곽",48,9.8));
		
		
		for (Student student : set) {
			System.out.println(student);
		}
	}
}
