package observer_pattern;
import java.util.*;
public class IndianFestival extends Festival{
	private ArrayList<Customer> indianCust=new ArrayList<>();
	private double discount;
	public void setState(double discount) {
		this.discount=discount;
		this.notifyAllObs();
	}
	public void attach(Customer x) {
		// TODO Auto-generated method stub
		indianCust.add(x);
	}

	public void detach(Customer x) {
		// TODO Auto-generated method stub
		indianCust.remove(x);
	}

	public void notifyAllObs() {
		// TODO Auto-generated method stub
		for(Customer x:indianCust) {
			x.update(discount);
		}
	}



}
