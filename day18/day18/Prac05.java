package com.baizhi.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac05 {
	public static void main(String[] args) {
//		�� �������Employee���󣬴洢��List�����С�
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("huangjiahao",58,180.0));
		list.add(new Employee("wang��zhiy",48,185.0));
		list.add(new Employee("yanjingyu",42,181.0));
		list.add(new Employee("��limaomao",68,2.5));
		list.add(new Employee("xieyuchen",78,186.0));
//	   	�� ��ӡ������е�Ա����Ϣ��
		for (Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("=======================");
//	   	�� ��������Ա��ƽ�����ʡ�
		double sum = 0;
		for (Employee employee : list) {
			sum+=employee.getSalary();
		}
		System.out.println(sum/list.size());
		System.out.println("=======================");
//	   	�� ��ӡ��������а��� "��" ������Ա����Ϣ��
		for (Employee employee : list) {
			if(employee.getName().contains("��")){
				System.out.println(employee);
			}
		}
//	   	�� ��ӡ��������� "��" ��Ա����Ϣ��
		for (Employee employee : list) {
			if(employee.getName().charAt(0)=='��'){
				System.out.println(employee);
			}
		}
		System.out.println("=============================");
//	   	�� ��������һ�������������Ƿ���ڴ�Ա�������ڣ����ӡ���Ա������Ϣ��
//	   	     ��������ڣ������"���޴���"
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		boolean flag = false;
		for (Employee employee : list) {
			if(next.equals(employee.getName())){
				System.out.println(employee);
				flag = true;
			}
		}
		if(!flag){
			System.out.println("���޴���");
		}
//	   	�� ����һ�����ʣ���ѯ���� ���� ���빤�ʵ�Ա����Ϣ��
		double d = scanner.nextDouble();
		for (Employee employee : list) {
			if(employee.getSalary()>d){
				System.out.println(employee);
			}
		}
		
		
		
	}
}

