package com.baizhi.day18;

import java.util.ArrayList;
import java.util.List;

public class Prac {
	public static void main(String[] args) {
		List<Animal> list = new ArrayList<>();
		list.add(new Dog());
		list.add(new Cat());
		list.add(new Dog());
		list.add(new Cat());
		
		//调用getAllDogs方法 
		List<Dog> dogs = getAllDogs(list);
		//下标遍历
		for(int i=0;i<dogs.size();i++){
			dogs.get(i).play();
		}

	}
	public static List<Dog> getAllDogs(List<Animal> as){
		//挑选出Animals集合中的dog  放在list集合中返回
		List<Dog> dogs = new ArrayList<>();
		//遍历as集合
		for(Animal a:as){
			if(a instanceof Dog){
				//as集合中的元素  是Animal类型  将其添加至dogs集合，需要强转
				dogs.add((Dog)a);
			}
		}
		return dogs;
	}
}
class Animal{}
class Dog extends Animal{
	public void play(){
		System.out.println("Dog play with you");
	}
}
class Cat extends Animal{
	
}