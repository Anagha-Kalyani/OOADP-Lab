package template_method_pattern;
import java.util.*;
public class Online extends Template{
	Scanner sc= new Scanner(System.in);
	double cost=0;
	@Override
	void selectItem() {
		System.out.println("Item catalog:");
		System.out.println("1. Shoes\t 8000 INR");
		System.out.println("2. Sport Item\t 400 INR");
		System.out.println("3. Clothes\t 1500 INR");
		System.out.println("4. Cycles\t 15000 INR");
		
		System.out.println("How many items do you want to buy?");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the item number:");
			int x=sc.nextInt();
			if(x==1) {
				cost+=8000;
			}
			else if(x==2) {
				cost+=400;
			}
			else if(x==3) {
				cost+=1500;
			}
			else if(x==4) {
				cost+=15000;
			}
		}
		System.out.println("Total cost is: "+cost);
	}

	@Override
	void doPayment() {
		System.out.println("You can pay via net banking.");
		
	}

	@Override
	void doDelivery() {
		double ship=0.1*cost;
		String address;
		System.out.println("Shipping cost is: "+ship);
		System.out.println("Enter shipping address:");
		sc.nextLine();
		address=sc.nextLine();
		System.out.println("Delivering to "+address+"\nTotal amount to be paid is: "+(cost+ship));
		
	}

}
