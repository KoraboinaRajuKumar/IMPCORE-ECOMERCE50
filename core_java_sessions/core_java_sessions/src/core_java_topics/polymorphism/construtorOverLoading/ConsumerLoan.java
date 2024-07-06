package core_java_topics.polymorphism.construtorOverLoading;
//this is an example of constructor overloading 
public class ConsumerLoan {

	private long loan_num;
	private String applicant_name;
	private double loan_amount;
	private String disbursal_date;
	private int tenure;
	private double rate_of_interest;
	private String loan_type;
	private String bank_name;
	private double processing_fee;
	
	
	public ConsumerLoan(long loan_num, String applicant_name, double loan_amount, String disbursal_date, int tenure,
			double rate_of_interest, String loan_type, String bank_name) {
		super();
		this.loan_num = loan_num;
		this.applicant_name = applicant_name;
		this.loan_amount = loan_amount;
		this.disbursal_date = disbursal_date;
		this.tenure = tenure;
		this.rate_of_interest = rate_of_interest;
		this.loan_type = loan_type;
		this.bank_name = bank_name;
	}

	public ConsumerLoan(long loan_num, String applicant_name, double loan_amount, String disbursal_date, int tenure,
			double rate_of_interest, String loan_type, String bank_name, double processing_fee) {
		super();
		this.loan_num = loan_num;
		this.applicant_name = applicant_name;
		this.loan_amount = loan_amount;
		this.disbursal_date = disbursal_date;
		this.tenure = tenure;
		this.rate_of_interest = rate_of_interest;
		this.loan_type = loan_type;
		this.bank_name = bank_name;
		this.processing_fee = processing_fee;
	}


	public void displayLoanInfo() {
		System.out.println("========== Loan Details =====================");
		System.out.println("Loan Number : " + loan_num);
		System.out.println("Applicant Name : " + applicant_name);
		System.out.println("Loan Amount : " + loan_amount);
		System.out.println("Disbursal Date : " + disbursal_date);
		System.out.println("Tenire : " + tenure);
		System.out.println("Rate Of interest : " + rate_of_interest);
		System.out.println("Loan Type : " + loan_type);
		System.out.println("Bank Name : " + bank_name);
		System.out.println("Processing Fee : " + processing_fee);
	}
}
