package javasessions;

public class IfElseConcept {
// Session on AUG-28
//nested if else 	
	public static void main(String[] args) {
		
		int marks=-101;
		if (marks>100 || marks<0)
		{
			System.out.println("Marks entered is incorrect or not valid");
			
		}
		else
		{
		if (marks>=90) {
			System.out.println("GRADE A");
			if (marks==100)
			{
				System.out.println("Eligible for Scholarship");
			}
		}
		
		else {
			System.out.println(" less than 90 marks");
			if (marks>=80)
			{
				System.out.println("  GRADE B");
			}
			else {
				System.out.println(" less than 80 marks");
				if (marks>=70)
				{
					System.out.println("  GRADE C");
				}
				
			}
		}
		
	}
	}
}