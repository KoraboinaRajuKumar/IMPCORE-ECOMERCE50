package core_java_topics.methods.userDefinedMethod;

public class InvestmentSavingAccountDetails {

	public static void main(String[] args) {
		
		InvestmentSavingAccount account1 = new InvestmentSavingAccount();
		InvestmentSavingAccount account2 = new InvestmentSavingAccount();
		InvestmentSavingAccount account3 = new InvestmentSavingAccount();
		InvestmentSavingAccount account4 = new InvestmentSavingAccount();
		
		account1.setIsa_acc_num(123456789l);
		account1.setIsa_cust_name("Akshay");
		account1.setIsa_branch_name("Pune Branch");
		account1.setIsa_city("Pune City");
		account1.setState("Maharashtra");
		account1.setZipCode(500004);
		account1.setLand_mark1("Land Mark 1");
		account1.setLand_mark2("Land Mark 2");
		account1.setMailing_address("akshay@gmail.com");
		account1.setPinNumber(1234);
		account1.setIsa_acc_balance(50000.0d);
		
		account2.setIsa_acc_num(987654321l);
		account2.setIsa_cust_name("Avinash");
		account2.setIsa_branch_name("Mumbai Branch");
		account2.setIsa_city("Mumbai City");
		account2.setState("Maharashtra");
		account2.setZipCode(500006);
		account2.setLand_mark1("Land Mark 1");
		account2.setLand_mark2("Land Mark 2");
		account2.setMailing_address("avinash@gmail.com");
		account2.setPinNumber(8654);
		account2.setIsa_acc_balance(76000.0d);
		
		account3.setIsa_acc_num(674904529l);
		account3.setIsa_cust_name("Karan");
		account3.setIsa_branch_name("Chandhigarh Branch");
		account3.setIsa_city("Chandigarh City");
		account3.setState("Punjab");
		account3.setZipCode(600004);
		account3.setLand_mark1("Land Mark 1");
		account3.setLand_mark2("Land Mark 2");
		account3.setMailing_address("karan@gmail.com");
		account3.setPinNumber(9009);
		account3.setIsa_acc_balance(83400.0d);
		
		account4.setIsa_acc_num(745095348l);
		account4.setIsa_cust_name("Sharmila");
		account4.setIsa_branch_name("Hyderabad Branch");
		account4.setIsa_city("Hyderabad City");
		account4.setState("Telangana");
		account4.setZipCode(400006);
		account4.setLand_mark1("Land Mark 1");
		account4.setLand_mark2("Land Mark 2");
		account4.setMailing_address("sharmila@gmail.com");
		account4.setPinNumber(1234);
		account4.setIsa_acc_balance(93500.0d);
		
		System.out.println("====================== Account 1 Details =========================");
		System.out.println("Account Number : " + account1.getIsa_acc_num());
		System.out.println("Customer Name : " + account1.getIsa_cust_name());
		System.out.println("Branch Name : " + account1.getIsa_branch_name());
		System.out.println("City : " + account1.getIsa_city());
		System.out.println("State : " + account1.getState());
		System.out.println("Pin code : " + account1.getZipCode());
		System.out.println("Land Mark 1 : " + account1.getLand_mark1());
		System.out.println("Land Mark 2 : " + account1.getLand_mark2());
		System.out.println("Mailing Address : " + account1.getMailing_address());
		System.out.println("Pin Number : " + account1.getPinNumber());
		System.out.println("Account Balance : " + account1.getIsa_acc_balance());
		account1.withdrawAmount(12000.0d);
		
		System.out.println("====================== Account 2 Details =========================");
		System.out.println("Account Number : " + account2.getIsa_acc_num());
		System.out.println("Customer Name : " + account2.getIsa_cust_name());
		System.out.println("Branch Name : " + account2.getIsa_branch_name());
		System.out.println("City : " + account2.getIsa_city());
		System.out.println("State : " + account2.getState());
		System.out.println("Pin code : " + account2.getZipCode());
		System.out.println("Land Mark 1 : " + account2.getLand_mark1());
		System.out.println("Land Mark 2 : " + account2.getLand_mark2());
		System.out.println("Mailing Address : " + account2.getMailing_address());
		System.out.println("Pin Number : " + account2.getPinNumber());
		System.out.println("Account Balance : " + account2.getIsa_acc_balance());
		account2.getLast5Transactions(987654321l);
		
		System.out.println("====================== Account 3 Details =========================");
		System.out.println("Account Number : " + account3.getIsa_acc_num());
		System.out.println("Customer Name : " + account3.getIsa_cust_name());
		System.out.println("Branch Name : " + account3.getIsa_branch_name());
		System.out.println("City : " + account3.getIsa_city());
		System.out.println("State : " + account3.getState());
		System.out.println("Pin code : " + account3.getZipCode());
		System.out.println("Land Mark 1 : " + account3.getLand_mark1());
		System.out.println("Land Mark 2 : " + account3.getLand_mark2());
		System.out.println("Mailing Address : " + account3.getMailing_address());
		System.out.println("Pin Number : " + account3.getPinNumber());
		System.out.println("Account Balance : " + account3.getIsa_acc_balance());
		account3.depositAmount(10000.0d);
		
		System.out.println("====================== Account 4 Details =========================");
		System.out.println("Account Number : " + account4.getIsa_acc_num());
		System.out.println("Customer Name : " + account4.getIsa_cust_name());
		System.out.println("Branch Name : " + account4.getIsa_branch_name());
		System.out.println("City : " + account4.getIsa_city());
		System.out.println("State : " + account4.getState());
		System.out.println("Pin code : " + account4.getZipCode());
		System.out.println("Land Mark 1 : " + account4.getLand_mark1());
		System.out.println("Land Mark 2 : " + account4.getLand_mark2());
		System.out.println("Mailing Address : " + account4.getMailing_address());
		System.out.println("Pin Number : " + account4.getPinNumber());
		System.out.println("Account Balance : " + account4.getIsa_acc_balance());
		account4.changePin(1234);
	}

}
