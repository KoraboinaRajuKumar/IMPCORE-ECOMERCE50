package core_java_topics.constructors.defaultConstructor;
public class SavingIndividualRetirementAccount {

	private long cust_id;
	private long sra_acc_num;
	private char gender;
	private String sra_holder_name;
	private String sra_branch_name;
	private String password;
	private double sra_acc_balance;
	private boolean isAccountActive;
	private int org_id;
	private String facilty_sk;
	private float rate_of_interest;
	
	//no-arg/default constructor
	public SavingIndividualRetirementAccount() {
		System.out.println("This is a default/no-arg constructor");
	}
	public void displaySRAInfo() {
		System.out.println("========================= Account Details =====================");
		System.out.println("Customer Id : " + cust_id);
		System.out.println("Account Number : " + sra_acc_num);
		System.out.println("Gender : " + gender);
		System.out.println("Customer Name : " + sra_holder_name);
		System.out.println("Branch Name : " + sra_branch_name);
		System.out.println("Password : " + password);
		System.out.println("Account Balance : " + sra_acc_balance);
		System.out.println("Is Account Active : " + isAccountActive);
		System.out.println("Organisation Id : " + org_id);
		System.out.println("Facility SK : " + facilty_sk);
		System.out.println("Rate Of Interest : " + rate_of_interest);
	}
	public static void main(String[] args) {
		SavingIndividualRetirementAccount account1 = new SavingIndividualRetirementAccount();
		SavingIndividualRetirementAccount account2 = new SavingIndividualRetirementAccount();
		SavingIndividualRetirementAccount account3 = new SavingIndividualRetirementAccount();
		
		account1.displaySRAInfo();
		account2.displaySRAInfo();
		account3.displaySRAInfo();
	}
}
