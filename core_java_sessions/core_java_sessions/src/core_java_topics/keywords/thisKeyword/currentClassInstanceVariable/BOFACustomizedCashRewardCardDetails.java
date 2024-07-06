package core_java_topics.keywords.thisKeyword.currentClassInstanceVariable;

public class BOFACustomizedCashRewardCardDetails {

	public static void main(String[] args) {

		BOFACustomizedCashRewardCard card1 = new BOFACustomizedCashRewardCard(123456789l, "Pratim Das","Master Card", "10-05-2035", 111, 1234, 1500.0d, 50000.0d);
		BOFACustomizedCashRewardCard card2 = new BOFACustomizedCashRewardCard(987654321l, "Yashas", "Visa Card", "10-05-2034", 222, 5678, 2000.0d, 100000.0d);
		BOFACustomizedCashRewardCard card3 = new BOFACustomizedCashRewardCard(984567347l, "Vishnu", "Master Card","10-05-2035", 555, 7890, 2500.0d, 200000.0d);
		
		card1.displayCCDetails();
		card2.displayCCDetails();
		card3.displayCCDetails();

	}

}
