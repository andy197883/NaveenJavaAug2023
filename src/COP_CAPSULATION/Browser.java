package COP_CAPSULATION;

public class Browser {
	
	public void launchBrowser() {
		// EXAMPLE for ENCAPSULATION
		//CALLING PRIVATE METHOD WITH HELP OF PUBLIC METHOD
		System.out.println("launching browser");
		checkRAM();
		checkCPUUtlization();
		checkBrowserVersion();
		checkBrowserUpgrade();
		
	}
	
	private void checkRAM() {
		System.out.println("checkRAM");	
	}
	

	private void checkCPUUtlization() {
		System.out.println("checkCPUUtlization");
}
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
}
	
	private void checkBrowserUpgrade() {
		System.out.println("checkBrowserUpgrade");
}

}
