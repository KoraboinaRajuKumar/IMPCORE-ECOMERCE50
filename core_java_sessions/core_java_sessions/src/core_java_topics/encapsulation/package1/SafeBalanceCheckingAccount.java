package core_java_topics.encapsulation.package1;

public class SafeBalanceCheckingAccount {

	long sbca_acc_num = 987654321l;
	String sbca_cust_name = "Saba Naaz Siddiqui";
	String sbca_branch_name = "Raichur Branch";
	String address = "12-12-86/2b, Arab Mohalla, Haji Colony";
	String sbca_city = "Raichur City";
	double sbca_acc_balance = 752845.0d;
	long phone_number = 8618224203l;
	
	void displaySBCAAccInfo() {
		System.out.println("============= Account Details =================");
		System.out.println("Account Number : " + sbca_acc_num);
		System.out.println("Customer Name : " + sbca_cust_name);
		System.out.println("Branch Name : " + sbca_branch_name);
		System.out.println("Address : " + address);
		System.out.println("City : " + sbca_city);
		System.out.println("Account Balance : " + sbca_acc_balance);
		System.out.println("Phone Number : " + phone_number);
		
	}
	public static void main(String[] args) {
		
		SafeBalanceCheckingAccount account = new SafeBalanceCheckingAccount();
		account.displaySBCAAccInfo();
	}
}
