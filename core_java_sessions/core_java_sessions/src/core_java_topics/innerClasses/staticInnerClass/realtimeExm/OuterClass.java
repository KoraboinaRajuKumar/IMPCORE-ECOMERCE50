package core_java_topics.innerClasses.staticInnerClass.realtimeExm;

public class OuterClass {

	private static int CUST_ID = 6546;
	private static String DOMESTIC_CUSTOMER_BRANCH = "Raichur Branch";
	private static long SECURITY_SOCIAL_NUMBER = 4787653865l;
	private static String VALUATION_DATE = "01-06-2024";
	private static String GURANTOR_BRANCH = "Station Branch";
	
	static class WholesaleCollateralBasic {
		
		static void displayCollateralInfo() {
			System.out.println("Customer Id : " + CUST_ID);
			System.out.println("Domestic Customer Branch : " + DOMESTIC_CUSTOMER_BRANCH);
			System.out.println("Security Social Number : " + SECURITY_SOCIAL_NUMBER);
			System.out.println("Valuation Date : " + VALUATION_DATE);
			System.out.println("Gurantor Branch : " + GURANTOR_BRANCH);
		}
	}
	
	public static void main(String[] args) {
		
		OuterClass.WholesaleCollateralBasic.displayCollateralInfo();
	}
}
