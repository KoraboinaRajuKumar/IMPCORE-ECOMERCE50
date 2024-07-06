package core_java_topics.serialization.aggregation;

import java.io.Serializable;

public class ContactDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String customer_name;
	String address;
	String city;
	String state;
	long ziCode;
	String country;
	public ContactDetails(String customer_name, String address, String city, String state, long ziCode,
			String country) {
		super();
		this.customer_name = customer_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.ziCode = ziCode;
		this.country = country;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public long getZiCode() {
		return ziCode;
	}
	public void setZiCode(long ziCode) {
		this.ziCode = ziCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "ContactDetails [customer_name=" + customer_name + ", address=" + address + ", city=" + city + ", state="
				+ state + ", ziCode=" + ziCode + ", country=" + country + "]";
	}
	
}
