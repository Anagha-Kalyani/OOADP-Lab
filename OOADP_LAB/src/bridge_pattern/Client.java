package bridge_pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj=new RegularCustomer("anagha",new Discount1());
		obj.details();
		obj.calcDiscount(1500);
	}

}
