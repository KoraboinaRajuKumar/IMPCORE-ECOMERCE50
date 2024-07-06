package core_java_topics.variables.localVariable;

public class CurrentAccountDetails {

	public static void main(String[] args) {
		//create the object for CurrentAccount class
		//syntax to create the object
		//class_name object_name = new class_name();
		
		CurrentAccount account1 = new CurrentAccount();
		CurrentAccount account2 = new CurrentAccount();
		
		account1.setCa_acc_num(123456789l);
		account1.setCa_cust_name("Yashas");
		account1.setBranch_name("Bangalore Branch");
		account1.setCity("Bangalore City");
		account1.setCa_acc_balance(50000.0d);
		
		account2.setCa_acc_num(987654321l);
		account2.setCa_cust_name("Akshay");
		account2.setBranch_name("Pune Branch");
		account2.setCity("Pune City");
		account2.setCa_acc_balance(25000.0d);
		
		
		System.out.println("=============== Account 1 Details ====================");
		System.out.println("Account Number : " + account1.getCa_acc_num());
		System.out.println("Customer Name : " + account1.getCa_cust_name());
		System.out.println("Branch Name : " + account2.getBranch_name());
		System.out.println("City : " + account1.getCity());
		System.out.println("Available Balance : " + account1.getCa_acc_balance());
		//account1.withdrawAmount(10000.0d);
		account1.depositAmount(23000.0d);
		
		System.out.println("=============== Account 2 Details ====================");
		System.out.println("Account Number : " + account2.getCa_acc_num());
		System.out.println("Customer Name : " + account2.getCa_cust_name());
		System.out.println("Branch Name : " + account2.getBranch_name());
		System.out.println("City : " + account2.getCity());
		System.out.println("Available Balance : " + account2.getCa_acc_balance());
		//account2.withdrawAmount(1000.0d);
		
		
		
		

	}

}
