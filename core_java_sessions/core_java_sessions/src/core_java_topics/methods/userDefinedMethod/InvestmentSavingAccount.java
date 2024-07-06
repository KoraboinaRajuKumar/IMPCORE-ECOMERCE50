package core_java_topics.methods.userDefinedMethod;

public class InvestmentSavingAccount {

	private long isa_acc_num;
	private String isa_cust_name;
	private String isa_branch_name;
	private String isa_city;
	private long zipCode;
	private String state;
	private String mailing_address;
	private String land_mark1;
	private String land_mark2;
	private double isa_acc_balance;
	private int pinNumber;
	public long getIsa_acc_num() {
		return isa_acc_num;
	}
	public void setIsa_acc_num(long isa_acc_num) {
		this.isa_acc_num = isa_acc_num;
	}
	public String getIsa_cust_name() {
		return isa_cust_name;
	}
	public void setIsa_cust_name(String isa_cust_name) {
		this.isa_cust_name = isa_cust_name;
	}
	public String getIsa_branch_name() {
		return isa_branch_name;
	}
	public void setIsa_branch_name(String isa_branch_name) {
		this.isa_branch_name = isa_branch_name;
	}
	public String getIsa_city() {
		return isa_city;
	}
	public void setIsa_city(String isa_city) {
		this.isa_city = isa_city;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMailing_address() {
		return mailing_address;
	}
	public void setMailing_address(String mailing_address) {
		this.mailing_address = mailing_address;
	}
	public String getLand_mark1() {
		return land_mark1;
	}
	public void setLand_mark1(String land_mark1) {
		this.land_mark1 = land_mark1;
	}
	public String getLand_mark2() {
		return land_mark2;
	}
	public void setLand_mark2(String land_mark2) {
		this.land_mark2 = land_mark2;
	}
	public double getIsa_acc_balance() {
		return isa_acc_balance;
	}
	public void setIsa_acc_balance(double isa_acc_balance) {
		this.isa_acc_balance = isa_acc_balance;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	//user defined method to change PIN number
	public void changePin(int pin_num) {
		if(pinNumber == 1234) {
			System.out.println("You have updated your pin successfully : 8956");
		}else {
			System.out.println("The PIN number which you have entered is wrong.. Please try again");
		}
	}
	//user defined method to deposit amount
	public void depositAmount(double dptAmt) {
		double after_deposit = isa_acc_balance + dptAmt;
		System.out.println("After Depositing : " + dptAmt + " Your updated balance is : " + after_deposit);
	}
	
	//user defined method to withdraw amount
	public void withdrawAmount(double wthAmt) {
		double after_withdraw = isa_acc_balance - wthAmt;
		System.out.println("After withdrawing : " + wthAmt + " Your updated balance is : " + after_withdraw);
	}
	
	//user defined method to get last 5 transactions
	public void getLast5Transactions(long account_number){
		if(account_number == 123456789) {
			System.out.println("================== Last 5 Transactions ======================");
			System.out.println("6000 credited on 01-05-2024");
			System.out.println("8320 debited on 04-05-2024");
			System.out.println("300 credited on 06-05-2024");
			System.out.println("1200 debited on 07-05-2024");
			System.out.println("7500 credited on 08-05-2024");
		}else if(account_number == 987654321) {
			System.out.println("================== Last 5 Transactions ======================");
			System.out.println("5300 credited on 02-05-2024");
			System.out.println("1300 debited on 03-05-2024");
			System.out.println("4200 credited on 06-05-2024");
			System.out.println("500 debited on 06-05-2024");
			System.out.println("100 credited on 07-05-2024");
		}else {
			System.out.println("You have entered wrong account number.... Please try again....");
		}
	}
}