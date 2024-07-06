package core_java_topics.objectInJava.objectInitialization.byReferenceVariable;

public class TaxSavingFDAccount {

	long tfd_cust_id;
	long tfd_acc_num;
	String tfd_acc_holder_name;
	String tfd_branch_name;
	String tfd_city;
	String tfd_state;
	double tfd_amount;
	double tfd_rate_of_interest;
	int tfd_tenure;
	
	
	public static void main(String[] args) {
		
		TaxSavingFDAccount account1 = new TaxSavingFDAccount();
		TaxSavingFDAccount account2 = new TaxSavingFDAccount();
		TaxSavingFDAccount account3 = new TaxSavingFDAccount();
		
		account1.tfd_cust_id = 123456789l;
		account1.tfd_acc_num = 123456789l;
		account1.tfd_acc_holder_name = "Karan Rana";
		account1.tfd_branch_name = "Canada Bracnh";
		account1.tfd_city = "Canada City";
		account1.tfd_state = "Canada State";
		account1.tfd_amount = 53000.0d;
		account1.tfd_rate_of_interest = 6.9d;
		account1.tfd_tenure = 5;
		
		account2.tfd_cust_id = 987654321l;
		account2.tfd_acc_num = 673484800l;
		account2.tfd_acc_holder_name = "Hanumanthu";
		account2.tfd_branch_name = "Hyderabad Bracnh";
		account2.tfd_city = "Hyderabad City";
		account2.tfd_state = "Telangana State";
		account2.tfd_amount = 75000.0d;
		account2.tfd_rate_of_interest = 8.9d;
		account2.tfd_tenure = 15;
		
		account3.tfd_cust_id = 734769084l;
		account3.tfd_acc_num = 351239086l;
		account3.tfd_acc_holder_name = "Keerthana";
		account3.tfd_branch_name = "Bangalore Bracnh";
		account3.tfd_city = "Bangalore City";
		account3.tfd_state = "Karnataka State";
		account3.tfd_amount = 81000.0d;
		account3.tfd_rate_of_interest = 9.9d;
		account3.tfd_tenure = 10;
		
		
		System.out.println("====================== Account 1 Details ======================");
		System.out.println("Cust Id : " + account1.tfd_cust_id);
		System.out.println("Acc Number : " + account1.tfd_acc_num);
		System.out.println("Customer Name : " + account1.tfd_acc_holder_name);
		System.out.println("Branch Name : " + account1.tfd_branch_name);
		System.out.println("City : " + account1.tfd_city);
		System.out.println("State : " + account1.tfd_state);
		System.out.println("Term Amount : " + account1.tfd_amount);
		System.out.println("Rate Of Interest : " + account1.tfd_rate_of_interest);
		System.out.println("Tenure : " + account1.tfd_tenure);

		System.out.println("====================== Account 2 Details ======================");
		System.out.println("Cust Id : " + account2.tfd_cust_id);
		System.out.println("Acc Number : " + account2.tfd_acc_num);
		System.out.println("Customer Name : " + account2.tfd_acc_holder_name);
		System.out.println("Branch Name : " + account2.tfd_branch_name);
		System.out.println("City : " + account2.tfd_city);
		System.out.println("State : " + account2.tfd_state);
		System.out.println("Term Amount : " + account2.tfd_amount);
		System.out.println("Rate Of Interest : " + account2.tfd_rate_of_interest);
		System.out.println("Tenure : " + account2.tfd_tenure);
		
		System.out.println("====================== Account 3 Details ======================");
		System.out.println("Cust Id : " + account3.tfd_cust_id);
		System.out.println("Acc Number : " + account3.tfd_acc_num);
		System.out.println("Customer Name : " + account3.tfd_acc_holder_name);
		System.out.println("Branch Name : " + account3.tfd_branch_name);
		System.out.println("City : " + account3.tfd_city);
		System.out.println("State : " + account3.tfd_state);
		System.out.println("Term Amount : " + account3.tfd_amount);
		System.out.println("Rate Of Interest : " + account3.tfd_rate_of_interest);
		System.out.println("Tenure : " + account3.tfd_tenure);
	}

}
