package core_java_topics.keywords.thisKeyword.problem;

public class IndividualRetirementAccount {

	long ira_acc_num;
	String ira_cust_name;
	String ira_branch_name;
	String ira_city;
	double ira_acc_balance;
	
	public IndividualRetirementAccount(long ira_acc_num, String ira_cust_name, String ira_branch_name, String ira_city,
			double ira_acc_balance) {
		
		ira_acc_num = ira_acc_num;
		ira_cust_name = ira_cust_name;
		ira_branch_name = ira_branch_name;
		ira_city = ira_city;
		ira_acc_balance = ira_acc_balance;
	}
	
	public void displayAccInfo() {
		System.out.println("================================== Account Details =================================================");
		System.out.println("Acc num : " + ira_acc_num + " Customer Name : " + ira_cust_name + " Branch Name : " + ira_branch_name
				+ " City : " + ira_city + " Balance " + ira_acc_balance);
	}
	
	public static void main(String[] args) {
		
		IndividualRetirementAccount account1 = new IndividualRetirementAccount(123456789l,"Akshay","Pune Branch Name","Pune City", 10000.0d);
		IndividualRetirementAccount account2 = new IndividualRetirementAccount(987654321l, "Sampath", "Chennai Branch", "Chennai City", 40000.0d);
		IndividualRetirementAccount account3 = new IndividualRetirementAccount(675907534l, "Srinivas", "Bangalore Branch", "Bangalore City", 45000.0d);
		
		account1.displayAccInfo();
		account2.displayAccInfo();
		account3.displayAccInfo();
	}
}
