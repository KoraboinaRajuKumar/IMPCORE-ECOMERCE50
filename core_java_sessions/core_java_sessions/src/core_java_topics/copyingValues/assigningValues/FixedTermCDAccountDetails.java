package core_java_topics.copyingValues.assigningValues;

public class FixedTermCDAccountDetails {

	public static void main(String[] args) {
		
		/*FixedTermCDAccount account1 = new FixedTermCDAccount(123456789l, "Mohammed Kamran", 5000.0d, "Raichur Branch","Raichur City",10, 1000000.0d, 6.5d);
		FixedTermCDAccount account2 = new FixedTermCDAccount();
		
		account2.fta_acc_numnber = account1.fta_acc_numnber;
		account2.fta_cust_name = account1.fta_cust_name;
		account2.minimum_balance = account1.minimum_balance;
		account2.fta_branch_name = account1.fta_branch_name;
		account2.fta_city = account1.fta_city;
		account2.term_tenure = account1.term_tenure;
		account2.fta_fixed_term_amount = account1.fta_fixed_term_amount;
		account2.rate_of_interest = account1.rate_of_interest;*/
		
		FixedTermCDAccount account1 = new FixedTermCDAccount();
		account1.setFta_acc_number(123456789l);
		account1.setFta_cust_name("Saba Naaz Siddiqui");
		account1.setFta_branch_name("Hyderabad Branch");
		account1.setFta_city("Hyderabad City");
		account1.setMinimum_balance(10000.0d);
		account1.setTerm_tenure(10);
		account1.setFta_fixed_term_amount(200000.0d);
		account1.setRate_of_interest(5.6d);
		
		FixedTermCDAccount account2 = new FixedTermCDAccount();
		account2.setFta_acc_number(account1.getFta_acc_number());
		account2.setFta_cust_name(account1.getFta_cust_name());
		account2.setFta_branch_name(account1.getFta_branch_name());
		account2.setFta_city(account1.getFta_city());
		account2.setMinimum_balance(account1.getMinimum_balance());
		account2.setTerm_tenure(account1.getTerm_tenure());
		account2.setFta_fixed_term_amount(account1.getFta_fixed_term_amount());
		account2.setRate_of_interest(account1.getRate_of_interest());
		
		account1.displayFTAAccInfo();
		account2.displayFTAAccInfo();
		
	}

}
