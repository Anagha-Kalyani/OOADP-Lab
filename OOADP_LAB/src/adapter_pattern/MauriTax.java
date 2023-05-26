package adapter_pattern;

public class MauriTax {
	double amt;
	MauriTax(double amt){
		this.amt=amt;
	}
	public double calcTax() {
		return 0.15*amt;
	}
}
