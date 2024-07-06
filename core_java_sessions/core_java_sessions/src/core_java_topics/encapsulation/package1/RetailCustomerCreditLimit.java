package core_java_topics.encapsulation.package1;

public class RetailCustomerCreditLimit {

	//protected access_modifier
	protected long cust_sr_num = 444444444l;
	protected int limit_grp_number = 123;
	protected String limit_type = "Credit Type";
	protected double limit_amount = 59000.0d;
	protected String starting_date = "06-05-2024";
	protected String cust_name = "Mohammed Irfan";
	
	protected void displayCCLimit() {
		System.out.println("============= Credit Card Limit =================");
		System.out.println("Customer Serial Number : " + cust_sr_num);
		System.out.println("Limit Group Number : " + limit_grp_number);
		System.out.println("Limit Type : " + limit_type);
		System.out.println("Limit Amount : " + limit_amount);
		System.out.println("Starting Date : " + starting_date);
		System.out.println("Customer Name : " + cust_name);
	}
	
	public static void main(String[] args) {
		
		RetailCustomerCreditLimit limit = new RetailCustomerCreditLimit();
		limit.displayCCLimit();
	}
}
