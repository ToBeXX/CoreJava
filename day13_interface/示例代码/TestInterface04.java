package day13;
class TestInterface04{
	public static void main(String[] args){
		//����һ��̨�ƶ���
		Temp t = new Temp();
		//׼��һ�����ݶ���
		Light l = new WhiteLight();
		//װ����
		t.setLight(l);
		//����
		t.on(); 
	}
}
interface Light{
	void shine();
}
//����һ��̨����
class Temp{
	//��������
	private Light light;
	public void setLight(Light light){
		this.light = light;
	}
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
class RedLight implements Light{
	public void shine(){
		System.out.println("�����...");
	}
}
class WhiteLight implements Light{
	public void shine(){
		System.out.println("���׹�...");
	}
}

