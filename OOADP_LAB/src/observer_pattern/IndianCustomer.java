package observer_pattern;

public class IndianCustomer implements Customer {
	
	String name;
	Festival f;
	IndianCustomer(String name,Festival f){
		this.name=name;
		this.f=f;
		this.f.attach(this);
	}
	@Override
	public void update(double discount) {
		// TODO Auto-generated method stub
		System.out.println(this.name+", you get a discount of "+discount+"% this month.");
	}

}
