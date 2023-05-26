package strategy_pattern;

public class FirstTime implements CustomerStrategy{

	@Override
	public void calcDiscount(double total) {
		// TODO Auto-generated method stub
		double discount=0.15*total;
		System.out.println("Discount: 15%");
		System.out.println("Price after discount:"+(total-discount));
		}

}
