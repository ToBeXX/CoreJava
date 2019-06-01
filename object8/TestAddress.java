class TestAddress{
	public static void main(String[] args){
		Address a = new Address();
		System.out.println(a);
		int b = a.age;
		System.out.println(b);
	}
}
class Address{
	String name;
	int age;
	double weight;
}