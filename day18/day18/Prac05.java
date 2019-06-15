package com.baizhi.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac05 {
	public static void main(String[] args) {
//		② 创建多个Employee对象，存储在List集合中。
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("huangjiahao",58,180.0));
		list.add(new Employee("wang胡zhiy",48,185.0));
		list.add(new Employee("yanjingyu",42,181.0));
		list.add(new Employee("胡limaomao",68,2.5));
		list.add(new Employee("xieyuchen",78,186.0));
//	   	③ 打印输出所有的员工信息。
		for (Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("=======================");
//	   	④ 计算所有员工平均工资。
		double sum = 0;
		for (Employee employee : list) {
			sum+=employee.getSalary();
		}
		System.out.println(sum/list.size());
		System.out.println("=======================");
//	   	⑤ 打印输出姓名中包含 "胡" 的所有员工信息。
		for (Employee employee : list) {
			if(employee.getName().contains("胡")){
				System.out.println(employee);
			}
		}
//	   	⑥ 打印输出所有姓 "胡" 的员工信息。
		for (Employee employee : list) {
			if(employee.getName().charAt(0)=='胡'){
				System.out.println(employee);
			}
		}
		System.out.println("=============================");
//	   	⑦ 键盘输入一个姓名，查找是否存在此员工，存在，则打印输出员工的信息，
//	   	     如果不存在，则输出"查无此人"
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
			System.out.println("查无此人");
		}
//	   	⑧ 输入一个工资，查询工资 大于 输入工资的员工信息。
		double d = scanner.nextDouble();
		for (Employee employee : list) {
			if(employee.getSalary()>d){
				System.out.println(employee);
			}
		}
		
		
		
	}
}

