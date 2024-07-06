package core_java_topics.keywords.thisKeyword.currentClassMethod;

public class BOFAUnlimitedCashRewardsCard {

	long crc_cc_number;
	String crc_cust_name;
	String crc_expiry_date;
	String bank_name;
	double crc_annual_fee;
	int crc_cvv_num;
	int crc_pin_number;
	double crc_cc_limit;
	
	public BOFAUnlimitedCashRewardsCard(long crc_cc_number, String crc_cust_name, String crc_expiry_date,
			String bank_name, double crc_annual_fee, int crc_cvv_num, int crc_pin_number, double crc_cc_limit) {
		super();
		this.crc_cc_number = crc_cc_number;
		this.crc_cust_name = crc_cust_name;
		this.crc_expiry_date = crc_expiry_date;
		this.bank_name = bank_name;
		this.crc_annual_fee = crc_annual_fee;
		this.crc_cvv_num = crc_cvv_num;
		this.crc_pin_number = crc_pin_number;
		this.crc_cc_limit = crc_cc_limit;
	}
	public void method1() {
		System.out.println("================== Credit Card Details ==================================");
		this.displayCRCDetails();
		
	}
	public void displayCRCDetails() {
		System.out.println("Credit Card Number : " + crc_cc_number);
		System.out.println("Customer Name : " + crc_cust_name);
		System.out.println("Expiry Date : " + crc_expiry_date);
		System.out.println("Bank Name : " + bank_name);
		System.out.println("Annual Fee : " + crc_annual_fee);
		System.out.println("Cvv Number : " + crc_cvv_num);
		System.out.println("Pin Number : " + crc_pin_number);
		System.out.println("Credit Card Limit : " + crc_cc_limit);
	}
	
	public static void main(String[] args) {
		
		BOFAUnlimitedCashRewardsCard card1 = new BOFAUnlimitedCashRewardsCard(123456789l, "Ajay","10-05-2035","Bank Of America", 1000.0d, 1234, 8876, 50000.0d);
		BOFAUnlimitedCashRewardsCard card2 = new BOFAUnlimitedCashRewardsCard(987654321l, "Manish","10-05-2034", "Bank Of America", 1500.0d, 444, 7865, 100000.0d);
		BOFAUnlimitedCashRewardsCard card3 = new BOFAUnlimitedCashRewardsCard(967563490l, "Avinash", "10-05-2036", "Bank Of America", 2000.0d, 555, 9564, 200000.0d);
		
		card1.method1();
		card2.method1();
		card3.method1();
	}
}
