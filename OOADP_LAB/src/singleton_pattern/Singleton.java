package singleton_pattern;
import java.util.*;
public class Singleton {
	private static Singleton obj;
	private ArrayList<String> history=new ArrayList<>();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(obj==null) {
			obj=new Singleton();
		}
		return obj;
	}
	
	public void addWebsite(String website) {
		history.add(0,website);
	}
	
	public void viewHistory() {
		System.out.println("Browsing history:");
		for(String x: history) {
			System.out.println(x);
		}
	}
}
