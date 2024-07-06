package core_java_topics.variables.staticVariable;

public class CertificateOfDepositAccount {

	//declare instance variable
	//syntax to declare instance variable
	//access_specifier data_type variable_name
	
	private long cda_acc_num;
	private String cda_cust_name;
	private String cda_branch_name;
	private String cda_city;
	private double cda_acc_balance;
	//declare static variable
	public static String BANK_NAME = "Bank Of America";
	
	public long getCda_acc_num() {
		return cda_acc_num;
	}
	public void setCda_acc_num(long cda_acc_num) {
		this.cda_acc_num = cda_acc_num;
	}
	public String getCda_cust_name() {
		return cda_cust_name;
	}
	public void setCda_cust_name(String cda_cust_name) {
		this.cda_cust_name = cda_cust_name;
	}
	public String getCda_branch_name() {
		return cda_branch_name;
	}
	public void setCda_branch_name(String cda_branch_name) {
		this.cda_branch_name = cda_branch_name;
	}
	public String getCda_city() {
		return cda_city;
	}
	public void setCda_city(String cda_city) {
		this.cda_city = cda_city;
	}
	public double getCda_acc_balance() {
		return cda_acc_balance;
	}
	public void setCda_acc_balance(double cda_acc_balance) {
		this.cda_acc_balance = cda_acc_balance;
	}
	
}
