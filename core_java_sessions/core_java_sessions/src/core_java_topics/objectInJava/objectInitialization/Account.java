package core_java_topics.objectInJava.objectInitialization;

public class Account {

	long acc_num;
	String acc_cust_name;
	int cust_id;
	float balance;
	double roi;
	boolean isAccActive;
	char gender;
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		System.out.println("Acc Num : " + acc.acc_num);
		System.out.println("Cust Name : " + acc.acc_cust_name);
		System.out.println("Cust Id : " + acc.cust_id);
		System.out.println("Rate Of Interest : " + acc.roi);
		System.out.println("Is Account Active : " + acc.isAccActive);
		System.out.println("Gender : " + acc.gender);
	}
}
