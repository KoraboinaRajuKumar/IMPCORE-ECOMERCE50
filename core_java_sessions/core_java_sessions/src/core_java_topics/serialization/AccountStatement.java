package core_java_topics.serialization;

import java.io.Serializable;

public class AccountStatement implements Serializable{

	private static final long serialVersionUID = 1L;
	private long cust_id;
	private long acc_number;
	private String cust_name;
	private String account_branch;
	private String address;
	private String state;
	private String city;
	private long phone_number;
	private String email_address;
	private String account_status;
	private long ifsc_code;
	private int branch_code;
	public AccountStatement(long cust_id, long acc_number, String cust_name, String account_branch, String address,
			String state, String city, long phone_number, String email_address, String account_status, long ifsc_code,
			int branch_code) {
		super();
		this.cust_id = cust_id;
		this.acc_number = acc_number;
		this.cust_name = cust_name;
		this.account_branch = account_branch;
		this.address = address;
		this.state = state;
		this.city = city;
		this.phone_number = phone_number;
		this.email_address = email_address;
		this.account_status = account_status;
		this.ifsc_code = ifsc_code;
		this.branch_code = branch_code;
	}
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}
	public long getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(long acc_number) {
		this.acc_number = acc_number;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getAccount_branch() {
		return account_branch;
	}
	public void setAccount_branch(String account_branch) {
		this.account_branch = account_branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getAccount_status() {
		return account_status;
	}
	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	public long getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(long ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public int getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(int branch_code) {
		this.branch_code = branch_code;
	}
	
	
}
