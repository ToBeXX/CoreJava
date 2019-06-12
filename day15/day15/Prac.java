package com.baizhi.day15;

public class Prac {
	public static void main(String[] args) {
		// 创建台灯对象
		Temp temp = new Temp();
		//创建一个灯泡对象
		//局部内部类
		class RedLight implements Light {
			public void shine() {
				System.out.println("发红光");
			}
		}
		RedLight rd = new RedLight();
		
		temp.setLight(rd);
		temp.on();
		
		//匿名内部类
		Light light = new Light(){
			//匿名内部类的内容
			public void shine(){
				System.out.println("发绿光");
			}
		};
		temp.setLight(light);
		temp.on();
		
	
		temp.setLight(new Light() {
			public void shine() {
				System.out.println("发黄光。。。");
			}
		});
		temp.on();
		
	}
}

interface Light {
	void shine();
}

class Temp {
	private Light light;
	public void setLight(Light light) {
		this.light = light;
	}
	public void on() {
		light.shine();
	}
}
