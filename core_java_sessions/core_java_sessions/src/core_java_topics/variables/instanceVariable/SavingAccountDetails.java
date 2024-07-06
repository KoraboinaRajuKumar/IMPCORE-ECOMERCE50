package core_java_topics.variables.instanceVariable;

public class SavingAccountDetails {

	public static void main(String[] args) {
		//create the instance/object for SavingAccount class
		//syntax to create the object
		//class_name object_name = new class_name();
		
		SavingAccount account1 = new SavingAccount();
		SavingAccount account2 = new SavingAccount();
		SavingAccount account3 = new SavingAccount();
		
		//using setter methods set the value for an object/variable
		account1.setAcc_num(111111111l);
		account1.setCust_name("Kamran");
		account1.setBranch_name("Raichur Branch");
		account1.setCity("Raichur City");
		account1.setState("Karnataka State");
		account1.setAcc_balance(20000.0d);
		
		account2.setAcc_num(222222222l);
		account2.setCust_name("Zeeshan");
		account2.setBranch_name("Hyderabad Branch");
		account2.setCity("Hyderabad City");
		account2.setState("Telangana State");
		account2.setAcc_balance(100000.0d);
		
		account3.setAcc_num(333333333l);
		account3.setCust_name("Irfan");
		account3.setBranch_name("Riyadh Branch");
		account3.setCity("Riyadh City");
		account3.setState("KSA State");
		account3.setAcc_balance(90000.0d);
		
		//using getter methods to get the value from the object
		System.out.println("========================= Account 1 Details =========================");
		System.out.println("Account number : " + account1.getAcc_num());
		System.out.println("Customer Name : " + account1.getCust_name());
		System.out.println("Branch Name : " + account1.getBranch_name());
		System.out.println("City : " + account1.getCity());
		System.out.println("State : " + account1.getState());
		System.out.println("Available Balance :  " + account1.getAcc_balance());
		
		System.out.println("========================= Account 2 Details =========================");
		System.out.println("Account number : " + account2.getAcc_num());
		System.out.println("Customer Name : " + account2.getCust_name());
		System.out.println("Branch Name : " + account2.getBranch_name());
		System.out.println("City : " + account2.getCity());
		System.out.println("State : " + account2.getState());
		System.out.println("Available Balance :  " + account2.getAcc_balance());
		
		System.out.println("========================= Account 3 Details =========================");
		System.out.println("Account number : " + account3.getAcc_num());
		System.out.println("Customer Name : " + account3.getCust_name());
		System.out.println("Branch Name : " + account3.getBranch_name());
		System.out.println("City : " + account3.getCity());
		System.out.println("State : " + account3.getState());
		System.out.println("Available Balance :  " + account3.getAcc_balance());

	}

}
