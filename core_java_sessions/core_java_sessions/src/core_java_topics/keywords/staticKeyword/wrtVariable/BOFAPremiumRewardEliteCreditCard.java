package core_java_topics.keywords.staticKeyword.wrtVariable;

public class BOFAPremiumRewardEliteCreditCard {
	long recc_cc_number;
	String recc_customer_name;
	String recc_expiry_date;
	int recc_cvv_number;
	int recc_pin_number;
	double recc_cc_limit;
	static String BANK_NAME = "Bank Of America";
	
	public BOFAPremiumRewardEliteCreditCard(long recc_cc_number, String recc_customer_name, String recc_expiry_date,
			int recc_cvv_number, int recc_pin_number, double recc_cc_limit) {
		super();
		this.recc_cc_number = recc_cc_number;
		this.recc_customer_name = recc_customer_name;
		this.recc_expiry_date = recc_expiry_date;
		this.recc_cvv_number = recc_cvv_number;
		this.recc_pin_number = recc_pin_number;
		this.recc_cc_limit = recc_cc_limit;
	}
	public void diplayRECCInfo() {
		System.out.println("====================== Credit Card Details ======================");
		System.out.println("Credit Card Number : " + recc_cc_number);
		System.out.println("Customer Name : " + recc_customer_name);
		System.out.println("Expiry Date : " + recc_expiry_date);
		System.out.println("Cvv Number : " + recc_cvv_number);
		System.out.println("Pin Number : " + recc_pin_number);
		System.out.println("Credit Card Limit : " + recc_cc_limit);
		System.out.println("Bank Name : " + BANK_NAME);
	}
	
	public static void main(String[] args) {
		BOFAPremiumRewardEliteCreditCard card1 = new BOFAPremiumRewardEliteCreditCard(123456789l, "Karan Rana", "11-05-2035", 666, 9054, 50000.0d);
		BOFAPremiumRewardEliteCreditCard card2 = new BOFAPremiumRewardEliteCreditCard(987654321l, "Harendra", "11-05-2034", 888, 5643, 100000.0d);
		BOFAPremiumRewardEliteCreditCard card3 = new BOFAPremiumRewardEliteCreditCard(879065409l, "Arvind", "11-05-2029", 444, 7698, 200000.0d);
	
		card1.diplayRECCInfo();
		card2.diplayRECCInfo();
		card3.diplayRECCInfo();
	}
}
