package core_java_topics.objectInJava.objectInitialization.byMethod;

public class BusinessRelationshipAdvantageFundamentalAccount {

	private long bafa_acc_num;
	private String bafa_cust_name;
	private String bafa_branch;
	private String bafa_city;
	private long cust_mobile_number;
	private String land_mark1;
	private String land_mark2;
	private String state;
	private double bafa_available_balance;
	
	//declare method to initialize the object
	public void insertAccInfoDetails(long bafa_acc_num,String bafa_cust_name,String bafa_branch,String bafa_city,long cust_mobile_number,String land_mark1,
			String land_mark2,String state,double bafa_available_balance) {
		this.bafa_acc_num = bafa_acc_num;
		this.bafa_cust_name = bafa_cust_name;
		this.bafa_branch = bafa_branch;
		this.bafa_city = bafa_city;
		this.cust_mobile_number = cust_mobile_number;
		this.land_mark1 = land_mark1;
		this.land_mark2 = land_mark2;
		this.state = state;
		this.bafa_available_balance = bafa_available_balance;
		
	}
	//declare method to display account info
	public void displayAccInfo() {
		System.out.println("======================= Account Details ======================");
		System.out.println("Account Number : " + bafa_acc_num);
		System.out.println("Customer Name : " + bafa_cust_name);
		System.out.println("Branch Name : " + bafa_branch);
		System.out.println("City : " + bafa_city);
		System.out.println("Contact Number : " + cust_mobile_number);
		System.out.println("Land Mark 1 : " + land_mark1);
		System.out.println("Land Mark 2 : " + land_mark2);
		System.out.println("State : " + state);
		System.out.println("Available Balance : " + bafa_available_balance);
	}
}
