package core_java_topics.inheritance.singleLevelInheritance;

public class CreditCard {

	private long cc_number;
	private String cc_holder_name;
	private String expiry_date;
	private double cc_limit;
	private int cvvNumber;
	private int pinNumber;
	
	public long getCc_number() {
		return cc_number;
	}
	public void setCc_number(long cc_number) {
		this.cc_number = cc_number;
	}
	public String getCc_holder_name() {
		return cc_holder_name;
	}
	public void setCc_holder_name(String cc_holder_name) {
		this.cc_holder_name = cc_holder_name;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public double getCc_limit() {
		return cc_limit;
	}
	public void setCc_limit(double cc_limit) {
		this.cc_limit = cc_limit;
	}
	public int getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
}
