package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		//AUG-28 Session
		
		// byte,short,int, String, char -- allowed
		// long, float, double, boolean -- not allowed
		
		String browser="chrome";
		int version=117;
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			
			
			if (version==115) {
				System.out.println("GIVE PERMISSION");
				
			}
			else {
				System.out.println("No Permission");
			}
			System.out.println("Launch chrome Browser");
			break;
		
			case "firefox":
				System.out.println("Launch firefox Browser");
				break;
			case "edge":
				System.out.println("Launch edge Browser");
			break;	
				
			case "safari":
				System.out.println("Launch safari Browser");
				break;
		default:
			System.out.println("Please pass the right browser..... " +browser);
			break;
			
		case "Opera":
			System.out.println("Launch Opera Browser");
			break;
		}

		/*
		char ch='A';
		switch (ch) {
		case 'a':
		{
			System.out.println(ch + " is a vowel");
			break;
		}
		case 'i':
		{
			System.out.println(ch + " is a vowel");
			break;
		}
		case 'e':
		{
			System.out.println(ch + " is a vowel");
			break;
		}
		case 'o':
		{
			System.out.println(ch + " is a vowel");
			break;
		}
		case 'u':
		{
			System.out.println(ch + " is a vowel");
			break;
		}
		case 'A':
		{
			System.out.println(ch + " is a vowel");
			break;
		}
		case 'I':
		{
			System.out.println(ch + " is a vowel");
			break;
		}
		case 'E':
		{
			System.out.println(ch + " is a vowel");
			break;
		}
		case 'O':
		{
			System.out.println(ch + " is a vowel");
			break;
		}
		case 'U':
		{
			System.out.println(ch + " is a vowel");
			break;
		}
		default:
			System.out.println(ch + " is a consonant");
			break;
		}
		*/
		
		//cross browser logic
		//cross platform/OS/devices: Linux, mac, windows, android, ios
		//user access based permission : RBAC: admin/seller/vendor/customer/distributor
		//multi env execution: dev/qa/stage/uat/prod
		//payment options: CC/UPI/mobile app/online/COD
		//Lang cases: English, Arabic, 
		//Web Page: Electronics, Fashion
	}

}
	



