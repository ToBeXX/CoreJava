package code_day9;
//�ӿ�
public class TestInterface{
	public static void main(String[] args){
		IA a1 = new MyClass();
		a1.m1();
		a1.m2();
		System.out.println(a1.a);
	}
}
//����һ���ӿ�

interface IA{
	//������̬����
	public static final int a = 10;
	public static final double b = 20.0;
	//�������󷽷�
	public abstract void m1();
	public abstract void m2();
}
//�ӿڵ�ʵ��---�ؼ��֣�implements
class MyClass implements IA{
	//�ӿ��г��󷽷���ʵ��
	public void m1(){}
	public void m2(){}
}

/*
�ӿ�ʵ�ֽ����
*/
interface Bulb{
	public abstract void light();
}
class YellowLight implements Bulb{
	public void light(){
		System.out.println("���ƹ�");
	}
}
class RedLight implements Bulb{
	public void light(){
		System.out.println("�����");
	}
}
class Light{
	Bulb bulb;
	public void setBulb(Bulb bulb){
		this.bulb = bulb;
	}
	public void lightOn(){
		bulb.light();
	}
}
class TestInterface1{
	public static void main(String[] args){
		Light light = new Light();
		RedLight redlight = new RedLight();
		light.setBulb(redlight);
		light.lightOn();
		YellowLight yellowlight = new YellowLight();
		light.setBulb(yellowlight);
		light.lightOn();
	}
}