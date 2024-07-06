package core_java_topics.keywords.staticKeyword.wrtMethod;
public class BOFARoyalCaribbeanSignatureCreditCard {
	long cs_cc_number;
	String cs_customer_name;
	String cs_expiry_date;
	int cs_cvv_number;
	int cs_pin_number;
	double cs_cc_limit;
	static String BANK_NAME = "Bank Of America";
	public BOFARoyalCaribbeanSignatureCreditCard(long cs_cc_number, String cs_customer_name, String cs_expiry_date,
			int cs_cvv_number, int cs_pin_number, double cs_cc_limit) {
		super();
		this.cs_cc_number = cs_cc_number;
		this.cs_customer_name = cs_customer_name;
		this.cs_expiry_date = cs_expiry_date;
		this.cs_cvv_number = cs_cvv_number;
		this.cs_pin_number = cs_pin_number;
		this.cs_cc_limit = cs_cc_limit;
	}
	public static void changeBankName() {
		BANK_NAME = "HDFC Bank";
	}
	//instance method
	public void displayCSInfo() {
		System.out.println("================== Credit Card Details ==========================");
		System.out.println("Credit Card Number : " + cs_cc_number);
		System.out.println("Customer Name : " + cs_customer_name);
		System.out.println("Expiry Date : " + cs_expiry_date);
		System.out.println("Cvv Number : " + cs_cvv_number);
		System.out.println("Pin Number : " + cs_pin_number);
		System.out.println("Credit Card Limit : " + cs_cc_limit);
		System.out.println("Bank Name : " + BANK_NAME);
	}
	public static void main(String[] args) {
		BOFARoyalCaribbeanSignatureCreditCard card1 = new BOFARoyalCaribbeanSignatureCreditCard(123456789l, "Vishnu", "12-05-2034", 888, 9734, 50000.0d);
		BOFARoyalCaribbeanSignatureCreditCard card2 = new BOFARoyalCaribbeanSignatureCreditCard(987654321l,"Sampath", "12-05-2035", 999, 6578, 75000.0d);
		BOFARoyalCaribbeanSignatureCreditCard card3 = new BOFARoyalCaribbeanSignatureCreditCard(785034865l, "Manish","12-05-2036", 444, 4908, 100000.0d);
		BOFARoyalCaribbeanSignatureCreditCard.changeBankName();
		card1.displayCSInfo();
		card2.displayCSInfo();
		card3.displayCSInfo();
	}
}
