package singleton_pattern;
import java.util.*;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Singleton browser= Singleton.getInstance();
		System.out.println("How many websites do you want to add?");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter URL: ");
			String x=sc.nextLine();
			browser.addWebsite(x);
		}
		browser.viewHistory();
	}

}
