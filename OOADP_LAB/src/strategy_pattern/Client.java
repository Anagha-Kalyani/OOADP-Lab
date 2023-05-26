package strategy_pattern;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double total;
		System.out.println("Enter the total cost:");
		total=sc.nextDouble();
		Context a;
		System.out.println("Which type of customer are you?");
		System.out.println("1. Regular\n2. First Time\n3. SeniorCitizen");
		int ch=sc.nextInt();
		if(ch==1) {
			a=new Context(total, new Regular());
			a.calculate();
		}
		else if(ch==2) {
			a=new Context(total, new FirstTime());
			a.calculate();
		}
		else if(ch==3) {
			a=new Context(total, new SeniorCitizen());
			a.calculate();
		}
		
	}

}
