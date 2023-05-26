package factory_method_pattern;

public class CustomerFactory {
	public Customer getCustomer(int input){
		if (input==1) {
			return new Regular();
		}
		else if(input==2) {
			return new FirstTime();
		}
		else if(input==3) {
			return new SeniorCitizen();
		}
		else {
			return null;
		}
	}
}
