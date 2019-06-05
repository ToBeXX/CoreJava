package day13;
class TestInterface04{
	public static void main(String[] args){
		//创建一个台灯对象
		Temp t = new Temp();
		//准备一个灯泡对象
		Light l = new WhiteLight();
		//装灯泡
		t.setLight(l);
		//发光
		t.on(); 
	}
}
interface Light{
	void shine();
}
//定义一个台灯类
class Temp{
	//灯泡属性
	private Light light;
	public void setLight(Light light){
		this.light = light;
	}
	public void on(){
		light.shine();
	}
} 
//定义一个灯泡类
class GreenLight implements Light{
	public void shine(){
		System.out.println("绿的发光");
	}
}
class RedLight implements Light{
	public void shine(){
		System.out.println("发红光...");
	}
}
class WhiteLight implements Light{
	public void shine(){
		System.out.println("发白光...");
	}
}

