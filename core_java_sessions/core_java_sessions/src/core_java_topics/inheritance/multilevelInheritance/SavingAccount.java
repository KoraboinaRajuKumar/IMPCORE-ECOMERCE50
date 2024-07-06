package core_java_topics.inheritance.multilevelInheritance;

public class SavingAccount extends BankAccount{

	private double interest_rate;

	public double getInterest_rate() {
		return interest_rate;
	}

	public void setInterest_rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}
	
	public void displaySavingInfo() {
		super.displayBankInfo();
		System.out.println("Interest Rate : " + interest_rate);
	}
}
