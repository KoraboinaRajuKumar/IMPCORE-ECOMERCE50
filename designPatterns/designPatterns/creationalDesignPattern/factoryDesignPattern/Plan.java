package designPatterns.creationalDesignPattern.factoryDesignPattern;

public abstract class Plan {
      
	protected double rate_per_unit;
	abstract void getRate();
	
	public void calculateBill(int unitConsumed) {
		System.out.println(rate_per_unit*unitConsumed);
	}
}
