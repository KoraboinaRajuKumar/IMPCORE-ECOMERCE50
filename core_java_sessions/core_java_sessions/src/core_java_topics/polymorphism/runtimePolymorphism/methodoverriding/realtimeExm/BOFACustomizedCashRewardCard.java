package core_java_topics.polymorphism.runtimePolymorphism.methodoverriding.realtimeExm;

public class BOFACustomizedCashRewardCard extends CreditCards{

	public void getCCDetails() {
		System.out.println("========= This is BOFACustomizedCashRewardCard Details ================");
		System.out.println("Credit Card Number : 987654321");
		System.out.println("Holder Name : Mohammed Zeeshan");
		System.out.println("3% cash back in the category of your choice");
		System.out.println("Annual Fee : $150");
		System.out.println("Credit Card Limit : $2000");
	}
}
