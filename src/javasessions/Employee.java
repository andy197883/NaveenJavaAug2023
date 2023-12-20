package javasessions;

public class Employee {
	
	// Session SEP-11
	
	String name;
	int empid;
	String dept;
	boolean isPerm;
	double salary;
	
	
	public static void main(String[] args) {
		
		int i=10;
		System.out.println(i);
		Employee e1=new Employee ();
		
		e1.name="Andrew";
		e1.empid=123;
		e1.dept="HR";
		e1.isPerm= true;
		e1.salary=23.3;
		System.out.println(e1.name);
		System.out.println(e1.empid);
		System.out.println(e1.dept);
		System.out.println(e1.isPerm);
		System.out.println(e1.salary);
		
		Employee e2=new Employee ();
		e2.name="Raj";
		e2.empid=3;
		
		
		new Employee().name="red";//No Ref object
		
		Employee e3=new Employee();
		//e3=null;
		//e3.name="RAJESH";//NPE
	}
	
	

}
