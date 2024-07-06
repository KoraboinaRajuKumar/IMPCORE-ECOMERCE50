package designPatterns.structuralDesignPattern.facadeDesignPattern;

public class SamsungBrand implements HomeTelevision{

	@Override
	public void getProductDetails() {
		System.out.println("Product Id : 87689767646");
		System.out.println("Product Brand : Samsung");
		System.out.println("Product Feature : SAMSUNG 80 cm (32 Inch) HD Ready LED Smart Tizen TV");
		System.out.println("Product Price : 35000");
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
