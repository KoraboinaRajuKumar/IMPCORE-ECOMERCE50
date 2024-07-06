package designPatterns.structuralDesignPattern.facadeDesignPattern;

public class MotorolaBrand implements HomeTelevision{

	@Override
	public void getProductDetails() {
		System.out.println("Product Id : 5467586964");
		System.out.println("Product Brand : Motorola Brand");
		System.out.println("Product Feature : Blaupunkt CyberSound G2 Series 80 cm (32 inch) HD");
		System.out.println("Product Price : 10000");
	}

	@Override
	public void placeOrder() {
		System.out.println("Placing the order...");
	}

	@Override
	public void makePayment() {
		System.out.println("Payment verified successfully...");	
	}

	@Override
	public void shipment() {
		System.out.println("Customer Name : Mohammed Kamran");
		System.out.println("Address : 12-12-86/2b, Arab Mohalla Raichur");
		System.out.println("City : Raichur");
		System.out.println("State : Karnataka");
	}

}
