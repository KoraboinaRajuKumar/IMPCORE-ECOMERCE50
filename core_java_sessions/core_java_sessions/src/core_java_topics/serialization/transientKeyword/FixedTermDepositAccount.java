package core_java_topics.serialization.transientKeyword;

import java.io.Serializable;

public class FixedTermDepositAccount implements Serializable{

	private static final long serialVersionUID = 1L;
	private long fd_acc_number;
	private String fd_cust_name;
	private String fd_branch_name;
	private String fd_city;
	private transient String fd_state;
	private transient long mobile_number;
	private transient double rate_of_interest;
	private double fd_amount;
	public FixedTermDepositAccount(long fd_acc_number, String fd_cust_name, String fd_branch_name, String fd_city,
			String fd_state, long mobile_number, double rate_of_interest, double fd_amount) {
		super();
		this.fd_acc_number = fd_acc_number;
		this.fd_cust_name = fd_cust_name;
		this.fd_branch_name = fd_branch_name;
		this.fd_city = fd_city;
		this.fd_state = fd_state;
		this.mobile_number = mobile_number;
		this.rate_of_interest = rate_of_interest;
		this.fd_amount = fd_amount;
	}
	public long getFd_acc_number() {
		return fd_acc_number;
	}
	public void setFd_acc_number(long fd_acc_number) {
		this.fd_acc_number = fd_acc_number;
	}
	public String getFd_cust_name() {
		return fd_cust_name;
	}
	public void setFd_cust_name(String fd_cust_name) {
		this.fd_cust_name = fd_cust_name;
	}
	public String getFd_branch_name() {
		return fd_branch_name;
	}
	public void setFd_branch_name(String fd_branch_name) {
		this.fd_branch_name = fd_branch_name;
	}
	public String getFd_city() {
		return fd_city;
	}
	public void setFd_city(String fd_city) {
		this.fd_city = fd_city;
	}
	public String getFd_state() {
		return fd_state;
	}
	public void setFd_state(String fd_state) {
		this.fd_state = fd_state;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public double getRate_of_interest() {
		return rate_of_interest;
	}
	public void setRate_of_interest(double rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}
	public double getFd_amount() {
		return fd_amount;
	}
	public void setFd_amount(double fd_amount) {
		this.fd_amount = fd_amount;
	}
	
	
}
