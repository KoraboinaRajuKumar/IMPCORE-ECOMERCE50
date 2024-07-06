package designPatterns.behavioralDesignPattern;

public class AmazonApp {

	public static void main(String[] args) {
		
		ShoppinCart cart = new ShoppinCart();
		
		Items samsung = new Items("Samsung Galaxy Note 3", 23000.0d);
		Items Iphone = new Items("Iphone 15 pro max", 160000.0d);
		
		cart.addItem(Iphone);
		cart.addItem(samsung);
		
		//upi payment
		//cart.pay(new UPIPayment(7207513883l));
		
		//net banking
		//cart.pay(new NetBankingPayment(123456789l, "HDFC Bank"));
		
		//credit or debit card payment
		cart.pay(new CreditCardOrDebitCardPayment(987654321l,"Mohammed Kamran", "23-05-2030", 867));
	}

}
