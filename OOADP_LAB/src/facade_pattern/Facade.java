package facade_pattern;

public class Facade {
	int giftCard;
	double cost;
	int qty;
	Subsystems obj;
	Facade(int giftCard, double cost, int qty){
		this.cost=cost;
		this.giftCard=giftCard;
		this.qty=qty;
	}
	public void items() {
		obj=new ItemsPurchased(this.giftCard,this.cost,this.qty);
		obj.getCost();
		obj.getQty();
	}
	public void process() {
		obj=new ProcessSales(this.giftCard,this.cost,this.qty);
		obj.processSales();
	}
}
