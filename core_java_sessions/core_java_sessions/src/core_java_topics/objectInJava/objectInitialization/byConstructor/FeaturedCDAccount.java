package core_java_topics.objectInJava.objectInitialization.byConstructor;

public class FeaturedCDAccount {

	private long fda_acc_num;
	private String fda_acc_holder_name;
	private double minimum_opening_deposit;
	private double annual_percentage_yield;
	private boolean additional_deposit_allowed;
	private int term;
	private double amount;
	
	//declaring constructor
	public FeaturedCDAccount(long fda_acc_num,String fda_acc_holder_name,double minimum_opening_deposit,
			double annual_percentage_yield,boolean additional_deposit_allowed, int term,double amount ) {
		this.fda_acc_num = fda_acc_num;
		this.fda_acc_holder_name = fda_acc_holder_name;
		this.minimum_opening_deposit = minimum_opening_deposit;
		this.annual_percentage_yield = annual_percentage_yield;
		this.additional_deposit_allowed = additional_deposit_allowed;
		this.term = term;
		this.amount = amount;
	}
	//declare method to display account info
	public void displayFDAACCInfo() {
		System.out.println("================ Account Details ===================");
		System.out.println("Account Number : " + fda_acc_num);
		System.out.println("Accoungt Holder Name : " + fda_acc_holder_name);
		System.out.println("Minimum Opening Deposit : " + minimum_opening_deposit);
		System.out.println("Annual Percentage Yield : " + annual_percentage_yield);
		System.out.println("Additional Deposit Allowed : " + additional_deposit_allowed);
		System.out.println("Term : " + term);
		System.out.println("Amount : " + amount);
	}
}
