package ConstructorConcept;

public class Employee {
	
	String name;
	int id;
	double salary;
	
	//public Employee( ){
	//	System.out.println("TRE");
	//}
	
	public Employee(String name1) {
	name = name1;//this.G = L
	}
	
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void test() { //NS - create the object
		System.out.println("test method");
	}
	
	
	public static void main(String[] args) {

		Employee e11 = new Employee("ABC");
		System.out.println(e11.name+"  "+e11.id +"  "+e11.salary);
		
		
		Employee e1 = new Employee("Kiran",1);
		e1.salary=12.33;
		System.out.println(e1.name+"  "+e1.id +"  "+e1.salary);
		
		Employee e3 = new Employee("Rahul", 201, 23.44);
		System.out.println(e3.name + " " + e3.id + " " + e3.salary);
		
		
		//Employee e4 = new Employee();
		//Employee e4 = new Employee(null, 0, 0.0);
		//new Employee();
		/*
		Employee e1 = new Employee("Tom");
		e1.test();
				
		System.out.println(e1.name);
		System.out.println(e1.name + " " + e1.id + " " + e1.salary);


		Employee e2 = new Employee("Kiran", 200);
		e2.salary = 45.55;
		e2.name = "Kiran Automation";
		System.out.println(e2.name + " " + e2.id + " " + e2.salary);
		
		
		
		*/

	}



}
