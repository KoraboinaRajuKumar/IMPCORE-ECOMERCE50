package core_java_topics.innerClasses.nonstaticInnerClass.localInnerClass.realtimeExm;

public class PaymentSettings {

	private long cell_number = 7207513883l;
	private String cust_name = "Mohammed Kamran";
	private String city = "Raichur";
	
	public void airtelPaymentSettings() {
		class Airtelpayment{
			public void displayAirtelPaymentSettingInfo() {
				System.out.println("================= This is Airtel Payment Settings ==============");
				System.out.println("Mobile Number : " + cell_number);
				System.out.println("Customer Name : " + cust_name);
				System.out.println("City : " + city);
			}
		}
		Airtelpayment airtelpayment = new Airtelpayment();
		airtelpayment.displayAirtelPaymentSettingInfo();
	}
	
	public void payTmPaymentSettings() {
		class PayTmPayment{
			public void displayPayTmPaymentSettingInfo() {
				System.out.println("================== This is PayTM Payment Settings ==============");
				System.out.println("Mobile Number : " + cell_number);
				System.out.println("Customer Name : " + cust_name);
				System.out.println("City : " + city);
			}
		}
		PayTmPayment payTMPayment = new PayTmPayment();
		payTMPayment.displayPayTmPaymentSettingInfo();
	}
	
	public void amazonPaymentSettings() {
		class AmazonWallet{
			public void displayAmazonPaymentSettingInfo() {
				System.out.println("================== This is Amazon Wallet Payment Settings ======");
				System.out.println("Mobile Number : " + cell_number);
				System.out.println("Customer Name : " + cust_name);
				System.out.println("City : " + city);
			}
		}
		AmazonWallet amazonPayment = new AmazonWallet();
		amazonPayment.displayAmazonPaymentSettingInfo();
	}
	public static void main(String[] args) {
		
		PaymentSettings settings = new PaymentSettings();
		//this is used to call Airtel Payment Settings
		//settings.airtelPaymentSettings();
		
		//this is used to call PayTm Payment settings
		//settings.payTmPaymentSettings();
		
		//this is used to call Amazon Wallet Payment settings
		settings.amazonPaymentSettings();
		
		
	}
}
