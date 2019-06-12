package com.baizhi.day15;

public class TestFinalize {
	public static void main(String[] args) {
		/*for(int i=0;i<5000000;i++){
			new Teacher();
		}*/
		for(int i=0;i<50;i++){
			new Teacher();
		}
		System.gc();
	}
}
class Teacher {}
