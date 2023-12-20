package COP_CAPSULATION;

public class EmpsTest {

	public static void main(String[] args) {
//		Employes e=new Employes();
//		e.setName("Ajay");
//		e.setId(1);
//		e.setCity("HYD");
//		e.setPerm(true);
//		
//		System.out.println(e.getName());
//		System.out.println(e.getId());
//		System.out.println(e.getCity());
//		System.out.println(e.isPerm());
		
		Employes e=new Employes("Ajay", 1, "HYD", true);
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getCity());
		System.out.println(e.isPerm());
		
		//User wants to update name and city
		
		e.setName("Ajay Devgn");
		e.setCity("MUMBAI");
		
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getCity());
		System.out.println(e.isPerm());
	}

}
