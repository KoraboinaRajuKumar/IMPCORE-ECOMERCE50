package core_java_topics.variables.instanceVariable;

public class SavingAccount {

	//declaring instance variable
	//syntax to declare instance variable
	//access_specifier data_type variable_name
	
	private long acc_num;
	private String branch_name;
	private String cust_name;
	private String city;
	private String state;
	private double acc_balance;
	//setters methods to set the value for object/variable
	//getters methods to get the value of an object/variable
	public long getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	
	
	
}
