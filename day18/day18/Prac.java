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
		
		//����getAllDogs���� 
		List<Dog> dogs = getAllDogs(list);
		//�±����
		for(int i=0;i<dogs.size();i++){
			dogs.get(i).play();
		}

	}
	public static List<Dog> getAllDogs(List<Animal> as){
		//��ѡ��Animals�����е�dog  ����list�����з���
		List<Dog> dogs = new ArrayList<>();
		//����as����
		for(Animal a:as){
			if(a instanceof Dog){
				//as�����е�Ԫ��  ��Animal����  ���������dogs���ϣ���Ҫǿת
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