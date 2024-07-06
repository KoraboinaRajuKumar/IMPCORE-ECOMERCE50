package core_java_topics.polymorphism.runtimePolymorphism.methodoverriding.realtimeExm;

public class CreditCardApp {

	public static void main(String[] args) {

		TravelMoreWorldEliteMasterCard masterCard = new TravelMoreWorldEliteMasterCard();
		BOFACustomizedCashRewardCard customizedCard = new BOFACustomizedCashRewardCard();
		
		masterCard.getCCDetails();
		customizedCard.getCCDetails();

	}

}
