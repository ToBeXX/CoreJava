package com.baizhi.day18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		//������һ��set����
		Set<String> set = new HashSet<>();
		
		//��
		set.add("huxinz");
		set.add("liuchuny");
		set.add("yangdd");
		set.add("wangxx");
		set.add("wangxx");
		
		System.out.println(set.size());
		//����for-each
		/*for(String s:set){
			System.out.println(s);
		}*/
		
		//����������
		//��ȡһ������������	iterator()
		Iterator<String> iterator = set.iterator();
		/*boolean hasNext()  �ж�ָ����Ƿ���Ԫ�� 
			E     next() ��ָ������Ԫ�ؽ��з��� */
		while(iterator.hasNext()){	//������滹��Ԫ��   hashNext�������Ϊtrue	
			System.out.println(iterator.next());	//�� ���غ����Ԫ��     next����
		}		
		
		
		
		
		
		
	}
}
