package core_java_topics.classInJava;

public class IndividualRetirementAccount {

	//declare instance variable
	//syntax to declare instance variable
	//access_specifier data_type variable_name
	
	private long ira_acc_num;
	private String ira_acc_holder_name;
	private String ira_branch_name;
	private String ira_city;
	private double ira_acc_balance;
	
	//declare static variable
	public static String BANK_NAME = "Bank Of America";

	public long getIra_acc_num() {
		return ira_acc_num;
	}
	public void setIra_acc_num(long ira_acc_num) {
		this.ira_acc_num = ira_acc_num;
	}
	public String getIra_acc_holder_name() {
		return ira_acc_holder_name;
	}
	public void setIra_acc_holder_name(String ira_acc_holder_name) {
		this.ira_acc_holder_name = ira_acc_holder_name;
	}
	public String getIra_branch_name() {
		return ira_branch_name;
	}
	public void setIra_branch_name(String ira_branch_name) {
		this.ira_branch_name = ira_branch_name;
	}
	public String getIra_city() {
		return ira_city;
	}
	public void setIra_city(String ira_city) {
		this.ira_city = ira_city;
	}
	public double getIra_acc_balance() {
		return ira_acc_balance;
	}
	public void setIra_acc_balance(double ira_acc_balance) {
		this.ira_acc_balance = ira_acc_balance;
	}
	
	//declare local variable
	public void depositAmount(double dptAmt) {
		double after_deposit = ira_acc_balance + dptAmt;
		System.out.println("After depositing : " + dptAmt + " Your available balance is : " + after_deposit);
	}
	
	
}
