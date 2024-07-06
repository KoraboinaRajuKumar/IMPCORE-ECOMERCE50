package core_java_topics.serialization.aggregation;

import java.io.Serializable;

public class SavingAccount implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	long sa_acc_num;
	String sa_branch_name;
	String sa_cust_name;
	double sa_acc_balance;
	 //HAS-A relationship with ContactDetails class
	 ContactDetails details;
	public SavingAccount(long sa_acc_num, String sa_branch_name, String sa_cust_name, double sa_acc_balance,
			ContactDetails details) {
		super();
		this.sa_acc_num = sa_acc_num;
		this.sa_branch_name = sa_branch_name;
		this.sa_cust_name = sa_cust_name;
		this.sa_acc_balance = sa_acc_balance;
		this.details = details;
	}
	public long getSa_acc_num() {
		return sa_acc_num;
	}
	public void setSa_acc_num(long sa_acc_num) {
		this.sa_acc_num = sa_acc_num;
	}
	public String getSa_branch_name() {
		return sa_branch_name;
	}
	public void setSa_branch_name(String sa_branch_name) {
		this.sa_branch_name = sa_branch_name;
	}
	public String getSa_cust_name() {
		return sa_cust_name;
	}
	public void setSa_cust_name(String sa_cust_name) {
		this.sa_cust_name = sa_cust_name;
	}
	public double getSa_acc_balance() {
		return sa_acc_balance;
	}
	public void setSa_acc_balance(double sa_acc_balance) {
		this.sa_acc_balance = sa_acc_balance;
	}
	public ContactDetails getDetails() {
		return details;
	}
	public void setDetails(ContactDetails details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "SavingAccount [sa_acc_num=" + sa_acc_num + ", sa_branch_name=" + sa_branch_name + ", sa_cust_name="
				+ sa_cust_name + ", sa_acc_balance=" + sa_acc_balance + ", details=" + details + "]";
	}
	
	
}

