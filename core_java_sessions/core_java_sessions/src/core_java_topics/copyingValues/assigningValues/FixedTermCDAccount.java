package core_java_topics.copyingValues.assigningValues;

public class FixedTermCDAccount {
	// declare instance variable
	private long fta_acc_number;
	private String fta_cust_name;
	private double minimum_balance;
	private String fta_branch_name;
	private String fta_city;
	private int term_tenure;
	private double fta_fixed_term_amount;
	private double rate_of_interest;

	public long getFta_acc_number() {
		return fta_acc_number;
	}
	public void setFta_acc_number(long fta_acc_number) {
		this.fta_acc_number = fta_acc_number;
	}
	public String getFta_cust_name() {
		return fta_cust_name;
	}
	public void setFta_cust_name(String fta_cust_name) {
		this.fta_cust_name = fta_cust_name;
	}
	public double getMinimum_balance() {
		return minimum_balance;
	}
	public void setMinimum_balance(double minimum_balance) {
		this.minimum_balance = minimum_balance;
	}
	public String getFta_branch_name() {
		return fta_branch_name;
	}
	public void setFta_branch_name(String fta_branch_name) {
		this.fta_branch_name = fta_branch_name;
	}
	public String getFta_city() {
		return fta_city;
	}
	public void setFta_city(String fta_city) {
		this.fta_city = fta_city;
	}
	public int getTerm_tenure() {
		return term_tenure;
	}
	public void setTerm_tenure(int term_tenure) {
		this.term_tenure = term_tenure;
	}
	public double getFta_fixed_term_amount() {
		return fta_fixed_term_amount;
	}
	public void setFta_fixed_term_amount(double fta_fixed_term_amount) {
		this.fta_fixed_term_amount = fta_fixed_term_amount;
	}
	public double getRate_of_interest() {
		return rate_of_interest;
	}
	public void setRate_of_interest(double rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}

	// declare method to display FTA Account Details
	public void displayFTAAccInfo() {
		System.out.println("================= Account Details ======================");
		System.out.println("Account Number : " + fta_acc_number);
		System.out.println("Customer Name : " + fta_cust_name);
		System.out.println("Minimum Balance : " + minimum_balance);
		System.out.println("Branch Name : " + fta_branch_name);
		System.out.println("City : " + fta_city);
		System.out.println("Term Tenure : " + term_tenure);
		System.out.println("Fixed Term Amount : " + fta_fixed_term_amount);
		System.out.println("Rate Of Interest : " + rate_of_interest);
	}
}
