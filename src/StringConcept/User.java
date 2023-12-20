package StringConcept;

public class User {

	public static void main(String[] args) {
				//String: is a class
		
		
				//1. using literals:
				String s2 = "Selenium"; //1
				
				//2. using new keyword
				String s1 = new String("Hello");//2 - heap, scp
				
				String s3 = "Hello";//0
				String s4 = new String("Hello");//1- heap
				
				System.out.println(s1 == s3);//false
				System.out.println(s1.equals(s3));//true
				System.out.println(s1 == s4);//false
				System.out.println(s1.equals(s4));//true
				
				String s5="Hello";
				System.out.println(s3 == s5);//true
				System.out.println(s1.equals(s5));//true
				
				String s6 = "hello";//1 in SCP
				
				String s7 = new String("Naveen");//2 - heap, scp
				
				s7.intern();
				
				

	}

}
