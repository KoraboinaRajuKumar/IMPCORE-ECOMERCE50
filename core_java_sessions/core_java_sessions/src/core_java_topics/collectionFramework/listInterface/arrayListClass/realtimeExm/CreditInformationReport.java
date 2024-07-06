package core_java_topics.collectionFramework.listInterface.arrayListClass.realtimeExm;

public class CreditInformationReport {

	private String cust_name;
	private long registered_mobile_number;
	private String address;
	private String email_id;
	private String account_type;
	private String account_number;
	private String ownership;
	private double credit_limit;
	private double cash_limit;
	private double disb_amount;
	private double writeOff_amount;
	private double principal_writeOff_amount;
	
	public CreditInformationReport(String cust_name, long registered_mobile_number, String address, String email_id,
			String account_type, String account_number, String ownership, double credit_limit, double cash_limit,
			double disb_amount, double writeOff_amount, double principal_writeOff_amount) {
		super();
		this.cust_name = cust_name;
		this.registered_mobile_number = registered_mobile_number;
		this.address = address;
		this.email_id = email_id;
		this.account_type = account_type;
		this.account_number = account_number;
		this.ownership = ownership;
		this.credit_limit = credit_limit;
		this.cash_limit = cash_limit;
		this.disb_amount = disb_amount;
		this.writeOff_amount = writeOff_amount;
		this.principal_writeOff_amount = principal_writeOff_amount;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public long getRegistered_mobile_number() {
		return registered_mobile_number;
	}
	public void setRegistered_mobile_number(long registered_mobile_number) {
		this.registered_mobile_number = registered_mobile_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getOwnership() {
		return ownership;
	}
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}
	public double getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(double credit_limit) {
		this.credit_limit = credit_limit;
	}
	public double getCash_limit() {
		return cash_limit;
	}
	public void setCash_limit(double cash_limit) {
		this.cash_limit = cash_limit;
	}
	public double getDisb_amount() {
		return disb_amount;
	}
	public void setDisb_amount(double disb_amount) {
		this.disb_amount = disb_amount;
	}
	public double getWriteOff_amount() {
		return writeOff_amount;
	}
	public void setWriteOff_amount(double writeOff_amount) {
		this.writeOff_amount = writeOff_amount;
	}
	public double getPrincipal_writeOff_amount() {
		return principal_writeOff_amount;
	}
	public void setPrincipal_writeOff_amount(double principal_writeOff_amount) {
		this.principal_writeOff_amount = principal_writeOff_amount;
	}
	@Override
	public String toString() {
		return "CreditInformationReport [cust_name=" + cust_name + ", registered_mobile_number="
				+ registered_mobile_number + ", address=" + address + ", email_id=" + email_id + ", account_type="
				+ account_type + ", account_number=" + account_number + ", ownership=" + ownership + ", credit_limit="
				+ credit_limit + ", cash_limit=" + cash_limit + ", disb_amount=" + disb_amount + ", writeOff_amount="
				+ writeOff_amount + ", principal_writeOff_amount=" + principal_writeOff_amount + "]";
	}
}
