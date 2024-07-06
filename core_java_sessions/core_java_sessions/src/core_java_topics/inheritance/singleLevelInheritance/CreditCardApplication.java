package core_java_topics.inheritance.singleLevelInheritance;

public class CreditCardApplication {

	public static void main(String[] args) {
		
		BankOfAmericaUnlimitedCashRewardCard card1 = new BankOfAmericaUnlimitedCashRewardCard();
		BankOfAmericaUnlimitedCashRewardCard card2 = new BankOfAmericaUnlimitedCashRewardCard();
		
		card1.setCc_number(123456789l);
		card1.setCc_holder_name("Vishnu");
		card1.setExpiry_date("14-05-2034");
		card1.setCc_limit(100000.0d);
		card1.setCvvNumber(222);
		card1.setPinNumber(6785);
		card1.setAnnual_fee(1500.0d);
		card1.setFeature("You can use in airport lounge");
		card1.setCash_back_offer(1000.0d);
		
		card2.setCc_number(987654321l);
		card2.setCc_holder_name("Aravind");
		card2.setExpiry_date("14-05-2035");
		card2.setCc_limit(75000.0d);
		card2.setCvvNumber(999);
		card2.setPinNumber(9009);
		card2.setAnnual_fee(1800.0d);
		card2.setFeature("Shop till you drop");
		card2.setCash_back_offer(800.0d);
		
		System.out.println("=============== Credit Card Details =======================");
		System.out.println("Credit Card Number " + card1.getCc_number());
		System.out.println("Credit Card Holder Name : " + card1.getCc_holder_name());
		System.out.println("Expiry Date : " + card1.getExpiry_date());
		System.out.println("Credit Card Limit : " + card1.getCc_limit());
		System.out.println("Cvv Number : " + card1.getCvvNumber());
		System.out.println("Pin Number : " + card1.getPinNumber());
		System.out.println("Annual Fee : " + card1.getAnnual_fee());
		System.out.println("Features : " + card1.getFeature());
		System.out.println("Cash Back Offer : " + card1.getCash_back_offer());
		
		System.out.println("=============== Credit Card Details =======================");
		System.out.println("Credit Card Number " + card2.getCc_number());
		System.out.println("Credit Card Holder Name : " + card2.getCc_holder_name());
		System.out.println("Expiry Date : " + card2.getExpiry_date());
		System.out.println("Credit Card Limit : " + card2.getCc_limit());
		System.out.println("Cvv Number : " + card2.getCvvNumber());
		System.out.println("Pin Number : " + card2.getPinNumber());
		System.out.println("Annual Fee : " + card2.getAnnual_fee());
		System.out.println("Features : " + card2.getFeature());
		System.out.println("Cash Back Offer : " + card2.getCash_back_offer());

	}

}
