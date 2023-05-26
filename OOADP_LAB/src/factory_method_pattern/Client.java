package factory_method_pattern;
import java.util.*;
public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the category you belong to:");
		System.out.println("1. Regular \n2. First time \n3. Senior Citizen");
		int input=sc.nextInt();
		CustomerFactory obj=new CustomerFactory();
		Customer obj1=obj.getCustomer(input);
		obj1.getCustType();
	}

}
