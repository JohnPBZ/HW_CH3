package test_p47;

public class Sample3_23 {
	public static void main(String[] args) {
		
		Car car1;
		car1=new Car();
		car1.show();
		
		int number=1234;
		double gassoline=20.5;
		String str="1號車";
		car1.setCar(number, gassoline);
		car1.setName(str);
		car1.show();
		
	}
}
class Car{
	private int num;
	private double gas;
	private String name;
	public Car() {
		num=0;
		gas=0.0;
		name="沒有名稱";
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public void setName(String nm) {
		name=nm;
		System.out.println("將車名設為"+name);
	}
	void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("車名是"+name);
	}
}