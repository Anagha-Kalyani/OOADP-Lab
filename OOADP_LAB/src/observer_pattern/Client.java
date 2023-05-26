package observer_pattern;

import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
	      Festival holi = new IndianFestival();
	      Festival songkran = new ThaiFestival();

	      new IndianCustomer("Anagha",holi);
	      new IndianCustomer("Anushka",holi);
	      new ThaiCustomer("Deepa",songkran);
	      new ThaiCustomer("Diya",songkran);

	      songkran.setState(7);
	      holi.setState(10);
	      
	      
	   }

}
