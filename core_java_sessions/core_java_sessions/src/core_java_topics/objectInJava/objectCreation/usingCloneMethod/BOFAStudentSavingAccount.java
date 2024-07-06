package core_java_topics.objectInJava.objectCreation.usingCloneMethod;

public class BOFAStudentSavingAccount implements Cloneable{

	private long ssa_acc_num;
	private String ssa_stud_name;
	private String ssa_branch_name;
	private String ssa_city;
	private long ssn_num;
	private double ssa_available_balance;
	
	public long getSsa_acc_num() {
		return ssa_acc_num;
	}
	public void setSsa_acc_num(long ssa_acc_num) {
		this.ssa_acc_num = ssa_acc_num;
	}
	public String getSsa_stud_name() {
		return ssa_stud_name;
	}
	public void setSsa_stud_name(String ssa_stud_name) {
		this.ssa_stud_name = ssa_stud_name;
	}
	public String getSsa_branch_name() {
		return ssa_branch_name;
	}
	public void setSsa_branch_name(String ssa_branch_name) {
		this.ssa_branch_name = ssa_branch_name;
	}
	public String getSsa_city() {
		return ssa_city;
	}
	public void setSsa_city(String ssa_city) {
		this.ssa_city = ssa_city;
	}
	public long getSsn_num() {
		return ssn_num;
	}
	public void setSsn_num(long ssn_num) {
		this.ssn_num = ssn_num;
	}
	public double getSsa_available_balance() {
		return ssa_available_balance;
	}
	public void setSsa_available_balance(double ssa_available_balance) {
		this.ssa_available_balance = ssa_available_balance;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
