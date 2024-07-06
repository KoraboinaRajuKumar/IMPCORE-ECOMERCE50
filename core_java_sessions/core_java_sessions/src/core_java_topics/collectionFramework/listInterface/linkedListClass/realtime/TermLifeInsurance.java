package core_java_topics.collectionFramework.listInterface.linkedListClass.realtime;

public class TermLifeInsurance {

	private String insurance_provider;
	private double claims_settled;
	private int coverage_till;
	private double life_cover;
	private double premium_emi_amount;
	public TermLifeInsurance(String insurance_provider, double claims_settled, int coverage_till, double life_cover,
			double premium_emi_amount) {
		super();
		this.insurance_provider = insurance_provider;
		this.claims_settled = claims_settled;
		this.coverage_till = coverage_till;
		this.life_cover = life_cover;
		this.premium_emi_amount = premium_emi_amount;
	}
	@Override
	public String toString() {
		return "TermLifeInsurance [insurance_provider=" + insurance_provider + ", claims_settled=" + claims_settled
				+ ", coverage_till=" + coverage_till + ", life_cover=" + life_cover + ", premium_emi_amount="
				+ premium_emi_amount + "]";
	}
	
}
