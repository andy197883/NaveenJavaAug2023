package javasessions;

public class IfElseConcepts {
	//Session AUG-28
	public static void main(String[] args) {
		int marks=0;
		if (marks>100 | marks<=0) {
			System.out.println("incorrect marks");
			
			
		}
		
		else
		{
		if (marks>=90) {
			System.out.println("GRADE A");
			
			if (marks==100)
			{
				System.out.println("You are Eligible for Scholarship");	
			}
		}
		else
		{
			System.out.println("less than 90 marks");
			if (marks>=80)
			{
				System.out.println("GRADE B");	
			}
			else {
				System.out.println("less than 80 marks");
				
			}
			if  (marks>=70) {
				System.out.println("GRADE C");	
			}
		}

	}
	}

}
