package core_java_topics.variables.localVariable;

public class CurrentAccount {

	//declare instance variable
	//syntax to declare instance variable
	//access_specifier data_type variable_name
	private long ca_acc_num;
	private String ca_cust_name;
	private String branch_name;
	private String city;
	private double ca_acc_balance;
	
	public long getCa_acc_num() {
		return ca_acc_num;
	}
	public void setCa_acc_num(long ca_acc_num) {
		this.ca_acc_num = ca_acc_num;
	}
	public String getCa_cust_name() {
		return ca_cust_name;
	}
	public void setCa_cust_name(String ca_cust_name) {
		this.ca_cust_name = ca_cust_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getCa_acc_balance() {
		return ca_acc_balance;
	}
	public void setCa_acc_balance(double ca_acc_balance) {
		this.ca_acc_balance = ca_acc_balance;
	}
	
	//declare withdraw amount method
	public void withdrawAmount(double wthAmt) {
		double after_withdraw = ca_acc_balance - wthAmt;
		System.out.println("Update balance after withdraw : " + wthAmt + " is : " + after_withdraw);
	}
	//declare deposit amount method
	public void depositAmount(double dptAmt) {
		double after_deposit = ca_acc_balance + dptAmt;
		System.out.println("Update balance after deposit : " + dptAmt + " is : " + after_deposit);
	}
}
