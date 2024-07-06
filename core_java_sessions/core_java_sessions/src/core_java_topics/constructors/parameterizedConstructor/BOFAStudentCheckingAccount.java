package core_java_topics.constructors.parameterizedConstructor;

public class BOFAStudentCheckingAccount {

	private long bsca_acc_num;
	private String bsca_cust_name;
	private String bsca_branch_name;
	private String bsca_city;
	private String mailing_address;
	private double minimum_deposit_amount;
	private double rate_of_interest;
	private String land_mark1;
	private String land_mark2;
	private String panCard;
	private double bsca_acc_balance;
	
	
	//parameterized constructor
	public BOFAStudentCheckingAccount(long bsca_acc_num, String bsca_cust_name, String bsca_branch_name,
			String bsca_city, String mailing_address, double minimum_deposit_amount, double rate_of_interest,
			String land_mark1, String land_mark2, String panCard, double bsca_acc_balance) {
		super();
		this.bsca_acc_num = bsca_acc_num;
		this.bsca_cust_name = bsca_cust_name;
		this.bsca_branch_name = bsca_branch_name;
		this.bsca_city = bsca_city;
		this.mailing_address = mailing_address;
		this.minimum_deposit_amount = minimum_deposit_amount;
		this.rate_of_interest = rate_of_interest;
		this.land_mark1 = land_mark1;
		this.land_mark2 = land_mark2;
		this.panCard = panCard;
		this.bsca_acc_balance = bsca_acc_balance;
	}
	
	public void displayBSCAInfo() {
		System.out.println("================ Account Details =====================");
		System.out.println("Account Number : " + bsca_acc_num);
		System.out.println("Customer Name : " + bsca_cust_name);
		System.out.println("Branch Name : " + bsca_branch_name);
		System.out.println("City : " + bsca_city);
		System.out.println("Mailing Address : " + mailing_address);
		System.out.println("Minimum Deposit Amount : " + minimum_deposit_amount);
		System.out.println("Rate Of Interest : " + rate_of_interest);
		System.out.println("Land Mark 1 : " + land_mark1);
		System.out.println("Land Mark 2 : " + land_mark2);
		System.out.println("Pan Card : " + panCard);
		System.out.println("Balance : " + bsca_acc_balance);
	}
}
