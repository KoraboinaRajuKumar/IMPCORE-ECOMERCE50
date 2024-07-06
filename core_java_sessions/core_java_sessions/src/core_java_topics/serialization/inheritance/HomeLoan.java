package core_java_topics.serialization.inheritance;

import java.io.Serializable;

public class HomeLoan extends Loan{

	private static final long serialVersionUID = 1L;
	private long loan_number;
	private String applicant_name;
	private String address_line1;
	private String address_line2;
	private long zipCode;
	private String panCard;
	private String city;
	private String state;
	private double loan_amount;
	private double roi;
	
	
	public HomeLoan(long loan_id, String loan_type, String bank_name,long loan_number, String applicant_name, String address_line1, String address_line2, long zipCode,
			String panCard, String city, String state, double loan_amount, double roi) {
		super(loan_id, loan_type, bank_name);
		this.loan_number = loan_number;
		this.applicant_name = applicant_name;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.zipCode = zipCode;
		this.panCard = panCard;
		this.city = city;
		this.state = state;
		this.loan_amount = loan_amount;
		this.roi = roi;
	}
	public long getLoan_number() {
		return loan_number;
	}
	public void setLoan_number(long loan_number) {
		this.loan_number = loan_number;
	}
	public String getApplicant_name() {
		return applicant_name;
	}
	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}
	public String getAddress_line1() {
		return address_line1;
	}
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
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
	public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	
	
}
