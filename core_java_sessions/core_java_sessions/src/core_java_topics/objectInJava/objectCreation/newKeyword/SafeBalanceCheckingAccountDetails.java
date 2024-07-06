package core_java_topics.objectInJava.objectCreation.newKeyword;

public class SafeBalanceCheckingAccountDetails {

	public static void main(String[] args) {
		//create the object of SafeBalanceCheckingAccount class
		//syntax to create object
		//class_name object_name = new class_name();
		
		
		SafeBalanceCheckingAccount account1 = new SafeBalanceCheckingAccount();
		SafeBalanceCheckingAccount account2 = new SafeBalanceCheckingAccount();
		SafeBalanceCheckingAccount account3 = new SafeBalanceCheckingAccount();
		
		account1.setSbca_acc_number(123456789l);
		account1.setSbca_customer_name("Roshni");
		account1.setSbca_branch_name("Indore Branch");
		account1.setSbca_city_name("Indore City");
		account1.setSsn_number(476490534l);
		account1.setSbca_acc_balance(32000.0d);
		
		account2.setSbca_acc_number(987654321l);
		account2.setSbca_customer_name("Madhu");
		account2.setSbca_branch_name("Hyderabad Branch");
		account2.setSbca_city_name("Hyderabad City");
		account2.setSsn_number(860823456l);
		account2.setSbca_acc_balance(62400.0d);
		
		account3.setSbca_acc_number(673498674l);
		account3.setSbca_customer_name("Keerthana");
		account3.setSbca_branch_name("Bangalore Branch");
		account3.setSbca_city_name("Bangalore City");
		account3.setSsn_number(783456892l);
		account3.setSbca_acc_balance(89340.0d);
		
		System.out.println("Hashcode of account1 : " + account1.hashCode());
		
		System.out.println("===================== Account 1 Details ===================");
		System.out.println("Account Number : " + account1.getSbca_acc_number());
		System.out.println("Customer Name : " + account1.getSbca_customer_name());
		System.out.println("Branch Name : " + account1.getSbca_branch_name());
		System.out.println("Social Seecurity Number : " + account1.getSsn_number());
		System.out.println("City : " + account1.getSbca_city_name());
		System.out.println("Available Balance : " + account1.getSbca_acc_balance());
		
		System.out.println("===================== Account 2 Details ===================");
		System.out.println("Account Number : " + account2.getSbca_acc_number());
		System.out.println("Customer Name : " + account2.getSbca_customer_name());
		System.out.println("Branch Name : " + account2.getSbca_branch_name());
		System.out.println("Social Seecurity Number : " + account2.getSsn_number());
		System.out.println("City : " + account2.getSbca_city_name());
		System.out.println("Available Balance : " + account2.getSbca_acc_balance());
		
		System.out.println("===================== Account 3 Details ===================");
		System.out.println("Account Number : " + account3.getSbca_acc_number());
		System.out.println("Customer Name : " + account3.getSbca_customer_name());
		System.out.println("Branch Name : " + account3.getSbca_branch_name());
		System.out.println("Social Seecurity Number : " + account3.getSsn_number());
		System.out.println("City : " + account3.getSbca_city_name());
		System.out.println("Available Balance : " + account3.getSbca_acc_balance());


	
	}

}
