package core_java_topics.keywords.thisKeyword.currentClassContructor;

public class BOFAAlwaysRewardsVisaCreditCard {

	long rcc_cc_number;
	String rcc_customer_name;
	String rcc_expiry_date;
	int rcc_cvv_num;
	int rcc_pin_num;
	double rcc_annual_fee;
	double rcc_cc_limit;
	
	public BOFAAlwaysRewardsVisaCreditCard() {
		System.out.println("========= This is construtor chaining ==================");
	}
	
	public BOFAAlwaysRewardsVisaCreditCard(long rcc_cc_number, String rcc_customer_name, String rcc_expiry_date,
			int rcc_cvv_num, int rcc_pin_num, double rcc_annual_fee, double rcc_cc_limit) {
		this();
		this.rcc_cc_number = rcc_cc_number;
		this.rcc_customer_name = rcc_customer_name;
		this.rcc_expiry_date = rcc_expiry_date;
		this.rcc_cvv_num = rcc_cvv_num;
		this.rcc_pin_num = rcc_pin_num;
		this.rcc_annual_fee = rcc_annual_fee;
		this.rcc_cc_limit = rcc_cc_limit;
	}
	
	public void displayRVCCDetails() {
		System.out.println("=================== Credit Card Details ======================");
		System.out.println("Credit Card Number : " + rcc_cc_number);
		System.out.println("Customer Name : " + rcc_customer_name);
		System.out.println("Expiry Date : " + rcc_expiry_date);
		System.out.println("Cvv Number : " + rcc_cvv_num);
		System.out.println("Pin Number : " + rcc_pin_num);
		System.out.println("Annual Fee : " + rcc_annual_fee);
		System.out.println("Credit Card Limit : " + rcc_cc_limit);
	}
		
	public static void main(String[] args) {
		
		BOFAAlwaysRewardsVisaCreditCard card1 = new BOFAAlwaysRewardsVisaCreditCard(123456789l, "Raunak", "11-05-2034", 555, 6453, 1000.0d, 50000.0d);
		BOFAAlwaysRewardsVisaCreditCard card2 = new BOFAAlwaysRewardsVisaCreditCard(987654321l, "Srinivas", "1-05-2035",777, 9009, 1200.0d, 100000.0d);
		BOFAAlwaysRewardsVisaCreditCard card3 = new BOFAAlwaysRewardsVisaCreditCard(876909453l, "Pratim Das", "11-05-2035", 654, 8790, 1500.0d, 200000.0d);
		BOFAAlwaysRewardsVisaCreditCard card4 = new BOFAAlwaysRewardsVisaCreditCard(657090876l, "Avinash", "11-05-2036", 888, 5409, 1500.0d, 150000.0d);
		
		card1.displayRVCCDetails();
		card2.displayRVCCDetails();
		card3.displayRVCCDetails();
		card4.displayRVCCDetails();
		
	}
}
