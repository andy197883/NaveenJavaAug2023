package ConstructorConcept;

import java.util.Arrays;

import Testing.Customer;

public class UserTest {

	public static void main(String[] args) {
		
		//User u1 = new User("Avinash");
		//String avinashDetails[] = u1.getUserOrderDetails("Avinash");
		//System.out.println(Arrays.toString(avinashDetails));
		
		//User u1= new User("ABC");
		User u2= new User("Ekanth",101);
		String ekanthDetails[] = u2.getUserOrderDetails("Ekanth");
		System.out.println(Arrays.toString(ekanthDetails));
		
	
		Customer c1=new Customer("Lipi", 30, true);
		System.out.println(c1.name+" "+c1.age+" "+c1.isActive);
		
	}

}
