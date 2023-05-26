package facade_pattern;
import java.util.*;
public class ItemsPurchased implements Subsystems{
	int giftCard;
	double cost;
	int qty;
	ItemsPurchased(int giftCard, double cost, int qty){
		this.cost=cost;
		this.giftCard=giftCard;
		this.qty=qty;
	}
	
	public void getCost() {
		System.out.println("Total cost: "+this.cost);

	}
	public void getQty() {
		System.out.println("The total quantity of items bought: "+this.qty);

	}

	@Override
	public void processSales() {
		// TODO Auto-generated method stub
		
	}
}
