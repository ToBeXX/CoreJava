package code_day10;
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
//������ݽӿ�
interface Bulb{
	//��һ������ĳ��󷽷�
	public abstract void light();
}
//����Ƶ���ʵ�ֵ��ݽӿ�
class YellowLight implements Bulb{
	//ʵ�ֽӿ��еķ���
	public void light(){
		System.out.println("���ƹ�");
	}
}
//��������ʵ�ֵ��ݽӿ�
class RedLight implements Bulb{
	//ʵ�ֽӿ��еķ���
	public void light(){
		System.out.println("�����");
	}
}
//��������
class Light{
	//������ݽӿ�����
	Bulb bulb;
	//����������������ʵ�ֵĴ���
	public void setBulb(Bulb bulb){
		this.bulb = bulb;
	}
	//�������ⷽ���������ʵ���˽ӿڵķ��ⷽ��
	public void lightOn(){
		bulb.light();
	}
}
class TestInterface1{
	public static void main(String[] args){
		//����һ���ƶ���
		Light light = new Light();
		//�����ƶ���
		RedLight redlight = new RedLight();
		
		light.setBulb(redlight);
		light.lightOn();
		//����Ƶƶ���
		YellowLight yellowlight = new YellowLight();
		light.setBulb(yellowlight);
		light.lightOn();
	}
}



//Static 
class TestStatic{
	public static void main(String[] args){
		System.out.println(Static.age);
		System.out.println(Static.a(3));
	}	
}
class Static{
	static int age = 10;
	static String name = "xiaoya";
	double salary = 3000.0; 
	public static int a(int ab){
		System.out.println("����Ů����Ư����Ů��");
		return age;
	}
}