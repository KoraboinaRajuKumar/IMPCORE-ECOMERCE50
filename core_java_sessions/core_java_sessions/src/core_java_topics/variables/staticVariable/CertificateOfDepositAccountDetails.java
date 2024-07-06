package core_java_topics.variables.staticVariable;

public class CertificateOfDepositAccountDetails {

	public static void main(String[] args) {
		//create the object for CertificateOfDepositAccount class
		//syntax to create the object
		//class_name object_name = new class_name();
		CertificateOfDepositAccount account1 = new CertificateOfDepositAccount();
		CertificateOfDepositAccount account2 = new CertificateOfDepositAccount();
		CertificateOfDepositAccount account3 = new CertificateOfDepositAccount();
		CertificateOfDepositAccount account4 = new CertificateOfDepositAccount();
		
		account1.setCda_acc_num(123456789l);
		account1.setCda_cust_name("Harendra Singh");
		account1.setCda_branch_name("Pune Branch");
		account1.setCda_city("Pune City");
		account1.setCda_acc_balance(38000.0d);
		
		account2.setCda_acc_num(987654321l);
		account2.setCda_cust_name("Srinivas");
		account2.setCda_branch_name("Bangalore Branch");
		account2.setCda_city("Bangalore City");
		account2.setCda_acc_balance(63000.0d);
		
		account3.setCda_acc_num(869453120l);
		account3.setCda_cust_name("Avinash");
		account3.setCda_branch_name("Mumbai Branch");
		account3.setCda_city("Mumbai City");
		account3.setCda_acc_balance(71000.0d);
		
		account4.setCda_acc_num(639071267l);
		account4.setCda_cust_name("Akshay");
		account4.setCda_branch_name("Hyderabad Branch");
		account4.setCda_city("Hyderabad City");
		account4.setCda_acc_balance(91000.0d);
		
		System.out.println("================== Account 1 Details ================");
		System.out.println("Account Num : " + account1.getCda_acc_num());
		System.out.println("Account Holder Name : " + account1.getCda_cust_name());
		System.out.println("Branch Name : " + account1.getCda_branch_name());
		System.out.println("City : " + account1.getCda_city());
		System.out.println("Available Balance : " + account1.getCda_acc_balance());
		System.out.println("Bank Name : " + CertificateOfDepositAccount.BANK_NAME);
		
		System.out.println("================== Account 2 Details ================");
		System.out.println("Account Num : " + account2.getCda_acc_num());
		System.out.println("Account Holder Name : " + account2.getCda_cust_name());
		System.out.println("Branch Name : " + account2.getCda_branch_name());
		System.out.println("City : " + account2.getCda_city());
		System.out.println("Available Balance : " + account2.getCda_acc_balance());
		System.out.println("Bank Name : " + CertificateOfDepositAccount.BANK_NAME);
		
		System.out.println("================== Account 3 Details ================");
		System.out.println("Account Num : " + account3.getCda_acc_num());
		System.out.println("Account Holder Name : " + account3.getCda_cust_name());
		System.out.println("Branch Name : " + account3.getCda_branch_name());
		System.out.println("City : " + account3.getCda_city());
		System.out.println("Available Balance : " + account3.getCda_acc_balance());
		System.out.println("Bank Name : " + CertificateOfDepositAccount.BANK_NAME);
		
		System.out.println("================== Account 4 Details ================");
		System.out.println("Account Num : " + account4.getCda_acc_num());
		System.out.println("Account Holder Name : " + account4.getCda_cust_name());
		System.out.println("Branch Name : " + account4.getCda_branch_name());
		System.out.println("City : " + account4.getCda_city());
		System.out.println("Available Balance : " + account4.getCda_acc_balance());
		System.out.println("Bank Name : " + CertificateOfDepositAccount.BANK_NAME);
		
		
	}

}
