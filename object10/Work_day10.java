package code_day10;
//第1题
class Monkey{
	public Monkey(){}
	public Monkey(String s){
		
	}
	public void speak(){
		System.out.println("咿咿呀呀。。。。");
	}	
}
class People extends Monkey{
	public void speak(){
		System.out.println("小样的，不错嘛！会说话了！");
	}
	public void think(){
		System.out.println("别说话！认真思考！");
	}
}
class E{
	public static void main(String[] args){
		Monkey monkey = new Monkey("haha");
		monkey.speak();
		People people = new People();
		people.speak();
		people.think();
	}
}
//第2题
class Bird{
	String wing;
	String leg;
}
class MaQue extends Bird{
	int age;
	double weight;
}
class TuoNiao extends Bird{
	double high;
	double speed;
	
}
class Hawk extends Bird{
	int flyHigh;
	public void hunt(){
		System.out.println("鹰在捕食");
	}
}
//第3题
class Vehicles{
	String brand;
	String color;
	public void run(){
		System.out.println("我已经开动了");
	}
	public void shouInfo(){
		System.out.println(brand+color);
	}
	public Vehicles(String brand,String color){
		this.brand = brand;
		this.color = color;
		
	}
	public Vehicles(){}
}
class Car extends Vehicles{
	int seats;
	public void showCar(){
		System.out.println(brand+color+seats);
	}
}
class Truck extends Vehicles{
	float load;
	public void showTruck(){
		System.out.println(brand+color+load);
	}
	public 	Truck(){}
	public 	Truck(String brand,String color,float load){
		super(brand,color);
		this.load = load;
	}
}
class TestCar{
	public static void main(String[] args){
		Truck truck = new Truck("大洋","蓝色",1000);
		truck.showTruck();
	}
}
//第4题
class Calculate1{
	
	public void reduce(){
		System.out.println("减");
	}
	public void add(){
		System.out.println("加");
	}
}
class Calculate2 extends Calculate1{
	public void multi(){
		System.out.println("乘");
	}
	public void divide(){
		System.out.println("除");
	}
}
class TestCa{
	public static void main(String[] args){
		Calculate2 ca = new Calculate2();
		ca.reduce();
		ca.add();
		ca.multi();
		ca.divide();
	}
}
//第5题
class Client{
	String name;
	String number;
	int birthday;
	
}
class Person extends Client{
	String education;
	String work;
}
class Officer extends Person{
	String job;
	String zhiwu;
}
class TestClient{
	public static void main(String[] agrs){
		Officer a = new Officer();
		a.name = "mgx";
		a.number = "410728199605203532";
		a.birthday = 19960503;
		a.education = "本科";
		//等等
	}
}
//第6题
class Auto{
	int num;
	String color;
	double weight;
	double speed;
	public Auto(){}
	public Auto(int num , String color,double weight,double speed){
		this.num = num;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	public void addSpeed(){
		System.out.println("汽车加速");
	}
	public void reduceSpeed(){
		System.out.println("汽车减速");
	}
	public void stop(){
		System.out.println("停车");
	}
}
class Car1 extends Auto{
	String airCondition;
	String CD;
	public void addSpeed(){
		System.out.println("小汽车加速");
	}
	public void reduceSpeed(){
		System.out.println("小汽车减速");
	}
}
class TestAuto{
	public static void main(String[] args){
		Car1 car = new Car1();
		car.addSpeed();
		car.reduceSpeed();
		car.stop();
	}
}
class Animalb{
	String name;
	public void eat(){
		System.out.println("Animal eat");
	}
	public void sleep(){
		System.out.println("Animal sleep");
	}
}
class Fish extends Animalb{
	public void eat(){
		System.out.println("Fish eat");
	}
}
class Dog extends Animalb{
	public void sleep(){
		System.out.println("Dog sleep");
	}
}
class TestAnim{
	public static void main(String[] args){
		Animalb a = new Animalb();
		a.eat();
		Fish f = new Fish();
		f.eat();
		Dog d = new Dog();
		d.eat();
	}
}