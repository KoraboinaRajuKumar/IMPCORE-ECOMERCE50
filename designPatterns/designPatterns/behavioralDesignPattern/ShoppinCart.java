package designPatterns.behavioralDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppinCart {

	List<Items> items;
	
	public ShoppinCart() {
		this.items = new ArrayList<Items>();
	}
	
	public void addItem(Items item) {
		this.items.add(item);
	}
	
	public void removeItem(Items item) {
		this.items.remove(item);
	}
	
	public  double calculateBillGenerate() {
		double sumTotal = 0.0d;
		for(Items product : items) {
			sumTotal = sumTotal + product.getItemPrice();
		}
		return sumTotal;
	}
	public void pay(PaymentMethod paymentMethod) {
		double amount  = calculateBillGenerate();
		paymentMethod.makePayment(amount);
	}
}
