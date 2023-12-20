package OOP_Inheritance;

public  class Car extends Vehicle{
	
	int maxspeed=100;
	
	public  void  start() {
		System.out.println("Car-- Start");
	}

	public void stop() {
		System.out.println("Car-- Stop");
	}
	
	public void refuel() {
		System.out.println("Car-- Refuel");
	}
	
	public static void billing() {
		System.out.println("Car ---Billing");
	}
	
	private void tyrePressure() {
		System.out.println("Car ---tyre Pressure");
	}
	public void cartyrePressure() {
		tyrePressure();
	}
	
}
