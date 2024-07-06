package core_java_topics.keywords.thisKeyword.thisKeywordConstrcutorChaining;

public class PersonalLoanDetails {

	public static void main(String[] args) {
		PersonalLoan loan1 = new PersonalLoan(111111111l, 123456789l, "Mohammed Kamran","kamran@gmail.com", "Personal Loan","12-12-86/2b,Arab Mohalla, Raichur", 
				10, 10.75, 1000000.0d);
		PersonalLoan loan2 = new PersonalLoan(222222222l, 987654321l, "Saba Naaz Siddiqui", "saba@gmail.com", "Personal Loan", "12-12-86/2b,Arab Mohalla, Raichur",
				5, 12.75, 300000.0d, 3500.0d);
		
		loan1.displayLoanDetails();
		loan2.displayLoanDetails();
	}

}
