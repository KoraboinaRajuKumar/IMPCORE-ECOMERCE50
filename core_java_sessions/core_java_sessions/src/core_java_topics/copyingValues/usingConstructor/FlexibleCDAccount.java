package core_java_topics.copyingValues.usingConstructor;

public class FlexibleCDAccount {

	private long fda_acc_num;
	private String fda_cust_name;
	private String fda_branch_name;
	private String fda_city;
	private double fda_min_amount;
	private double rate_of_interest;
	private boolean isDepositAllowed;
	private double fda_amount;
	private int term;
	
	public FlexibleCDAccount(long fda_acc_num, String fda_cust_name, String fda_branch_name, String fda_city,
			double fda_min_amount, double rate_of_interest, boolean isDepositAllowed, double fda_amount, int term) {
		super();
		this.fda_acc_num = fda_acc_num;
		this.fda_cust_name = fda_cust_name;
		this.fda_branch_name = fda_branch_name;
		this.fda_city = fda_city;
		this.fda_min_amount = fda_min_amount;
		this.rate_of_interest = rate_of_interest;
		this.isDepositAllowed = isDepositAllowed;
		this.fda_amount = fda_amount;
		this.term = term;
	}
	
	public FlexibleCDAccount(FlexibleCDAccount accountObj) {
		fda_acc_num = accountObj.fda_acc_num;
		fda_cust_name = accountObj.fda_cust_name;
		fda_branch_name = accountObj.fda_branch_name;
		fda_city = accountObj.fda_city;
		fda_min_amount = accountObj.fda_min_amount;
		rate_of_interest = accountObj.rate_of_interest;
		isDepositAllowed = accountObj.isDepositAllowed;
		fda_amount = accountObj.fda_amount;
		term = accountObj.term;
	}
	
	public void displayFDAInfo() {
		System.out.println("================= Account Details =======================");
		System.out.println("Account Number : " + fda_acc_num);
		System.out.println("Customer Name : " + fda_cust_name);
		System.out.println("Branch Name : " + fda_branch_name);
		System.out.println("City : " + fda_city);
		System.out.println("Minimum Amount : " + fda_min_amount);
		System.out.println("Rate Of Interest : " + rate_of_interest);
		System.out.println("Is Deposit Allowed : " + isDepositAllowed);
		System.out.println("Amount : " + fda_amount);
		System.out.println("Term : " + term);
	}
}