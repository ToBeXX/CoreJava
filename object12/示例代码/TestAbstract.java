package day12;
class TestAbstract{
	public static void main(String[] args){
		Shape s =  new Suqare();
		System.out.println(s.getArea());
	}
}
abstract class Shape{
	public abstract double getArea();
	public abstract double getGrith();
}
class Suqare extends Shape{
	public double getArea(){
		return 10*10;
	}
	public double getGrith(){
		return 4*10;
	}
}
class Rect extends Shape{
	public double getArea(){
		return 10*11;
	}
	public double getGrith(){
		return 2*(10+11);
	}
}