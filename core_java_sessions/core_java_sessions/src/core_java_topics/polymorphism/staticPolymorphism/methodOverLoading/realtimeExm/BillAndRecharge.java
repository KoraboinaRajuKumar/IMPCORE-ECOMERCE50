package core_java_topics.polymorphism.staticPolymorphism.methodOverLoading.realtimeExm;

public class BillAndRecharge {

	//these properties are used to re-charge the mobile 
	long mobile_number;
	String service_provider;
	double recharge_amount;
	String validity;
	
	//these properties are used to activate DTH
	long cust_id;
	long dth_number;
	long registered_customer_number;
	String dth_service_provider;
	double monthly_bill_amount;
	String expiry_date;
	
	//these are the properties to re-charge fasTag
	String car_number;
	String customer_name;
	long acc_number;
	
	//these are the properties used to pay the credit card bill
	long cc_number;
	String bank_name;
	double cc_bill_amount;
	String due_date;
	String last_date;
	
	//this method is used to re-charge mobile
	public static void makePayment(long mobile_number, String service_provider, double recharge_amount, String validity) {
		System.out.println("============ This method is used to re-charge mobile =====================");
		System.out.println("Mobile Number : " + mobile_number);
		System.out.println("Service Provider : " + service_provider);
		System.out.println("Recharge Amount : " + recharge_amount);
		System.out.println("Validity : " + validity);
		System.out.println("Mobile recharge done successfully.........................");
	}
	
	//this method is used to activate DTH
	public static void makePayment(long cust_id, long dth_number, long registered_customer_number, String dth_service_provider, double monthly_bill_amount,
			String expiry_date) {
		System.out.println("============ This method is used to activate DTH =====================");
		System.out.println("Cust Id : " + cust_id);
		System.out.println("DTH Number : " + dth_number);
		System.out.println("Customer Number : " + registered_customer_number);
		System.out.println("Service Provider : " + dth_service_provider);
		System.out.println("Monthly Bill Amount : " + monthly_bill_amount);
		System.out.println("Expiry Date : " + expiry_date);
		System.out.println("DTH recharge successfully...............................");
	}
	//this method is used to pay credit card bill
	public static void makePayment(long cc_number, String bank_name, double cc_bill_amount,String due_date,String last_date ) {
		System.out.println("============ This method is used to pay the credit card bill =====================");
		System.out.println("Credit Card Number : " + cc_number);
		System.out.println("Bank Name : " + bank_name);
		System.out.println("Bill Amount : " + cc_bill_amount);
		System.out.println("Due Date : " + due_date);
		System.out.println("Last Date : " + last_date);
		System.out.println("Credit Card Payment made successfully.............................................");
	}
	//this method is used to re-charge fasTag
	public static void makePayment(String car_number, String customer_name, long acc_number) {
		System.out.println("============ This method is used to recharge fasTag =====================");
		System.out.println("Car Number : " + car_number);
		System.out.println("Customer Name : " + customer_name);
		System.out.println("Account Numnber : " + acc_number);
		System.out.println("fasTag recharge successfully.............................................");
	}
}
