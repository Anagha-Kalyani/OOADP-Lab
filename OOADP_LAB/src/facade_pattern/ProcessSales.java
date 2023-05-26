package facade_pattern;
import java.util.*;
public class ProcessSales implements Subsystems{
	int giftCard;
	double cost;
	int qty;
	ProcessSales(int giftCard, double cost, int qty){
		this.cost=cost;
		this.giftCard=giftCard;
		this.qty=qty;
	}
	


	Scanner sc= new Scanner(System.in);
	
	
	public void processSales() {
		if(this.giftCard==1 && this.qty==1) {
			System.out.println("You are eligible.");
			System.out.println("Enter the gift card amount:");
			double gc=sc.nextDouble();
			if(gc>=this.cost) {
				System.out.println(this.cost+" paid using gift certicifate.");
				System.out.println((gc-this.cost)+" Will not be refunded.");
			}
			else {
				System.out.println("Pay "+(this.cost-gc)+" via cash only.");
			}
		}
		else {
			System.out.println("Not eligible for gift card.");
			System.out.println("Pay "+this.cost+" via cash or card.");
		}
		System.out.println("Thank you!!");
	}


	@Override
	public void getCost() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getQty() {
		// TODO Auto-generated method stub
		
	}
	
}
