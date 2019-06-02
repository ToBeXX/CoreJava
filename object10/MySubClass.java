package corejava.temp;
import corejava.chp7.MyClass;
public class MySubClass extends MyClass{
	int value;
	public MySubClass(int value){
		super.value = value;
	}
	public void getValue(){
		System.out.println(this.value);
	}
}
class TestExtends{
	public static void main(String[] args){
		MySubClass a = new MySubClass(10);
		a.getValue();
		a.getValue1();
	}
}