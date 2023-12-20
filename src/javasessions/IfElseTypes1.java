package javasessions;

public class IfElseTypes1 {
	// Session on AUG-28
	public static void main(String[] args) {
	
		/*String test="AndreW";
		if(test.equals("Andrew")) {
			System.out.println("MATCHING");
		}
		else {
			System.out.println("NOT MATCHING");
		}
	
/*
		

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		 if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		 if(browser.equals("edge")) {
			System.out.println("launch edge");
		}
		 if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("plz pass the right browser...." + browser);
}
		 
	*/	 
		String browser = "opera";
			if (browser.equals("chrome")) {
				System.out.println("launch chrome");
			}
			else if(browser.equals("firefox")) {
				System.out.println("launch firefox");
				
			}
			else if(browser.equals("edge")) {
				System.out.println("launch edge");
			}
			else if(browser.equals("safari")) {
				System.out.println("launch safari");
			}
			else {
				System.out.println("plz pass the right browser...." + browser);
	}
}
}

