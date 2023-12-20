package OOP_Interface;

public class TestHospital {
	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.ENTServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.gynoServices();
		
		fh.medicalTraining();
		fh.medicalInsurance();
		
		//USMedical us = new USMedical();
		//System.out.println("---TEST MINFEE---");
		System.out.println(USMedical.min_fee);//10
		//System.out.println("---TEST MINFEE-FH CLASS--");
		System.out.println(FortisHospital.min_fee);
		//System.out.println("---TEST MINFEE-FH OBJECT--");
		//System.out.println(fh.min_fee);
		//System.out.println(FortisHospital.min_fee);//50
		
		USMedical.billing();
		
		//FortisHospital.billing();
		
		fh.medicalNewsPublish();
		System.out.println("---COVID VACCINATION--");
	    fh.covidVaccination();
		
		//top casting: child class object can be referred by parent interface ref variable
		
		System.out.println("------");
		USMedical us = new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.pediaServices();
		us.emergencyServices();
			
		System.out.println("---UK---");
		UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.orthoServices();
		uk.emergencyServices();
		
		
		System.out.println("---UK-END--");
		//down casting: NA
		//FortisHospital fh1 = new USMedical();
		
		
		//
	
		
		
		
		
	}

}
