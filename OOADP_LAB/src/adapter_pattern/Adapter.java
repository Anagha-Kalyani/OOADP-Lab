package adapter_pattern;

public class Adapter extends MauriTax implements DecathlonTaxCalc{
	double amt;
	Adapter(double amt) {
		super(amt);
	}

	@Override
	public double calculate() {
		return super.calcTax();
	}

}
