package OOP_Inheritance;

public class BMW extends Car{

	int maxspeed=200;
	
	@Override
	public void start() {
		System.out.println("BMW-- Start");
	}
	
	public void autoparking() {
		System.out.println("BMW-- autoparking");
	}
	
	@Override 
	public void engine() {
		System.out.println("BMW ---Engine");
	}
	

	public static void billing() {
		System.out.println("BMW ---Billing");
	
	}
	
	private void tyrePressure() {
		System.out.println("Car ---tyre Pressure");
	}
	
}
