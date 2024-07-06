package core_java_topics.inheritance.multilevelInheritance;

public class CheckingAccount extends BankAccount{

	private double overDraftLimit;

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	public void displayCheckingInfo() {
		super.displayBankInfo();
		System.out.println("Over Draft Limit : " + overDraftLimit);
	}
}
