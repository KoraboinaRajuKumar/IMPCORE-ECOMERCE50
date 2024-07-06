package core_java_topics.keywords.thisKeyword.thisKeywordConstrcutorChaining;

public class PersonalLoan {

	long loan_id;
	long loan_number;
	String applicant_name;
	String mailing_address;
	String loan_type;
	String address;
	int tenure;
	double rate_of_interest;
	double loan_amount;
	double processing_fee;
	
	public PersonalLoan(long loan_id, long loan_number, String applicant_name, String mailing_address, String loan_type,
			String address, int tenure, double rate_of_interest, double loan_amount) {
		super();
		this.loan_id = loan_id;
		this.loan_number = loan_number;
		this.applicant_name = applicant_name;
		this.mailing_address = mailing_address;
		this.loan_type = loan_type;
		this.address = address;
		this.tenure = tenure;
		this.rate_of_interest = rate_of_interest;
		this.loan_amount = loan_amount;
	}

	public PersonalLoan(long loan_id, long loan_number, String applicant_name, String mailing_address, String loan_type,
			String address, int tenure, double rate_of_interest, double loan_amount, double processing_fee) {
		this(loan_id, loan_number, applicant_name, mailing_address, loan_type, address, tenure, rate_of_interest, loan_amount);
		this.loan_id = loan_id;
		this.loan_number = loan_number;
		this.applicant_name = applicant_name;
		this.mailing_address = mailing_address;
		this.loan_type = loan_type;
		this.address = address;
		this.tenure = tenure;
		this.rate_of_interest = rate_of_interest;
		this.loan_amount = loan_amount;
		this.processing_fee = processing_fee;
	}
	
	public void displayLoanDetails() {
		System.out.println("=============================== Loan Details ================================");
		System.out.println("Loan Id : " + loan_id);
		System.out.println("Loan Number : " + loan_number);
		System.out.println("Applicant Name : " + applicant_name);
		System.out.println("Mailing Address : " + mailing_address);
		System.out.println("Loan Type : " + loan_type);
		System.out.println("Address : " + address);
		System.out.println("Tenure : " + tenure);
		System.out.println("Rate Of Interest : " + rate_of_interest);
		System.out.println("Loan Amount : " + loan_amount);
		System.out.println("Processing Fee : " + processing_fee);
	}
}
