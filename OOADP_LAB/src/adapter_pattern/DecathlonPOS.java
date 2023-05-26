package adapter_pattern;
import java.util.*;
public class DecathlonPOS {

	public static void main(String[] args) {
		double total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total cost:");
		total=sc.nextDouble();
		DecathlonTaxCalc obj=new Adapter(total);
		double tax=obj.calculate();
		System.out.println("Total cost is:\t"+total);
		System.out.println("Tax payable is:\t"+tax);
		System.out.println("Total cost with tax is:\t"+(total+tax));

	}

}
