package designPatterns.structuralDesignPattern.adapterDesignPattern;

public class BankOfAmericaCreditCardApp {

	public static void main(String[] args) {
		
		BankOfAmericaCreditCard card = new HDFCCustomer();
		card.giveCustomerDetails();
		System.out.println(card.issueCreditCard());
		
		/*BankOfAmericaCreditCard card = new ICICICustomer();
		card.giveCustomerDetails();
		System.out.println(card.issueCreditCard());*/

	}

}
