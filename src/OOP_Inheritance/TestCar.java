package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoparking();
		b.engine();
		BMW.billing();
		Car.billing();
		//Vehicle.billing();
		System.out.println(b.maxspeed);
		
		
		System.out.println("----------------");
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		//c.autoparking();
		c.engine();
		//c.ty
		
		System.out.println("----------------");
		Car c1= new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.autoparking();
		
		System.out.println("----------------");
		Vehicle v1=new BMW();
		v1.engine();

	}

}
