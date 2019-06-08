package chp8;

public class TestEmployee {
	public static void main(String[] args) {
		Employee[] es = new Employee[4];
		es[0] = new SalariedEmployee("John", 5, 5000);
		es[1] = new HourlyEmployee("Tom", 10, 25, 170);
		es[2] = new SalesEmployee("Lucy", 7, 200000, 0.03);
		es[3] = new BasePlusSalesEmployee("James", 8, 1000000, 0.02, 5000);
		
		//ͳ�ƹ�˾�����˶��ټӰ��
		double sum = 0;
		for(int i=0;i<es.length;i++){
			if(es[i] instanceof OverTime){
				//ǿתΪOverTime����
				OverTime ot = (OverTime)es[i];
				//,��ȡ�Ӱ��
				double a = ot.getOverTimeSalary();
				sum += a;
			}
		}
		System.out.println(sum);
		
		
	}
}
//����һ���ӿ�
//��ʾ�мӰ��
interface OverTime{
	//���صõ��˶��ټӰ��
	public double getOverTimeSalary();
}

class Employee{
	private String name;
	private int birthMonth;
	public Employee(String name,int birthMonth){
		this.name=name;
		this.birthMonth=birthMonth;
	}
	public String getName(){
		return name;
	}
	public double getSalary(int month){
		if (this.birthMonth==month) return 100;
		else return 0;
	}
}
class SalariedEmployee extends Employee implements OverTime{
	private double salary;
	public SalariedEmployee(String name,int birthMonth,double salary){
		//��name��birthMonth���������������࣬���ø�������
		super(name,birthMonth);
		this.salary=salary;
	}
	public double getSalary(int month){
		return salary+super.getSalary(month);
	}
	public double getOverTimeSalary(){
		return 2000;
	}

}
class HourlyEmployee extends Employee{
	private double salaryPerHour;
	private int hours;
	public HourlyEmployee(String name, int birthMonth, double salaryPerHour, int hours) {
		super(name, birthMonth);
		this.salaryPerHour = salaryPerHour;
		this.hours = hours;
	}
	public double getSalary(int month){
		double result=0;
		if (hours>160) result=160*this.salaryPerHour+(hours-160)*this.salaryPerHour*1.5;
		else result=this.hours*this.salaryPerHour;
		return result+super.getSalary(month);
	}
}
class SalesEmployee extends Employee{
	private double sales;
	private double rate;
	public SalesEmployee(String name, int birthMonth, double sales, double rate) {
		super(name, birthMonth);
		this.sales = sales;
		this.rate = rate;
	}
	public double getSalary(int month) {
		return this.sales*this.rate+super.getSalary(month);
	}
}
class BasePlusSalesEmployee extends SalesEmployee implements OverTime{
	private double basedSalary;
	public BasePlusSalesEmployee(String name, int birthMonth, double sales, double rate, double basedSalary) {
		super(name, birthMonth, sales, rate);
		this.basedSalary = basedSalary;
	}
	public double getSalary(int month) {
		return this.basedSalary+super.getSalary(month);
	}
	public double getOverTimeSalary(){
		return 1000;
	}

}
