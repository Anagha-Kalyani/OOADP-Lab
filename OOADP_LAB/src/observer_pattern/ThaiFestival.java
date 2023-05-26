package observer_pattern;
import java.util.*;
public class ThaiFestival extends Festival{
	private ArrayList<Customer> thaiCust=new ArrayList<>();
	private double discount;
	public void setState(double discount) {
		this.discount=discount;
		this.notifyAllObs();

	}
	public void attach(Customer x) {
		// TODO Auto-generated method stub
		thaiCust.add(x);
	}

	public void detach(Customer x) {
		// TODO Auto-generated method stub
		thaiCust.remove(x);
	}

	public void notifyAllObs() {
		// TODO Auto-generated method stub
		for(Customer x:thaiCust) {
			x.update(discount);
		}
	}



}
