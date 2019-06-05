package code_day13;
/*
ʾ����������
*/
//������
class TestInterface{
	public static void main(String[] args){
		Interface m = new SubInterface();	//��̬��Ӧ��
		m.m1();
		m.m2();
	}
}
//�ӿ�
interface Interface{
	//������Ĭ�Ϲ�����̬���� public static final
	int a = 10;
	//������Ĭ�Ϲ������󷽷� public abstract
	void m1();
	void m2();
}
//ʵ����   implements
//SubInterface ʵ���� Interface�ӿ�
class SubInterface implements Interface{
	public void m1(){
		System.out.println("hello");
	}
	public void m2(){
		System.out.println("world");
	}
}

class TestInterface1{
	public static void main(String[] args){
		// Class a = new Class();	//���� �����಻�ܴ�������
		   Class a;  //�����������������
		
		// MyInterface m = new MyInterface();  //����  �ӿڲ��ܴ������� 
		// MyInterface m  �ӿڿ�����������
		
		System.out.println(Class.b);	//20
		System.out.println(MyInterface.b);	//30
		System.out.println(MyInterface.a);	//40  �ܴ�ӡ����  ��Ϊ�ӿ��е�����Ĭ��Ϊ������̬�����������ýӿ���ֱ�ӷ���
		// MyInterface.a = 50;  error
		// MyInterface.b = ;
		
	}
}
//����ĳ�����
abstract class Class{
	//�Ǿ�̬����
	int a=10;
	//��̬����
	static int b = 20;
	//���������й��췽��  �����๹�����ʱ��ȥ�����������ʱʹ��
	public Class(){}
	//�������п����зǳ��󷽷�
	public void m1(){}
	//�������󷽷�  �������п���û�г��󷽷�
	/* public abstract void m2(); */
}
//�ӿ� �ؼ���interface   ������interface �ӿ���
interface MyInterface{
	int a = 40;    				//������Ĭ�Ϲ�����̬����    public static final int a = 40;
	static int b = 30;
	// public MyInterface(){}   	����  �ӿ�û�й��췽��
	// public void m1(){}		//����Ĭ��Ϊ�������󷽷� public abstract void m1();
	/* public abstract void m2(); */	//��void m2(); �ȼ�
	void m2();
}
/*
ʾ����������
*/
class TestInterface2{
	public static void main(String[] args){
		//����һ��������������as������� dog cat fish bird dog�������
		Animal[] as = new Animal[]{
			new Dog(),
			new Cat(),
			new Fish(),
			new Bird(),
			new Dog()
		};
		//�ж�as�����У���еĶ������
		int count = 0;
		for(int i=0;i<as.length;i++){
			//��instanceof�����ж���  �������Ϊ��������ǲ��ǻ��ʲô
			//�ж�as[i]�ǲ��ǻ��
			if(as[i] instanceof Shoutable){
				count++;
			}
		}
		System.out.println(count);
		
		//��as�����л���Ӿ������Ӿ
		for(int i=0;i<as.length;i++){
			//�ж��Ƿ����Ӿ
			if(as[i] instanceof Swimable){
				//�������Ӿ����ǿתΪ����Ӿ������
				Swimable sa = (Swimable)as[i];
				//������Ӿ����
				sa.swim();
			}
		}
		
	}
}
//�ӿ�  ���нз���
interface Shoutable{
	public void shout();
}
//�ӿ�  ������Ӿ����
interface Swimable{
	public void swim();
}
//�������о��гԷ�����˯������
class Animal{
	public void eat(){
		System.out.println("animal eat....");
	}
	public void sleep(){
		System.out.println("animal sleep....");
	}
}
//���̳ж����࣬ʵ�ֽнӿں���Ӿ�ӿڣ�����ʵ���������ӿ��еķ���
class Dog extends Animal implements Shoutable,Swimable{
	public void shout(){
		System.out.println("shout...");
	}
	public void swim(){
		System.out.println("swimming...");
	}
}
//è�̳ж����� ʵ�ֽнӿڣ�����ʵ�ֽнӿ��еĽз���
class Cat extends Animal implements Shoutable{
	//è�������Լ�����������
	public void climbTree(){
		System.out.println("climbTree...");
	}
	public void shout(){
		System.out.println("shout...");
	}
}
//��ʵ����Ӿ�ӿڣ�ʵ����Ӿ�ӿ��е���Ӿ����
class Fish extends Animal implements Swimable{
	public void swim(){
		System.out.println("swimming...");
	}
}
//��ʵ�ֽнӿڡ�����ʵ�ֽнӿڵĽз���
class Bird extends Animal implements Shoutable{
	public void fly(){
		System.out.println("fly...");
	}
	public void shout(){
		System.out.println("shout...");
	}
}
/*
������ʾ�������һ��
*/
class TestInterface3{
	public static void main(String[] args){
		//����һ��̨�ƶ���
		Temp t = new Temp();
		//׼��һ�����ݶ���
		Light l = new WhiteLight();
		//����̨���е�װ���ݷ�����׼���õĵ���װ��ȥ
		t.setLight(l);
		//���÷��ⷽ��
		t.on(); 
	}
}
//����һ�����ݽӿھ���������
interface Light{
	void shine();
}
//����һ��̨����
class Temp{
	//��һ���������͵�����
	private Light light;
	//��һ�������ݵķ�������׼���õĵ��ݰ���ȥ
	public void setLight(Light light){
		this.light = light;
	}
	//��һ������������̨�Ƶĵ��ݷ���
	public void on(){
		light.shine();
	}
} 
//����һ��������
class GreenLight implements Light{
	public void shine(){
		System.out.println("�̵ķ���");
	}
}
//�����ʵ�ֵ��ݽӿڣ������
class RedLight implements Light{
	public void shine(){
		System.out.println("�����...");
	}
}
//�׵���ʵ�ֵ��ݽӿڣ����׹�
class WhiteLight implements Light{
	public void shine(){
		System.out.println("���׹�...");
	}
}
//�ڶ���
//������һ�����ݽӿ�
interface Bulb{
	void shine();
}
//�в�ͬ���͵ĵ���ʵ������ӿ�
class GreenBulb implements Bulb{
	public void shine(){
		System.out.println("���̹�");
	}
}
class YellowBulb implements Bulb{
	public void shine(){
		System.out.println("���ƹ�");
	}
}
//��һ��̨���࣬����е������ԣ����а����ݵķ��������д򿪵��ݵķ���
class Lamp1{
	Bulb bulb;
	public void setBulb(Bulb bulb){
		this.bulb = bulb;
	}
	public void lightOn(){
		bulb.shine();
	}
}
//������
class TestLamp{
	public static void main(String[] args){
		//�ȴ���һ��̨�ƶ���
		Lamp1 l = new Lamp1();
		//�ٴ���һ������
		YellowBulb yellowBulb = new YellowBulb(); 
		//����̨���е�װ���ݷ���������װ��ȥ
		l.setBulb(yellowBulb);
		//���÷��ⷽ��
		l.lightOn();
		//����һ����ɫ����
		GreenBulb greenBulb = new GreenBulb();
		//�����ݻ�����ɫ����
		l.setBulb(greenBulb);
		//���÷��ⷽ��
		l.lightOn();
	}
}
//������
interface Bulb1{
	void shine();
}
//�в�ͬ���͵ĵ���ʵ������ӿ�
class BuleBulb implements Bulb1{
	public void shine(){
		System.out.println("������");
	}
}
class BlackBulb implements Bulb1{
	public void shine(){
		System.out.println("���ڹ�");
	}
}
//��һ��̨���࣬����е������ԣ����а����ݵķ��������д򿪵��ݵķ���
class Lamp2{
	Bulb1 bulb;
	public void setBulb(Bulb1 bulb){
		this.bulb = bulb;
	}
	public void lightOn(){
		bulb.shine();
	}
}
//������
class TestLamp1{
	public static void main(String[] args){
		//�ȴ���һ��̨�ƶ���
		Lamp2 l = new Lamp2();
		//�ٴ���һ������
		BuleBulb buleBulb = new BuleBulb(); 
		//����̨���е�װ���ݷ���������װ��ȥ
		l.setBulb(buleBulb);
		//���÷��ⷽ��
		l.lightOn();
		//�ٴ���һ������
		BlackBulb blackBulb = new BlackBulb();
		//�����ݻ��ɺ�ɫ����
		l.setBulb(blackBulb);
		//���÷��ⷽ��
		l.lightOn();
	}
}