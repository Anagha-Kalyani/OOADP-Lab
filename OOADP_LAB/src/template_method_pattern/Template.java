package template_method_pattern;

public abstract class Template {
	abstract void selectItem();
	abstract void doPayment();
	abstract void doDelivery();

	Template(){
		System.out.println("Welcome to the store!");
	}
	public final void processOrder() {
		selectItem();
		doPayment();
		doDelivery();
	}
}
