package bridge_pattern;

public class Discount2 implements Discount{
	double rate=0.15;
	@Override
	public void calculate(double amount) {
		// TODO Auto-generated method stub
		double discount=amount*rate;
		System.out.println("15% discount");
		System.out.println("Total payable: "+(amount-discount));
	}

}
