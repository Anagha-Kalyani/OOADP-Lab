package strategy_pattern;

public class Context {
	CustomerStrategy x;
	double total;
	double salesIndex=200;
	Context(double total,CustomerStrategy x){
		this.total=total;
		if(this.total>1000) {
			System.out.println("Discount based on sales index: 200");
			this.total-=salesIndex;
		}
		this.x=x;
	}
	public void calculate() {
		x.calcDiscount(this.total);
	}
}
