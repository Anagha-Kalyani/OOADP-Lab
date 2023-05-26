package bridge_pattern;

public class SeniorCitizen extends Customer{

	SeniorCitizen(String name, Discount d) {
		super(name, d);
		// TODO Auto-generated constructor stub
	}
	public void details() {
		System.out.println("Senior Citizen Customer");
		super.details();
	}
}
