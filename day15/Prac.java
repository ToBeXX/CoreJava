package com.baizhi.day15;

public class Prac {
	public static void main(String[] args) {
		// ����̨�ƶ���
		Temp temp = new Temp();
		//����һ�����ݶ���
		//�ֲ��ڲ���
		class RedLight implements Light {
			public void shine() {
				System.out.println("�����");
			}
		}
		RedLight rd = new RedLight();
		
		temp.setLight(rd);
		temp.on();
		
		//�����ڲ���
		Light light = new Light(){
			//�����ڲ��������
			public void shine(){
				System.out.println("���̹�");
			}
		};
		temp.setLight(light);
		temp.on();
		
	
		temp.setLight(new Light() {
			public void shine() {
				System.out.println("���ƹ⡣����");
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
