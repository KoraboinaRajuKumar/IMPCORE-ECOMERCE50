package core_java_topics.inheritance.aggregation;

public class SavingAccount {

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
	
	public void displayProfileDetails() {
		System.out.println("======================== Account Profile Details =================");
		System.out.println("Account Number : " + sa_acc_num);
		System.out.println("Customer Name : " + sa_cust_name);
		System.out.println("Branch Name : " + sa_branch_name);
		System.out.println("Account Balance : " + sa_acc_balance);
		System.out.println("======================== Contact Details =========================");
		System.out.println(details);
	}
}

