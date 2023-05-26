package bridge_pattern;

public class RegularCustomer extends Customer{

	RegularCustomer(String name, Discount d) {
		super(name, d);
		// TODO Auto-generated constructor stub
	}
	public void details() {
		System.out.println("Regular Customer");
		super.details();
	}
}
