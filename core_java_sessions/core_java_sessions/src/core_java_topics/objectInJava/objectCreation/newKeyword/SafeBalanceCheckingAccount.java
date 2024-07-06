package core_java_topics.objectInJava.objectCreation.newKeyword;

public class SafeBalanceCheckingAccount {

	//declare instance variable
	//syntax to declare instance variable
	//access_specifier data_type variable_name
	
	private long sbca_acc_number;
	private String sbca_customer_name;
	private String sbca_branch_name;
	private String sbca_city_name;
	private long ssn_number;
	private double sbca_acc_balance;
	
	//setter methods to set the value of an object/variable
	//getter methods are to get the value of an object/variable
	public long getSbca_acc_number() {
		return sbca_acc_number;
	}
	public void setSbca_acc_number(long sbca_acc_number) {
		this.sbca_acc_number = sbca_acc_number;
	}
	public String getSbca_customer_name() {
		return sbca_customer_name;
	}
	public void setSbca_customer_name(String sbca_customer_name) {
		this.sbca_customer_name = sbca_customer_name;
	}
	public String getSbca_branch_name() {
		return sbca_branch_name;
	}
	public void setSbca_branch_name(String sbca_branch_name) {
		this.sbca_branch_name = sbca_branch_name;
	}
	public String getSbca_city_name() {
		return sbca_city_name;
	}
	public void setSbca_city_name(String sbca_city_name) {
		this.sbca_city_name = sbca_city_name;
	}
	public long getSsn_number() {
		return ssn_number;
	}
	public void setSsn_number(long ssn_number) {
		this.ssn_number = ssn_number;
	}
	public double getSbca_acc_balance() {
		return sbca_acc_balance;
	}
	public void setSbca_acc_balance(double sbca_acc_balance) {
		this.sbca_acc_balance = sbca_acc_balance;
	}
}
