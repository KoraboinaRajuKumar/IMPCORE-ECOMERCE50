package core_java_topics.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LoanDetails {

	public static void main(String[] args) {
		try {
			//serialization of Loan and HomeLoan objects
				/*HomeLoan loan = new HomeLoan(123456789l, "HOme Loan", "Hdfc Bank", 6745760l, "Mohammed Kamran","Haji Colony","Arab Mohalla", 584101l, 
				"BIIPK0365D", "Raichur City", "Karnataka", 3500000.0d, 10.10d);
				ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("C:\\iopackages\\loanDetails.txt"));
				oout.writeObject(loan);
				oout.close();
				System.out.println("Loan Details serialized successfully....");*/
				
			//deserialization
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\iopackages\\loanDetails.txt"));
				HomeLoan loan1 = (HomeLoan) ois.readObject();
				System.out.println("================ Loan Details ===================");
				System.out.println("Loan Id : " + loan1.getLoan_id());
				System.out.println("Loan Type : " + loan1.getLoan_type());
				System.out.println("Bank Name : " + loan1.getBank_name());
				System.out.println("Loan number : " + loan1.getLoan_number());
				System.out.println("Applicant Name : " + loan1.getApplicant_name());
				System.out.println("Address Line 1 : " + loan1.getAddress_line1());
				System.out.println("Address Line 2 : " + loan1.getAddress_line2());
				System.out.println("Zip Code : " + loan1.getZipCode());
				System.out.println("Pan Card : " + loan1.getPanCard());
				System.out.println("City : " + loan1.getCity());
				System.out.println("State : " + loan1.getState());
				System.out.println("Loan Amount : " + loan1.getLoan_amount());
				System.out.println("Rate Of Interest : " + loan1.getRoi());
				ois.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
