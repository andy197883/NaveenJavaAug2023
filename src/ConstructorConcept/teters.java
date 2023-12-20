package ConstructorConcept;

public class teters {
	
	String name;
	String email;
	int userId;
	String dob;
	String city;
	public teters(String name) {

		this.name = name;
	}
	public teters(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public teters(String name, int userId) {
		super();
		this.name = name;
		this.userId = userId;
	}
	
	  

}
