package core_java_topics.inheritance.problem;

public class GoldLoan {

	private long loan_number;
	private String applicant_name;
	private String disbursal_date;
	private String address;
	private double rate_of_interest;
	private double loan_amount;
	private String feature;
	
	public long getLoan_number() {
		return loan_number;
	}
	public void setLoan_number(long loan_number) {
		this.loan_number = loan_number;
	}
	public String getApplicant_name() {
		return applicant_name;
	}
	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}
	public String getDisbursal_date() {
		return disbursal_date;
	}
	public void setDisbursal_date(String disbursal_date) {
		this.disbursal_date = disbursal_date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getRate_of_interest() {
		return rate_of_interest;
	}
	public void setRate_of_interest(double rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}
	public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
}
