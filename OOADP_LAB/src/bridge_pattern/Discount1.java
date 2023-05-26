package bridge_pattern;

public class Discount1 implements Discount{
	double rate=0.1;
	@Override
	public void calculate(double amount) {
		// TODO Auto-generated method stub
		double discount=amount*rate;
		System.out.println("10% discount");
		System.out.println("Total payable: "+(amount-discount));
	}

}
