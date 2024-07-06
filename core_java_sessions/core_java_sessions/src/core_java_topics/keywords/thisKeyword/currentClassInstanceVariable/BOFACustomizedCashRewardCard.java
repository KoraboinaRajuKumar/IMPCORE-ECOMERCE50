package core_java_topics.keywords.thisKeyword.currentClassInstanceVariable;

public class BOFACustomizedCashRewardCard {

	long cc_number;
	String cc_holder_name;
	String cc_type;
	String expiry_date;
	int cvv_number;
	int pin_number;
	double annual_fee;
	double cc_limit;
	
	public BOFACustomizedCashRewardCard(long cc_number, String cc_holder_name, String cc_type, String expiry_date,
			int cvv_number, int pin_number, double annual_fee, double cc_limit) {
		super();
		this.cc_number = cc_number;
		this.cc_holder_name = cc_holder_name;
		this.cc_type = cc_type;
		this.expiry_date = expiry_date;
		this.cvv_number = cvv_number;
		this.pin_number = pin_number;
		this.annual_fee = annual_fee;
		this.cc_limit = cc_limit;
	}
	
	public void displayCCDetails() {
		System.out.println("========================== Credit Card Details ============================");
		System.out.println("Credit Card Number : " + cc_number);
		System.out.println("Credit Card Holder Name : " + cc_holder_name);
		System.out.println("Credit Card Type : " + cc_type);
		System.out.println("Expiry Date : " + expiry_date);
		System.out.println("Cvv Number : " + cvv_number);
		System.out.println("Pin Number : " + pin_number);
		System.out.println("Annual Fee : " + annual_fee);
		System.out.println("Credit Card Limit : " + cc_limit);
	}
}
