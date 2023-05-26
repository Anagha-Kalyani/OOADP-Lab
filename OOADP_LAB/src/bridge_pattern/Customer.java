package bridge_pattern;

public class Customer {
	String name;
	Discount d;
	Customer(String name, Discount d){
		this.name=name;
		this.d=d;
	}
	public void details() {
		System.out.println("Name: "+this.name);
	}
	public void calcDiscount(double amount) {
		this.d.calculate(amount);
	}
}
