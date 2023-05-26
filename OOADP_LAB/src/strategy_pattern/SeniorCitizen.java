package strategy_pattern;

public class SeniorCitizen implements CustomerStrategy{

	@Override
	public void calcDiscount(double total) {
		// TODO Auto-generated method stub
		double discount=0.10*total;
		System.out.println("Discount: 10%");
		System.out.println("Price after discount:"+(total-discount));
	
	}

}
