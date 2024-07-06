package core_java_topics.serialization.inheritance;

import java.io.Serializable;

public class Loan implements Serializable{

	private static final long serialVersionUID = 1L;
	private long loan_id;
	private String loan_type;
	private String bank_name;
	public Loan() {}
	public Loan(long loan_id, String loan_type, String bank_name) {
		super();
		this.loan_id = loan_id;
		this.loan_type = loan_type;
		this.bank_name = bank_name;
	}
	public long getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(long loan_id) {
		this.loan_id = loan_id;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	@Override
	public String toString() {
		return "Loan [loan_id=" + loan_id + ", loan_type=" + loan_type + ", bank_name=" + bank_name + "]";
	}
	

}
