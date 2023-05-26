package facade_pattern;

import java.util.Scanner;

public class Client {
	 int qty;
	 double cost;
	 int giftCard;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("What is the total quantity of items bought?");
		int qty=sc.nextInt();
		System.out.println("Total cost?");
		double cost=sc.nextDouble();
		System.out.println("Do you have a gift card? (1/0)");
		int giftCard=sc.nextInt();
		Facade f= new Facade(giftCard, cost, qty);
		f.items();
		f.process();
	}

}
