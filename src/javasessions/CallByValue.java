package javasessions;

public class CallByValue {

	String name;
	int age;
	String city;
	public static void main(String[] args) {
		// Session 11-SEP Assignment
		//Call by Reference Call  by Value
		User u1 = new User();
		u1.name = "Rahul";
		u1.age = 25;
		u1.city = "Pune";

		User u2 = new User();
		u2.name = "Pooja";
		u2.age = 35;
		u2.city = "LA";
 
		
		User u3 = new User();
		u3.name = "Satish";
		u3.age = 30;
		u3.city = "Bangalore";
		
		User u4 = new User();
		u4.name = "Dhoni";
		u4.age = 38;
		u4.city = "Jharkand";
		
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
        System.out.println("---u1 u2---------");
		
		u1 = u2;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Pooja
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Pooja
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Satish
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("----2 3--------");
		
		
		u2 = u3;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Pooja
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Pooja
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Satish
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("-----3 1-------");
		
		u3 = u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Pooja
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Satish
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Pooja
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("-----4 1-------");
	
		u4=u1;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Pooja
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Satish
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Pooja
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
	}

}
