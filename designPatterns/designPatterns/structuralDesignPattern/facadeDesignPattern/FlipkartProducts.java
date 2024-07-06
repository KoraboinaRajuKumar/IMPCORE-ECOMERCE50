package designPatterns.structuralDesignPattern.facadeDesignPattern;

public class FlipkartProducts {

	private HomeTelevision samsungBrand;
	private HomeTelevision lgBrand;
	private HomeTelevision motorolaBrand;

	public FlipkartProducts() {
		samsungBrand = new SamsungBrand();
		lgBrand = new LGBrand();
		motorolaBrand = new MotorolaBrand();
	}
	
	public void getSamsungTV() {
		samsungBrand.getProductDetails();
		samsungBrand.placeOrder();
		samsungBrand.makePayment();
		samsungBrand.shipment();
	}
	
	public void getLGTV() {
		lgBrand.getProductDetails();
		lgBrand.placeOrder();
		lgBrand.makePayment();
		lgBrand.shipment();
	}
	
	public void getMotorolaTV() {
		motorolaBrand.getProductDetails();
		motorolaBrand.placeOrder();
		motorolaBrand.makePayment();
		motorolaBrand.shipment();
	}
}
