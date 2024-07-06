package core_java_topics.inheritance.singleLevelInheritance;

public class BankOfAmericaUnlimitedCashRewardCard extends CreditCard{
	
	private double annual_fee;
	private String feature;
	private double cash_back_offer;
	
	public double getAnnual_fee() {
		return annual_fee;
	}
	public void setAnnual_fee(double annual_fee) {
		this.annual_fee = annual_fee;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public double getCash_back_offer() {
		return cash_back_offer;
	}
	public void setCash_back_offer(double cash_back_offer) {
		this.cash_back_offer = cash_back_offer;
	}
}
