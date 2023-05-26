package template_method_pattern;
import java.util.*;
public class Client {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int ch;
		System.out.println("Press 1 for offline shopping or 2 for online shopping");
		ch=sc.nextInt();
		if (ch==1){
			Template obj= new Offline();
			obj.processOrder();
		}
		else {
			Template obj= new Online();
			obj.processOrder();
		}
	}
}
